package com.waq.employment_platform_serve.entity.webmodel;

import lombok.Data;

@Data
public class RecomCard {
    private Integer id  ;// 公司主键
    private String name;// 公司名称
    private String des;//招聘简介
    private String isHot;// 是否为hot
    private String isNew;// 是否为new
    private String postSrc;// 海报src
    private Integer viewer;// 浏览人数
}
