class Date {
    int day;
    int month;
    int year;
}

public class DateDifference {
    static int[] daysBefore = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    // Print a date
    static void printDate(Date d) {
        System.out.print(d.day + "." + d.month + "." + d.year);
    }

    // Return the number of days since 1.1.0000 (assuming Gregorian calendar)
    static int daysSince0(Date d) {
        int days = 365 * d.year + daysBefore[d.month] + d.day - 1;
        if (d.month > 2 && d.year % 4 == 0 && (d.year % 100 != 0 || d.year % 400 == 0)) days++;
        int year = d.year - 1;
        if (year >= 0)
            days += 1 /*year 0 was a leap year*/ + year / 4 - year / 100 + year / 400;
        return days;
    }

    // Return the number of days between two dates
    static int dayDiff(Date d1, Date d2) {
        int days1 = daysSince0(d1);
        int days2 = daysSince0(d2);
        return Math.abs(days1 - days2);
    }

    public static void main(String args[]) {

            /*
Sample input:
12 3 2001 3 4 2001
14 7 1789 12 3 2001
14 7 1789 4 7 1776
12 3 2001 12 3 2001
1 1 0000 30 8 2001
*/


        Date d1 = new Date();
        d1.day = 12;
        d1.month = 3;
        d1.year = 2001;

        Date d2 = new Date();
        d2.day = 12;
        d2.month = 4;
        d2.year = 2001;

        printDate(d1); System.out.print(", "); printDate(d2);
        System.out.println(": Difference in days = " + dayDiff(d1, d2));

    }
}