package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.webmodel.CompanyListCard;
import com.waq.employment_platform_serve.mapper.CompanyListCardMapper;
import com.waq.employment_platform_serve.service.CompanyListCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyListCardServiceImpl implements CompanyListCardService {

    @Autowired
    CompanyListCardMapper companyListCardMapper;

    @Override
    public List<CompanyListCard> getList() {

        return companyListCardMapper.getList();
    }

    @Override
    public List<CompanyListCard> findByKeyword(String keyword) {

        return companyListCardMapper.findByKeyword(keyword);
    }


}
