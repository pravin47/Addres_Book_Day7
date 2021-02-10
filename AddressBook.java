package com.address.book;

import java.util.*;

class CreateContact {
	static Scanner sc = new Scanner(System.in);
	static ArrayList book = new ArrayList();

	public static void addNewContact() {

		System.out.println("Please Enter First Name");
		NewContact.fName = sc.next();
		book.add(NewContact.fName);

		System.out.println("Please Enter Last Name");
		NewContact.lName = sc.next();
		book.add(NewContact.lName);

		System.out.println("Please Enter Address");
		NewContact.address = sc.next();
		book.add(NewContact.address);

		System.out.println("Please Enter City");
		NewContact.city = sc.next();
		book.add(NewContact.city);

		System.out.println("Please Enter State");
		NewContact.state = sc.next();
		book.add(NewContact.state);

		System.out.println("Please Enter the Zip Code");
		NewContact.zip = sc.nextInt();
		book.add(NewContact.zip);

		System.out.println("Please enter the Phone Number");
		NewContact.phoneNumber = sc.nextInt();
		book.add(NewContact.phoneNumber);

		System.out.println("Please Enter the Email Address");
		NewContact.email = sc.next();
		book.add(NewContact.email);
		System.out.println("Contact added Succesfully");

	}

	public static void show() {

		System.out.println(book);
	}

}

public class AddressBook extends CreateContact {
	static boolean ans = true;

	public static void main(String args[]) {

		System.out.println("Welcome To Addres Book Program");
		while (ans != false) {
			System.out.println("Please Enter Your Choice");
			System.out.println("1 Add Contact");
			System.out.println("2 Show The All Contact");
			System.out.println("3 Exit");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				addNewContact();
				break;

			case 2:
				show();
				break;
			
			case 3:
				ans = false;

			}

		}
	}
}

class NewContact {

	static String fName;
	static String lName;
	static String address;
	static String city;
	static String state;
	static int zip;
	static int phoneNumber;
	static String email;

	NewContact(String fName, String lName, String address, String city, String state, int zip, int phoneNumber,String email) {

		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;

	}

}
