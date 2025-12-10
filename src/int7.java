interface D {
    default int demo0(int a, int b)
    {
        return a + b;
    }

    static void demo11 ()

    {
        System.out.println("static methods");
    }
}
class demo12 implements D {
        public static void main(String[] args) {
            demo12 obj = new demo12();
            System.out.println(obj.demo0(2, 8));
            D.demo11();
        }
    }
