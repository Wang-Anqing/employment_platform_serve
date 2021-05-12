package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.Jobseeker;
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
public interface JobseekerService extends IService<Jobseeker> {
    //返回JobSeeker列表
    List<Jobseeker> allJobSeeker();

    //通过邮箱查询
    Jobseeker findByEmail(String email);

    //通过主键id查询
    Jobseeker findById(Integer id);

    //判断是否登陆成功
    boolean checkLogin(String email,String password);

    //注册用户
    boolean addUser(Jobseeker jobseeker);

    //更新用户个人信息
    boolean updateUser(Jobseeker jobseeker);
}
