package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.webmodel.CompanyListCard;

import java.util.List;

public interface CompanyListCardMapper {
//    获取全部公司列表卡片信息
    List<CompanyListCard> getList();
//    根据关键词获取公司卡片信息
    List<CompanyListCard> findByKeyword(String keyword);
}
