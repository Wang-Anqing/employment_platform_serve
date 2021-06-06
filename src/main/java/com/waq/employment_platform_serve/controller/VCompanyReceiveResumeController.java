package com.waq.employment_platform_serve.controller;


import com.waq.employment_platform_serve.entity.webmodel.VCompanyReceiveResume;
import com.waq.employment_platform_serve.service.impl.VCompanyReceiveResumeServiceImpl;
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
 * @since 2021-06-04
 */
@RestController
@RequestMapping("/api")
public class VCompanyReceiveResumeController {

    @Autowired
    VCompanyReceiveResumeServiceImpl vCompanyReceiveResumeService;

    @PostMapping("/company/receiveResume")
    public List<VCompanyReceiveResume> getVyCompanyId(@RequestBody VCompanyReceiveResume vCompanyReceiveResume){
        return vCompanyReceiveResumeService.getByCompanyId(vCompanyReceiveResume.getCompanyId());
    }
}

