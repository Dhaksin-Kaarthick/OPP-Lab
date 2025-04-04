import java.util.*;
import java.time.*;
import java.io.*;

public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter number of employees: ");
            int numEmployees = scanner.nextInt();
            scanner.nextLine();

            ArrayList<Employee> employees = new ArrayList<>();

            for (int i = 0; i < numEmployees; i++) {
                System.out.println("\nEmployee " + (i + 1) + ":");

                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();

                System.out.print("Enter joining year: ");
                int joiningYear = scanner.nextInt();
                scanner.nextLine();

                employees.add(new Employee(name, salary, joiningYear));
            }

            FileWriter writer = new FileWriter("EmployeePayroll.txt");

            System.out.println("\n--- Employee Payroll ---");
            writer.write("--- Employee Payroll ---\n");

            for (Employee emp : employees) {
                emp.calculateBonus();
                emp.displayDetails();
                writer.write(emp.getDetailsForFile());
            }

            writer.close();
            System.out.println("\nPayroll saved to 'EmployeePayroll.txt'");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers correctly.");
        }

        scanner.close();
    }
}

class Employee {
    private String name;
    private double salary;
    private int joiningYear;
    private double bonus;

    public Employee(String name, double salary, int joiningYear) {
        this.name = name;
        this.salary = salary;
        this.joiningYear = joiningYear;
    }

    public void calculateBonus() {
        int currentYear = LocalDate.now().getYear();
        int yearsWorked = currentYear - joiningYear;

        if (yearsWorked >= 5) {
            bonus = salary * 0.1;
        } else {
            bonus = salary * 0.05;
        }
    }

    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Joining Year: " + joiningYear);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Salary: ₹" + (salary + bonus));
        System.out.println();
    }

    public String getDetailsForFile() {
        return "Employee: " + name + "\n" +
               "Salary: ₹" + salary + "\n" +
               "Joining Year: " + joiningYear + "\n" +
               "Bonus: ₹" + bonus + "\n" +
               "Total Salary: ₹" + (salary + bonus) + "\n\n";
    }
}
