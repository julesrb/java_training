package org.example;
import java.util.*;


public class Cart {
	public List<Product> items;

	public Cart() {
		this.items = new ArrayList<>();
	}

	void add_to_cart(Product product) {
		items.add(product);
		System.out.println("Added to cart: " + product.quantities + " x " + product.name + " (€" + product.price + " each)");
	}
}