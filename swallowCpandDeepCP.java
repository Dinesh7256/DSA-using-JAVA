import java.util.Scanner;

public class swallowCpandDeepCP {
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//       int[] arr = new int[];
        int[] arr = {2,5,4,7,8};
        int[] arr2;

//        shallow copy
        arr2 = arr;

//        Deep copy hai
        arr2= arr.clone();

        arr[0] = 1;

        printArray(arr);
        printArray(arr2);


    }
}
