class encap1{
    private String name="Ajay";
    private int age=18;
    public void setName(String name)
    {
      this.name =name;
    }
    public void setAge(int age)
    {
        this.age =age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class encap {
    public static void main(String[] args) {
      encap1 obj = new encap1();
      obj.setName("Arju");
      obj.setAge(22);
        System.out.println(obj.getName()+"  " +obj.getAge());
    }
}
