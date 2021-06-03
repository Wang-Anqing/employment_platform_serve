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

    @Override
    public Company findByEmail(String email) {
        return companyMapper.findByEmail(email);
    }

    @Override
    public boolean checkLogin(String email, String password) {
        Company company = companyMapper.findByEmail(email);
        System.out.println("email为："+email);
        System.out.println("password为："+password);
        System.out.println("companyServiceImpl为：");
        System.out.println(company);

        if (company == null){
            System.out.println("未查询到!!!");
            return false;
        }else if (company.getPassword().equals(password) && company.getEmail().equals(email)){
            return true;
        }
        else{
            System.out.println("这里错了！！！");
            return false;
        }
    }

    @Override
    public boolean updateCompany(Company company) {
        return companyMapper.updateCompany(company);
    }

    @Override
    public boolean addCompany(Company company) {
        return companyMapper.addCompany(company);
    }


}
