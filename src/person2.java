class  person1{
    String name1;
    int age1;
    person1(String name,int age)
    {
        name1=name;
        age1=age;
    }
    public void details()
    {

        System.out.println(name1+" "+age1);
    }
}
public class person2 {
    public static void main(String[] args) {
        person1 obj = new person1("arjuman", 22);
        obj.details();
    }
}
