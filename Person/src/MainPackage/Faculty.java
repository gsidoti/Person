package MainPackage;

public class Faculty extends Employee {

	private String OfficeHours;
	private String Rank;

	public Faculty(String Name, String Address, String PhoneNumber, String Email) {
		super(Name, Address, PhoneNumber, Email);
	}

	public void setRank(String Rank) {
		this.Rank = Rank;
	}

	public void setOfficeHours(String OfficeHours) {
		this.OfficeHours = OfficeHours;
	}

	public String getRank() {
		return Rank;
	}

	public String getOfficeHours() {
		return OfficeHours;
	}

	@Override
	public String toString() {

		return this.getClass().getName() + getName();
	}

}