package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.webmodel.VSendResume;
import com.waq.employment_platform_serve.mapper.VSendResumeMapper;
import com.waq.employment_platform_serve.service.VSendResumeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
@Service
public class VSendResumeServiceImpl extends ServiceImpl<VSendResumeMapper, VSendResume> implements VSendResumeService {

    @Autowired
    VSendResumeMapper vSendResumeMapper;

    @Override
    public List<VSendResume> getInfo(Integer jobseekerId) {
        return vSendResumeMapper.getInfo(jobseekerId);
    }
}
