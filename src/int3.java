interface Grandparent1 {
    void Grandfather1(String name, int age);
}

interface Father1 extends Grandparent1 {
    void Father1(String name, int age);
}

class demo101 implements Father1 {

    public void Grandfather1(String name, int age) {
        System.out.println("Name is: " + name + " Age is: " + age);
    }

    public void Father1(String name, int age) {
        System.out.println("Name is: " + name + " Age is: " + age);
    }
}

public class int3 {
    public static void main(String[] args) {
        demo101 obj = new demo101();
        obj.Grandfather1("abs", 66);
        obj.Father1("zxc", 45);
    }
}
