class vehicle1 {
    String name;
    int regno;
    double price;

    vehicle1(String n, int r, double p) {   // constructor
        name = n;
        regno = r;
        price = p;
    }

    public void details() {
        System.out.println(name + " " + regno + " " + price);
    }
}

public class arju {
    public static void main(String[] args) {
        vehicle1 v = new vehicle1("Honda", 1234, 75000.50);
        v.details();
    }
}
