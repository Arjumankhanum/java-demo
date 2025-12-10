class one{
    public void parent(){
        System.out.println("Parent");
    }
}
class two extends one{
    public void child1(){
        System.out.println("Child1");
    }
}

class three extends one{
    public void child2(){
        System.out.println("child2");
    }
}
public class hierarchial {
    public static void main(String[] args) {
        two obj = new two();
        obj.parent();
        obj.child1();
        three obj1 = new three();
        obj1.child2();
        obj1.parent();
    }
}
