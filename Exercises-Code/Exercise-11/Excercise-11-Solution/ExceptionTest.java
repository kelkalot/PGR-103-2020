public class ExceptionTest {

    public static void main(String[] args) {

        try{
            int y = 5/2;
            System.out.println("y did work and is: "+y );
            int x = 5/0;

        }
        catch(java.lang.ArithmeticException e){
            System.out.println("You dividing by 0 which does not work!");
        }

    }

}
