
/*
 * Aim :- Create hashtable that store information about books in library
 * :- Take book title as key and all other information like Author, Year, Price
 * as value.
 * :- Create function for addBook(), removeBook(), searchBookByTitle() &
 * listAllBooks().
 */
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class Ex92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManagement lm = new LibraryManagement();
        int ch;
        do {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book By Title");
            System.out.println("4. List All Books");
            System.out.print("Enter Your Choice : ");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    lm.addBook();
                    break;
                case 2:
                    lm.removeBook();
                    break;
                case 3:
                    lm.searchBook();
                    break;
                case 4:
                    lm.display();
                    break;

            }
        } while (ch != 5);
    }
}

class LibraryManagement {
    Hashtable<String, Book> library;
    Scanner sc = new Scanner(System.in);

    LibraryManagement() {
        library = new Hashtable<>();
    }

    class Book {
        String author;
        double price;
        int year;

        public Book(String author, double price, int year) {
            this.author = author;
            this.price = price;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Book [author=" + author + ", price=" + price + ", year=" + year + "]";
        }
    }

    void addBook() {
        System.out.print("Enter Book Title : ");
        String title = sc.nextLine();
        System.out.print("Enter Book Author : ");
        String author = sc.nextLine();
        System.out.print("Enter Book Price : ");
        double price = sc.nextDouble();
        System.out.print("Enter Book Year : ");
        int year = sc.nextInt();
        sc.nextLine();

        Book b = new Book(author, price, year);
        library.put(title, b);
        System.out.println("Book Is Added Sucessfully " + title);
    }

    void removeBook() {
        System.out.print("Enter Book Title To Remove : ");
        String title = sc.nextLine().toLowerCase();
        if (library.containsKey(title)) {
            System.out.println("Book Is Removed " + title + " - " + library.remove(title));
        } else {
            System.out.println("Book Not Found " + title);
        }
    }

    void searchBook() {
        System.out.print("Enter Book Title To Remove : ");
        String title = sc.nextLine().toLowerCase();
        if (library.containsKey(title)) {
            System.out.println("Book Is Found " + title + " - " + library.get(title));
        } else {
            System.out.println("Book Not Found " + title);
        }
    }

    void display() {
        System.out.println("-----All Books-----");
        for (Map.Entry m : library.entrySet()) {
            System.out.println("Book Title = " + m.getKey() + " --> " + m.getValue());
        }
    }
}