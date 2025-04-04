class Employee {
    String name;
    int age;
    double salary;
 
    Employee() {
        name = "Unknown";
        age = 18;
        salary = 30000;
    }
 
    Employee(String n, int a) {
        name = n;
        age = a;
        salary = 40000;
    }
 
    Employee(String n, int a, double s) {
        name = n;
        age = a;
        salary = s;
    }
 
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: $" + salary);
    }
}
 
public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Employee e1 = new Employee();  
        Employee e2 = new Employee("John", 25);  
        Employee e3 = new Employee("Alice", 30, 60000);  
 
        e1.display();
        e2.display();
        e3.display();
    }
}
