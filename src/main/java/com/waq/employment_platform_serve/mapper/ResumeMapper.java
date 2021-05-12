package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.Resume;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WAQ
 * @since 2021-05-10
 */
public interface ResumeMapper extends BaseMapper<Resume> {

    //获取全部简历
    List<Resume> getList (Integer id);
    //跟新简历信息
    boolean updateResume (Resume resume);
}
