public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 9, 6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double mean = (double) sum / arr.length;
        System.out.println("Sum = " + sum);
        System.out.println("Mean = " + mean);
    }
}