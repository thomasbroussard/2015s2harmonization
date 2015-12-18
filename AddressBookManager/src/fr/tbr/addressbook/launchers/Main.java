package fr.tbr.addressbook.launchers;

import fr.tbr.addressbook.datamodel.AddressBook;
import fr.tbr.addressbook.datamodel.Contact;


public class Main {

	public static void main(String[] args) {
		System.out.println("hello");
		
	
		
		AddressBook addressBook = new AddressBook("test Address Book");
		
		Contact contact = new Contact("thomas", "broussard", "Paris", "0123456789", addressBook);
		
		
		System.out.println(addressBook);
		System.out.println(contact);

	}

}
