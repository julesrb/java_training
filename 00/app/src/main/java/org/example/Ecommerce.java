package org.example;
import java.util.*;

public class Ecommerce {
	public static void main(String[] args) {

		User John = new User("john_doe", "john@example.com", 123, "credit");

		Order order = new Order(new Cart());
		order.setUser(John);

		order.add_to_order(new Book(1));
		order.add_to_order(new Pen(3));
		order.add_to_order(new Notebook(2));

		order.checkout();
		order.pay();


	}
}
