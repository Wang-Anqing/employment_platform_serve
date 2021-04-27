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
}
