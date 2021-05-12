package com.ojas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private String h_No;
	private String street;
	private String district;
	private String pincode;

	public Address() {
		super();
	}

	public String getH_No() {
		return h_No;
	}

	public void setH_No(String h_No) {
		this.h_No = h_No;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [h_No=" + h_No + ", street=" + street + ", district=" + district + ", pincode=" + pincode + "]";
	}
}
