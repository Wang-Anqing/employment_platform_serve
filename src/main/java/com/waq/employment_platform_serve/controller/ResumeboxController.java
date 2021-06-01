package com.waq.employment_platform_serve.controller;


import com.waq.employment_platform_serve.entity.Resumebox;
import com.waq.employment_platform_serve.entity.Resumestate;
import com.waq.employment_platform_serve.service.impl.ResumeServiceImpl;
import com.waq.employment_platform_serve.service.impl.ResumeboxServiceImpl;
import com.waq.employment_platform_serve.service.impl.ResumestateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
@RestController
@RequestMapping("/api")
public class ResumeboxController {

    @Autowired
    ResumeboxServiceImpl resumeboxService;
    @Autowired
    ResumestateServiceImpl resumestateService;

    @PostMapping("/sendResume")
    public boolean sendResume(@RequestBody Resumebox resumebox){
        //获取当前时间
        LocalDateTime now = LocalDateTime.now();
        now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        //初始化简历投递状态
        Resumestate resumestate = new Resumestate();
//        resumestate.setResumeboxId(resumebox.getId());
        resumestate.setState(0);
        resumestate.setOperateDate(now);

        resumeboxService.sendResume(resumebox);
//        System.out.println(resumebox.getId());
        resumestate.setResumeboxId(resumebox.getId());
        resumestateService.addState(resumestate);
        System.out.println("resumestate is :");
        System.out.println(resumestate);
        return true;
    }
}

