interface A1{
    void add(int a,int b);
    }
interface A2{
    void sub(int a,int b);
}
class demo89 implements A1,A2
{
   public void add(int a,int b)
   {

       System.out.println(a+b);
   }
 public void sub(int a,int b)
 {
     System.out.println(a-b);
    }
}
public class int1 {
    public static void main(String[] args) {
       demo89 obj = new demo89();
       obj.add(5,9);
       obj.sub(6,2);
    }
}
