package hrapp;

import java.util.Arrays;

/**
 *
 * @author ke212
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("HR App starts\n");
        
        Department department1 = new Department("Department Education");
        Employee employee1 = new Employee(101,"Ann", 1234.56);
        Employee employee2 = new Employee(102,"Bob", 1200.34);
        Employee employee3 = new Employee(103,"Ray", 1122.33);
        
        System.out.println("Emp : "+ employee1);
        System.out.println("Emp : "+ employee2);
        System.out.println("Emp : "+ employee3);
        
        Employee[] newEmployees = {employee1, employee2, employee3};
        department1.addEmployee(newEmployees);

        System.out.println("Department : "+ department1.getName());
        for(Employee employee : department1.getEmployee()){
            System.out.println("Employee : "+ employee.getId()+" "+employee.getName()+" "+employee.getSalary());
        }
        
        System.out.println("Total Salary is : " + department1.totalSalary());
        
        int average = 0;
        int count = 0;
        
        for(Employee employee : department1.getEmployee()){
            count++;
            if(employee.equals(count))
            average += employee.getSalary();   
        }
        System.out.println("Number of Employees : " + count);
        
        try{
            average = (count == 0) ? 0 : average / count;
            average = average/count;
            System.out.println("Average Salary is : "+average);
        }catch(ArithmeticException e){
            System.out.println("Don't divide by 0");
        }
    }
    
}
