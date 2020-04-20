package com.infosys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "phone_no")
	public long phoneNo;
	public String address;
	public String email;
	public int age;
	public char gender;
	public String name;
	public String password;
	@Column(name = "plan_id")
	public int planId;
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	@Override
	public String toString() {
		return "Customer [phoneNo=" + phoneNo + ", address=" + address + ", email=" + email + ", age=" + age
				+ ", gender=" + gender + ", name=" + name + ", password=" + password + ", planId=" + planId + "]";
	}
	
	
}
