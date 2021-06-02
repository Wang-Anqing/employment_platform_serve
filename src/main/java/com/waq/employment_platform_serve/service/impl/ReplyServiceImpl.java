package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.entity.Reply;
import com.waq.employment_platform_serve.mapper.ReplyMapper;
import com.waq.employment_platform_serve.service.ReplyService;
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
public class ReplyServiceImpl extends ServiceImpl<ReplyMapper, Reply> implements ReplyService {

    @Autowired
    ReplyMapper replyMapper;

    @Override
    public List<Reply> getReply(Integer discussId) {
        return replyMapper.getReply(discussId);
    }

    @Override
    public boolean addReply(Reply reply) {
        replyMapper.addReply(reply);
        return true;
    }
}
