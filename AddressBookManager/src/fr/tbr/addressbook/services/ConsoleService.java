package fr.tbr.addressbook.services;

import java.util.Scanner;

import fr.tbr.addressbook.datamodel.AddressBook;
import fr.tbr.addressbook.datamodel.Contact;

public class ConsoleService {
	
	Scanner scanner;
	
	public ConsoleService() {
		this.scanner = new Scanner(System.in);
	}
	
	
	public Contact readContactFromConsole(AddressBook addressBook) {
		System.out.println("Enter the Contact first name :");
		String firstName = scanner.nextLine();
		System.out.println("Enter the Contact last name :");
		String lastName = scanner.nextLine();
		System.out.println("Enter the Contact address :");
		String address = scanner.nextLine();
		System.out.println("Enter the Contact phone number ");
		String phoneNumber = scanner.nextLine();	
		Contact readContact = new Contact(firstName, lastName , address , phoneNumber, addressBook);
		
		System.out.println("thank you, hereafter the read contact:");
		System.out.println(readContact);
		return readContact;
	}
	
	public void terminate(){
		this.scanner.close();
	}

}
