import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (temp != 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }

        if (sum == n)
            System.out.println(n + " is Armstrong");
        else
            System.out.println(n + " is NOT Armstrong");
    }
}