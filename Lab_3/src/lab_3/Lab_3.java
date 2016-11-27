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
        
        Employee emp = new Employee("Ivanov", "Ivan", Gender.Male);

        emp.setBornData(1, Month.April, 2001);
        emp.setAdress("SPB");
        emp.setDivision(DivisionPr);
        
        System.out.println(emp.getBornDate());
    }
    
}
