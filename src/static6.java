class outer8{
    static  class inner8{
        void demo12(){
            System.out.println("static nested class");
        }
    }
}
public class static6 {
    public static void main(String[] args) {
  outer8.inner8 obj= new outer8.inner8();
  obj.demo12();
    }
}
