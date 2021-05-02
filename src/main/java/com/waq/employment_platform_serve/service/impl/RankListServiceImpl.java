package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.webmodel.RankList;
import com.waq.employment_platform_serve.mapper.RankListMapper;
import com.waq.employment_platform_serve.service.RankListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankListServiceImpl implements RankListService {

    @Autowired
    RankListMapper rankListMapper;

    @Override
    public List<RankList> getViewerList() {
        return rankListMapper.getViewerList();
    }

    @Override
    public List<RankList> getDeliverList() {
        return rankListMapper.getDeliverList();
    }

    @Override
    public List<RankList> getActivityList() {
        return rankListMapper.getActivityList();
    }
}
