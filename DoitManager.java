package lab3;

import java.util.List;
import java.util.Scanner;

public class DoitManager {
	private Scanner sc;
	
	DoitManager() {
		sc = new Scanner(System.in);
	}
	
	public void startMenu(List<Unit> units, List<Subscriber> subscribers, List<Room> rooms){
		while(true){
			System.out.println("\n�������� ������ ����� ����:\n");
			System.out.println("1.������� ���� ���������\n");
			System.out.println("2.������� ��� ���������\n");
			System.out.println("3.������� ��� �������������\n");
			System.out.println("4.������� ������ ��������� �� �������������\n");
			System.out.println("5.������� ������ ��������� �� ���������\n");
			System.out.println("6.������� ���������� ��������� �� �������������\n");
			System.out.println("7.������� ���������� ��������� �� ���������\n");
			switch(sc.nextInt()){
			case 1: 
				showAllSubs(subscribers);
				break;
			case 2:
				showAllRooms(rooms);
				break;
			case 3:
				showAllUnits(units);
				break;
			case 4: 
				printPhoneByUnit(units, subscribers);
				break;
			case 5:
				printPhoneByRoom(rooms, subscribers);
				break;
			case 6:
				printNumSubsByUnit(units, subscribers);
				break;
			case 7:
				printNumSubsByRoom(rooms, subscribers);
				break;
			default: 
				System.out.println("�������� ����\n");
				break;
			}
		}
	}
	
	public void showAllSubs(List<Subscriber> subs){
		for(Subscriber sub : subs) {
			System.out.println(sub.getLastname() + " " + sub.getFirstname() + " " + sub.getPatronymic() + " ���� ��������: " + sub.getDob() + " �������: " + sub.getPhonenum());
		}
	}
	
	public void showAllRooms(List<Room> rooms){
		for(Room room : rooms) {
			System.out.println("��������� �" + room.getId() + " ���: " + room.getType().toString() +  " ��������� � �������������: " + room.getUnit().getName());
		}
	}
	
	public void showAllUnits(List<Unit> units){
		for(Unit unit : units) {
			System.out.println("������������� " + unit.getName() + " ���: " + unit.getType().toString());
		}
	}
	
	public void printPhoneByUnit(List<Unit> units, List<Subscriber> subs){
		sc.nextLine();
		System.out.println("������� �������� �������������\n");
		String unitName = sc.nextLine();
		for(Unit unit : units) {
			if(unit.getName().equals(unitName)) {
				for(Subscriber subscriber : subs) {
					if (subscriber.getUnit().getName().equals(unit.getName())){
						System.out.println(subscriber.getPhonenum());
					}
				}
			}
		}
		
	}
	
	public void printPhoneByRoom(List<Room> rooms, List<Subscriber> subs){
		System.out.println("������� ����� ���������\n");
		int roomNum = sc.nextInt();
		for(Room room : rooms) {
			if(room.getId()==roomNum) {
				for(Subscriber subscriber : subs) {
					if (subscriber.getUnit().getName().equals(room.getUnit().getName())){
						System.out.println(subscriber.getPhonenum());
					}
				}
			}
		}
	}
	
	public void printNumSubsByUnit(List<Unit> units, List<Subscriber> subs){
		int i=0;
		sc.nextLine();
		System.out.println("������� �������� �������������\n");
		String unitName = sc.nextLine();
		for(Unit unit : units) {
			if(unit.getName().equals(unitName)) {
				for(Subscriber subscriber : subs) {
					if (subscriber.getUnit().getName().equals(unit.getName())){
						i++;
					}
				}
				System.out.println("���������� ��������� � ������������� " + unit.getName() + " : "+ i);
				break;
			}
		}
	}
	
	public void printNumSubsByRoom(List<Room> rooms, List<Subscriber> subs){
		int i=0;
		System.out.println("������� ����� ���������\n");
		int roomNum = sc.nextInt();
		for(Room room : rooms) {
			if(room.getId()==roomNum) {
				for(Subscriber subscriber : subs) {
					if (subscriber.getUnit().getName().equals(room.getUnit().getName())){
						i++;
					}
				}
				System.out.println("���������� ��������� � ��������� " + room.getId() + " : "+ i);
				break;
			}
		}
	}
}
