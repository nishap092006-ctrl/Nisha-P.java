import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // 1. ADDING (Push)
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s); // [10, 20, 30] -> 30 is on Top

        // 2. LOOKUP
        System.out.println(s.peek()); // 30 (top element)

        // 3. REMOVING (Pop)
        s.pop(); // removes 30
        System.out.println(s); // [10, 20]

        // 4. TRAVERSING
        for (int num : s) {
            System.out.println(num);
        }
    }
}