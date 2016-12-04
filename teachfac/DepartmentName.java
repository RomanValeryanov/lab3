package teachfac;

public enum DepartmentName {
	DEP_MATH("Departament of Mathematics"),
	DEP_PHYSIC("Departament of Physics"),
	DEP_CHEMISTRY("Departament of Chemistry"),
	DEP_MUSIC("Departament of Music"),
	DEP_PAINTING("Departament of Painting"),
	DEP_ECONOMICS("Departament of Economics");
	
	private final String depName;	
	
	private DepartmentName(final String dn) {
		this.depName = dn;
	}
	
	public String getStringName() {
		return this.depName;
	}
}
