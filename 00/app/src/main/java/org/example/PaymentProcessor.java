package org.example;
import java.util.*;

public class PaymentProcessor {
	private static final PaymentProcessor singleton = new PaymentProcessor();

	private PaymentProcessor(){}

	public static PaymentProcessor getInstance(){
			return singleton;
	}

	boolean process_payment(double amount, String method) {
		if (method.equals("credit")) {
			System.out.println("Processing credit payment for €" + amount + "...");
			return true;
		} else if (method.equals("paypal")) {
			System.out.println("Redirecting to PayPal for €" + amount + "...");
			return true;
		} else if (method.equals("crypto")) {
			System.out.println("Processing crypto payment...");
			return false; // simulate failure
		}
		return false;
	}
}