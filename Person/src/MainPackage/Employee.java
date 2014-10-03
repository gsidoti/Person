package MainPackage;

import java.util.Date;

public class Employee extends Person {

	public Employee(String Name, String Address, String PhoneNumber,
			String Email) {
		super(Name, Address, PhoneNumber, Email);

	}

	private Date DateHired = new java.util.Date();
	private String Salary;
	private String Office;

	public void setDateHired(Date DateHired) {
		this.DateHired = DateHired;
	}

	public void setOffice(String Office) {
		this.Office = Office;
	}

	public void setSalary(String Salary) {
		this.Salary = Salary;
	}

	public Date getDateHired() {
		return DateHired;
	}
	
	public String getOffice() {
		return Office;
	}

	public String getSalary() {
		return Salary;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + getName();
	}

}
