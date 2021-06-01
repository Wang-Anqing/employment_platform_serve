package com.waq.employment_platform_serve.controller;


import com.waq.employment_platform_serve.entity.Wage;
import com.waq.employment_platform_serve.service.impl.WageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
public class WageController {
    @Autowired
    WageServiceImpl wageService;

    @PostMapping("/getWage")
    public List<Wage> getWage(@RequestBody Wage wage){
        return wageService.getWage(wage.getCompanyId());
    }

    @PostMapping("/shareWage")
    public boolean shareWage(@RequestBody Wage wage){
        wageService.shareWage(wage);
        return true;
    }
}

