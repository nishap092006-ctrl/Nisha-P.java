import java.util.Scanner;

public class Main {

    // METHODS
    static void add(int a, int b) {
        System.out.println("Result: " + (a + b));
    }
    static void sub(int a, int b) {
        System.out.println("Result: " + (a - b));
    }
    static void mul(int a, int b) {
        System.out.println("Result: " + (a * b));
    }
    static void div(int a, int b) {
        if (b != 0) {
            System.out.println("Result: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter operation + - * / : ");
        char op = sc.next().charAt(0);

        // calling methods
        if (op == '+') {
            add(a, b);
        } else if (op == '-') {
            sub(a, b);
        } else if (op == '*') {
            mul(a, b);
        } else if (op == '/') {
            div(a, b);
        } else {
            System.out.println("Invalid operator");
        }
    }
}