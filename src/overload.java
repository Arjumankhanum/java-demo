class formula {
    public int area(int s)
    {
        return s*s;
    }
    public int area(int l,int b){

        return l*b;
    }
    public double area(double r){

        return 3.14*r*r;
    }
  }
    public class overload {
    public static void main(String[] args) {
        formula obj = new formula();
        System.out.println("area of square:" +obj.area(5));
        System.out.println("area of rectangle:" +obj.area(2,6));
        System.out.println("area of circle:"+obj.area(6.6));
    }
}
