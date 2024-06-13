import java.util.Scanner;

class item
{
    static int sr=1000; // static data type
    int itemnum;
    String itemname;
    public item(String itemname)
    {
        this.itemnum=++sr;
        this.itemname=itemname;
    }
    public void display()
    {
        System.out.println("Item-serial number : "+itemnum);
        System.out.println("Item name : "+itemname);
    }
}
public class j13 {
    public static void main(String[]args)
    {
        // Question 13 :  create a program for using static data memeber
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter item name to put in to cart : ");
        item i1=new item(sc.next());
        i1.display();
    }
}
