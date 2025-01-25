//ARRAY MANUPULATION

import java.util.Scanner;
//question 1; finding the total pair exist in the array
public class ArrQn1 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int pairSum(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter "+size+ " elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter your target: ");
        int target = sc.nextInt();

        System.out.println("Your entered elements: ");
        printArray(arr1);

        System.out.println("\n To number of pair exist: "+ pairSum(arr1, target));
    }
}

//question 2 : Triplet sum
//question 3: int[] arr = [1,2,3,4,2,1,3] find the unique element in the array.

