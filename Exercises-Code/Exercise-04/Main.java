import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Input with scanner
        Scanner scan = new Scanner(System.in);

        //Input a float
        checkFloat(scan.nextFloat());

        //Input a binary value
        readBinary(scan.nextInt());

        //Testvalues
        printVal("Soup");
        printVal(212);
        printVal(231.113);

        //Check 6 tests
        int[] fl61 = {1,2,6};
        int[] fl62 = {6,1,2,3};
        int[] fl63 = {13,6,1,2,3};
        System.out.println(firstlast6(fl61));
        System.out.println(firstlast6(fl62));
        System.out.println(firstlast6(fl63));
    }

    //1 Floating point
    public static void checkFloat(float f){
        if(f == 0){
            System.out.println("Zero");
        } else if (f < 0){
            System.out.println("Negative");
        } else {
            if (f < 1){
                System.out.print("Small ");
            } else if (f > 1000000){
                System.out.print("Large ");
            }
            System.out.println("Positive");
        }
    }

    // 2 - a - read binary
    public static float readBinary(int binary){
        int n = 0;
        int temp = binary;
        float result = 0;
        while(binary != 0){
            n++;
            binary /= 10;
        }
        for (int i = 0; i < n; i++){
            if (temp % 10 == 1){
                result += (1*Math.pow(2,i));
            } else {
                result += (0*Math.pow(2,i));
            }
            temp /= 10;
        }
        System.out.println(result);
        return result;
    }

    // 2 - b - print
    public static void printVal(String val){
        System.out.println(val);
    }

    public static void printVal(int val){
        System.out.println(val);
    }

    public static void printVal(double val){
        System.out.println(val);
    }

    // 3 - Arrays
    public static boolean firstlast6(int[] arr){
        if (arr[0] == 6 || arr[arr.length-1] == 6){
            return true;
        }
        else {
            return false;
        }
    }
}
