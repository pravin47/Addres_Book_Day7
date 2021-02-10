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

	public static void editContact() {

		System.out.println("Enter The First Name You Want To Edit");
		String edit = sc.next();
		boolean check = book.contains(NewContact.fName);
		if (check == true) {
			System.out.println("Please Enter Which Field You Want To Edit");
			System.out.println("1 For New First Name");
			System.out.println("2 For New Last Name");
			System.out.println("3 For New Address");
			System.out.println("4 For New City");
			System.out.println("5 For New State");
			System.out.println("6 For New Zip Code");
			System.out.println("7 For New Phone Number");
			System.out.println("8 For New Email Id");
			int ch = sc.nextInt();
			switch (ch) {

			case 1:
				System.out.println("Enter The New First Name");
				String nName = sc.next();
				book.set(0, nName);
				System.out.println("First Name Update Successfully");
				break;
			case 2:
				System.out.println("Enter The New Last Name");
				String lName = sc.next();
				book.set(1, lName);
				System.out.println("Last Name Update Successfully");
				break;

			case 3:
				System.out.println("Enter The New Address");
				String nAddress = sc.next();
				book.set(2, nAddress);
				System.out.println("Address Update Successfully");
				break;
			case 4:
				System.out.println("Enter The New City");
				String nCity = sc.next();
				book.set(3, nCity);
				System.out.println("City Update Successfully");
				break;
			case 5:
				System.out.println("Enter the New State");
				String nState = sc.next();
				book.set(4, nState);
				System.out.println("State Update Successfully");
				break;
			case 6:
				System.out.println("Enter The New Zip Code");
				int nZip = sc.nextInt();
				book.set(5, nZip);
				System.out.println("Zip Code Update Successfully");
				break;

			case 7:
				System.out.println("Enter The New Phone Number");
				int nPh = sc.nextInt();
				book.set(6, nPh);
				System.out.println("Phone Number Update Successfully");
				break;

			case 8:
				System.out.println("Enter The New Email Address");
				String nEmail = sc.next();
				book.set(7, nEmail);
				System.out.println("Email Update Successfully");
				break;

			}

		} else {
			System.out.println("This Name Does Not Exist");
		}
	}

	public static void delete() {
		System.out.println("Enter The First Name You Want To Delete");
		String delete = sc.next();
		boolean check1 = book.contains(delete);
		if (check1 == true) {
			System.out.println("Contact Deleted Successfully");
			book.clear();
		} else {
			System.out.println("This Name Does Not Exit");
		}
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
			System.out.println("3 For Edit Contact");
			System.out.println("4 For Delete Contact");
			System.out.println("5 Exit");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Entet the First Name It Will Check Exist Or Not");
				String uniq = sc.next();
				boolean check = book.contains(NewContact.fName);
				if (check == true) {

					System.out.println("This Name Is All Ready Exist Please Enter Anathor Name");
				} else {
					addNewContact();
					break;
				}
			case 2:
				show();
				break;

			case 3:
				editContact();
				break;

			case 4:
				delete();
				break;

			case 5:
				ans = false;
				break;
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

	NewContact(String fName, String lName, String address, String city, String state, int zip, int phoneNumber,
			String email) {

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
