package com.augusto.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.augusto.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
