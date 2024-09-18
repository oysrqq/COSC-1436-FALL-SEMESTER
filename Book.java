public class Book
{
    public String title;
    public String writer;
    public int pages;
    
    public Book()
    {
        title = "Chillin in Space";
        writer = "Izzy Tiji";
        pages = 142;
 
    } 

    public Book(String title)
    {
        this.title = title;
    }
    public Book(String writer, int pages)
    {
        this.writer = writer;
        pages = pages;
    }

    public Book(String title, String writer, int pgs)
    {
        this.title = title;
        this.writer = writer;
        pages = pages;
    }

    public void bookpages()
    {
        System.out.println(title + "Has 142 pages.");
    }

    public void written ()
    {
        System.out.println(title + "Was Written by Izzy Tiji.");
    }

    public String toString()
    {
        return ("title: " + title + "\nposition: " + writer + "\npages: " + pages);
    }

}
