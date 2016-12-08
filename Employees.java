package lab3;

enum UNIT_STAFF {	
	FACULTY("faculty"),
	TEACHINGANDSUPPORT("teachingandsupport"),
	ADMINISTRATIVEANDECONOMIC("administrativeandrconomic");
	
	private final String name;
	
    @Override
    public String toString() {
        return name;
    }

    UNIT_STAFF(String nam) {
        this.name=nam;
    }
}

public class Employees {
	private String surname;
	private String name;
	private String patronymic;
	private String sex;
	private int age;
	private String address;
	private UNIT_STAFF staff;
	private Units unit;
	
	Employees (String surname, String name, String patronymic,String sex,int age,String address,UNIT_STAFF staff, Units unit ){
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.sex = sex;
		this.age = age;
		this.address = address;
		this.staff = staff;
		this.unit = unit;
	}
	
	public String returnSurname () {
		return surname;
	}
	
	public String returnName(){
		return name;
	}
	
	public String returnPatronymic(){
		return patronymic;
	}
	
	public String returnSex(){
		return sex;
		
	}
	
	public int returnAge(){
		return age;
	}
	
	public String returnAddress(){
		return address;
	}
	
	public UNIT_STAFF returnStaff(){
		return staff;
	}
	
	public Units returnUnit(){
		return unit;
	}
}
