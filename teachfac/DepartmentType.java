package teachfac;

public enum DepartmentType {
	EDUC_TYPE("Educational and scientific type"),
	ADM_TYPE("Teaching and administrative");
	
	
	private final String depType;	
	
	DepartmentType(final String dt) {
		this.depType = dt;
	}
	
	public String getStringName() {
		return this.depType;
	}
}
