public class string {


    public static void swap(char[] c, int a , int b){
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }

    public static  char[] Reverse(String str){


//        for(int i = 0; i<str.length(); i++){
//            string s = str.charAt(str.length()-1-i);
//        }


        char[] ch = str.toCharArray();
        int left  = 0;
        int right = ch.length-1;

        while(left<=right){
            swap(ch, left, right);
            left++;
            right--;
        }
        return ch;
    }

    public static void main(String[] a){
        String s = "Dinesh";

//        ["d", "i", "n","s","h"];

//
//        for(char ch: Reverse(s)){
//            System.out.println(ch);
//        };


//        string to char conversion
//        char to string conversion
//        array to string
//        string to array

//        String is Immutable


        StringBuilder sb = new StringBuilder(s);
        String rs = sb.reverse().toString();
        System.out.println(rs);


//        if (s.equals(rs)) {
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("not palindrome");
//        }

    }
}

//The primary reason why using a char[] for string reversal is more efficient than using stringname.charAt(i) is performance and memory overhead. Let's break it down:
//        1. Direct Access in char[]:
//
//A char[] is an array of characters that provides direct indexed access to its elements. This makes accessing or modifying characters very fast, as the operation is O(1)O(1) for each character.
//
//        2. Overhead of charAt() Method:
//
//The charAt(i) method in Java performs bounds checking every time it's called to ensure i is within the string's range. This adds a slight overhead compared to direct access in a char[].
//Internally, a String in Java stores its characters in a char[]. So every call to charAt(i) indirectly accesses this array after performing the necessary safety checks.
//
//3. Memory Efficiency:
//
//When you work directly with a char[], you're manipulating a single data structure. However, if you repeatedly use charAt(i) while reversing a string, you’re performing multiple method calls, which can add up in terms of overhead when the string is large.
//
//        4. Mutability of char[]:
//
//Strings in Java are immutable, meaning that any modification creates a new string object. Using a char[] allows in-place updates without creating additional objects, which can save memory and improve performance.


