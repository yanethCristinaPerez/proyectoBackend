package com.proyecto.proyecto.servicios;

import com.proyecto.proyecto.entidades.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EnvioCorreoService {

    @Autowired
    private JavaMailSender javaMailSender;

    //String from, String to, String subject, String body, Factura factura
    public void sendMail(String to, Factura factura) {

        SimpleMailMessage mail = new SimpleMailMessage();

        //mail.setFrom(from);
        mail.setTo(to);
        //mail.setSubject(subject);
        //mail.setText(body);

        javaMailSender.send(mail);
    }
}
