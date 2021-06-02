package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.Reply;
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
public interface ReplyService extends IService<Reply> {
    List<Reply> getReply(Integer discussId);
    boolean addReply(Reply reply);
}
