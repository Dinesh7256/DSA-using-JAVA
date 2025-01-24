import java.util.*;
//////////////How to Communicating Between two classes///////

public class Robot  {
    String name;
    String color;
    int weight;

     Robot(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    void printDetails() {
        System.out.println("Name :" + this.name + "\n" + "Color : " + this.color + "\n" + "Weigth: "  + this.weight);
    }


}

class Person{
    String name;
    String personality;
    boolean isSetting;
    Robot robotOwned;

    Person(String name, String personality, boolean isSetting, Robot robotOwned) {
        this.name = name;
        this.personality = personality;
        this.isSetting = isSetting;
        this.robotOwned = robotOwned;
    }

    void sitDown() {
        this.isSetting = true;
    }

    void standUp() {
        this.isSetting = false;
    }

    void printDetails() {
        System.out.println("Name :" + this.name + "\n" + "Personality: " + this.personality + "\n" + "SettingStatus: " + this.isSetting);
    }


    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        Robot r1 = new Robot("Tom", "Blue", 85);
//        r1.weight = 25;
        Robot r2 = new Robot("Jerry", "red", 23);


        Person p1 = new Person("Dinesh", "nice", false, r1);
        Person p2 = new Person("Rahul", "Naughty", true, r2);
//        Person p3 = new Person("Sachin", "Kind",false);

//        p1.robotOwned = ;
//        p2.robotOwned = r2;
        r1.printDetails();
        r2.printDetails();

        p1.sitDown();

        p1.printDetails();


        System.out.println(p1.robotOwned.name);
        System.out.println(p2.robotOwned.name);



//        System.out.println(r1.name);
//        System.out.println(r1.color);
//        System.out.println(r1.weight);

    }

}