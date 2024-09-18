import java.util.Scanner;

public class Authour
{
    public String name, email, race;

    public static void main(String [] args);

    private static Scanner res = new Scanner(System.in);
    
    public Authour()
    {

    }

    public Authour(String name, String email, String race)
    {
        this.name = name;
        this.email = email;
        race = race;
    }

    public void wrotebook()
    {
        System.out.println(name + " Wrote Chillin in Space.");
    }

    public Book bookInfo()
    {
        System.out.println("What is the Book Title?: ");
        String bookTitle = res.nextLine();
        System.out.println("What is the Authour's name and ethnicity?: ");
        String bookWriter = res.nextLine();
        System.out.println("How many pages does the book have?: ");
        int bookPages = res.nextInt();
        return new Book(bookTitle, bookWriter, bookPages);
    }

    public String toString()
    {
        return ("name: " + name + "\nrace: " + race + "\nemail; " + email );
        

    }
    


}