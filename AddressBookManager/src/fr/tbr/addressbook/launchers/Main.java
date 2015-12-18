package fr.tbr.addressbook.launchers;

import java.util.Scanner;

import fr.tbr.addressbook.datamodel.AddressBook;
import fr.tbr.addressbook.datamodel.Contact;
import fr.tbr.addressbook.services.ConsoleService;


public class Main {

	public static void main(String[] args) {
		System.out.println("hello");
		
		ConsoleService console = new ConsoleService();
		
		AddressBook addressBook = new AddressBook("test Address Book");
				

		Contact contact1 = console.readContactFromConsole(addressBook);
		Contact contact4 = console.readContactFromConsole(addressBook);
		Contact contact3 = console.readContactFromConsole(addressBook);
		Contact contact2 = console.readContactFromConsole(addressBook);
		
		
		console.terminate();

		
	}

	

}
