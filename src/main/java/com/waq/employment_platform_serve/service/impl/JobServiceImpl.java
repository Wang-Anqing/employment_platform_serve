package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.Job;
import com.waq.employment_platform_serve.mapper.JobMapper;
import com.waq.employment_platform_serve.mapper.JobseekerMapper;
import com.waq.employment_platform_serve.service.JobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WAQ
 * @since 2021-04-21
 */
@Service
public class JobServiceImpl extends ServiceImpl<JobMapper, Job> implements JobService {

    @Autowired
    JobMapper jobMapper;

    @Override
    public List<Job> findByCompanyId(int companyId) {
        return jobMapper.findByCompanyId(companyId);
    }

    @Override
    public boolean addJob(Job job) {
        return jobMapper.addJob(job);
    }

    @Override
    public boolean updateJob(Job job) {
        jobMapper.updateJob(job);
        return true;
    }
}
