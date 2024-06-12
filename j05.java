public class j05 {
    public static void main(String[]args)
    {
        // Question 5 : Statements in java

        //for each loop or enhanced for loop
        String animals[]={"Cat","Tiger","Lion","Lynx"};
        for (String i : animals)
        {
            System.out.println("Elements are as : "+i);
        }

        // for loop
        System.out.println("Again print the animals name but using for loop this time");
        for (int i=0;i<animals.length;i++)
        {
            System.out.println("Animals name are as follows : "+animals[i]);
        }

        // if statements and if-else statement
        int age=17;
        if(age>=18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("you cant vote");
        }

        // switch statement
        char grade='A';
        switch (grade)
        {
            case 'A':
                System.out.println("You did great");
                break;
            case 'B' :
                System.out.println("You did good");
            default:
                System.out.println("You can do better than this");
        }

        
    }
}
