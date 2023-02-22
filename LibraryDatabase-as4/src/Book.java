public class Book {
    String title;
    boolean borrowed = false;

    public Book(String bookTitle) {
        title = bookTitle;
    }

    public void rented() {
        borrowed = true;
    }

    public void returned() {
        borrowed = false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] arguments) {
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title: " + example.getTitle());
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed?: " + example.isBorrowed());
    }
}