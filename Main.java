public class Main {
    public static void main(String[] args) {
        Book first = new Book("Clean Code", "Robert Martin", 464);
        Book second = new Book("Tales of Mystery and Imagination", "Edgar Allan Poe", 230);

        first.describe();
        second.describe();
    }
}
