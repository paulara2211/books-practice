import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("Clean Code", "Robert Martin", 464));
        library.add(new Book("Tales of Mystery and Imagination", "Edgar Allan Poe", 230));
        library.add(new Book("1984", "George Orwell", 25));

        for (Book book : library) {
            System.out.println(book.getTitle());
        }
        for (Book book : library) {
            if (book.getPages() > 300) {
                System.out.println("Long book: " + book.getTitle());
            }
        }
            Book longest = library.get(0);

            for (Book book : library) {
                if (book.getPages() > longest.getPages()) {
                    longest = book;
                }
            }
            System.out.println("Longest book: " + longest.getTitle());  
      
        System.out.println("Total books: " + library.size());
    }
}