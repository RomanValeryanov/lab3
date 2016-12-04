package teachfac;

public class Discipline {

	private DisciplineType id; // number of discipline
	
	Discipline(DisciplineType type) {
		this.id = type;
	}
	
	public DisciplineType getIdDiscipline() {
		return this.id;
	}
	
	public String getStringDiscipline() {
		return this.id.getStringName();
	}
}
