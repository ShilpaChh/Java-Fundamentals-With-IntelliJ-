package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

// Ch 13 - TDD - Challenge
// Test drive an implementation of FizzBuzz that gives you the FizzBuzz value for a single number.
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        fizzBuzz.for(1)
//// => "1"
//        fizzBuzz.for(3)
//// => "Fizz"
//        fizzBuzz.for(5)
//// => "Buzz"
//        fizzBuzz.for(15)
//// => "FizzBuzz"
public class FizzBuzzTest {

    @Test
    public void testFizzBuzzNumberDivisibleBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String outcome = fizzBuzz.num(3);
        Assert.assertEquals("Fizz", outcome);
    }

    @Test
    public void testFizzBuzzNumberDivisibleBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String outcome = fizzBuzz.num(5);
        Assert.assertEquals("Buzz", outcome);
    }

    @Test
    public void testFizzBuzzNumberDivisibleBy15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String outcome = fizzBuzz.num(15);
        Assert.assertEquals("FizzBuzz", outcome);
    }
    @Test
    public void testFizzBuzzNumberDivisibleBy1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String outcome = fizzBuzz.num(1);
        Assert.assertEquals("1", outcome);
    }

//    @Test
//    public void testFizzBuzzNumberInDivisibleBy15() {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        String outcome = fizzBuzz.num1(2);
//        Assert.assertEquals("Number is not divisible by 15, 5 or 3", outcome);
//    }

}
