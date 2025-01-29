import java.util.Scanner;

public class TranposeMatrix {

    public static void printMatrix(int[][] arr, int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
//                swapping perform
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row and col : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
//        int[][] arr2 = new int[row][col];

        System.out.println("Row :" +row+ " col : "+col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRIX: ");
        printMatrix(arr, row, col);

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr2[j][i] = arr[i][j];
//            }
//        }
//
        System.out.println("Transpose Matrix: ");
        transposeMatrix(arr, row, col);
        printMatrix(arr, row, col);
    }
}
