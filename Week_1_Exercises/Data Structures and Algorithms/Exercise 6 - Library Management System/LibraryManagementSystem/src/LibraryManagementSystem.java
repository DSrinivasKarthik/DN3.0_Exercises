import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagementSystem {
    private Book[] books;
    private int count;

    public LibraryManagementSystem(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Array is full, cannot add more books.");
        }
    }

    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, count, Comparator.comparing(Book::getTitle));
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);

            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem(5);

        Book b1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book b2 = new Book(2, "1984", "George Orwell");
        Book b3 = new Book(3, "To Kill a Mockingbird", "Harper Lee");

        lms.addBook(b1);
        lms.addBook(b2);
        lms.addBook(b3);

        System.out.println("Linear Search for '1984':");
        System.out.println(lms.linearSearchByTitle("1984"));

        System.out.println("\nBinary Search for 'To Kill a Mockingbird':");
        System.out.println(lms.binarySearchByTitle("To Kill a Mockingbird"));
    }
}
