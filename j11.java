import java.util.Scanner;

// first class
class first
{
    int roll;
    String name;
    void getroll()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your roll number : ");
        roll=sc.nextInt();
    }
    void getname()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name : ");
        name=s.next();
    }
    void showrolls()
    {
        System.out.println("Roll number : "+roll);
    }
    void showname()
    {
        System.out.println("Name : "+name);
    }
}

// second class
class second extends first
{
   void gr()
   {
       getroll();
   }
   void gd()
   {
       showrolls();
   }
}

// third class
class third extends first
{
    void gn()
    {
        getname();
    }
    void ng()
    {
        showname();
    }

}

public class j11 {
    public static void main(String[]args)
    {
        // Question 11 : create a program for hierarchical inheritance
        second s1=new second();
        s1.gr();
        s1.gd();


        third t1=new third();
        t1.gn();
        t1.ng();
    }
}
