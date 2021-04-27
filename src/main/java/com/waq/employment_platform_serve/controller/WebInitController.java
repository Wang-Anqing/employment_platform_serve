package com.waq.employment_platform_serve.controller;

import com.waq.employment_platform_serve.entity.webmodel.RecomCard;
import com.waq.employment_platform_serve.entity.webmodel.Swiper;
import com.waq.employment_platform_serve.service.impl.RecomCardServiceImpl;
import com.waq.employment_platform_serve.service.impl.SwiperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/init/swiper")
    public List<Swiper> swiperList(){
//        System.out.println(swiperService.initSwiper());
        return swiperService.initSwiper();
    }

    @GetMapping("/init/recomCard")
    public List<RecomCard> recomCardList(){
        System.out.println(recomCardService.cardList());
        return recomCardService.cardList();
    }
}
