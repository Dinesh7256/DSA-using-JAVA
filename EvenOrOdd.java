import java.util.Scanner;

public class EvenOrOdd {
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void evenOdd(int[] arr) {
        int n  = arr.length;
        int left = 0;
        int right = n-1;

            while(left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("original array");
        printArray(arr);
        evenOdd(arr);
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
