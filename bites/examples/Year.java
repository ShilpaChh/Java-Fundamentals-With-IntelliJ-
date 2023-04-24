package bites.examples;
//
//Leap Years
//        A simple tool that will tell you whether a year is a leap year, according to the following rules:
//
//        All years divisible by 400 ARE leap years (e.g. 2000 was a leap year)
//        All years divisible by 100 but not by 400 are NOT leap years (e.g. 1700, 1800 and 1900 were not leap years)
//        All years divisible by 4 and not by 100 ARE leap years (e.g. 2004, 2008 and 2012 were leap years)
//        All years not divisible by 4 are NOT leap years (e.g. 2009, 2010 and 2011 were not leap years)
//
//The procedure is as follows:
//
//        Let the year be y.
//        We start our if-else block and check if the year is divisible by 400, or not, if true, the year is a leap year
//        and we print the same, otherwise we move to the else if block.
//        If the first else if block, we check if the year is divisible by 100, if true, the year is not a leap year
//        and we print the result, else we move to the next else if block.
//        In the last else if block, we check if the year is divisible by 4 and if that turns out to be true the year is a leap year
//        and we display the result, if that condition fails too, we conclude that the year is not a leap year in our final else block.

public class Year {
        public static void main(String[] args) {
            System.out.println(Year.year(2000));
            System.out.println(Year.year(1700));
            System.out.println(Year.year(1800));
            System.out.println(Year.year(1900));
            System.out.println(Year.year(2004));
            System.out.println(Year.year(2008));
            System.out.println(Year.year(2012));
            System.out.println(Year.year(2009));
            System.out.println(Year.year(2010));
            System.out.println(Year.year(2011));
            System.out.println(Year.year(1998));
        }

       public static String year(Integer year) {
           if(year % 400 == 0) {
                return (year + ":" + " This year is a Leap year as it is divisible by 400.");
            } else if(year % 100 == 0) {
                    return (year + ":" + " This year is not a Leap year as it's divisible by 100 but not by 400.");
            } else if(year % 4 == 0  ) {
                    return (year + ":" + " This year is a Leap year as it's divisible by 4 and not by 100.");
            } else {
                    return (year + ":" + " This is not a Leap year as it's not divisible by 4.");
            }

        }

}
