class Dog{
    String name = "Munna";
    int age = 2;
    String color = "White";
}
class cat{
    String name ="abc";
    String color = "black";
}
public class object {
    public static void main(String[] args) {
        Dog obj = new Dog();
        cat obj2 = new cat();
        System.out.println("name is:" +obj.name+"  "+"Age is: "+obj.age +" "+"color is:" + obj.color +" "+obj2.name+" "+obj2.color);


    }

}
