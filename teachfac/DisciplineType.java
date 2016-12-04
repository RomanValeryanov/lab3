package teachfac;

public enum DisciplineType {
	MATH("Mathematics"),
	PHYSIC("Physic"),
	CHEMISTRY("Chemistry"),
	MUSIC("Music"),
	PAINTING("Painting"),
	ECONOMY("Economy");
	
	private final String disName;
	
	private DisciplineType(final String ds) {
		this.disName = ds;
	}
	
	public String getStringName() {
		return this.disName;
	}
	
}
