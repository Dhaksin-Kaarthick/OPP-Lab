class Person {
    String name;
 
    Person(String name) {
        this.name = name;
    }
 
    void showDetails() {
        System.out.println("Name: " + name);
    }
}
class Student extends Person {
    int studentID;
 
    Student(String name, int studentID) {
        super(name);
        this.studentID = studentID;
    }
 
    void study() {
        System.out.println(name + " is studying.");
    }
}
class Teacher extends Person {
    String subject;
 
    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }
 
    void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }
}
interface Assistant {
    void assist();
}
class TeachingAssistant extends Student implements Assistant {
    TeachingAssistant(String name, int studentID) {
        super(name, studentID);
    }
 
    public void assist() {
        System.out.println(name + " is assisting in a lab session.");
    }
}
public class HybridInheritanceExample1 {
    public static void main(String[] args) {
        TeachingAssistant ta = new TeachingAssistant("Alex", 101);
        ta.showDetails();
        ta.study();
        ta.assist();
    }
}
