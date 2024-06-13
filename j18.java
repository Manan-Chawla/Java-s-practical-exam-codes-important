public class j18 {
    public static void main(String[]args)
    {
        // Question 18 : create a program for string and its operation
        String name="Manan Chawla";

        //tolowercase
        System.out.println("Value in lowercase : "+name.toLowerCase());
        //topuppercase
        System.out.println("Value in uppercase : "+name.toUpperCase());
        //charat() for getting value at specific index
        System.out.println("Value at index 6 : "+name.charAt(6));

        //comparing string
        String s1="MANAN";
        String s2="manan";
        if(s1.equals(s2))
        {
            System.out.println("They are equal ");
        }
        else
        {
            System.out.println("They are not equal");
        }

        //adding two string
        String st1="Manan ";
        String st2=st1.concat("Chawla");
        System.out.println("String value after adding : "+st2);
    }
}
