package fr.tbr.addressbook.launchers;

import java.sql.SQLException;

import fr.tbr.addressbook.datamodel.Contact;
import fr.tbr.addressbook.services.ContactJDBCDAO;

public class AlternateLauncher {

	public static void main(String[] args) throws SQLException {
		ContactJDBCDAO dao = new ContactJDBCDAO();
		
		dao.save(new Contact("Thomas", "Broussard", "Paris", "0123456789", null));

		dao.close();
	}

}
