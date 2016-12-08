package lab3;

public class Units {
	private String name;
	private String unitKind;
	
	Units (String name, String unitKind) {
		this.name = name;
		this.unitKind = unitKind;
	}
	
	public String returnName() {
		return name;
	}
	
	public String returnUnitKind() {
		return unitKind;
	}
}
