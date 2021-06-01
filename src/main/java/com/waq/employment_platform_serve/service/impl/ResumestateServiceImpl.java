package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.Resumestate;
import com.waq.employment_platform_serve.mapper.ResumestateMapper;
import com.waq.employment_platform_serve.service.ResumestateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
@Service
public class ResumestateServiceImpl extends ServiceImpl<ResumestateMapper, Resumestate> implements ResumestateService {

    @Autowired ResumestateMapper resumestateMapper;

    @Override
    public boolean addState(Resumestate resumestate) {
        resumestateMapper.addState(resumestate);
        return true;
    }
}
