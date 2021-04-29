package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.webmodel.RecomCard;

import java.util.List;

public interface RecomCardMapper {
//    初始化推荐页面
    List<RecomCard> cardList();
//    根据标签推荐海报
    List<RecomCard> findByTag(String tag);
}
