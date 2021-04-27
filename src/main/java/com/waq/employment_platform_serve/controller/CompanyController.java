package com.waq.employment_platform_serve.controller;


import com.waq.employment_platform_serve.entity.Company;
import com.waq.employment_platform_serve.service.impl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
public class CompanyController {

    @Autowired
    CompanyServiceImpl companyService;

//    获取企业信息，初始化招聘单位详情页信息
    @PostMapping("/init/jobDetails")
    public Company getCompanyInfo(@RequestBody Company company, HttpServletRequest request, HttpServletResponse response){
        Company result  = companyService.findById(company.getId());
        System.out.println("result is ：");
        System.out.println(result);
        return result;
    }

    @GetMapping("/update/viewer/{companyId}")
    public boolean updateViewer(@PathVariable Integer companyId){
        companyService.updateViewer(companyId);
        return true;
    }
}

