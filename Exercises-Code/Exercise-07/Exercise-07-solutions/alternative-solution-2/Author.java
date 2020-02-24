public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[name="+name+", email="+email+", gender="+gender+"]";
    }
}

class TestAuthor{
    public static void main(String[] args) {
        testAuthor();
    }

    public static void testAuthor(){
        Author a1 = new Author("Krisp", "Krisp@outlook.com",'m');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        a1.setEmail("Krisp@kristiania.no");
        System.out.println(a1.getEmail());
        System.out.println(a1.toString());
    }
}