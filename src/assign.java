class college1{
    String name;
    String address;
    college1(String name,String address){
        this.name = name;
        this.address = address;
    }
    public void cdetails(){
        System.out.println(name +" " +address);
    }
}
class  dept  extends college1{
    String Dname;
    dept(String name,String address,String Dname){
        super(name,address);
        this.Dname  = Dname;
    }
    public void ddetails(){
        System.out.println(name +" " +address+" "+Dname);
    }
}
class student extends dept{
    String Sname;
    String rollno;
    student(String name,String address,String Dname,String Sname,String rollno){
        super(name,address,Dname);
        this.Sname = Sname;
        this.rollno = rollno;
    }
    public void sdetails(){
        System.out.println("college:" +" " +name +" " +address+" "+"Department" +Dname+" "+"Student:"+Sname +" "+"rollno:"+rollno);
    }
}
public class assign {
    public static void main(String[] args) {
   student obj = new student("mvj", "Bangalore", "ISE", "Arjuman", "125");
   obj.sdetails();
    }
}
