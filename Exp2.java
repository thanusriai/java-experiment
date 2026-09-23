abstract class Employee {

static String company = "ABC Technologies";
public String department;
private double salary;
protected String designation;
String location;
Employee(String department, double salary,
String designation, String location) {
this.department = department;
this.salary = salary;
this.designation = designation;
this.location = location;
}
public double getSalary() {
return salary;
}

public void setSalary(double salary) {

this.salary = salary;
}


abstract void displayRole();


void displayDetails() {
System.out.println("Company : " + company);
System.out.println("Department : " + department);
System.out.println("Salary : " + salary);
System.out.println("Designation : " + designation);
System.out.println("Location : " + location);
}
}

class Developer extends Employee {

Developer(String department, double salary,
String designation, String location) {

super(department, salary, designation, location);
}


@Override
void displayRole() {
System.out.println("Role : Software Developer");
}
}

public class Main {
public static void main(String[] args) {
Developer emp = new Developer(
"Computer Science",
50000,
"Developer",
"Chennai"
);
emp.displayDetails();
emp.displayRole();
emp.setSalary(60000);
System.out.println("\nUpdated Salary : " + emp.getSalary());
}
}