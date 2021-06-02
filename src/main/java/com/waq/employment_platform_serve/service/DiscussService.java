package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.Discuss;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WAQ
 * @since 2021-06-02
 */
public interface DiscussService extends IService<Discuss> {
    List<Discuss> getAllDiscuss();
    List<Discuss> getByType(Integer type);
    boolean updateDiscuss(Discuss discuss);
    boolean addDiscuss(Discuss discuss);
}
