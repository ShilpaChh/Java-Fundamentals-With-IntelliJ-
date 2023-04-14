package fizzbuzz;

public class FizzBuzz {

    public static String num(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else   {
            return "1";
        }
//        else {
//            return "Number is not divisible by 15, 5 or 3";
//        }
    }


}
