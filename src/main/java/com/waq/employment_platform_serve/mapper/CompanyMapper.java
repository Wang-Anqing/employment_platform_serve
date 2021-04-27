package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.Company;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WAQ
 * @since 2021-04-21
 */
public interface CompanyMapper extends BaseMapper<Company> {
//    主键id查询企业信息
    Company findById(int id);
//    更新浏览人数
    void updateViewer(int companyId);
}
