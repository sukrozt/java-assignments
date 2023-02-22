public class Library {
    String address;
    Book[] books;                               //I created an array for objects
    boolean isItExist = false;
    boolean isEmpty = true;
    public static String openingHours = "9 AM";  //I assigned 2 different value for opening and closing
    // hours so that they can be changed easily
    public static String closingHours = "5 PM";

    public Library(String libAddress) {
        address = libAddress;
        this.books = new Book[5];  //capacity of every library is 5 books
    }

    public void libAddress() {
        System.out.println(address);
    }

    public static void libHours() {
        System.out.println("Libraries are open daily from " + openingHours + " to " + closingHours + ".");
    }

    public void availableBooks() {  //prints every book in a library
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book != null && !book.isBorrowed()) {
                System.out.println(books[i].title);
                isEmpty = false;
            }
        }
        if (isEmpty)
            System.out.println("No book in catalog");
    }

    public void addBook(Book newBook) { //Adds new book to library
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                break;
            }
        }
    }

    public void borrowBook(String title) { //marks the books as borrowed when they are, so that books become unreachable
        for (int i = 0; i < books.length; i++) {
            Book book1 = books[i];
            if (book1 != null && book1.getTitle().equals(title)) {
                isItExist = true;
                if (book1.borrowed) {
                    System.out.println("Sorry, this book is already borrowed.");
                    break;
                } else {
                    System.out.println("You successfully borrowed " + title + ".");
                    book1.borrowed = true;
                    break;
                }
            }
        }
        if (!isItExist) {
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }

    public void returnBook(String title) {  //marks the books as returned when they are, so that books become reachable again
        for (int i = 0; i < books.length; i++) {
            Book book1 = books[i];
            if (book1 != null && book1.getTitle().equals(title)) {
                if (book1.borrowed)
                    System.out.println("You successfully returned " + title + ".");

                else
                    System.out.println("Sorry, this book is already returned.");
                book1.borrowed = false;

            }
        }
        if (!isItExist) {
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }

    public static void main(String[] args) { //main test
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
// Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petite Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
// Print opening hours and the addresses
        System.out.println("Library hours:");
        libHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.libAddress();
        secondLibrary.libAddress();
        System.out.println();
// Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
// Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.availableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.availableBooks();
        System.out.println();
        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.availableBooks();

    }
}