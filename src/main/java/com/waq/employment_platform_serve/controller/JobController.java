package com.waq.employment_platform_serve.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.waq.employment_platform_serve.entity.Job;
import com.waq.employment_platform_serve.service.impl.JobServiceImpl;
import lombok.Data;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WAQ
 * @since 2021-04-21
 */
@RestController
@RequestMapping("/api")
public class JobController {

    @Autowired
    JobServiceImpl jobService;

//    通过公司id查找全部工作信息
    @GetMapping("/init/getJobList/{companyId}")
    public List<Job> getJobList(@PathVariable Integer companyId){
        System.out.println("companyId  is :");
        System.out.println(companyId);
        List<Job> jobList = jobService.findByCompanyId(companyId);
        System.out.println("jobList is :");
        System.out.println(jobList);
        return jobList;
    }

//    人岗匹配
    @PostMapping("/match")
    public int match(@RequestBody String strs) {
        JSONObject jsonObject = JSONObject.parseObject(strs);
        System.out.println("json 为：");
        System.out.println(jsonObject);
        Map<String,Object> map = (Map<String,Object>)jsonObject;//json对象转Map
        System.out.println(map.get("resume"));
        System.out.println(map.get("jd"));

        //请求头中的token
        String token="ad7760ab99a747c6acb2a5e56e4498c51622431210907token";
        //申请的接口地址
        String url="http://comdo.hanlp.com/hanlp/v1/keyword/extract";
        Map<String,Object> params=new HashMap<String,Object>();

        //提取简历的关键词
        //text是我们需要进行短语提取的文本啦~
        String resume = (String) map.get("resume");
        params.put("text", resume);
        //size呢就是我们需要短语提取的数量 这里设置10个
        params.put("size", "200");

        //执行HanLP短语提取接口，result为返回的结果
        String resumeResult=doHanlpApi(token,url,params);
        //打印输出短语提取内容结果
        System.out.println("简历关键词为：");
        System.out.println(resumeResult);

        //提取jd的关键词
        //text是我们需要进行短语提取的文本啦~
        String jd = (String) map.get("jd");
        params.put("text", jd);
        //size呢就是我们需要短语提取的数量 这里设置10个
        params.put("size", "100");

        //执行HanLP短语提取接口，result为返回的结果
        String jdResult=doHanlpApi(token,url,params);
        //打印输出短语提取内容结果
        System.out.println("JD关键词为：");
        System.out.println(jdResult);

        JSONObject resumeJsonObj = JSONObject.parseObject(resumeResult);
        JSONObject jdJsonObj = JSONObject.parseObject(jdResult);
        resumeJsonObj.remove("code");
        jdJsonObj.remove("code");
        System.out.println("resumeJsonObj is :");
        System.out.println(resumeJsonObj);
        System.out.println("jdJsnoObj is :");
        System.out.println(jdJsonObj);

        //将resume  JSON形式的data转为List
        JSONArray result0 = resumeJsonObj.getJSONArray("data");
        String jsonString0 = JSONObject.toJSONString(result0);
        List<Result> resumeResults = JSONObject.parseArray(jsonString0,Result.class);
        System.out.println(resumeResults.size());

        //将JD  JSON形式的data转为List
        JSONArray  result1 = jdJsonObj.getJSONArray("data");
        String jsonString1 = JSONObject.toJSONString(result1);
        List<Result> jdResults = JSONObject.parseArray(jsonString1,Result.class);
        System.out.println(jdResults.size());

        List<Result>  jiaoji = new ArrayList<>(resumeResults);
        jiaoji.retainAll(jdResults);
        System.out.println(jiaoji.size());

        return jiaoji.size();
    }
    public static String doHanlpApi(String token,String url,Map<String,Object> params) {
        // 创建Httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);
            //添加header请求头，token请放在header里
            httpPost.setHeader("token", token);
            // 创建参数列表
            List<NameValuePair> paramList = new ArrayList<>();
            if (params != null) {
                for (String key : params.keySet()) {
                    //所有参数依次放在paramList中
                    paramList.add(new BasicNameValuePair(key, (String) params.get(key)));
                }
                //模拟表单
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList, "utf-8");
                httpPost.setEntity(entity);
            }
            // 执行http请求
            response = httpClient.execute(httpPost);
            resultString = EntityUtils.toString(response.getEntity(), "utf-8");
            return resultString;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(response!=null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Data
    public static class Result{
        private String nature;
        private String word;
    }
}

