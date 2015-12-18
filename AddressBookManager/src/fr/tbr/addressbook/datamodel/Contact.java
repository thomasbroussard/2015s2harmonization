package fr.tbr.addressbook.datamodel;


public class Contact {

	
	String firstName;


	String lastName;
	String address;
	String phoneNumber;
	
	AddressBook addressBook;

	public Contact() {
	}
	
	public Contact(String firstName, String lastName, String address,
			String phoneNumber, AddressBook addressBook) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.addressBook = addressBook;
	}
	
	
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", addressBook=" + addressBook + "]";
	}
	
	
}
