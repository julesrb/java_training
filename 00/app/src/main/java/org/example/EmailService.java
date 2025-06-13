package org.example;
import java.util.*;

public class EmailService {
	private static final EmailService singleton = new EmailService();

	private EmailService(){}

	public static EmailService getInstance(){
			return singleton;
	}

	void sendConfirmationEmail(String email, double total){
		System.out.println("Sending confirmation email to " + email + " for €" + total + "...");
	}
}