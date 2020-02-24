public class TestMultibook {

//Test the multibook

    public static void main(String[] args) {

        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Frank", "frank@somewhere.com", 'm');
        authors[1] = new Author("Hank", "hank@nowhere.com", 'm');

        // Declare and allocate a Book instance
        MultiBook myDummyBook = new MultiBook("Java for Dummy", authors, 19.99, 99);
        System.out.println(myDummyBook);  // toString()

    }
}
