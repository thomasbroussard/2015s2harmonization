package fr.tbr.addressbook.services;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.tbr.addressbook.datamodel.Contact;
import fr.tbr.addressbook.exceptions.DAOInitializationException;

public class ContactDAO {

	private static final String filepath = "/tests/harmonization/contacts/contacts.txt";
	PrintWriter writer;
	Scanner scanner;

	public ContactDAO() throws DAOInitializationException {

		try {
			File file = new File(ContactDAO.filepath);
			if (!file.exists()) {
				// create the tree
				file.getParentFile().mkdirs();

				// create the file itself
				file.createNewFile();
			}
			this.writer = new PrintWriter(file);
			this.scanner = new Scanner(file);
		} catch (Exception e) {
			DAOInitializationException initException = new DAOInitializationException();
			initException.initCause(e);
			throw initException;
		}
	}

	public void save(Contact contact) {
		this.writer.println("-- Contact --");
		this.writer.println(contact.getFirstName());
		this.writer.println(contact.getLastName());
		this.writer.println(contact.getAddress());
		this.writer.println(contact.getPhoneNumber());
		this.writer.println("-------------");
		this.writer.flush();

	}

	// TODO implement that
	public List<Contact> readAll() {
		return new ArrayList<Contact>();
	}

	public void close() {
		this.scanner.close();
		this.writer.close();
	}

}
