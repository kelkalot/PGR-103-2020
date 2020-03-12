import javax.swing.*;

public class MultipleException {

    public static void main(String[] args) {

        // Enter the following values and see what exception is caught.
        //    0, 4, character, <no value>
        try {

            String value = JOptionPane.showInputDialog(null, "Enter value:");

            // Non-numerica value will result an NumberFormatException
            int divisor = Integer.parseInt(value);

            // If the divisor is 0, it will result in ArithmetricException
            System.out.println(3/divisor);

        } catch (NumberFormatException nfe){
            System.out.println("Exception caught by this program: Enter numeric value.");
        } catch (ArithmeticException exc) {
            System.out.println("Exception caught by this program: Divisor was 0.");
        }
        System.out.println("After exception.");
    }

}
