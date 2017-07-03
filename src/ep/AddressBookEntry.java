package ep;

public class AddressBookEntry {

	private String name;
	private String emailAddress;
	private String phoneNumber;

	public AddressBookEntry(String nameIn, String emailAddressIn, String phoneNumberIn){
		name = nameIn;
		emailAddress = emailAddressIn;
		phoneNumber = phoneNumberIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
