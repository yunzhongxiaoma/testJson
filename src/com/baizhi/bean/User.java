package com.baizhi.bean;

public class User {
	private String name;
	private String password;
	private Integer age;
	private Address address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String password, Integer age, Address address) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.address = address;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + ", address=" + address + "]";
	}

}
