package lab3;

enum UNIT_TYPE {
	DISTRICT("Районное"),
	URBAN("Городское"),
	COMMUNITY("Микрорайонное");
	
	private final String name;
	
    @Override
    public String toString() {
        return name;
    }

    UNIT_TYPE(String n) {
        this.name=n;
    }
}

public class Unit {
	private String name;
	private UNIT_TYPE type;
	
	public Unit(String name, UNIT_TYPE type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}

	public UNIT_TYPE getType() {
		return type;
	}


	
}
