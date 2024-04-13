public class Book 
{
    //encapsulation | private variables
    private int pages;
    private int chapters;
    private int publication;
    private String title;
    private String author;

    //default constructor
    public Book()
    {
        pages = 0; chapters = 0; publication = 0; title = ""; author = "";
    }
    //value pass constructor
    public Book(int totPage, int totChaps, int yrPub, String bookTitle, String bookAuthor)
    {
        pages = totPage; chapters = totChaps; publication = yrPub; 
        title = bookTitle; author = bookAuthor;
    }

    //mutators and accessor methods
    public void change_pages(int new_page)
    {pages = new_page;}

    public void change_chapters(int new_chapter)
    {chapters = new_chapter;}

    public void change_publication(int new_publication)
    {publication = new_publication;}

    public void change_title(String new_title)
    {title = new_title;}

    public void change_author(String new_author)
    {author = new_author;}

    public int get_pages()
    {return pages;}

    public int get_chapters()
    {return chapters;}

    public int get_publication()
    {return publication;}

    public String get_title()
    {return title;}

    public String get_author()
    {return author;}

}