import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 1. ADDING
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println(list); // [Java, Python, C++]

        // 2. REMOVING
        list.remove("Python"); // remove by value
        list.remove(0); // remove by index 0 (Java)
        System.out.println(list); // [C++]

        // Add again for traversing
        list.add("Java");
        list.add("Go");

        // 3. TRAVERSING
        for (String lang : list) {
            System.out.println(lang);
        }
    }
}