
public class static_and_non_Static {
    public static void main(String[] args) {
        // Calling static method
        Example.staticMethod();

        // Creating an object to call non-static method
        Example obj = new Example();
        obj.nonStaticMethod();
    }
}

 class Example {


    // Static variable
    static String staticVar = "I am static";

    // Non-static variable
    String nonStaticVar = "I am non-static";

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static Variable: " + staticVar);

        // Cannot access non-static members directly
        // System.out.println(nonStaticVar); // Error
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Non-static Variable: " + nonStaticVar); // Allowed
    }

}
