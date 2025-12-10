interface Parent {//hybrid combination of hierarchial and multiple
    void displayParent();
}

interface  Child1 extends Parent {
    void child1Method();
}

interface Child2 extends Parent {
    void child2Method();
}

class Demo implements Child1, Child2 {

    public void displayParent() {
        System.out.println("Parent interface method");
    }

    public void child1Method() {
        System.out.println("Child1 interface method");
    }

    public void child2Method() {
        System.out.println("Child2 interface method");
    }
}

public class hierarchial2 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.displayParent();
        obj.child1Method();
        obj.child2Method();
    }
}
