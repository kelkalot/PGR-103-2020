public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    Book(String name, Author author, double price, int qty){
        this(name,author,price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        return author.getName();
    }

    public String getAuthorEmail(){
        return author.getEmail();
    }

    public char getAuthorGender(){
        return author.getGender();
    }

    @Override
    public String toString() {
        return "Book[name="+name+", " + author.toString() + "]";
    }
}

class TestBook{
    public static void main(String[] args) {
        testBook();
    }

    public static void testBook(){
        Author a1 = new Author("Krisp", "Krispmail",'m');
        Book b1 = new Book("Krispbook",a1,77.77,77);

        //Test book methods:
        System.out.println(b1.getName());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPrice());
        b1.setPrice(7.7);
        System.out.println(b1.getPrice());
        System.out.println(b1.getQty());
        b1.setQty(7);
        System.out.println(b1.getQty());

        System.out.println(b1.toString());
    }
}
