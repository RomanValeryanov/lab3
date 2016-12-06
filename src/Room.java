package lab3;

enum ROOM_TYPE {	
	AUDITORY("Аудитория"),
	CABINET("Кабинет"),
	OFFICE("Офис");
	
	private final String name;
	
    @Override
    public String toString() {
        return name;
    }

    ROOM_TYPE(String n) {
        this.name=n;
    }
}

public class Room {
	private int id;
	private ROOM_TYPE type;
	private Unit unit;
	
	Room(int id, ROOM_TYPE type, Unit unit) {
		this.id = id;
		this.type = type;
		this.unit = unit;
	}
	
	public int getId() {
		return id;
	}
	
	public ROOM_TYPE getType() {
		return type;
	}
	
	public Unit getUnit() {
		return unit;
	}
}


