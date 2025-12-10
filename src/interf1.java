interface C{
    int a =3;
    static int b = 34;
    final int c = 12;
}
class demo8 implements C{

}
public class interf1 {
    public static void main(String[] args) {
        demo8 obj = new demo8();
        System.out.println(obj.a);
        System.out.println(C.b);
        System.out.println(obj.c);
    }
}
