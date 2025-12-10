interface bird9 {
    void bird9(String color,int age);
}
interface peacock extends bird9 {
    void peacock_details(String color);
}
interface parrot extends bird9 {
    void parrot(String color);
}

class b3 implements bird9,peacock,parrot{

    public void bird9(String color,int age){
        System.out.println("Bird color is:" +color+" Age is:" +age);
    }

    public void peacock_details(String color){
        System.out.println("Peacock color is:" + color);
    }

    public void parrot(String color){
        System.out.println("Parrot color is:" + color);
    }
}

public class interface77 {
    public static void main(String[] args) {
        b3 obj = new b3();
        obj.bird9("white",2);
        obj.peacock_details("blue");
        obj.parrot("green");
    }
}
