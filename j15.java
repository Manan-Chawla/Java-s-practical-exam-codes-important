public class j15 {
    public static void main(String[]args)
    {
        // Question 15 : create a program for exception propgation
        j15 e1=new j15();
        System.out.println("This is main function : ");
        e1.gets();
    }
    void gets()
    {
        System.out.println("Name of car : ");
        String car="Ford mustang";
        System.out.println(car);
        getdetail();
    }
    void getdetail()
    {
        System.out.println("Ford mustang is a american muscle car you should buy it");
    }
}
