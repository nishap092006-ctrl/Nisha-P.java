// File: Main.java

class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Durga");

        // Read using getter
        System.out.println(s1.getId() + " - " + s1.getName());

        // Update using setter
        s1.setName("Seema");
        System.out.println(s1.getName());
    }
}