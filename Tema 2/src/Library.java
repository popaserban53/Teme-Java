import java.util.ArrayList;

public class Library {
    ArrayList<Books> books;
    public Library() {
        books = new ArrayList<Books>();
    }
    public void addBooks(Books book) {
        books.add(book);
    }
    public void removeBooks(Books book) {
       if(books.remove(book)){
            System.out.println("Book has been removed!");
        }
        else{
            System.out.println("Book removal has failed!");
        }
    }
    public void listBook() {
        for (Books i:books
             ) {
            System.out.println(i.toString());

        }
    }
}
