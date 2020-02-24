public class MultiBook {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    MultiBook(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    MultiBook(String name, Author[] authors, double price, int qty){
        this(name,authors,price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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

    public String[] getAuthorNames(){
        String[] authornames = new String[authors.length];
        for(int i = 0; i < authors.length; i++){
            authornames[i] = authors[i].getName();
        }
        return authornames;
    }

    @Override
    public String toString() {
        String authorList = "";
        for(int i = 0; i < authors.length;i++){
            authorList += authors[i].toString();
            authorList += ", ";
        }
        return "Book[name="+name+", Authors={" + authorList + "}, price="+price+", quantity="+qty+"]";
    }
}

class TestMultibook{
    public static void main(String[] args) {
        testMultiBook();
    }

    static void testMultiBook(){
        Author[] authors = {
                new Author("JK Rowling", "JKRowling@Yahoo.com",'f'),
                new Author("Scott Sterling", "HitInFace@Face.com",'m'),
                new Author("Me","NotMe@Meee.com",'m')
        };
        MultiBook bestBook = new MultiBook("The Ultimate Book",authors,777.77,77);

        //Test Multibook
        System.out.println(bestBook.getName());
        System.out.println(bestBook.getAuthors()); //Gets an array, not meant to print proper string
        System.out.println(bestBook.getAuthorNames()); //Gets an array, not meant to print proper string
        System.out.println(bestBook.getPrice());
        System.out.println(bestBook.getQty());
        System.out.println(bestBook.toString());

    }
}
