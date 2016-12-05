package teachfac;


public class Operations {
	
	
	public void getDisciplineByEmployee(Employee empl) {
		System.out.println("Disciplines for " + empl.getSurname() + " " + empl.getName() + " " + empl.getPatronymic());
		for(Discipline dis : empl.getDisciplines()) {
			System.out.println("\t" + dis.getDisciplineName());
		}
	}
	
	public void getDisciplineByEmployees(Employee[] emplArr) {
		for(Employee empl:emplArr) {
			this.getDisciplineByEmployee(empl);
		}
	}
	
	public void getEmployeesByDepartment(Employee[] emplArr, String dn) {
		System.out.println("Employees in department " + dn);
		for(Employee empl:emplArr) {
			for(Department dp: empl.getDepartments()) {
				if(dn == dp.getDepName())
					System.out.println("\t" + empl.getSurname() + " " + empl.getName() + " " + empl.getPatronymic());
			}
		}
	}
	
	public void getEmployeesByDepartments(Employee[] emplArr, String[] dn){
		for(String depN : dn) {
			this.getEmployeesByDepartment(emplArr, depN);
		}
	}
	
	public void getDisciplinesByDepartment(Employee[] emplArr, String dn) {
		for(Employee empl: emplArr) {
			for(Department dp : empl.getDepartments()) {
				if(dp.getDepName() == dn) {
					System.out.println("Disciplines read by " + empl.getSurname() + " " + empl.getName() + " " + empl.getPatronymic() + " in " + dp.getDepName());
					for(Discipline dis: empl.getDisciplines())
						System.out.println("\t" + dis.getDisciplineName());
				}
					
			}
		}
	}
	
	public void getDisciplinesByDepartments(Employee[] emplArr, String[] dn) {
		for(String dep : dn)
			this.getDisciplinesByDepartment(emplArr, dep);
	}
}
