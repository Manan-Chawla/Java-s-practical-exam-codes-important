interface one
{
    public void printsme();
    public void printsmetoo();
}
class firsts implements one {
    @Override
    public void printsme() {
        System.out.println("Hi this is me ");
    }

    @Override
    public void printsmetoo() {
        System.out.println("You know me well pal");
    }
}
public class interfaceuser {
    public static void main(String[]args)
    {
        firsts o1=new firsts();
        o1.printsme();
        o1.printsmetoo();
    }
}
