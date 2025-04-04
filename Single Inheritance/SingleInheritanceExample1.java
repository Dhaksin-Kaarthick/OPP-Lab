
class College {
    String collegeName = "AMRITA";
    String address = "CHENNAI, India";
 
    void showCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Address: " + address);
    }
}
class Student extends College {
    String studentName;
    int rollNumber;
 
    Student(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }
 
    void showStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
    }
}
public class SingleInheritanceExample1 {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101);
        s1.showCollegeDetails();
        s1.showStudentDetails();
    }
}
