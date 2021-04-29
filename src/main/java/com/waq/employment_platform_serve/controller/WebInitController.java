package com.waq.employment_platform_serve.controller;

import com.waq.employment_platform_serve.entity.webmodel.CompanyListCard;
import com.waq.employment_platform_serve.entity.webmodel.RecomCard;
import com.waq.employment_platform_serve.entity.webmodel.Swiper;
import com.waq.employment_platform_serve.service.impl.CompanyListCardServiceImpl;
import com.waq.employment_platform_serve.service.impl.RecomCardServiceImpl;
import com.waq.employment_platform_serve.service.impl.SwiperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WebInitController {

    @Autowired
    SwiperServiceImpl swiperService;
    @Autowired
    RecomCardServiceImpl recomCardService;
    @Autowired
    CompanyListCardServiceImpl companyListCardService;

//    初始化首页轮播图
    @GetMapping("/init/swiper")
    public List<Swiper> swiperList(){
//        System.out.println(swiperService.initSwiper());
        return swiperService.initSwiper();
    }
//    初始化首页推荐海报
    @GetMapping("/init/recomCard")
    public List<RecomCard> recomCardList(){
        System.out.println(recomCardService.cardList());
        return recomCardService.cardList();
    }

//      初始化求职页面，公司列表
    @GetMapping("/init/companyListCard/{keyword}")
    public List<CompanyListCard>listCard(@PathVariable String keyword){
        if (keyword.equals("all")){
            return companyListCardService.getList();
        }
        else
            return companyListCardService.findByKeyword(keyword);
    }

//    求职页面，根据输入的公司名称进行查找
    @GetMapping("/search/companyListCard/{name}")
    public List<CompanyListCard>list(@PathVariable String name){
        return companyListCardService.findByName(name);
    }
//    首页推荐列表根据tag查找
    @GetMapping("/search/recomCard/{tag}")
    public List<RecomCard>recomCardList(@PathVariable String tag){
        return recomCardService.findByTag(tag);
    }
}
