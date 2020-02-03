//Exercise 5.2
//Solution by e.olseng

public class Date {

    int day;
    int month;
    int year;

    // Constructor - lets you use "Date x = new Date(day, month, year);" to assign values to day, month and year.
    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Print date in DD.MM.YYYY-format
    public String printDate() { return this.day + "." + this.month + "." + this.year; }

    // Used to check if year is a leap-year
    private boolean isLeapYear(int year) {
        //Returns true if year is dividable by 4, but not 100, or if it is dividable by 400.
        return ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0;
    }

    // Converts past months into days - if the input is 5 (may), it counts jan, feb, mar, apr, but not may.
    private int monthsToDays () {

        int months = this.month;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int monthsAsDays = 0;

        // Loops through each month and adds the days to the total counter.
        for (int i = 0; i < months - 1; i++) {
            monthsAsDays += daysInMonth[i];
        }

        // Add 1 to monthsAsDays if leap year and march or later.
        if(isLeapYear(this.year) && months > 2) { monthsAsDays += 1; }

        return monthsAsDays;
    }

    // Converts years into days.
    private int yearsToDays () {
        int yearsAsDays = 0;

        // Loop through each year, add to total.
        for (int i = 0; i < this.year; i++) {
            // Check if year being added is leap year.
            if(isLeapYear(i)) {
                yearsAsDays += 366;
            } else yearsAsDays += 365;
        }
        return yearsAsDays;
    }

    // Converts a date into elapsed days since 01.01.0000.
    private int convertToDays() { return this.day + this.monthsToDays() + this.yearsToDays() -1; }

    // Calculates the difference between two dates
    public static void calculateDifference (Date date1, Date date2) {

        // Converts both input dates to days since day 01.01.0000.
        int date1Days = date1.convertToDays();
        int date2Days = date2.convertToDays();

        // Calculates difference between the two dates. Converts to a positive number if it is negative.
        int difference = Math.abs(date1Days - date2Days);

        System.out.println("------------------------------------------------------------");
        System.out.println("There are " + difference + " days between " + date1.printDate() + " and " + date2.printDate() + ".");
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Date date1 = new Date (18, 05, 1992);
        Date date2 = new Date (07, 03, 2019);

        Date.calculateDifference(date1, date2);
    }
}
