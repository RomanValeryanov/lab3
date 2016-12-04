package teachfac;

public class Department {
	private DepartmentName name;
	private DepartmentType type;
	
	Department(DepartmentName n, DepartmentType t) {
		this.name = n;
		this.type = t;
	}
	
	DepartmentName getDepName() {
		return this.name;
	}
	
	String getStringName() {
		return this.name.getStringName();
	}
	
	DepartmentType getType() {
		return this.type;
	}
	
	String getStringType() {
		return this.type.getStringName();
	}
	
}
