public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 9, 6};
        int bubbles = 0; // total swaps

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    bubbles++;
                }
            }
        }

        System.out.println("Total bubbles / swaps = " + bubbles);
        System.out.print("Sorted array: ");
        for (int n : arr) System.out.print(n + " ");
    }
}