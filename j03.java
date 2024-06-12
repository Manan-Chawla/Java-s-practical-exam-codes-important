public class j03 {
    public static void main(String[]args)
    {
        // Question 3 : to get whether a number is strong number or not
        int num=145;
        int n=num;
        int sum=0;
        int d;
        while(num>0)
        {
            d=num%10;
            int fac=1;
            for (int i=1;i<=d;i++)
            {
                fac=fac*i;
            }
            sum=sum+fac;
            num=num/10;
        }
        if(n==sum)
        {
            System.out.println("its strong number");
        }
        else
        {
            System.out.println("its not a strong number");
        }
    }
}
