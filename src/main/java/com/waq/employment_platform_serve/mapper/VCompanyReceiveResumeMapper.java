package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.webmodel.VCompanyReceiveResume;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * VIEW Mapper 接口
 * </p>
 *
 * @author WAQ
 * @since 2021-06-04
 */
public interface VCompanyReceiveResumeMapper extends BaseMapper<VCompanyReceiveResume> {
    List<VCompanyReceiveResume> getByCompanyId(Integer companyId);
}
