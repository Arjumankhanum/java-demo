class bank {
    public void hdfc(String name, String address) {
        System.out.println(name + " " + address);
    }

    public void hdfc(String name, long accountno, String ifsc) {
        System.out.println(name + " " + accountno + " " + ifsc);
    }
}
public class bank1 {
    public static void main(String[] args) {
        bank n=new bank();
        n.hdfc("arjuman", 88888880l, "hdf00734");
        n.hdfc("arju","gbd");


    }
}
