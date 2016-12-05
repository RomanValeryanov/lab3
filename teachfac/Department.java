package teachfac;

public class Department {
	private String name;
	private DepartmentType type;
	
	Department(String n, DepartmentType t) {
		this.name = n;
		this.type = t;
	}
	
	public String getDepName() {
		return this.name;
	}
	
	
	public DepartmentType getType() {
		return this.type;
	}
	
	public String getStringType() {
		return this.type.getStringName();
	}
	
}
