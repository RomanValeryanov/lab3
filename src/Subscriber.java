package lab3;

public class Subscriber {
	private String lastname;
	private String firstname;
	private String patronymic;
	private String dob;
	private Unit unit;
	private String phonenum;
	
	public Subscriber(String lastname, String firstname, String patronymic, String dob, Unit unit, String phonenum) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.patronymic = patronymic;
		this.dob = dob;
		this.unit = unit;
		this.phonenum = phonenum;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getPatronymic() {
		return patronymic;
	}
	
	public String getDob() {
		return dob;
	}
	
	public Unit getUnit() {
		return unit;
	}
	
	public String getPhonenum() {
		return phonenum;
	}
	
	
	
}
