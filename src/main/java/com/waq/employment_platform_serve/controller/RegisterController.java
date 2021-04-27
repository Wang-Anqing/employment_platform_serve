package com.waq.employment_platform_serve.controller;

import com.waq.employment_platform_serve.entity.Jobseeker;
import com.waq.employment_platform_serve.service.impl.JobseekerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/register")
public class RegisterController {

    @Autowired
    JobseekerServiceImpl jobseekerService;

    @PostMapping("/jobseeker")
    public boolean register(@RequestBody Jobseeker jobseeker, HttpServletRequest request, HttpServletResponse response){
        System.out.println();
        if (jobseekerService.addUser(jobseeker)){
            System.out.println("用户注册成功");
            return true;
        }
        else {
            response.setStatus(403);
            System.out.println("用户注册失败");
            System.out.println("该用户已存在");
            return false;
        }
    }
}
