package bites.examples;

// Ch 9 - Exercise:
// Add a for loop to your FizzBuzz program so that it generates the sequence for numbers 1 to 100.
public class FizzBuzz1 {
        public static void main(String[] args) {
            for(int num = 1; num <=100; num++)
                if(num % 15 == 0) {
                    System.out.println(num + " fizzbuzz"); }
                else if(num % 5 == 0){
                    System.out.println(num + " buzz");
                }
                else if (num % 3 == 0) {
                    System.out.println(num + " Fizz");
                }
                else {
                    System.out.println(num + " is not divisible by 3 or 5");
                }
        }


}
