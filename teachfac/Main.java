package teachfac;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Department [] ivDeps = {new Department("Departament of Chemistry", DepartmentType.EDUC_TYPE)};
		
		Department [] elDeps = {new Department("Departament of Chemistry", DepartmentType.EDUC_TYPE),
								new Department("Departament of Physics", DepartmentType.EDUC_TYPE),
								new Department("Departament of Mathematics", DepartmentType.EDUC_TYPE)};
		
		Department [] irDeps = {new Department("Departament of Music", DepartmentType.EDUC_TYPE)};
		
		Department [] anDeps = {new Department("Departament of Mathematics", DepartmentType.EDUC_TYPE),
								 new Department("Departament of Physics", DepartmentType.EDUC_TYPE)
		};
		
		Discipline [] ivDisc = {new Discipline("Chemistry")};
		Discipline [] elDisc = {new Discipline("Chemistry"), new Discipline("Physic"), new Discipline("Mathematics")};
		Discipline [] irDisc = {new Discipline("Music")};
		Discipline [] anDisc = {new Discipline("Mathematics"), new Discipline("Physic")};
		
		@SuppressWarnings("deprecation")
		Employee[] empArr = {
				new Employee("Ivan", "Petrov", "Ivanovich", 
							false, new Date(1967, 5, 25), "Mira 13", 
							EmployeesPosition.ASSISTANT, ivDeps, ivDisc),
				new Employee("Elena", "Ivanova", "Alexseevna", 
							true, new Date(1985, 3, 23), "Kr. Kyrsanta 18", 
							EmployeesPosition.TEACHER, elDeps, elDisc),
				new Employee("Irirna", "Evseeva", "Viktorovna", 
							true, new Date(1990, 1, 29), "L'va Tolstogo 19", 
							EmployeesPosition.TEACHER, irDeps, irDisc),
				new Employee("Andrey", "Kolpakov", "Sergeevich", 
							false, new Date(1990, 1, 29), "Vvedenskaya 19", 
							EmployeesPosition.PROBATIONER, anDeps, anDisc),
		}; 
		
		Operations opObj = new Operations();
		String []dnArr = {"Departament of Chemistry", "Departament of Physics", "Departament of Mathematics"};
		opObj.getDisciplineByEmployee(empArr[0]);
//		opObj.getDisciplineByEmployees(empArr);
//		opObj.getEmployeesByDepartment(empArr, "Departament of Mathematics");
		opObj.getEmployeesByDepartments(empArr, dnArr);
//		opObj.getDisciplinesByDepartment(empArr, "Departament of Mathematics");
//		opObj.getDisciplinesByDepartments(empArr, dnArr);
	}	

}
