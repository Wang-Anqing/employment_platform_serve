package com.waq.employment_platform_serve.entity.webmodel;

import lombok.Data;

@Data
public class CompanyListCard {
    private Integer id;//公司id
    private String  name;//公司名称
    private String logoSrc;//公司logo地址
    private String isHot;//火热
    private String isNew;//上新
    private String tag;//标签
    private Integer account;//公司在招岗位数量
}
