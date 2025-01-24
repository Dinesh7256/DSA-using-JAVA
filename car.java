public class car {
    String color;
    String type;
    int  Hoshpower;

    car(String clr , String type, int Hp) {
        this.color = clr;
        this.type = type;
        this.Hoshpower = Hp;
    }

    void printDetail() {
        System.out.println("color: "+this.color+ "\n" + "type: "+ this.type);
    }

    public static void name(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        car odi = new car("red", "luxury", 8800);
//                       name("dinesh");
        odi.printDetail();

//        odi.color = "red";
//        odi.type = "luxury";
//        odi.Hoshpower = 562;

    }


}
