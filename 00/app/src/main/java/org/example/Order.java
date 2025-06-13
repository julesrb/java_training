package org.example;
import java.util.*;


public class Order {
	public double total = 0.0;
	final double taxRate = 0.19;
	private double tax = 0.0;
	private double discount = 0.0;
	private Cart cart;
	private User user;
	private EmailService emailService;
	private PaymentProcessor paymentProcessor;
	private DiscountCalculator discountCalculator;
	private boolean paid = false;


	public Order(Cart cart){
		this.cart = cart;
		emailService = EmailService.getInstance();
		paymentProcessor = PaymentProcessor.getInstance();
		discountCalculator = DiscountCalculator.getInstance();
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	public void add_to_order(Product product) {
		cart.add_to_cart(product);
		update_total(product);
	}

	public void update_total(Product product){
		total += product.price * product.quantities;
		System.out.println("new total: " + total + "€");
	}

	public void checkout() {
		discount = discountCalculator.calculate_discount(total);
		tax = (total - discount) * taxRate;
		System.out.println("User: " + user.name + " (" + user.email + ")");
		System.out.println("Subtotal: €" + (total - discount));
		System.out.println("Tax (19%): €" + tax);
		System.out.println("Total: €" + (total + tax - discount));
	}

	public void pay() {
		if (paymentProcessor.process_payment(total + tax - discount, user.paymentMethod))
			emailService.sendConfirmationEmail(user.email, total + tax - discount);
		else
			System.out.println("Payment failed...");
	}
}