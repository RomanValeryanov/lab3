package lab3;

import java.util.ArrayList;
import java.util.List;

	//Вариант №7 Телефонный узел связи

public class Main {
	public static void main(String[] args) {
		List<Subscriber> subscribers = new ArrayList<>();
		List<Room> rooms = new ArrayList<>();
		List<Unit> units = new ArrayList<>();
		units.add(new Unit("Южное",UNIT_TYPE.DISTRICT));
		units.add(new Unit("Северное",UNIT_TYPE.DISTRICT));
		units.add(new Unit("Центральное",UNIT_TYPE.URBAN));
		units.add(new Unit("ПодЮжное",UNIT_TYPE.COMMUNITY));
		subscribers.add(new Subscriber("Ворона","Виктор","Михайлович","11.06.1995",units.get(0),"9602892868"));
		subscribers.add(new Subscriber("Мелочь","Семен","Михайлович","10.01.1997",units.get(2),"9604442233"));
		subscribers.add(new Subscriber("Крушиев","Петр","Михайлович","12.07.1994",units.get(1),"9603444242"));
		subscribers.add(new Subscriber("Павлов","Андрей","Михайлович","18.02.1993",units.get(3),"9603424232"));
		subscribers.add(new Subscriber("Галиев","Михаил","Михайлович","13.09.1992",units.get(2),"9603773232"));
		rooms.add(new Room(1,ROOM_TYPE.AUDITORY,units.get(0)));
		rooms.add(new Room(2,ROOM_TYPE.CABINET,units.get(1)));
		rooms.add(new Room(3,ROOM_TYPE.OFFICE,units.get(2)));
		rooms.add(new Room(4,ROOM_TYPE.CABINET,units.get(3)));
		rooms.add(new Room(5,ROOM_TYPE.AUDITORY,units.get(0)));
		
		DoitManager doitManager = new DoitManager();
		doitManager.startMenu(units, subscribers, rooms);
	}
	
}
