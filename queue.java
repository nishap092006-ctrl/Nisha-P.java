import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // 1. ADDING (Enqueue)
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q); // [10, 20, 30]

        // 2. LOOKUP
        System.out.println(q.peek()); // 10 (front element)

        // 3. REMOVING (Dequeue)
        q.remove(); // removes 10
        System.out.println(q); // [20, 30]

        // 4. TRAVERSING
        for (int num : q) {
            System.out.println(num);
        }
    }
}