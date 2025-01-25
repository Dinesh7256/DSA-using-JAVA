import java.util.Scanner;

public class rotateArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] rotatingArray(int[] arr, int k) {
        int[] ans = new int[arr.length];
        int n = arr.length;
        k = k % arr.length;
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j] = arr[i];
            j++;
        }

        for (int i = 0; i < n - k; i++) {
            ans[j] = arr[i];
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        System.out.println("how many time you want to rotate: ");
        int k = sc.nextInt();
        int[] arr1 = new int[size];


        System.out.println("Enter your element: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Your entered elements: ");
        printArray(arr1);

        System.out.println("\n");
        for(int num: rotatingArray(arr1, k)){
            System.out.print(num+" ");
        };

    }
}
