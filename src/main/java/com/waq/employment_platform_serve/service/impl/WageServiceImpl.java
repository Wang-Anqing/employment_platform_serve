package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.Wage;
import com.waq.employment_platform_serve.mapper.WageMapper;
import com.waq.employment_platform_serve.service.WageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
@Service
public class WageServiceImpl extends ServiceImpl<WageMapper, Wage> implements WageService {

    @Autowired
    WageMapper wageMapper;


    @Override
    public List<Wage> getWage(Integer companyId) {
        return wageMapper.getWage(companyId);
    }

    @Override
    public boolean shareWage(Wage wage) {
        wageMapper.shareWage(wage);
        return true;
    }

}
