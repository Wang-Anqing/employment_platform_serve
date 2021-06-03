package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.Company;
import com.baomidou.mybatisplus.extension.service.IService;
import com.waq.employment_platform_serve.mapper.CompanyMapper;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WAQ
 * @since 2021-04-21
 */
public interface CompanyService extends IService<Company> {
//    通过id查询企业信息
    Company findById(int id);
//    更新浏览人数
    boolean updateViewer(int companyId);
//    根据Email查找信息
    Company findByEmail(String email);
//    核对登录信息并登录
    boolean checkLogin(String email,String password);
//    更新公司信息
    boolean updateCompany(Company company);
    //    新增招聘单位
    boolean addCompany (Company company);
}
