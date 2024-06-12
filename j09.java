import java.util.Scanner;

// first class
class parent
{
    String pname;
    int age;
    void gets()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your father's name : ");
        pname=sc.next();
        System.out.println("Enter your father's age : ");
        age=sc.nextInt();
    }
    void shows()
    {
        System.out.println("Father name : "+pname);
        System.out.println("Age : "+age);
    }
}

// second class
class childs extends parent
{
    void getdata()
    {
        gets();
    }
    void showdata()
    {
        shows();
    }
}
public class j09 {
    public static void main(String[]args)
    {
        // Question 9 : create a program to demonstrate single inheritance
        childs c1=new childs();
        c1.getdata();
        c1.showdata();
    }
}
