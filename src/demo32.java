abstract class demo33 {
    abstract void add(int a, int b);
}

public class demo32 {
    public static void main(String[] args) {

        demo33 obj = new demo33() {   // anonymous class
            public void add(int a, int b) {

                System.out.println(a + b);
            }
        };

        obj.add(9, 8);
    }
}


