public class Author {

    //Variables we need
    private String name;
    private String email;
    private char gender;

    //Constructor
    Author(String name, String email, char gender){

        this.name=name;
        this.email=email;
        this.gender = gender;

    }

    //Getter and setter methods
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

    // Return a description of this instance
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender="+gender+"]";
    }


}
