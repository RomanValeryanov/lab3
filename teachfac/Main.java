package teachfac;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Department [] ivDeps = {new Department(DepartmentName.DEP_CHEMISTRY, DepartmentType.EDUC_TYPE)};
		
		Department [] elDeps = {new Department(DepartmentName.DEP_CHEMISTRY, DepartmentType.EDUC_TYPE),
								new Department(DepartmentName.DEP_PHYSIC, DepartmentType.EDUC_TYPE),
								new Department(DepartmentName.DEP_MATH, DepartmentType.EDUC_TYPE)};
		
		Department [] irDeps = {new Department(DepartmentName.DEP_MUSIC, DepartmentType.EDUC_TYPE)};
		
		Department [] anDeps = {new Department(DepartmentName.DEP_MATH, DepartmentType.EDUC_TYPE),
								 new Department(DepartmentName.DEP_PHYSIC, DepartmentType.EDUC_TYPE)
		};
		
		Discipline [] ivDisc = {new Discipline(DisciplineType.CHEMISTRY)};
		Discipline [] elDisc = {new Discipline(DisciplineType.CHEMISTRY), new Discipline(DisciplineType.PHYSIC), new Discipline(DisciplineType.MATH)};
		Discipline [] irDisc = {new Discipline(DisciplineType.MUSIC)};
		Discipline [] anDisc = {new Discipline(DisciplineType.MATH), new Discipline(DisciplineType.PHYSIC)};
		
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
		DepartmentName []dnArr = {DepartmentName.DEP_CHEMISTRY,DepartmentName.DEP_PHYSIC, DepartmentName.DEP_MATH};
		//opObj.getDisciplineByEmployee(empArr[0]);
		//opObj.getDisciplineByEmployees(empArr);
		//opObj.getEmployeesByDepartment(empArr, DepartmentName.DEP_MATH);
		//opObj.getEmployeesByDepartments(empArr, dnArr);
		//opObj.getDisciplinesByDepartment(empArr, DepartmentName.DEP_MATH);
		opObj.getDisciplinesByDepartments(empArr, dnArr);
	}	

}
