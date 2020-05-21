package day42_Inheritance.Task01;
/*
    create a class called company:
			create 3 objects of employee and set thier info
			create an array of employees and store all those employee objects
			use regular for loop to print out each employee' name and employeeID
     */
public class Company {

    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static {
        employee1 = new Employee();
        employee1.setEmployeeInfo("Hunar", 32, 'M', 140_000, 13654,"FullTime");
        employee2 = new Employee();
        employee2.setEmployeeInfo("Rahman", 25, 'M', 145_000, 65654,"FullTime");
        employee3 = new Employee();
        employee3.setEmployeeInfo("Barzy", 26, 'M', 148_000, 6599,"FullTime");
    }

    public static void main(String[] args) {

        Employee[] employees = {employee1, employee2, employee3};

        for (int i=0; i<employees.length; i++){
            // System.out.println(employees[i]);
            System.out.println("Name: "+employees[i].name+", ID: "+employees[i].employeeID);
        }



    }






}
