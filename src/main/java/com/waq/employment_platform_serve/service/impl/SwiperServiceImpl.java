package com.waq.employment_platform_serve.service.impl;


import com.waq.employment_platform_serve.entity.webmodel.Swiper;
import com.waq.employment_platform_serve.mapper.SwiperMapper;
import com.waq.employment_platform_serve.service.SwiperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwiperServiceImpl implements SwiperService {

    @Autowired
    SwiperMapper swiperMapper;

    @Override
    public List<Swiper> initSwiper() {
        return this.swiperMapper.initSwiper();
    }
}
