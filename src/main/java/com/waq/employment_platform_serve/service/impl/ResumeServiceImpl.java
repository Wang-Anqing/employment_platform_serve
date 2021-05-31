package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.Resume;
import com.waq.employment_platform_serve.mapper.ResumeMapper;
import com.waq.employment_platform_serve.service.ResumeService;
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
 * @since 2021-05-10
 */
@Service
public class ResumeServiceImpl extends ServiceImpl<ResumeMapper, Resume> implements ResumeService {

    @Autowired
    ResumeMapper resumeMapper;

    @Override
    public List<Resume> getList(Integer jobseekerId) {
        return resumeMapper.getList(jobseekerId);
    }

    @Override
    public boolean updateResume(Resume resume) {
        return resumeMapper.updateResume(resume);
    }

    @Override
    public boolean addResume(Resume resume) {
        return resumeMapper.addResume(resume);
    }

}
