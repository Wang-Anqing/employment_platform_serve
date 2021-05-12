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
//        String str = "{\"id\":1,\"title\":\"WEB前端工程师1\",\"updateTime\":\"2021-05-10T10:15:19\",\"jobseekerId\":1,\"photo\":\"https://www.hualigs.cn/image/60949026c3b6a.jpg\",\"name\":\"王安青\",\"phone\":\"15103727413\",\"email\":\"wanganqing98@163.com\",\"location\":\"安阳市\",\"nation\":\"汉族\",\"politicalStatus\":\"共青团员\",\"sex\":\"男\",\"birthday\":\"1998-12-27\",\"job\":\"ＷＥＢ前端开发\",\"wage\":\"13Ｋ\",\"school\":\"南昌航空大学\",\"profession\":\"软件工程\",\"academy\":\"软件学院\",\"background\":\"本科\",\"eduExpress\":\"-修课程：WEB高级编程、JAVA网络编程、移动终端编程技术、面向对象程序设计、算法设计与分析、数据库系统；-荣誉奖项：大学生职业生涯规划优胜奖、软件学院“优秀共青团员”、优秀志愿者\\r\",\"skill\":\"- 掌握HTML+CSS+Javascript，了解HTTP协议以及浏览器原理；\\r\\n- Photoshop有一定了解，能够根据UI设计图将其转化为符合W3C标准的静态页面；\\r\\n- 悉Java能够进行一定的后台搭建，完成后台需要的基本功能；\\r\\n- 会使用vue前端框架。\",\"program1Name\":\"企业信息化管理\",\"program1Role\":\"销售模块负责人\",\"program1Express\":\"-于MVC模式下实现了对销售记录、产品库存、销售任务等的增删改查，以及分配销售任务、统计销售情况与销售额等功\\r\\n能，使用MySQL进行数据存储；\\r-用技术：jsp、servlet、JDBC、JavaBean、以及JavaScript；\\r-在前端使用JavaScript与正则表达式来对数据进行校验与限制，例如限制产品销售与库存数量的上下限，判别用户是否非法\\r\\n输入；\\r-为了更好的展示某段时间员工的销售额，将员工的销售情况生成json格式的数据，调用开源图表，生成柱状图来进行数据显\\r\\n示。\\r\",\"program2Name\":\"学成在线\",\"program2Role\":\"主要负责人\",\"program2Express\":\"-整体使用div+CSS布局，使页面整洁美观；-用Photoshop对psd 效果图进行测量与切图，并将其转化为符合W3C的静态页面；\\r-在布局时，先使用多个块级盒子采用标准流完成整体的模块布局，再采用浮动对大盒子进行元素填充；-动的元素会脱标，为了消除元素脱标带来的影响，要对其父元素进行清除浮动，从而更好的进行布局；\\r\",\"schoolexp1Name\":\"“大手牵小手，温暖孩童心”爱心活动\\r\",\"schoolexp1Role\":\"活动负责人\",\"schoolexp1Express\":\"-作为负责人，协同学院志愿者协会，组织开展“大手牵小手，温暖孩童心”探望残障儿童爱心活动，从最初的活动策划到最\\r\\n终的活动总结都尽心完成 ；\\r-使用公众号以及QQ空间对活动进行宣传，并安排进行线下物品募捐与义卖，共获得近600元资金；\\r-最终活动顺利开展，为孩子们送去了一份来自陌生人的温暖 。\\r\",\"schoolexp2Name\":null,\"schoolexp2Role\":null,\"schoolexp2Express\":null,\"others\":\"-**技能**： Office，Eclipse，Axure，Java，SQL；-**语言**： 英语四级（489分）\\r\",\"conclusion\":\"希望未来在WEB前端开发这一岗位更好的发展，在工作中有意识的更加规范代码写作习惯，对标签语义化能够有更加深刻\\r\\n的理解，如今资质尚浅仍需要不断的充实自己。对待工作理性且老实，能够及时完成布置的任务。性格开朗，会自我排解，能\\r\\n够很快的调整好自己的情绪。\\r\"}";
//        Resume resume0 = JSON.parseObject(str, Resume.class);
//        System.out.println("resume0 is :");
//        System.out.println(resume0.getName());

        data = StringEscapeUtils.unescapeJava(data);
        data = "{"+data+"}";
        data = JSON.toJSONString(JSON.parse(data.toString()));
//        System.out.println("data is :");
        System.out.println(data);
        Resume resume = JSON.parseObject(data, Resume.class);
//        System.out.println("resume is :");
//        System.out.println(resume.getName());
        resumeService.updateResume(resume);
        return true;
    }

}

