package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.Jobseeker;
import com.waq.employment_platform_serve.mapper.JobseekerMapper;
import com.waq.employment_platform_serve.service.JobseekerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
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
public class JobseekerServiceImpl extends ServiceImpl<JobseekerMapper, Jobseeker> implements JobseekerService {

    @Autowired JobseekerMapper jobseekerMapper;

    @Override
    public List<Jobseeker> allJobSeeker() {
        return this.jobseekerMapper.allJobSeeker();
    }

    @Override
    public Jobseeker findByEmail(String email) {
        return this.jobseekerMapper.findByEmail(email);
    }

    @Override
    public Jobseeker findById(Integer id) {
        return  this.jobseekerMapper.findById(id);
    }

    @Override
    public boolean checkLogin(String email, String password) {
        Jobseeker jobseeker = this.jobseekerMapper.findByEmail(email);
        System.out.println("email为："+email);
        System.out.println("password为："+password);
        System.out.println("ServiceImpl为：");
        System.out.println(jobseeker);

        if (jobseeker == null){
            System.out.println("未查询到!!!");
            return false;
        }else if (jobseeker.getPassword().equals(password) && jobseeker.getEmail().equals(email)){
            return true;
        }
        else{
            System.out.println("这里错了！！！");
            return false;
        }
    }
    @Override
    public boolean addUser(Jobseeker jobseeker){
        if (jobseekerMapper.findByEmail(jobseeker.getEmail()) != null)
        {
            System.out.println("ServiceImpl为："+jobseekerMapper.findByEmail(jobseeker.getEmail()));
            return false;
        }
        else {
            System.out.println("ServiceImpl用户添加成功");
            jobseekerMapper.addUser(jobseeker);
            return true;
        }
    }

}
