package com.blz.javastreamAPI;

import java.util.ArrayList;
import java.util.Iterator;
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

//	Edit the contact details

	private void editContact() {
		System.out.print("Enter person name to edit person :: ");
		String editPersonName = sc.next();
		Person person = getPerson(editPersonName);
		System.out.print(
				"Enter what you want to edit :: 1-first name\n2-lastname\n3-address\n4-city\n5-zip code\n6-phone number\n7-email\n::-> ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			editFirstName(person);
			break;
		case 2:
			editLastName(person);
			break;
		case 3:
			editAddress(person);
			break;
		case 4:
			editCity(person);
			break;
		case 5:
			editZipCode(person);
			break;
		case 6:
			editPhoneNumber(person);
			break;
		case 7:
			editEmail(person);
			break;
		default:
			System.out.println("Enter valid choice :");
		}

		System.out.println(list);
	}

	private void editEmail(Person person) {
		sc = new Scanner(System.in);
		System.out.print("Enter new email here :-> ");
		person.email = sc.next();
	}

	private void editPhoneNumber(Person person) {
		sc = new Scanner(System.in);
		System.out.print("Enter new phone number here :-> ");
		person.phoneNumber = sc.next();
		System.out.println("Done");

	}

	private void editZipCode(Person person) {
		sc = new Scanner(System.in);
		System.out.print("Enter new zip code here :-> ");
		person.zipCode = sc.nextInt();
		System.out.println("Done");

	}

	private void editCity(Person person) {
		sc = new Scanner(System.in);
		System.out.print("Enter new city name :: ");
		person.city = sc.next();
		System.out.println("Done");

	}

	private void editAddress(Person person) {
		sc = new Scanner(System.in);
		System.out.print("Enter new address here :-> ");
		person.address = sc.next();
		System.out.println("Done");

	}

	private void editLastName(Person person) {
		sc = new Scanner(System.in);
		System.out.print("Enter new last name here :->");
		person.lastName = sc.next();
		System.out.println("Done");
	}

	private void editFirstName(Person person) {
		sc = new Scanner(System.in);
		System.out.print("Enter new First name here  :->");
		person.firstName = sc.next();
		System.out.println("Done");

	}

	private Person getPerson(String editPersonName) {
		Iterator iterator = list.iterator();
		if (iterator.hasNext()) {
			for (int i = 0; i < list.size(); i++) {
				Person person = (Person) iterator.next();
				if (person.firstName.equalsIgnoreCase(editPersonName)) {
					return person;
				}
			}
		}
		return null;
	}

//	Delete contact using person's name

	private void deletePerson() {
		sc = new Scanner(System.in);
		System.out.print("Enter name of person to delete its contact :-> ");
		String personName = sc.next();
		Person person = getPerson(personName);
		if (person == null) {
			System.out.println(":: sorry No person found for given name ::");
		} else {
			list.remove(person);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcom to Address book program using Stream API");
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 10) {
			System.out.print("please choose from below\n1-add contact\n2-edit contact\n3-delete contact\n:-> ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addressBook.addDetails();
				break;
			case 2:
				addressBook.editContact();
				break;
			case 3:
				addressBook.deletePerson();
			}
		}

	}
}
