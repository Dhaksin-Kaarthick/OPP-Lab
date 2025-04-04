class Employee {
    private String name;
    private int id;
    private double salary;
    void setDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void setDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void setDetails(String name) {
        this.name = name;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setDetails("Alice", 101); // Calls first method
        emp1.displayDetails();
        Employee emp2 = new Employee();
        emp2.setDetails("Bob", 102, 50000.0); // Calls second method
        emp2.displayDetails();
        Employee emp3 = new Employee();
        emp3.setDetails("Charlie"); // Calls third method
        emp3.displayDetails();
    }
}
