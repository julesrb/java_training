package org.example;
import java.util.*;

public abstract class Product {
	public String	name;
	public double	price;
	public String	category;
	public int		quantities;

	public Product(String name, double price, String category, int quantities) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantities = quantities;
	}
}