package bites.examples;

public class InverseFizzBuzz {

    public static void main(String[] args) {
        Integer num = 101;
        while(num != 1) {
            num--;
            if (num % 15 == 0) {
                System.out.println(num + " FizzBuzz");
            } else if (num % 5 == 0) {
                System.out.println(num + " Buzz");
            } else if (num % 3 == 0) {
                System.out.println(num + " Fizz");
            } else {
                System.out.println(num + " is not divisible by 3 or 5");
            }
        }
    }


}
