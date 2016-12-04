package teachfac;


public class Operations {
	
	
	public void getDisciplineByEmployee(Employee empl) {
		System.out.println("Disciplines for " + empl.getSurname() + " " + empl.getName() + " " + empl.getPatronymic());
		for(Discipline dis : empl.getDisciplines()) {
			System.out.println("\t" + dis.getStringDiscipline());
		}
	}
	
	public void getDisciplineByEmployees(Employee[] emplArr) {
		for(Employee empl:emplArr) {
			this.getDisciplineByEmployee(empl);
		}
	}
	
	public void getEmployeesByDepartment(Employee[] emplArr, DepartmentName dn) {
		System.out.println("Employees in department " + dn.getStringName());
		for(Employee empl:emplArr) {
			for(Department dp: empl.getDepartments()) {
				if(dn == dp.getDepName())
					System.out.println("\t" + empl.getSurname() + " " + empl.getName() + " " + empl.getPatronymic());
			}
		}
	}
	
	public void getEmployeesByDepartments(Employee[] emplArr, DepartmentName[] dn){
		for(DepartmentName depN : dn) {
			this.getEmployeesByDepartment(emplArr, depN);
		}
	}
	
	public void getDisciplinesByDepartment(Employee[] emplArr, DepartmentName dn) {
		for(Employee empl: emplArr) {
			for(Department dp : empl.getDepartments()) {
				if(dp.getDepName() == dn) {
					System.out.println("Disciplines read by " + empl.getSurname() + " " + empl.getName() + " " + empl.getPatronymic() + " in " + dp.getStringName());
					for(Discipline dis: empl.getDisciplines())
						System.out.println("\t" + dis.getStringDiscipline());
				}
					
			}
		}
	}
	
	public void getDisciplinesByDepartments(Employee[] emplArr, DepartmentName[] dn) {
		for(DepartmentName dep : dn)
			this.getDisciplinesByDepartment(emplArr, dep);
	}
}
