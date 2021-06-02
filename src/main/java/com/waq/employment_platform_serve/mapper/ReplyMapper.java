package com.waq.employment_platform_serve.mapper;

import com.waq.employment_platform_serve.entity.Reply;
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
public interface ReplyMapper extends BaseMapper<Reply> {
    List<Reply> getReply(Integer discussId);
    boolean addReply(Reply reply);
}
