public class anonymous {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        anonymous obj = new anonymous();
        obj.add(9, 7);
    }
}
//this is not anonymous class//