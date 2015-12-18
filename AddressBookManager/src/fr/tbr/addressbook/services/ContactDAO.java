package fr.tbr.addressbook.services;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.tbr.addressbook.datamodel.Contact;

public class ContactDAO {

	private static final String filepath = "/tests/harmonization/contacts/contacts.txt";
	PrintWriter writer;
	Scanner scanner;
	
	
	public ContactDAO() throws Exception {
		File file = new File(filepath);
		if (! file.exists() ){
			//create the tree
			file.getParentFile().mkdirs();
			
			//create the file itself
			file.createNewFile();
		}
		this.writer = new PrintWriter(file);
		this.scanner = new Scanner(file);
	}
	
	public void save(Contact contact) {
		writer.println(contact);
		writer.flush();
		
	}

	//TODO implement that
	public List<Contact> readAll() {
		return new ArrayList<Contact>();
	}
	
	
	public void close(){
		this.scanner.close();
		this.writer.close();
	}

}
