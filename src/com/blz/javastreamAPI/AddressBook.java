package com.blz.javastreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @author - Priya
 * Purpose to add the details of the person using collection
 */

public class AddressBook {
	List<Person> list = new ArrayList<>();
	// as we use hashSet here multiple entries are not allowed.
	Scanner sc;

	public void addDetails() {
		sc = new Scanner(System.in);

		System.out.print("Enter first name :: ");
		String firstName = sc.next();

		System.out.print("Enter last name :: ");
		String lastName = sc.next();

		System.out.print("Enter your address :: ");
		String address = sc.next();

		System.out.print("Enter your city :: ");
		String city = sc.next();

		System.out.print("Enter zip code :: ");
		int zipCode = sc.nextInt();

		System.out.print("Enter phone number :: ");
		String phoneNumber = sc.next();

		System.out.print("Enter email :: ");
		String email = sc.next();

		list.add(new Person(firstName, lastName, address, city, zipCode, phoneNumber, email));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcom to Address book program using Stream API");
		AddressBook addressBook = new AddressBook();
		addressBook.addDetails();

	}
}