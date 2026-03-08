class Book{
    protected String bookID;
    protected String bookName;
    protected String bookAuthor;
    protected Integer ISBN;
    protected Double price;

    public Book(String id, String Name, String author,Integer isbn, double Price){
        this.bookID = id;
        this.bookName = Name;
        this.bookAuthor = author;
        this.ISBN = isbn;
        this.price = Price;
    }
}
class Category1 extends Book{
    protected String category;

    public Category1(String ID, String bName,String bAuthor,Integer Isbn,double bprice, String bCategory){
        super(ID, bName, bAuthor, Isbn, bprice);
        this.category = bCategory;
    }

    public void display(){
        System.out.println("Book Details");
        System.out.println("Book ID: " + bookID);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Author: " + bookAuthor);
        System.out.println("Book Category: " + category);
        System.out.println("Book ISBN: " + ISBN);
        System.out.println("Book Price: " + price);
        System.out.println("\n");
    }
}
public class Task4 {
    public static void main(String[] args) {
        Category1 book1 = new Category1("1","Java Programming","James Gosling",1111,500,"Java");
        Category1 book2 = new Category1("2","C Programming","Dennis Ritchie",2222,400,"C");
        Category1 book3 = new Category1("3","C++ Programming","Bjarne Stroustrup",3333,600,"C++");
        Book books;
        books = book1;
        book1.display();
    
        books = book2;
        book2.display();
    
        books = book3;
        book3.display();
    }
}
