public class Employee {
    public String name;

    public void setName(String employeeName) { 
        name = employeeName; 
    }

    public void printDetails() { 
        System.out.println(name); 
    } 

    public static void main(String args[]) { 
        Employee employee = new Employee(); 
        employee.printDetails(); 
        employee.setName("John"); 
        employee.printDetails(); 
        Employee newEmployee = new Employee(); 
        newEmployee.setName("Priya"); 
        employee.printDetails(); 
    }
}