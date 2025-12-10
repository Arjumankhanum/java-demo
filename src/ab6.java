abstract class bird1 {
    String color;
    String name;


    bird1(String color, String name) {
        this.color = color;
        this.name = name;
    }

    abstract void details();

    abstract void bird2method();

    void dog(String name, String breed, String color) {

        System.out.println(name + " " + breed + " " + color);
    }
}
class bird extends bird1 {
    bird(String color, String name) {

        super(color, name);
    }
    void details() {

        System.out.println("Bird Name: " + name + " Color: " + color);
    }
    void bird2method() {
        System.out.println("Bird2 Method: " + name + " color:" + color);
    }
}
public class ab6 {
    public static void main(String[] args) {
        bird b = new bird("Green", "Parrot");
        b.details();
        b.bird2method();
        b.dog("Tommy", "Pug", "White");
    }
}
