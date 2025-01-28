import java.util.*;

public class Zerotoone {
    static void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sorting(int[] arr) {
        int left = 0;
        int n = arr.length;
        int right = n - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1};
        sorting(arr);
        Display(arr);
    }
}
