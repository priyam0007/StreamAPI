package com.blz.javastreamAPI;

public class Person {
	String firstName;
	String lastName;
	String address;
	String city;
	int zipCode;
	long phoneNumber;
	String email;
	String state;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return email;
	}

	public void setEmailId(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "PersonDetails : [" + "First-Name ='" + firstName + '\'' + ", Last-Name ='" + lastName + '\''
				+ ", Address ='" + address + '\'' + ", City ='" + city + '\'' + ", State ='" + state + '\''
				+ ", ZipCode =" + zipCode + ", Phone-Number =" + phoneNumber + ", EmailId ='" + email + '\'' + ']';
	}
}
