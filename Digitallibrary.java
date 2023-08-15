import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

}

class Member {
    int id;
    String name;
    String email;

    public Member(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}

class Library {
    Map<Integer, Book> books;
    Map<Integer, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

}

public class Digitallibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    adminLogin(scanner, library);
                    break;
                case 2:
                    userLogin(scanner, library);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void adminLogin(Scanner scanner, Library library) {
        // Implement admin login logic
        // Admin actions: Add/Update/Delete books and members

        // Example:
        System.out.println("Admin Logged In.");
        System.out.println("1. Add Book");
        System.out.println("2. Update Book");
        System.out.println("3. Delete Book");
        // ... other admin options
    }

    public static void userLogin(Scanner scanner, Library library) {

        System.out.println("User Logged In.");
        System.out.println("1. View Books");
        System.out.println("2. Search Book");
        System.out.println("3. Issue Book");
        System.out.println("4. Return Book");

    }
}
