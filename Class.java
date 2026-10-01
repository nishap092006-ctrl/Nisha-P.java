// 1. CLASS
class Student {

    // 3. STATIC variable - sab objects ke liye same rahega
    static String collegeName = "BMS College";

    // 4. ENCAPSULATION - private variables
    private String name;
    private int rollNo;

    // 5. CONSTRUCTOR - object bante hi call hota hai
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Encapsulation ke liye getter/setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }

    // 3. STATIC METHOD - object banane ki zarurat nahi
    static void showCollege() {
        System.out.println("College: " + collegeName);
    }

    void display() {
        System.out.println("Name: " + name + ", RollNo: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        // STATIC method ko direct Class se call
        Student.showCollege();

        // 2. OBJECT banana
        Student s1 = new Student("Aman", 101);
        Student s2 = new Student("Rahul", 102);

        s1.display();
        s2.display();

        // Encapsulation ka use - setter se value change
        s1.setName("Aman Kumar");
        System.out.println("Updated Name: " + s1.getName());
    }
}