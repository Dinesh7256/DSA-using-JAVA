import java.util.Scanner;
public class Array {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    public static int findMax(int[] arr) {
        int max_idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max_idx]) {
                max_idx = i;
            }
        }
        return max_idx;
    }


    public static int secondMax(int[] arr) {

        int max_index = findMax(arr);

        arr[max_index] = Integer.MIN_VALUE;

        int secondMax = findMax(arr);
        return arr[secondMax];
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();


        int[] arr1 = new int[size];

//       int arr2[] = new int[size];
        System.out.println("Enter your element: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Your entered elements: ");
        printArray(arr1);
//        int idx  = findMax(arr1);
//        System.out.println("\nmax index: "+ idx);

        System.out.println("Second Max element is : "+ secondMax(arr1));

    }
}
