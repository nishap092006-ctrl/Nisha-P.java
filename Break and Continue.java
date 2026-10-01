public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skip 5, go to 6
            }
            System.out.println(i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // loop will stop here
            }
            System.out.println(i);
        }
        System.out.println("Loop Ended");
    }
}