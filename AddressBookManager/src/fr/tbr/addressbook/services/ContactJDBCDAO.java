package fr.tbr.addressbook.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.tbr.addressbook.datamodel.AddressBook;
import fr.tbr.addressbook.datamodel.Contact;

public class ContactJDBCDAO {

	Connection connection;
	
	
	
	public ContactJDBCDAO() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:derby://localhost:1527/AddressBookManager;create=true", "tom","tom");
	
	}
	
	public void save(Contact contact) throws SQLException{
		
		String sqlQuery = "insert into CONTACTS (CONTACT_FIRSTNAME, CONTACT_LASTNAME, CONTACT_PHONENUMBER, CONTACT_ADDRESS, ADDRESS_BOOK_ID) values(? ,?, ?, ?, ?)";
		PreparedStatement statement = this.connection.prepareStatement(sqlQuery);
		statement.setString(1,contact.getFirstName());
		statement.setString(2,contact.getLastName());
		statement.setString(3,contact.getPhoneNumber());
		statement.setString(4,contact.getAddress());
		AddressBook addressBook = contact.getAddressBook();
		statement.setInt(5, (addressBook == null)? 0 : addressBook.getId());
		statement.execute();
		
	}
	
	public void close() throws SQLException{
		this.connection.close();
	}
	
}
