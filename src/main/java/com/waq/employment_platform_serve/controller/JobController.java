package com.waq.employment_platform_serve.controller;


import com.waq.employment_platform_serve.entity.Job;
import com.waq.employment_platform_serve.service.impl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

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
}

