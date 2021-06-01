package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.Resumebox;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
public interface ResumeboxMapper extends BaseMapper<Resumebox> {
    //投递简历
    boolean sendResume(Resumebox resumebox);
}
