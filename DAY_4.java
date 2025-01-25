
import java.util.Scanner;

public class DAY_4 {
    String colour;
//    int wheel;
    static int wheel = 4;


    public static void swap( int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap value of a: " + a);
        System.out.println("swap value of b ; " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DAY_4 obj = new DAY_4();
        DAY_4 obj1 = new DAY_4();

        obj1 = obj;

        obj.colour = "green";
        obj.wheel = 4;

        obj1.colour = "pink";
        obj1.wheel = 5;

        System.out.println(obj.colour);
        System.out.println(obj.wheel);

        System.out.println(obj1.colour);
        System.out.println(obj1.wheel);





//        System.out.println("original value of a : ");
//        int a =  sc.nextInt();
//        System.out.println("orginal value of  B : ");
//        int b = sc.nextInt();
//        int a = 100;
//        int b = a;
//        b = 200;
//        System.out.println(a);
//        System.out.println(b);

//        swap(a, b);
//        System.out.println("swap value of a :" + a);
//        System.out.println("swap value of b :" + b);


    }
}
