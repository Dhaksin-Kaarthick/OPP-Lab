class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.setAge(20);
        System.out.println("Person: " + p.getName() + ", Age: " + p.getAge());
    }
}