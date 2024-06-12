import java.util.Scanner;

//first class
class pdetail
{
    String pname;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your father's name");
        pname=sc.next();
    }
    void show()
    {
        System.out.println("Father's name : "+pname);
    }
}

//second class
class cdetail extends pdetail
{
    String cname;
    void gets()
    {
        get();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name : ");
        cname=s.next();
    }
    void shows()
    {
        show();
        System.out.println("Student name : "+cname);
    }
}

//third class
class cpdetail extends cdetail
{
    void getdatas()
    {
        gets();
    }
    void showdatas()
    {
        shows();
    }
}
public class j10 {
    public static void main(String[]args)
    {
        // Question 10 : create a program of multilevel inheritance
        cpdetail c1=new cpdetail();
        c1.getdatas();
        c1.showdatas();
    }
}
