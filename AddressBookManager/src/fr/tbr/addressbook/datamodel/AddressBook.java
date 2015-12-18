package fr.tbr.addressbook.datamodel;

public class AddressBook {
	
	String addressBookName;

	public AddressBook(String addressBookName) {
		super();
		this.addressBookName = addressBookName;
	}

	@Override
	public String toString() {
		return "AddressBook [addressBookName=" + addressBookName + "]";
	}
	
	
	

}
