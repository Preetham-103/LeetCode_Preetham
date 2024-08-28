import java.util.*;

public class Main {
    public static void rearrange(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
            }
        }

        for (int nums : arr) {
            System.out.print(nums);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrange(arr);
    }
}