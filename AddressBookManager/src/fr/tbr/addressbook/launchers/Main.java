package fr.tbr.addressbook.launchers;



import java.util.List;

import fr.tbr.addressbook.datamodel.AddressBook;
import fr.tbr.addressbook.datamodel.Contact;
import fr.tbr.addressbook.exceptions.DAOInitializationException;
import fr.tbr.addressbook.services.ConsoleService;
import fr.tbr.addressbook.services.ContactDAO;


public class Main {

	public static void main(String[] args){
		System.out.println("hello");
		
		ConsoleService console = new ConsoleService();
		
		AddressBook addressBook = new AddressBook("test Address Book");
		ContactDAO contactDAO = null;
		try {
			contactDAO = new ContactDAO();
		} catch (DAOInitializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}		

		Contact contact1 = console.readContactFromConsole(addressBook);
		contactDAO.save(contact1);
		
//		
//		Contact contact4 = console.readContactFromConsole(addressBook);
//		contactDAO.save(contact4);
//		
//		
//		Contact contact3 = console.readContactFromConsole(addressBook);
//		contactDAO.save(contact3);
//		Contact contact2 = console.readContactFromConsole(addressBook);
//		contactDAO.save(contact2);
	
		List<Contact> contactsList = contactDAO.readAll();
		
		console.terminate();

		
	}

	

}
