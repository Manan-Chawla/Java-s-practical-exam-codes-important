interface A
{
    void getname();
}
interface B
{
    void getcarname();
}
class Customer implements A,B
{
    @Override
    public void getname()
    {
        System.out.println(" Customer name : Manan Chawla");
    }
    public void getcarname()
    {
        System.out.println(" Car name : Ford Bronco ");
    }
}
public class j17 {
    public static void main(String[]args)
    {
        // Question 17 : create a program for mutiple inheritance
        Customer c1=new Customer();
        c1.getname();
        c1.getcarname();
    }
}
