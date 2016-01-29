package fr.tbr.addressbook.datamodel;

public class AddressBook {
	
	private int id;
	
	String addressBookName;

	public AddressBook(String addressBookName) {
		super();
		this.addressBookName = addressBookName;
	}

	@Override
	public String toString() {
		return "AddressBook [addressBookName=" + this.addressBookName + "]";
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressBookName() {
		return this.addressBookName;
	}

	public void setAddressBookName(String addressBookName) {
		this.addressBookName = addressBookName;
	}
	

}
