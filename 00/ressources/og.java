// CartSystem.java

import java.util.*;

public class CartSystem {

	public static void main(String[] args) {
		// String username = "john_doe";
		// String email = "john@example.com";
		// int userId = 123;
		// String paymentMethod = "credit";

		// List<String> productNames = Arrays.asList("Book", "Pen", "Notebook");
		// List<Double> productPrices = Arrays.asList(12.99, 1.5, 5.25);
		// List<Integer> productQuantities = Arrays.asList(1, 3, 2);
		// List<String> categories = Arrays.asList("Stationery", "Stationery", "Stationery");

		// double total = 0.0;
		double taxRate = 0.19;
		double discount = 0.0;

		// for (int i = 0; i < productNames.size(); i++) {
			// double itemTotal = productPrices.get(i) * productQuantities.get(i);
			// total += itemTotal;
			// System.out.println("Added to cart: " + productQuantities.get(i) + " x " + productNames.get(i) + " (€" + productPrices.get(i) + " each)");
		// }

		if (total > 50) {
			discount = total * 0.1;
			total -= discount;
			System.out.println("10% discount applied: -€" + discount);
		}

		// double tax = total * taxRate;
		// total += tax;

		// System.out.println("User: " + username + " (" + email + ")");
		// System.out.println("Subtotal: €" + (total - tax));
		// System.out.println("Tax (19%): €" + tax);
		// System.out.println("Total: €" + total);

		boolean paid = processPayment(total, paymentMethod);
		if (paid) {
			System.out.println("Order confirmed for " + username + "!");
		} else {
			System.out.println("Payment failed. Please try again.");
		}

		sendConfirmationEmail(email, total);
	}

	public static boolean processPayment(double amount, String method) {
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

	public static void sendConfirmationEmail(String email, double total) {
		System.out.println("Sending confirmation email to " + email + " for €" + total + "...");
	}
}
