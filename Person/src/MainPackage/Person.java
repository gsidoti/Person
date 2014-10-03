package MainPackage;

public class Person {
	private String Name;
	private String Address;
	private String PhoneNumber;
	private String Email;

	public Person(String Name, String Address, String PhoneNumber, String Email) {
		this.Name = Name;
		this.Address = Address;
		this.PhoneNumber = PhoneNumber;
		this.Email = Email;

	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getName() {
		return Name;
	}

	public String getAddress() {
		return Address;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	@Override
	public String toString() {

		return this.getClass().getName() + Name;

	}

}
