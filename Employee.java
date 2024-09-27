//Create an abstract class for employees
public abstract class Employee {
    //Give them basic information
    private String name;
    private int id;

    //Constructor innitilizing basic information
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Public function used to get the employee name in other files
    public String getName(){
        return name;
    }

    //Public function used to get the employee id in other files
    public int getId(){
        return id;
    }

    //Public function that is meant to be override in another file
    public abstract double calculateSalary();

    //Printing format
    public String toString() {
        return "Employee {name=" + name + ", id=" + id + "}";
    }
}
