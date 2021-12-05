package edu.citik.controller;

import edu.citik.domain.dto.ErrorMessageDto;
import edu.citik.mail.MailService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.mail.MessagingException;

@AllArgsConstructor
@Controller("/mail")
public class MailController {
	private final MailService mailService;

	@PostMapping("/error")
	public ResponseEntity reportError(@RequestBody ErrorMessageDto errorMessageDto) throws MessagingException {
		String message = "В информации обнаружена ошибка. Подробности: <br>" + errorMessageDto.toString();
		mailService.send(message);
		return new ResponseEntity(HttpStatus.OK);
	}
}
