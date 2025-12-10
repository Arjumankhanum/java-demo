class k {
    public double interest(int p, double r) {
        return p * r / 100;
    }
    public double interest(int p, double r, int t) {
        return p * t * r / 100;
    }
}

public class overload2 {
    public static void main(String[] args) {
        k ob = new k();
        System.out.println(ob.interest(20000, 2.2, 8));
    }
}
