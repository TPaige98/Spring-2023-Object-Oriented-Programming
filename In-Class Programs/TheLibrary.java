public class TheLibrary 
{
 
    public static void main(String [] args)
    {
        Book Trevor = new Book();
        Book Paige = new Book(0, 0, 0, "", "");

        Trevor.change_title("Adventures of Huckleberry Finn");
        Trevor.change_author("Mark Twain");
        Trevor.change_publication(1884);
        Trevor.change_pages(366);
        Trevor.change_chapters(43);

        System.out.println("You are checking out: " + Trevor.get_title() + " | Written by: " + Trevor.get_author() 
        + " | Published: " + Trevor.get_publication() + " | Pages: " + Trevor.get_pages() 
        + " | Chapters: " + Trevor.get_chapters());

        System.out.println();

        Paige.change_title("A Clash of Kings");
        Paige.change_author("George R.R. Martin");
        Paige.change_publication(1998);
        Paige.change_pages(761);
        Paige.change_chapters(69);

        System.out.println("You are now checking out: " + Paige.get_title() + " | Written by: " + Paige.get_author()
        + " | Published: " + Paige.get_publication() + " | Pages: " + Paige.get_pages() 
        + " | Chapters: " + Paige.get_chapters());
    }
    
}
