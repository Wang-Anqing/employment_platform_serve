package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.webmodel.RankList;

import java.util.List;

public interface RankListMapper {

//    查询热搜榜
    List<RankList> getViewerList();

//    查询热投榜
    List<RankList> getDeliverList();
//    查询活跃榜
    List<RankList> getActivityList();
}
