import java.util.Arrays;
import java.util.Scanner;

interface UseInter {
    void getdata();
    void showdata();
}

// Implement the interface in the Student class
class Student implements UseInter {
    int roll;
    String name;

    @Override
    public void getdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your roll number:");
        roll = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over
        System.out.println("Enter your name:");
        name = scanner.nextLine();
    }

    @Override
    public void showdata() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + roll);
    }
}

public class j20
{
    public static void main(String[]args)
    {
        // getting largest element from a array
        int arr[]={10,45,67,23,45,67,43,222};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("The largest element from the array : "+largest);

        //arrange element in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted array : ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Element : "+arr[i]);
        }

        //factorial of number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to get factorial of that number ");
        int num=sc.nextInt();
        int fac=1;
        for(int i=1;i<=num;i++)
        {
            fac=fac*i;
        }
        System.out.println("Factorial of number : "+fac);


        //to check a number is strong or not
        int n1=145;
        int n=n1;
        int d;
        int sum=0;
        while(n1>0)
        {
            int facs=1;
            d=n1%10;
            for(int i=1;i<=d;i++)
            {
                facs=facs*i;
            }
            sum=sum+facs;
            n1=n1/10;
        }
        if(n==sum)
        {
            System.out.println("its a strong number");
        }
        else
        {
            System.out.println("its not a strong number");
        }

        // create a 2d array
        int arrs[][]={
                {
                    100,200,300
                },
                {
                    400,500,600
                },
                {
                    700,800,900
                }
        };
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {

                  System.out.println("Element of arrays : "+arrs[i][j]);
            }
        }

        //statements
        int age=19;
        if(age>=18)
        {
            System.out.println("You are allowed to vote");
        }
        else if (age==0)
        {
            System.out.println("You are just born go back to mama dude!");
        }
        else
        {
            System.out.println("You're not allowed to vote");
        }

        for(int k : arr )
        {
            System.out.println("element are : =====> "+k);
        }

        char grade='a';
        switch (grade)
        {
            case 'a' :
                System.out.println("First in class");
                break;
            case 'b' :
                System.out.println("Second in class");
                break;
            case 'c':
                System.out.println("Third in class");
                break;
            default:
                System.out.println("better luck next time");
        }

        UseInter student = new Student();
        student.getdata();
        student.showdata();
    }
}
