package lab3;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private Scanner sc;
	
	Menu () {
		sc = new Scanner(System.in);
	}
	
	public void startMenu(List<Employees>employees, List <Units> units){
		while (true){
			System.out.println("Press 1 to select a list of all employees");
			System.out.println("Press 2 to select a list of all units");
			System.out.println("Press 3 to select a list of employees by one unit");
			System.out.println("Press 4 to count AVERAGE AGE of employees by units");
			System.out.println("Press 5 to select a list of employees by staff");
			System.out.println("Make your choise:");
			switch(sc.nextInt()){
			case 1:	{
				showAllEmployess(employees);
				
			}
			break;
			case 2: {
				showAllUnits(units);
				
			}
			break;
			case 3:	{
				selectListOfEmployeesByUnit(employees,units);
				
			}
			break;
			case 4:	{
				countAverageAgeByUnits(employees,units);
			}
			break;
			case 5: {
				selectListOfEmployeesByJobPosition(employees,units);
			}
			break;
			default: {
				System.out.println("Incorrect choise");
			}
			break;
			}
			
		}
	}
	public void showAllEmployess(List<Employees>employees) {
		for (Employees em:employees) {
			System.out.println(em.returnName()+em.returnSurname()+em.returnPatronymic()+em.returnAge()+em.returnSex()+em.returnAddress()+em.returnStaff()+em.returnUnit().returnName());
		}
			
	}
	
	public void showAllUnits(List<Units> units) {
		for (Units un:units) {
			System.out.println(un.returnName()+un.returnUnitKind());
		}
	}
	
	public void selectListOfEmployeesByUnit(List<Employees>employees,List<Units> units){
		sc.nextLine();
		System.out.println("Enter name of unit");
		String unitName = sc.nextLine();
		for (Employees em:employees) {
			if (em.returnUnit().returnName().equals(unitName))
				System.out.println(em.returnName()+em.returnSurname()+em.returnPatronymic()+em.returnAge()+em.returnSex()+em.returnAddress()+em.returnStaff()+em.returnUnit().returnName());
		}
	}
	
	public void countAverageAgeByUnits(List<Employees>employees,List<Units> units) {
		int averageAge = 0;
		int cnt = 0;
		for (Units un:units) {
			for (Employees em:employees) {
				if (em.returnUnit().returnName().equals(un.returnName())) {
					averageAge = averageAge + em.returnAge();
					cnt ++;
				}
			}
			System.out.println("average age = "+averageAge/cnt);
		}
	}
	
	public void selectListOfEmployeesByJobPosition(List<Employees>employees,List<Units> units) {
		sc.nextLine();
		System.out.println("Enter name of staff");
		String staff = sc.nextLine();
		for (Employees em:employees) {
			if (em.returnStaff().toString().equals(staff)) {
				System.out.println(em.returnName()+em.returnSurname()+em.returnPatronymic()+em.returnAge()+em.returnSex()+em.returnAddress()+em.returnStaff()+em.returnUnit().returnName());
			}
		}
	}
}
