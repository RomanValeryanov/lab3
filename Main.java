package lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List <Employees> employees = new ArrayList<>();
		List <Units> units = new ArrayList<>();
		units.add(new Units("SMT","Govenment"));
		employees.add(new Employees("Valeryanov","Roman","Victorivich","Male",22,"Russia",UNIT_STAFF.FACULTY,units.get(0)));
		employees.add(new Employees("Shibalov","Artem","Urievich","Male",24,"Russia",UNIT_STAFF.TEACHINGANDSUPPORT,units.get(0)));
		Menu menu = new Menu();
		menu.startMenu(employees, units);
	}
}
