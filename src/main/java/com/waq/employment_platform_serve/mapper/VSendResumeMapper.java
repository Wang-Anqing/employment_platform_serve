package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.webmodel.VSendResume;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * VIEW Mapper 接口
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
public interface VSendResumeMapper extends BaseMapper<VSendResume> {
    //获得简历投递情况
    List<VSendResume> getInfo(Integer jobseekerId);
}
