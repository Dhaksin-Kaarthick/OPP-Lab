class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void showPerson() {
        System.out.println("Person Name: " + name);
    }
}
class Employee extends Person {
    int employeeID;
    double salary;
    Employee(String name, int employeeID, double salary) {
        super(name);
        this.employeeID = employeeID;
        this.salary = salary;
    }
    void showEmployee() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
}
class Manager extends Employee {
    String department;
    Manager(String name, int employeeID, double salary, String department) {
        super(name, employeeID, salary);
        this.department = department;
    }
    void showManager() {
        System.out.println("Department: " + department);
        System.out.println("Role: Manager");
    }
}
public class MultilevelExample2 {
    public static void main(String[] args) {
        Manager m1 = new Manager("Alice", 2001, 75000, "HR");
        m1.showPerson();
        m1.showEmployee();
        m1.showManager();
    }
}
