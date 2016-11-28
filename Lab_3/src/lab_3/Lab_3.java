/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;

/**
 *
 * @author Dron
 */
public class Lab_3 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /* Класс HR-отдела */
        Division DivisionHr = new Division("HR", DivisionType.HR);
        
        /* Класс IT-отдела */
        Division DivisionIt = new Division("IT", DivisionType.IT);

        /* Класс PR-отдела */
        Division DivisionPr = new Division("PR", DivisionType.PR);
        
        Employee emp1 = new Employee("Ivanov", "Ivan", Gender.Male);

        emp1.setBornData(1, Month.April, 2001);
        emp1.setAdress("SPB");
        emp1.setDivision(DivisionPr);
        
        Employee emp2 = new Employee("Petrov", "Petr", Gender.Male);

        emp2.setBornData(5, Month.May, 1995);
        emp2.setAdress("SPB");
        emp2.setDivision(DivisionHr);
        
        Employee emp3 = new Employee("Sidorovov", "Ivan", Gender.Male);

        emp3.setBornData(1, Month.April, 2001);
        emp3.setAdress("SPB");
        emp3.setDivision(DivisionIt);
        
    }
    
}
