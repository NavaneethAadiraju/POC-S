package com.ojas.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentInfo")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "stdid")
	private int id;
	@Column(name = "stdname")
	private String name;
	@Column(name = "class")
	private String stdclass;
	@Embedded
	@Column(name = "Address")
	private Address address;
	@Column(name = "email-Id")
	private String email;
	@Column(name = "mobile")
	private String phNumber;

	public Student() {
		super();
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

	public String getStdclass() {
		return stdclass;
	}

	public void setStdclass(String stdclass) {
		this.stdclass = stdclass;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", stdclass=" + stdclass + ", address=" + address + ", email="
				+ email + ", phNumber=" + phNumber + "]";
	}

}
