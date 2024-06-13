import java.util.Scanner;

public class j14 {
    public static void main(String[]args)
    {
        // Question 14 : create a program to perform arthimetic exception
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a whole nuber to divide");
            int a=sc.nextInt();
            System.out.println("Enter number to divide by ");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("result : "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("You cant divide by zero");
        }
        catch (Exception e)
        {
            System.out.println("something went wrong");
        }
    }
}
