class dog1{
    String color;
    dog1(String color){

        this.color = color;
    }
    public void ddetails(){

        System.out.println(color);
    }
}
class babydog extends dog1
{
String name;
babydog(String name,String color)
{
    super(color);
    this.name = name;
}
public void bdetails(){

    System.out.println(name +" " +color);
       }
}
public class sing {
    public static void main(String[] args) {
babydog  obj = new babydog("arju", "blue");
        obj.bdetails();
    }
}
