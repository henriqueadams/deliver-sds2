package com.devsuperior.deliver.dto;

import java.io.Serializable;

import com.devsuperior.deliver.entities.Product;

//objeto para carregador os dados e entregar para o frontend
public class ProductDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private double price;
	private String description;
	private String imageUri;
	
	public ProductDTO() {
		
	}

	public ProductDTO(long id, String name, double price, String description, String imageUri) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUri = imageUri;
	}
	
	public ProductDTO(Product entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.price = entity.getPrice();
		this.description = entity.getDescription();
		this.imageUri = entity.getImageUri();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
	
}
