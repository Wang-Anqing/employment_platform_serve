package com.waq.employment_platform_serve.controller;


import com.alibaba.fastjson.JSON;
import com.waq.employment_platform_serve.entity.Company;
import com.waq.employment_platform_serve.entity.Jobseeker;
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

    @PostMapping("/company/login")
    public Company login(@RequestBody Company company, HttpServletRequest request, HttpServletResponse response){

        //通过邮箱和密码作为条件查询数据库，若返回结果不为空登陆成功
        if (companyService.checkLogin(company.getEmail(),company.getPassword())){
            Company company1 = companyService.findByEmail(company.getEmail());
            System.out.println("用户返回成功");
            return company1;
        }
        else {
            response.setStatus(403);
            System.out.println("用户返回失败");
            return null;
        }
    }

//    更新企业信息
    @PostMapping("/company/update")
    public boolean updateCompany(@RequestBody String data){
        System.out.println("data is :");
        System.out.println(data);
        Company company = JSON.parseObject(data,Company.class);
        companyService.updateCompany(company);
        return true;
    }
}

