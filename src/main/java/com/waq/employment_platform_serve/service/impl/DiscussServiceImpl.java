package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.Discuss;
import com.waq.employment_platform_serve.mapper.DiscussMapper;
import com.waq.employment_platform_serve.service.DiscussService;
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
 * @since 2021-06-02
 */
@Service
public class DiscussServiceImpl extends ServiceImpl<DiscussMapper, Discuss> implements DiscussService {

    @Autowired
    DiscussMapper discussMapper;

    @Override
    public List<Discuss> getAllDiscuss() {
        return discussMapper.getAllDiscuss();
    }

    @Override
    public List<Discuss> getByType(Integer type) {
        return discussMapper.getByType(type);
    }

    @Override
    public boolean updateDiscuss(Discuss discuss) {
        discussMapper.updateDiscuss(discuss);
        return true;
    }

    @Override
    public boolean addDiscuss(Discuss discuss) {
        discussMapper.addDiscuss(discuss);
        return true;
    }
}
