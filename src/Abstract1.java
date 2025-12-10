// Abstract class with uppercase name
abstract class Demo00{
    abstract void display();
    abstract void show();

    void java()
    {
        System.out.println("Normal method");
    }
}

// Subclass extending abstract class
class Demo1 extends Demo00 {
    void display() {
        System.out.println("Abstract method implementation");
    }


    void show() {
        System.out.println("Welcome developers");
    }
}

// Public class must match filename
public class Abstract1 {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.display();
        obj.show();
        obj.java();
    }
}
