package com.waq.employment_platform_serve.service.impl;

import com.waq.employment_platform_serve.service.MailService;
import com.waq.employment_platform_serve.util.GenerateVcode;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
public class MailServiceImpl implements MailService {
    /**
     * 验证码
     */
    private String code;
    /**
     * 发送时间
     */
    private Date sendTime;
    @Override
    @Async
    public String getCode(String sender, JavaMailSenderImpl mailSender, String receiver) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("验证码");//设置邮件标题
        code = GenerateVcode.generateVerCode();
        sendTime = new Date();
        message.setText("尊敬的用户,您好:\n"
                + "\n本次请求的邮件验证码为:" + code + ",本验证码5分钟内有效，请及时输入。（请勿泄露此验证码）\n"
                + "\n如非本人操作，请忽略该邮件。\n(这是一封自动发送的邮件，请不要直接回复）");    //设置邮件正文
        message.setFrom(sender);//发件人
        message.setTo(receiver);//收件人
        mailSender.send(message);//发送邮件
        return code;
    }
//
//    @Override
//    public AdvanceResponse addUser(User user, String verCode) {
//        Date date = new Date();
//        //判断验证码
//        if (VerCodeGenerateUtil.getMinute(sendTime, date) > 5) {
//            return AdvanceResponse.failedResponse("验证码已经失效！！！");
//        }
//        if (!verCode.equals(code)) {
//            return AdvanceResponse.failedResponse("验证码不正确！！！");
//        }
//        user.setRole(0);
//        user.setCreateTime(date);
//        user.setUpdateTime(date);
//        userDao.insert(user);
//        code = null;
//        return AdvanceResponse.successResponse();
//    }
}
