package fr.tbr.addressbook.datamodel;


/**
 * This is the main concept implementation for "Contact"
 * Example :
 * <pre><code> Contact contact = new Contact();</code> </pre>
 * 
 * @author tbrou
 *
 */
public class Contact {
	
	private int id;

	// 
	private String firstName;
	/* */ 
	private String lastName;
	private String address;
	private String phoneNumber;
	
	private AddressBook addressBook;

	
	/**
	 * 
	 */
	public Contact() {
	}
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 * @param addressBook
	 */
	public Contact(String firstName, String lastName, String address,
			String phoneNumber, AddressBook addressBook) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.addressBook = addressBook;
	}
	
	
	@Override
	public String toString() {
		return "Contact [firstName=" + this.firstName + ", lastName=" + this.lastName
				+ ", address=" + this.address + ", phoneNumber=" + this.phoneNumber
				+ ", addressBook=" + this.addressBook + "]";
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public AddressBook getAddressBook() {
		return this.addressBook;
	}

	public void setAddressBook(AddressBook addressBook) {
		this.addressBook = addressBook;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
}
