class encap7{
    private String name ="arju";
    private int age=20;
    private String College ="mvj";
    private String branch = "ise";
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setCollege(String College)
    {
        this.College=College;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCollege(){
    return College;
    }
    public String getBranch(){
        return branch;
    }
}
public class encap2 {
    public static void main(String[] args) {
        encap7 obj = new encap7();
        obj.setName("Arju");
        obj.setAge(22);
        obj.setCollege("mvjce");
        obj.setBranch("ISE");
        System.out.println(obj.getName() + " " + obj.getAge() + " " + obj.getCollege() + " " + obj.getBranch());
    }
}
