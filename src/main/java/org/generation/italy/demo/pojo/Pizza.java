package org.generation.italy.demo.pojo;

import org.generation.italy.interf.PriceableInt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


@Entity
@Table
public class Pizza implements PriceableInt{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty(message="il nome della pizza non può essere vuoto")
	@Column
	private String name;
	
	@Column
	@Lob
	private String description;
	
	@Column
	@NotNull(message = "inserire il prezzo")
	@Min(value=1, message="Il prezzo non può essere inferiore a 1€")
	private int price;

	public Pizza() {}
	public Pizza(String name, String description, int price) {
	
		setName(name);
		setDescription(description);
		setPrice(price);
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	@Override
	public int getPrice() {
		return price;
	}
	@Override
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return getId() 
				+ " - " 
				+ getName() 
				+ " - " 
				+ getDescription() 
				+ " - " 
				+ getPrice() + "$";
	}
}
