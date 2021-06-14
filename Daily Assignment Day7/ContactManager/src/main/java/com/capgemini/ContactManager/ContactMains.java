package com.capgemini.ContactManager;

import com.capgemini.ContactModel.Contacts;

public class ContactMains {
	public static void main(String[] args) {
		Contacts c = new Contacts();
		c.readDetails();
		String output = c.displayDetails();
		System.out.println(output);
	}
}
