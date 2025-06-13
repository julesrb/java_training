package org.example;
import java.util.*;


public class User {
	public String	name;
	public String	email;
	public int		id;
	public String	paymentMethod;

	public User(String name, String email, int id, String paymentMethod) {
		this.name = name;
		this.email = email;
		this.id = id;
		this.paymentMethod = paymentMethod;
	}
}