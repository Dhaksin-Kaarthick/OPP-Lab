class Person {
    private String name;
    private int age;
 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Student extends Person {
    private int studentId;
    private String major;
    public Student(String name, int age, int studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }
    public void study() {
        System.out.println("Student is studying " + major);
    }
  public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId + ", Major: " + major);
    }
}
class Professor extends Person {
    private String department;
    private String researchArea;
  public Professor(String name, int age, String department, String researchArea) {
        super(name, age);
        this.department = department;
        this.researchArea = researchArea;
    }
 public void teach() {
        System.out.println("Professor is teaching in " + department);
    } 
   public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department + ", Research Area: " + researchArea);
    }
}
class TeachingAssistant extends Student {
    private String course;
 
    public TeachingAssistant(String name, int age, int studentId, String major, String course) {
        super(name, age, studentId, major);
        this.course = course;
    }
    public void assist() {
        System.out.println("Teaching assistant is assisting in " + course);
    }
public void displayDetails() {
        super.displayDetails();
        System.out.println("Course: " + course);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 101, "Computer Science");
        student.displayDetails();
        student.study();
         Professor professor = new Professor("Dr. Smith", 45, "Computer Science", "AI");
        professor.displayDetails();
        professor.teach();
        TeachingAssistant ta = new TeachingAssistant("Bob", 25, 102, "Mathematics", "Calculus");
        ta.displayDetails();
        ta.study();
        ta.assist();
    }
}
