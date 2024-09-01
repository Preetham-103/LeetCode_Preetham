import java.util.*;

public class Main {
    public static void swap_arr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int x = arr[i];
                int y = arr[i + 1];
                x = x + y;
                y = x - y;
                x = x - y;

                arr[i] = x;
                arr[i + 1] = y;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        swap_arr(arr);
    }
}