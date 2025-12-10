class vehicle15{
    String color;
    vehicle15(String color){

        this.color = color;
    }
    public void vdetails()
    {
        System.out.println(color);
    }
}
class car1 extends vehicle15{
    String regno;
    int prize;
    car1(String regno,int prize,String color){
        super(color);
        this.regno = regno;
        this.prize = prize;
    }
    public void cdetails()
    {
        System.out.println(color +" " +regno +" "+prize);
    }
}
class bike1 extends car1{
    String name;
    bike1(String name,String regno, int prize,String color){
        super(regno,prize,color);
        this.name = name;
    }
    public void bdetails(){

        System.out.println(name +" " +color +" " +regno +" "+prize);
    }
}
public class multi2 {
    public static void main(String[] args) {
        bike1 obj = new bike1("gt","ka40",2000000, "black");
        obj.bdetails();
    }
}
