package org.generation.italy.demo.pojo;

public class Pizza {

	private String name;
	private String description;
	private int price;
	
	public Pizza(String name, String description, int price) {
		
		setName(name);
		setDescription(description);
		setPrice(price);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
