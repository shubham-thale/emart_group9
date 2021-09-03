package com.vita.emart.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author shubh
 *
 */
@Entity
public class Category{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long cat_id;
	
	@Column
	private long subcat_id;
	
	@Column
	private String cat_name;
	
	@Column
	 private String cat_image_path;
	
	@OneToMany(mappedBy = "category")
	private List<Products> products;

	
	
	public long getCat_id() {
		return cat_id;
	}

	public void setCat_id(long cat_id) {
		this.cat_id = cat_id;
	}

	public long getSubcat_id() {
		return subcat_id;
	}

	public void setSubcat_id(long subcat_id) {
		this.subcat_id = subcat_id;
	}

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	public String getCat_image_path() {
		return cat_image_path;
	}

	public void setCat_image_path(String cat_image_path) {
		this.cat_image_path = cat_image_path;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	
}
