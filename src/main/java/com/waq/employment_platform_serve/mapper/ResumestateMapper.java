package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.Resumestate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
public interface ResumestateMapper extends BaseMapper<Resumestate> {
    //更新简历投递状态
    boolean addState(Resumestate resumestate);
}
