import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private int price;
    private int num_pages;

    Book(String name, String author, int price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setNumPages(int num_pages) {
        this.num_pages = num_pages;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    int getPrice() {
        return price;
    }

    int getNumPages() {
        return num_pages;
    }

    // toString method
    public String toString() {
        return "Book Name: " + name +
               "\nAuthor: " + author +
               "\nPrice: " + price +
               "\nNumber of Pages: " + num_pages;
    }
}

public class books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of books:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book[] b = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.println("Enter book name:");
            String name = sc.nextLine();

            System.out.println("Enter author name:");
            String author = sc.nextLine();

            System.out.println("Enter price:");
            int price = sc.nextInt();

            System.out.println("Enter number of pages:");
            int pages = sc.nextInt();
            sc.nextLine(); // consume newline

            b[i] = new Book(name, author, price, pages);
        }

        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
            System.out.println("-------------------");
        }

        sc.close();
    }
}
