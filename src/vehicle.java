class Car{
    String name = "Defender";
    int price = 20000000;
    String color = "White";
    String model = " Defender 130";
    String Regno =" KA40 ";
}
class
bike{
    String name ="GT 650";
    int price = 500000;
    String color = "black";
}
public class vehicle {
    public static void main(String[] args) {
        Car obj = new Car();
        bike obj2 = new bike();
        System.out.println(obj.name + "  " + obj.price + " " + obj.color + " " + obj.model + " " + obj.Regno);
        System.out.println(obj2.name + " " + obj2.price + " " + obj2.color);
    }
}


