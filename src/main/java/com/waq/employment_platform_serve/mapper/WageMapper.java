package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.Wage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
public interface WageMapper extends BaseMapper<Wage> {
    //获取薪资分享列表
    List<Wage> getWage(Integer companyId);
    //增加薪资分享记录
    boolean shareWage (Wage wage);
}
