package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.Job;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WAQ
 * @since 2021-04-21
 */
public interface JobService extends IService<Job> {

    //通过公司id查找所有工作的信息
    List<Job> findByCompanyId(int companyId);
    //    新增工作
    boolean addJob(Job job);
//    更新工作信息
    boolean updateJob(Job job);
}
