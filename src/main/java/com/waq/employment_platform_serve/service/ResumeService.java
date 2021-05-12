package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.Resume;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WAQ
 * @since 2021-05-10
 */
public interface ResumeService extends IService<Resume> {
    //获取用户全部简历信息
    List<Resume> getList(Integer jobseekerId);
    //更新简历信息
    boolean updateResume(Resume resume);
}
