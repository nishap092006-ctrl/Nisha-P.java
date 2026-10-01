public class Main {
    public static void main(String[] args) {
        String str = "mujebe ek done bro";
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (String s : arr) System.out.print(s + " ");
    }
}
// Output: bro done ek mujebe