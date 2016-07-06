package org.goshop.email.service;

import org.goshop.common.dubbo.spring.annotation.DubboService;
import org.goshop.email.i.EMailService;
import org.goshop.email.utils.SimpleMailSender;
import org.springframework.beans.factory.annotation.Value;

import javax.mail.MessagingException;

@DubboService(interfaceClass = EMailService.class)
public class EMailServiceImpl implements EMailService {

    @Value("${EMAIL_ADDRESS}")
    private String eMailAddress;

    @Value("${EMAIL_PASSWORD}")
    private String eMailPassword;


    @Override
    public void send(String email,String title, String emailContent) {
        SimpleMailSender sms = new SimpleMailSender(eMailAddress,eMailPassword);
        try {
            sms.send(email,title,emailContent);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
