public class j08 {
    public static int do_work(int num1, int num2)
    {
        int sum=num1+num2;
        System.out.println("Addition of number : "+sum);
        return sum;
    }
    public static int do_work(int a ,int b , int c)
    {
        int mul=a*b*c;
        System.out.println("Multiplication of number : "+mul);
        return mul;
    }
    public static void main(String[]args)
    {
        // Question 8 : create a program which demonstrate method overloading
        do_work(1020,1202);
        do_work(10,20,2);
    }
}
