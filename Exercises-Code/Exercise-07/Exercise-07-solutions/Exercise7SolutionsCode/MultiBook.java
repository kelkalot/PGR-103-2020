public class MultiBook {

    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    //constructors
    public MultiBook (String name, Author[] authors, double price) {
        this.name=name;
        this.authors = authors;
        this.price=price;
    }
    public MultiBook (String name, Author[] authors, double price, int qty) {

        this.name=name;
        this.authors = authors;
        this.price=price;
        this.qty=qty;
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

    public String getAuthorNames() {

        String authorsList = "";

        for(Author author:authors){
            authorsList = authorsList+","+author.getName();
        }
        // cannot use author.name as name is private in Author class
        return authorsList;

    }

    public String getAuthorEmails() {
        String emailList = "";

        for(Author author:authors){
            emailList = emailList+","+author.getEmail();
        }
        // cannot use author.name as name is private in Author class
        return emailList;
    }

    public String getAuthorGenders() {
        String genderList = "";

        for(Author author:authors){
            genderList = genderList+","+author.getGender();
        }
        return genderList;
    }

    // Return a description of this instance
    //"Book[name=?,Author[name=?,email=?,gender=?],price=?,qty=?"
    public String toString() {
        return "Book[name=" + name + ",authors="+ this.getAuthorNames() + ",price= "+price+",qty="+qty+"]";
    }

}
