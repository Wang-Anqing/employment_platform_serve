package com.waq.employment_platform_serve.controller;


import com.waq.employment_platform_serve.entity.Jobseeker;
import com.waq.employment_platform_serve.service.impl.JobseekerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WAQ
 * @since 2021-04-21
 */
@RestController
@RequestMapping("/api/jobseeker")
public class JobseekerController {
    @Autowired
    JobseekerServiceImpl jobseekerService;

    @PostMapping("/update")
    public boolean update(@RequestBody Jobseeker jobseeker){
        System.out.println("更改的用户信息为："+jobseeker);
        return jobseekerService.updateUser(jobseeker);
    }
}

