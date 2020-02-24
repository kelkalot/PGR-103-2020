public class TestBook {

    public static void main(String[] args) {
        // Construct an author instance
        Author ahTeck = new Author("Jules", "jules@nowhere.com", 'm');
        System.out.println(ahTeck);  // Author's toString()

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

// Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()


        //Printing the name and email of the author from a Book instance.
        // (Hint: aBook.getAuthor().getName(), aBook.getAuthor().getEmail())
        System.out.println(dummyBook.getAuthor().getName() +" "+ dummyBook.getAuthor().getEmail());
        //Test the new methods added to the book class
        System.out.println(dummyBook.getAuthorName() +" "+ dummyBook.getAuthorEmail()+" "+dummyBook.getAuthorGender());

    }
}
