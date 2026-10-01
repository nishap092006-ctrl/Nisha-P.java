public class ForLoop {
    public static void main(String[] args) {
        int num = 13;
        int counter = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }

        System.out.println("Total divisors: " + counter);
    }
}