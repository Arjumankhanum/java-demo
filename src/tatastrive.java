import java.util.*;
class Tata{
    String courseName;
    int Batchid;
    int duration;

    Tata(String cname, int bid, int dur) {
        courseName = cname;
        Batchid = bid;
        duration = dur;
    }
    public void Tsdetails(String address,int phoneNo){
        System.out.println("Course Name: " +courseName);
        System.out.println("Batch id: " + Batchid);
        System.out.println("Duration:" +duration);
        System.out.println("Address:" + address);
        System.out.println("Phone Number:" +phoneNo);
    }
}

public class tatastrive {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course Name:");
        String cname = sc.nextLine();
        System.out.println("Enter Batch id:");
        int bid = sc.nextInt();
        System.out.println("Enter Duration:");
        int dur = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Address:");
        String address = sc.nextLine();
        System.out.println("Enter Phone Number:");
        int phoneNo = sc.nextInt();
        // Create object
        Tata obj = new Tata(cname, bid, dur);//initialise constructor
        // Call method
        obj.Tsdetails(address, phoneNo);//call method
    }
}

