package MainPackage;

public class MyDate {

	private String Year;
	private String Month;
	private String Day;

	public MyDate(String Year, String Month, String Day) {

		this.Year = Year;
		this.Month = Month;
		this.Day = Day;
	}

	public void setDay(String Day) {
		this.Day = Day;
	}

	public void setMonth(String Month) {
		this.Month = Month;
	}

	public void setYear(String Year) {
		this.Year = Year;
	}

	public String getDay() {
		return Day;
	}

	public String getMonth() {
		return Month;
	}

	public String getYear() {
		return Year;
	}
	
	
}