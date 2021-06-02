package com.waq.employment_platform_serve.controller;


import com.waq.employment_platform_serve.entity.Reply;
import com.waq.employment_platform_serve.service.impl.ReplyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WAQ
 * @since 2021-06-02
 */
@RestController
@RequestMapping("/api")
public class ReplyController {
    @Autowired
    ReplyServiceImpl replyService;

    @PostMapping("/getReply")
    public List<Reply> getReply(@RequestBody Reply reply){
        return replyService.getReply(reply.getDiscussId());
    }

    @PostMapping("/addReply")
    public boolean addReply(@RequestBody Reply reply){
        replyService.addReply(reply);
        return true;
    }
}

