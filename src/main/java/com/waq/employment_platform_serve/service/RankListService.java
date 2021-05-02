package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.webmodel.RankList;

import java.util.List;

public interface RankListService {
    List<RankList> getViewerList();
    List<RankList> getDeliverList();
    List<RankList> getActivityList();
}
