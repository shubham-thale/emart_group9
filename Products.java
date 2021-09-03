package com.vita.emart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Products{

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long prod_id;
	
	@Column
	 private String prod_name;
	
	@Column
	 private String prod_description;
	
	@Column
	 private String brand;
	
	@Column
	 private String model_no;
	
	@Column
	private String prod_quantity;
	
	@Column
	 private String prime_price;
	
	@Column
	private double total_price;
	
	@Column
	private String discount;
	
	@Column
	private double discounted_price;
	
	@Column
	private int points;
	
	@Column
	private String available;
	
	@Column
	private String p_image_path;
	
	@ManyToOne
	private Category category;

	public long getProd_id() {
		return prod_id;
	}


	public void setProd_id(long prod_id) {
		this.prod_id = prod_id;
	}


	public String getProd_name() {
		return prod_name;
	}


	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}


	public String getProd_description() {
		return prod_description;
	}


	public void setProd_description(String prod_description) {
		this.prod_description = prod_description;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel_no() {
		return model_no;
	}


	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}


	public String getProd_quantity() {
		return prod_quantity;
	}


	public void setProd_quantity(String prod_quantity) {
		this.prod_quantity = prod_quantity;
	}


	public String getPrime_price() {
		return prime_price;
	}


	public void setPrime_price(String prime_price) {
		this.prime_price = prime_price;
	}


	public double getTotal_price() {
		return total_price;
	}


	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}


	public String getDiscount() {
		return discount;
	}


	public void setDiscount(String discount) {
		this.discount = discount;
	}


	public double getDiscounted_price() {
		return discounted_price;
	}


	public void setDiscounted_price(double discounted_price) {
		this.discounted_price = discounted_price;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	public String getAvailable() {
		return available;
	}


	public void setAvailable(String available) {
		this.available = available;
	}


	public String getP_image_path() {
		return p_image_path;
	}


	public void setP_image_path(String p_image_path) {
		this.p_image_path = p_image_path;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	
	 
	

}
