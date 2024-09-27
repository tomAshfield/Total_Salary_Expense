public class Main {
    public static void main(String[] args) {
        //Create a new company object
        Company company = new Company();

        //Add new employees to said company with all neccesary details provided
        Employee john = new FullTimeEmployee("John Doe", 101, 60000, 5000);
        Employee jane = new PartTimeEmployee("Jane Smith", 102, 20, 80);
        Employee tom = new FullTimeEmployee("Thomas Ashfield", 103, 85000, 3000);
        Employee alex = new PartTimeEmployee("Alex Cunning", 104, 35, 130);

        //Function call to add them to a list
        company.addEmployee(john);
        company.addEmployee(jane);
        company.addEmployee(tom);
        company.addEmployee(alex);

        //Funciton call to print them out to command line
        company.printAllEmployees();

        //Function call to print the total salary expense
        System.out.println("Total Salary Expense: " + company.getTotalSalaryExpense());
    }
}