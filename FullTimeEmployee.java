//Create an abstract class for full time employees
public class FullTimeEmployee extends Employee{
    //Declare basic information
    private double baseSalary;
    private double bonus;

    //Constructor to initialize the basic information
    public FullTimeEmployee(String name, int id, double baseSalary, double bonus){
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    //Overrided function
    public double calculateSalary(){
        return baseSalary + bonus;
    }

    //Second overrided function
    public String toString(){
        return "FullTimeEmployee {name=" + getName() + ", id=" + getId() + ", baseSalary=" + baseSalary + ", bonus=" + bonus + "}";
    }
}
