package com.waq.employment_platform_serve.controller;

import org.apache.commons.lang.StringEscapeUtils;
import com.alibaba.fastjson.JSONObject;
import com.waq.employment_platform_serve.entity.Resume;
import com.waq.employment_platform_serve.service.impl.JobseekerServiceImpl;
import com.waq.employment_platform_serve.service.impl.ResumeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WAQ
 * @since 2021-05-10
 */
@RestController
@RequestMapping("/api/resume")
public class ResumeController {

    @Autowired
    ResumeServiceImpl resumeService;

    @PostMapping("/getList")
    public List<Resume> getList(@RequestBody Resume resume){
        System.out.println("全部简历信息为：");
        System.out.println(resumeService.getList(resume.getJobseekerId()));
        return resumeService.getList(resume.getJobseekerId());
    }

    @PostMapping("/updateResume")
    public boolean updateResume(@RequestBody String data){

        //去除转义符
        data = StringEscapeUtils.unescapeJava(data);
        data = "{"+data+"}";
        data = JSON.toJSONString(JSON.parse(data.toString()));
        System.out.println(data);
        Resume resume = JSON.parseObject(data, Resume.class);

        resumeService.updateResume(resume);
        return true;
    }

    @PostMapping("/addResume")
    public boolean addResume(@RequestBody String data){
        System.out.println("当前的简历为：");
        System.out.println(data);
        Resume resume = JSON .parseObject(data,Resume.class);
        System.out.println("schoolExp2 is :"+resume.getSchoolexp2Name());
//        System.out.println("当前的简历为：");
//        System.out.println(resume);
        resumeService.addResume(resume);
        return true;
    }
}

