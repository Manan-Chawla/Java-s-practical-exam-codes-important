import java.util.Scanner;

class parents
{
    String name;
    int roll;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your roll number ");
        roll=sc.nextInt();
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your name ");
        name=s1.next();
    }
    void showdata()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll no : "+roll);
    }
}
class child extends parents
{
    String pname;
    String mname;

    void gets()
    {
        getdata();
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        System.out.println("Enter your father's name : ");
        pname=s2.next();
        System.out.println("Enter your mother's name : ");
        mname=s3.next();
    }
    void shows()
    {
        System.out.println("Father name : "+pname);
        System.out.println("Mother name : "+mname);
    }
}
class grandchild extends child
{
    String course;
    String section;
    void getdetail()
    {
        gets();
        Scanner s4= new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);
        System.out.println("Enter your course ");
        course=s4.next();
        System.out.println("Enter your section ");
        section=s5.next();
    }
    void showdetail()
    {
        showdata();
        shows();
        System.out.println("Course : "+course);
        System.out.println("Section : "+section);
    }
}
public class inheritancejava {
    public static void main(String[]args)
    {
        grandchild g1=new grandchild();
        g1.getdetail();
        g1.showdetail();
    }
}
