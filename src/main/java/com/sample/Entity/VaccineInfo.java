package com.sample.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VaccineInfo {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="VACCINENAME")
	private String vaccineName;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="PRICE")
	private Integer price;
	
	public VaccineInfo() {
		super();
		System.out.println("Constructor is called");
	}
	public VaccineInfo(String vaccineName, String country, Integer price) {
		super();
		this.vaccineName = vaccineName;
		this.country = country;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "VaccineInfo [id=" + id + ", vaccineName=" + vaccineName + ", country=" + country + ", price=" + price
				+ "]";
	}


	
	
	
}
