class emp {
    String name = "arju";
    long id = 548332225587l;
    String salary = "22.5L";
}
class Department {
    String name = "Developer";
    long id = 2555987456l;
}
public class hw{
    public static void main(String[] args) {
        emp obj = new emp();
        Department obj1 = new Department();
        System.out.println("Employee details -1");
        System.out.println("Emp Name:"+obj.name);
        System.out.println("Emp id:"+obj.id);
        System.out.println("Emp salary:"+obj.salary);
        System.out.println();
        System.out.println("Employee details - 2");
        System.out.println("Dep Name:" +obj1.name);
        System.out.println("Dep id: "+obj1.id);


    }
}
