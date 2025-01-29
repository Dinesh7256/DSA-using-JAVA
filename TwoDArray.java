import java.util.Scanner;

public class TwoDArray {
    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of row and col : ");
//        int row = sc.nextInt();
//        int col = sc.nextInt();

//        int[][] arr = new int[row][col];
//        int[][] ar2 = new int[row][col];

        int[][] arr = {{1,1}, {2,2}};
        int[][] arr2 = {{3,3}, {4,4}};

        int[][] arr3 = new int[2][2];


//        System.out.println("Row :" +row+ " col : "+col);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = arr[i][j] + arr2[i][j];
            }
        }


        System.out.println("MATRIX: ");
        printMatrix(arr);
    }
}
