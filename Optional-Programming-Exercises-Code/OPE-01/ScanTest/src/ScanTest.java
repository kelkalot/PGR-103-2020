import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Scan a string and output it
        String text = scan.nextLine();
        System.out.println(text);

        //Scan an integer and output it:
        int num = scan.nextInt();
        scan.nextLine(); //Applies a linefeed after the integer, since the scanner does not carry it
        System.out.println(num);
    }
}
