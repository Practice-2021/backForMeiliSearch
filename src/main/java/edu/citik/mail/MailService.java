package edu.citik.mail;

import com.sun.mail.smtp.SMTPTransport;
import edu.citik.configuration.EmailProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class MailService {
	@Autowired
	private EmailProperties emailProperties;

	private static final String SMTP_SERVER = "smtp.yandex.ru";
	private static final String SMTP_PORT = "465";
	private static final String EMAIL_SUBJECT = "Incorrect information";

	private final Properties properties;
	private final Session session;
	private final Message msg;

	public MailService() {
		properties = System.getProperties();
		properties.put("mail.smtp.host", SMTP_SERVER);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.port", SMTP_PORT);
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		session = Session.getInstance(properties, null);
		msg = new MimeMessage(session);
	}

	public void send(String message) throws MessagingException {
		String ADMIN_ADDRESS = emailProperties.getAdminAddress();
		String SENDER_MAIL = emailProperties.getSenderMail();
		String SENDER_USERNAME = emailProperties.getSenderUsername();
		String SENDER_PASSWORD = emailProperties.getSenderPassword();

		msg.setFrom(new InternetAddress(SENDER_MAIL));

		msg.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(ADMIN_ADDRESS, false));

		msg.setSubject(EMAIL_SUBJECT);
		msg.setContent(message, "text/html; charset=utf-8");

		SMTPTransport transport = (SMTPTransport) session.getTransport("smtp");

		transport.connect(SMTP_SERVER, SENDER_USERNAME, SENDER_PASSWORD);
		transport.sendMessage(msg, msg.getAllRecipients());

		transport.close();
	}
}
