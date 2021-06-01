package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.Resumebox;
import com.waq.employment_platform_serve.mapper.ResumeboxMapper;
import com.waq.employment_platform_serve.service.ResumeboxService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WAQ
 * @since 2021-06-01
 */
@Service
public class ResumeboxServiceImpl extends ServiceImpl<ResumeboxMapper, Resumebox> implements ResumeboxService {

    @Autowired ResumeboxMapper resumeboxMapper;

    @Override
    public boolean sendResume(Resumebox resumebox) {
        resumeboxMapper.sendResume(resumebox);
        return true;
    }
}
