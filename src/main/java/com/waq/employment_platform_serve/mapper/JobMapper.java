package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.Job;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WAQ
 * @since 2021-04-21
 */
public interface JobMapper extends BaseMapper<Job> {

    //通过公司id查出所有对应的工作信息
    List<Job>findByCompanyId(int companyId);
//    新增工作
    boolean addJob(Job job);
}
