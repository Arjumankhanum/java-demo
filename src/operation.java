import java.util.*;
class Op {
    public int add(int a, int b) {

        return a + b;
    }
    public int subs(int a, int b) {

        return a - b;
    }
    public int mul(int a, int b) {

        return a * b;
    }
    public int div(int a, int b) {

        return a / b;
    }
}
public  class operation {
    public static void main(String[] args) {
        Op obj = new Op();
        int r = obj.add(1, 5);
        System.out.println(r);
        int s = obj.subs(1, 5);
        System.out.println(s);
        int t = obj.mul(1, 5);
        System.out.println(t);
        int v = obj.div(1, 5);
        System.out.println(v);
    }
}