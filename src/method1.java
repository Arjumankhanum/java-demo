class j1{
    public void mobile1(String name, int ram, int rom, String battery, String model) {
        System.out.println("---- Mobile Details ----");
        System.out.println("Name: " + name);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("ROM: " + rom + "GB");
        System.out.println("Battery: " + battery);
        System.out.println("Model: " + model);
    }
}
class g extends j1 {
    public void mobile1(String name, int ram, int rom) {
        System.out.println("---- Mobile Details (Child Class) ----");
        System.out.println("Name: " + name);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("ROM: " + rom + "GB");
    }
    public void laptop1(String name, int ram, int rom, String graphics, String processor) {
        System.out.println("---- Laptop Details ----");
        System.out.println("Name: " + name);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("ROM: " + rom + "GB");
        System.out.println("Graphics: " + graphics);
        System.out.println("Processor: " + processor);
    }
}
public class method1 {
    public static void main(String[] args) {

        g obj = new g();
        obj.mobile1("Samsung F54", 8, 128, "6000mAh", "5G");
        obj.laptop1("HP Pavilion", 16, 512, "RTX 3050", "Intel i7");
    }
}
