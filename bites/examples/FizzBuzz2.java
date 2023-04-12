package bites.examples;

// Exercise 2: Adapt your FizzBuzz program to use a while loop instead of for loop.
// While loop
public class FizzBuzz2 {
    public static void main(String[] args) {
        Integer num = 0;
        while(num < 100) {
            num++;
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