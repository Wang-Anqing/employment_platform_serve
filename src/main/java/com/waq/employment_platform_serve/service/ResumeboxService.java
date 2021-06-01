package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.Resumebox;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
public interface ResumeboxService extends IService<Resumebox> {
    //投递简历
    boolean sendResume(Resumebox resumebox);
}
