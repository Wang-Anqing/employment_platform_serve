package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.webmodel.VCompanyReceiveResume;
import com.waq.employment_platform_serve.mapper.VCompanyReceiveResumeMapper;
import com.waq.employment_platform_serve.service.VCompanyReceiveResumeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author WAQ
 * @since 2021-06-04
 */
@Service
public class VCompanyReceiveResumeServiceImpl extends ServiceImpl<VCompanyReceiveResumeMapper, VCompanyReceiveResume> implements VCompanyReceiveResumeService {

    @Autowired
    VCompanyReceiveResumeMapper vCompanyReceiveResumeMapper;


    @Override
    public List<VCompanyReceiveResume> getByCompanyId(Integer companyId) {
        return vCompanyReceiveResumeMapper.getByCompanyId(companyId);
    }
}
