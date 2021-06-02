package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.Discuss;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WAQ
 * @since 2021-06-02
 */
public interface DiscussMapper extends BaseMapper<Discuss> {
    //获取讨论区主贴内容
    List<Discuss> getAllDiscuss();
    //根据分类获取
    List<Discuss> getByType(Integer type);
    //更新帖子信息
    boolean updateDiscuss(Discuss discuss);
    //新增帖子
    boolean addDiscuss(Discuss discuss);
}
