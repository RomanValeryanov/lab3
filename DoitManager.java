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
			System.out.println("\nВыберите нужный пункт меню:\n");
			System.out.println("1.Вывести всех абонентов\n");
			System.out.println("2.Вывести все помещения\n");
			System.out.println("3.Вывести все подразделения\n");
			System.out.println("4.Вывести номера абонентов по подразделению\n");
			System.out.println("5.Вывести номера абонентов по помещению\n");
			System.out.println("6.Вывести количество абонентов по подразделению\n");
			System.out.println("7.Вывести количество абонентов по помещению\n");
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
				System.out.println("Неверный ввод\n");
				break;
			}
		}
	}
	
	public void showAllSubs(List<Subscriber> subs){
		for(Subscriber sub : subs) {
			System.out.println(sub.getLastname() + " " + sub.getFirstname() + " " + sub.getPatronymic() + " Дата рождения: " + sub.getDob() + " Телефон: " + sub.getPhonenum());
		}
	}
	
	public void showAllRooms(List<Room> rooms){
		for(Room room : rooms) {
			System.out.println("Помещение №" + room.getId() + " Тип: " + room.getType().toString() +  " Относится к подразделению: " + room.getUnit().getName());
		}
	}
	
	public void showAllUnits(List<Unit> units){
		for(Unit unit : units) {
			System.out.println("Подразделение " + unit.getName() + " Тип: " + unit.getType().toString());
		}
	}
	
	public void printPhoneByUnit(List<Unit> units, List<Subscriber> subs){
		sc.nextLine();
		System.out.println("Введите название подразделения\n");
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
		System.out.println("Введите номер помещения\n");
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
		System.out.println("Введите название подразделения\n");
		String unitName = sc.nextLine();
		for(Unit unit : units) {
			if(unit.getName().equals(unitName)) {
				for(Subscriber subscriber : subs) {
					if (subscriber.getUnit().getName().equals(unit.getName())){
						i++;
					}
				}
				System.out.println("Количество абонентов в подразделении " + unit.getName() + " : "+ i);
				break;
			}
		}
	}
	
	public void printNumSubsByRoom(List<Room> rooms, List<Subscriber> subs){
		int i=0;
		System.out.println("Введите номер помещения\n");
		int roomNum = sc.nextInt();
		for(Room room : rooms) {
			if(room.getId()==roomNum) {
				for(Subscriber subscriber : subs) {
					if (subscriber.getUnit().getName().equals(room.getUnit().getName())){
						i++;
					}
				}
				System.out.println("Количество абонентов в помещении " + room.getId() + " : "+ i);
				break;
			}
		}
	}
}
