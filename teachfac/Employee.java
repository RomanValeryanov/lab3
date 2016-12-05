package teachfac;

import java.util.ArrayList;
import java.util.Date;

public class Employee {
		private String name;
		private String surname;
		private String patronymic;
		private boolean sex;
		private Date bornDate;
		private String addr;
		private EmployeesPosition pos;
		private ArrayList<Department> depTypes = new  ArrayList<Department>();
		private ArrayList<Discipline> disTypes = new ArrayList<Discipline>();
		
		
		Employee(String name, String surname, String patronymic, boolean sex,
					Date bd, String addr, EmployeesPosition pos, Department[] dt,
					Discipline[] dist) {
				
			this.name = name;
			this.surname = surname;
			this.patronymic = patronymic;
			this.sex = sex;
			this.bornDate = bd;
			this.addr = addr;
			this.pos = pos;
			
			for(Department dep: dt)
				depTypes.add(dep);
			
			for(Discipline dis: dist)
				disTypes.add(dis);
		}
		
		public String getName() {
			return this.name;
		}
		
		public String getSurname() {
			return this.surname;
		}
		
		public String getPatronymic() {
			return this.patronymic;
		}
		
		public boolean getSex() {
			return this.sex;
		}
		
		public Date getBornDate() {
			return this.bornDate;
		}
		
		public String getAddr() {
			return this.addr;
		}
		
		public EmployeesPosition getPosition() {
			return this.pos;
		}
		
		public String getStringPosition() {
			return this.pos.getStringName();
		}
		
		public ArrayList<Department> getDepartments() {
			return this.depTypes;
		}
		
		public ArrayList<Discipline> getDisciplines() {
			return this.disTypes;
		}
		
}
