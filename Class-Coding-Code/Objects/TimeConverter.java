import java.util.Scanner;

//Time class defining the time object
class Time{
    int h, m, s;
}

//Main class that converts given seconds to h, m and s
class TimeConverter {


    static Time convertSeconds(int seconds){

        Time t = new Time();
        t.h = seconds / 3600;
        t.m = (seconds % 3600) / 60;
        t.s = seconds % 60;
        return t;
    }

    public static void main(String[] args) {

        //Create scanner
        Scanner scan = new Scanner(System.in);
        //Ask user for input
        System.out.println("How many seconds?");
        //read the input
        int seconds = scan.nextInt();
        //create the time object and convert the seconds
        Time t = convertSeconds(seconds);
        System.out.println(t.h+" "+t.m+" "+t.s);
    }
}








