class outer{
    private class inner{
        public void innerMethod()
            {
            System.out.println("inner class data");
        }
    }
    void details()
    {
        inner obj1 = new inner();
        obj1.innerMethod();
    }
}
public class inner {
    public static void main(String[] args) {
    outer obj = new outer();
    obj.details();
    }
}
