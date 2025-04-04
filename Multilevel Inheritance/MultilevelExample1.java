class LivingBeing {
    void breathe() {
        System.out.println("Living beings breathe.");
    }
}
class Human extends LivingBeing {
    void speak() {
        System.out.println("Humans can speak.");
    }
}
class Student extends Human {
    String name;
    int studentID;
 
    Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }
 
    void study() {
        System.out.println(name + " is studying.");
    }
 
    void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentID);
    }
}
public class MultilevelExample1 {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101);
        s1.breathe();
        s1.speak();
        s1.study();
        s1.showDetails();
    }
}
