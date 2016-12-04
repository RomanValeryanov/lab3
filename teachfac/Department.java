package teachfac;

public class Department {
	private DepartmentName name;
	private DepartmentType type;
	
	Department(DepartmentName n, DepartmentType t) {
		this.name = n;
		this.type = t;
	}
	
	public DepartmentName getDepName() {
		return this.name;
	}
	
	public String getStringName() {
		return this.name.getStringName();
	}
	
	public DepartmentType getType() {
		return this.type;
	}
	
	public String getStringType() {
		return this.type.getStringName();
	}
	
}
