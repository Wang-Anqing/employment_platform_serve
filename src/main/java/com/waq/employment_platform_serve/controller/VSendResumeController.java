package com.waq.employment_platform_serve.controller;


import com.waq.employment_platform_serve.entity.webmodel.VSendResume;
import com.waq.employment_platform_serve.service.impl.VSendResumeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * VIEW 前端控制器
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
@RestController
@RequestMapping("/api")
public class VSendResumeController {
    @Autowired
    VSendResumeServiceImpl vSendResumeService;

    @PostMapping("/getResumeState")
    public List<VSendResume> getResumeState(@RequestBody VSendResume vSendResume){
        System.out.println(vSendResumeService.getInfo(vSendResume.getJobseekerId()).size());
        return vSendResumeService.getInfo(vSendResume.getJobseekerId());
    }
}

