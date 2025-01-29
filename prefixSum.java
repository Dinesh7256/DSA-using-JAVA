import java.util.Scanner;

public class prefixSum {

    public static int[] computePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static void prefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        int[] prefixSum = computePrefixSum(arr);
        prefixSum(arr);

        System.out.println("Prefix Sum Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
//        for (int sum : prefixSum) {
//            System.out.print(sum + " ");
//        }

    }
}
