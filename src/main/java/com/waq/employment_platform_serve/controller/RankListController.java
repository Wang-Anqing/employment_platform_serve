package com.waq.employment_platform_serve.controller;

import com.waq.employment_platform_serve.entity.webmodel.RankList;
import com.waq.employment_platform_serve.service.impl.RankListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RankListController {
    @Autowired
    RankListServiceImpl rankListService;

    @GetMapping("/getViewerList")
    public List<RankList> getViewerList(){
        return rankListService.getViewerList();
    }

    @GetMapping("/getDeliverList")
    public List<RankList> getDeliverList(){
        return rankListService.getDeliverList();
    }

    @GetMapping("/getActivityList")
    public List<RankList> getActivityList(){
        return rankListService.getActivityList();
    }
}
