public class Main
{
    public static void main(String[] args)
    {
        Authour authour1 = new Authour("Mike", 13.3);
        authour1.acquirebook();
        System.out.println(authour1.getBook());
    }
}