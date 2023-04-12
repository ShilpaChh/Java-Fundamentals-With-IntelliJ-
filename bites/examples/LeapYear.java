package bites.examples;

public class LeapYear {
        public static void main(String[] args) {
            System.out.println(LeapYear.year(2000));
            System.out.println(LeapYear.year(1800));
            System.out.println(LeapYear.year(2004));
            System.out.println(LeapYear.year(2009));
            System.out.println(LeapYear.year(1700));
            System.out.println(LeapYear.year(2011));
        }

        public static String year(Integer year) {
            if(year % 400 == 0) {
                return (year + ":" + " This year is a Leap year as it is divisible by 400.");
            } else if(year % 100 == 0 && year != 400) {
                    return (year + ":" + " This year is not a Leap year as it's divisible by 100 but not by 400.");
            } else if(year % 4 == 0 && year != 100 ) {
                    return (year + ":" + " This year is a Leap year as it's divisible by 4 and not by 100.");
            } else {
                    return (year + ":" + " This is not a Leap year as it's not divisible by 4.");
            }
        }

}
