package com.waq.employment_platform_serve.entity.webmodel;

import lombok.Data;

@Data
public class RankList {
    private Integer id;//公司id
    private String name;//公司名称
    private String isHot;//是否火热
    private String isNew;//是否为新
    private Integer heat;//热度，或者说是各个榜单的具体数值(浏览数，投递数，活跃度)
}
