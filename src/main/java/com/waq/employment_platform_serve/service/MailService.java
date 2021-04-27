package com.waq.employment_platform_serve.service;

import com.waq.employment_platform_serve.entity.Jobseeker;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public interface MailService {
    /**
     * 发送验证码到指定邮箱
     * @param sender 发送地址
     * @param mailSender spring自带
     * @param receiver 接受地址
     */
    String getCode(String sender, JavaMailSenderImpl mailSender, String receiver);
    /**
     * 注册用户
     */
//    AdvanceResponse addUser(Jobseeker jobseeker, String verCode);

}
