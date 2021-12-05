package edu.citik.configuration;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@ConstructorBinding
@ConfigurationProperties(prefix = "mail")
public class EmailProperties {
	public String adminAddress;
	public String senderMail;
	public String senderUsername;
	public String senderPassword;

	public EmailProperties(String adminAddress, String senderMail, String senderUsername, String senderPassword) {
		this.adminAddress = adminAddress;
		this.senderMail = senderMail;
		this.senderUsername = senderUsername;
		this.senderPassword = senderPassword;
	}
}
