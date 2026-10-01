import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // 1. ADDING
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr); // [10, 20, 30]

        // 2. REMOVING
        arr.remove(1); // remove index 1 (20)
        System.out.println(arr); // [10, 30]

        // 3. TRAVERSING
        for (int num : arr) {
            System.out.println(num);
        }

        // 4. LOOKUP
        System.out.println(arr.contains(10)); // true
        System.out.println(arr.get(0)); // 10 - get by index
    }
}