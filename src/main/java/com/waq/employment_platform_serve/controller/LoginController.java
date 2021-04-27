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
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    JobseekerServiceImpl jobseekerService;

    @PostMapping("/jobseeker")
    public Jobseeker login(@RequestBody Jobseeker jobseeker, HttpServletRequest request, HttpServletResponse response){

        //通过邮箱和密码作为条件查询数据库，若返回结果不为空登陆成功
        if (jobseekerService.checkLogin(jobseeker.getEmail(),jobseeker.getPassword())){
            Jobseeker jseeker = jobseekerService.findByEmail(jobseeker.getEmail());
            System.out.println("用户返回成功");
            return jseeker;
        }
        else {
            response.setStatus(403);
            System.out.println("用户返回失败");
            return null;
        }
    }
}
