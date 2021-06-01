package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.Resumestate;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
public interface ResumestateService extends IService<Resumestate> {
    //更新简历投递状态
    boolean  addState(Resumestate resumestate);
}
