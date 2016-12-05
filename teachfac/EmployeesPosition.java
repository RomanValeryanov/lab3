package teachfac;

public enum EmployeesPosition {
	GRADUATE_STUDENT("Graduate student"),
	ASSISTANT("Assistant"),
	TEACHER("Teacher"),
	PROBATIONER("Probationer"),
	ASSISTANT_PROFESSOR("Assistant professor");
	
	
	private final String empPos;	
	
	EmployeesPosition(final String ep) {
		this.empPos = ep;
	}
	
	public String getStringName() {
		return this.empPos;
	}
}
