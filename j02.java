import java.util.Scanner;

public class j02 {
    public static void main(String[]args)
    {
        //Question 2 : factorial of a number
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=s1.nextInt();
        int fac=1;
        for (int i=1;i<=num;i++)
        {
            fac=fac*i;
        }
        System.out.println("Factorial of number is : "+fac);
    }
}
