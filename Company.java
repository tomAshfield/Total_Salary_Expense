import java.util.ArrayList;
import java.util.List;

//Create a new class called company
public class Company {
    //Create a new list to store the employees
    private List<Employee> employees;

    //Constructor
    public Company() {
        this.employees = new ArrayList<>();
    }

    //Public function that adds the employees to the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    //Printing out each employee on different lines
    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println('\n');
        }
    }

    //Public function that adds on to the total salary expense
    public double getTotalSalaryExpense() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.calculateSalary();
        }
        return total;
    }
}
