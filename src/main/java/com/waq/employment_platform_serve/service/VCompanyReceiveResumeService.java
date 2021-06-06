package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.webmodel.VCompanyReceiveResume;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author WAQ
 * @since 2021-06-04
 */
public interface VCompanyReceiveResumeService extends IService<VCompanyReceiveResume> {
    List<VCompanyReceiveResume> getByCompanyId(Integer companyId);
}
