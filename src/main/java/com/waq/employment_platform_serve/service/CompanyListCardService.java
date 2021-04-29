package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.webmodel.CompanyListCard;
import com.waq.employment_platform_serve.mapper.CompanyListCardMapper;

import java.util.List;

public interface CompanyListCardService {
    List<CompanyListCard> getList();
    List<CompanyListCard> findByKeyword(String keyword);
    List<CompanyListCard> findByName(String name);
}
