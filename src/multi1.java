class x {
    public void demo() {
        System.out.println("Grand Parent");
    }

}
class y extends x{
        public void demo2(){
          System.out.println("Parent");
      }
  }
  class z extends y{
        public void demo3(){

            System.out.println("child");
        }
  }
public class multi1 {
    public static void main(String[] args) {
        z obj = new z();
        obj.demo();
        obj.demo2();
        obj.demo3();
    }
}
