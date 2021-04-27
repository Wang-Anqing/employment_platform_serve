package com.waq.employment_platform_serve.controller;


import com.waq.employment_platform_serve.service.impl.MailServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class MailController {
    @Autowired
    private MailServiceImpl MailService;
    @Autowired
    private JavaMailSenderImpl mailSender;
    @Value("${spring.mail.username}")
    private String sender;

    /**
     * 发送验证码到指定邮箱
     */
    @GetMapping("/Vcode")
    public String verCode(String receiver) {
        System.out.println(receiver);
        return MailService.getCode(sender, mailSender, receiver);
    }

}
