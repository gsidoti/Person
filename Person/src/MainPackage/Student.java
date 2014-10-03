package MainPackage;

public class Student extends Person{

	public Student(String Name, String Address, String PhoneNumber, String Email) {
		super(Name, Address, PhoneNumber, Email);
	}
	
	public static final int freshman = 9;
	public static final int sophmore = 10;
	public static final int junior = 11;
	public static final int senior = 12;

	@Override
	public String toString() {

		return this.getClass().getName() + getName();
	}

}
