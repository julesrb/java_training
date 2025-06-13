package org.example;
import java.util.*;

public class DiscountCalculator {
	private static final DiscountCalculator singleton = new DiscountCalculator();

	private DiscountCalculator(){}

	public static DiscountCalculator getInstance(){
			return singleton;
	}
	
	double calculate_discount(double total){
		if (total > 50) {
			double discount = total * 0.1;
			System.out.println("10% discount applied: -€" + discount);
			return discount;
		}
		else
			return 0.0;
	}
}