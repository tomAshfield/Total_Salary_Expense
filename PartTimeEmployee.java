//Create a class for part time employees
public class PartTimeEmployee extends Employee {
    //Declare basic information
    private double hourlyWage;
    private int hoursWorked;

    //Constructor for basic information
    public PartTimeEmployee(String name, int id, double hourlyWage, int hoursWorked) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    //Public function to calculate part time salary
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    //Part time employee overriden funciton
    public String toString() {
        return "PartTimeEmployee {" +
                "name=" + getName() +
                ", id=" + getId() +
                ", hourlyWage=" + hourlyWage +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}