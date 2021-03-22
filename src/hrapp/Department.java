package hrapp;

/**
 *
 * @author ke212
 */
public class Department {
    private String name;
    private Employee[] employees = new Employee[10];
    
    private int lastEmployeeIndex = -1;
    
    public Department(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployee() {
        return employees;
    }

    public void setEmployee(Employee[] employee) {
        this.employees = employee;
    }

    public void addEmployee(Employee[] newEmployee){
        this.employees = newEmployee;
    }
    
    public void addEmployee(Employee newEmployee){
        if(lastEmployeeIndex < employees.length){
            lastEmployeeIndex++;
            employees[lastEmployeeIndex] = newEmployee;
        }
    }
    
    public Employee[] getEmployee(int id) {
        return employees;
    }
    
    public Employee[] getEmployees() {
        Employee[] actualEmployees = new Employee[lastEmployeeIndex+1];
        for(int i = 0; i < actualEmployees.length; i++){
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }
    
    public int getEmployeeCount(){
        return lastEmployeeIndex+1;
    }
    
    public Employee getEmployeeById(int id) {
        Employee result = null;
        for(Employee emp : employees){
            if(emp.getId() == id){
                result = emp;
                break;
            }
        }
        return result;
        
        /*for(Employee emp : employees){
            if( emp != null ){
                if(emp.getId() == id){
                    return emp;
                }
            }
        }
        return null;*/
    }
    
    public double totalSalary(){    
        double total_salary = 0.0; 
        for(Employee employe : employees){
            total_salary = total_salary + employe.getSalary();
        }   
        
        return total_salary;
    }
    
    public double getTotalSalary(){
        double total_salary = 0.0; 
        for(int i = 0; i <= lastEmployeeIndex; i++){
            total_salary = employees[i].getSalary();
        }
        return total_salary;
    }
    
    public double getAverageSalary(){
        if(lastEmployeeIndex > -1){
            return getTotalSalary() / (lastEmployeeIndex+1);
        }
        return 0.0;
    }
    
    public double averageSalary(){
        return totalSalary() / (lastEmployeeIndex+1);
    }
    
    @Override
    public String toString(){
        return getName();
    }
    
}
