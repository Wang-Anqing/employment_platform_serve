package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.Wage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
public interface WageService extends IService<Wage> {
    //获取薪资分享信息
    List<Wage> getWage(Integer companyId);

    boolean shareWage (Wage wage);
}
