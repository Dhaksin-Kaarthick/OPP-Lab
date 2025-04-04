class Book {
    String title;
    int pages;
    Book(String t, int p) {
        title = t;
        pages = p;
    }
    Book(Book b) {
        title = b.title;
        pages = b.pages;
    }
    void display() {
        System.out.println("Book: " + title + ", Pages: " + pages);
    }
}
 public class ConstructorExample {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", 500);
        Book b2 = new Book(b1); 
        b1.display();
        b2.display();
    }
}
