class Runinter implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Hi!. people lets do something....");
    }
}
public class j19 {
    public static void main(String[]args)
    {
        Runinter r1=new Runinter();
        Thread thread=new Thread(r1);
        thread.start();
    }
}
