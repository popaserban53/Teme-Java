public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Books book = new Books ("Harap Alb", 4);
        Books book1 = new Albums("Fat Frumos", 12, "Bun");
        Books book2 = new Novel("Capra cu trei iezi",3, "Poveste");
        library.addBooks(book); library.addBooks(book1); library.addBooks(book2);
        library.removeBooks(book2);
        library.listBook();
    }
}
