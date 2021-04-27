package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.webmodel.Swiper;

import java.util.List;

public interface SwiperService {

    // 查询要加在的轮播图信息
    List<Swiper> initSwiper();
}
