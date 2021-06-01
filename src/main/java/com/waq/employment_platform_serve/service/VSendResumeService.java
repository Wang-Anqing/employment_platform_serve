package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.webmodel.VSendResume;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
public interface VSendResumeService extends IService<VSendResume> {
    List<VSendResume> getInfo(Integer jobseekerId);
}
