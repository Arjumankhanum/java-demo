class a{
    public void demo1(){
        System.out.println("Hello Parent");
    }
    }
 class b extends a{
    public void demo2(){
         System.out.println("Hello Child and Parent");
     }
}
public class single {
    public static void main(String[] args) {
    b obj = new b();
    obj.demo1();
    obj.demo2();
    }
}
