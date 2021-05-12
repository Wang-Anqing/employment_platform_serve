package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.Jobseeker;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WAQ
 * @since 2021-04-21
 */
@Mapper
public interface JobseekerMapper extends BaseMapper<Jobseeker> {
    //返回JobSeeker列表
    List<Jobseeker> allJobSeeker();

    //通过邮箱查询
    Jobseeker findByEmail(String email);

    //通过主键id查询
    Jobseeker findById(int id);

    //注册用户
    void addUser (Jobseeker jobseeker);

    //更改用户个人信息
    boolean updateUser (Jobseeker jobseeker);
}
