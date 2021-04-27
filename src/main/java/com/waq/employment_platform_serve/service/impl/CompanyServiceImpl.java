package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.Company;
import com.waq.employment_platform_serve.mapper.CompanyMapper;
import com.waq.employment_platform_serve.service.CompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WAQ
 * @since 2021-04-21
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    @Override
    public Company findById(int id) {
        return this.companyMapper.findById(id);
    }

    @Override
    public boolean updateViewer(int companyId) {
        this.companyMapper.updateViewer(companyId);
        return true;
    }
}
