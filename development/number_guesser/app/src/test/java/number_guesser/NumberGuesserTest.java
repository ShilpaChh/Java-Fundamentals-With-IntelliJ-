package number_guesser;

// Ch 13 - TDD:So we're going to need
//
//        tests
//        for when the number guessed is too low
//        for when the number guessed is too high
//        for when the number guessed is correct
//        a class called NumberGuesser
//        one method called guess that takes an Integer and returns Strings
//        a constructor that takes one Integer as an argument
//        one instance field for holding the secret number

import org.junit.Assert;
import org.junit.Test;

public class NumberGuesserTest {
    @Test // this is a Test method
    public void testGuessesTooLowReturnsHigher(){
        NumberGuesser game = new NumberGuesser(10);
        String actual = game.guess(9);
        Assert.assertEquals("Higher", actual); // first one is Always the expected result and the second one is Always the actual result. These are usually called yoda assertions from Star wars..
    }

    @Test
    public void testGuessTooHighReturnsLower() {
        NumberGuesser game = new NumberGuesser(10);
        String actual = game.guess(11);
        Assert.assertEquals("Lower", actual); // first one is Always the expected result and the second one is Always the actual result. These are usually called yoda assertions from Star wars..
    }
    @Test
    public void testGuessIsCorrectReturnsCorrectAReno() {
        NumberGuesser game = new NumberGuesser(10);
        String actual = game.guess(10);
        Assert.assertEquals("Correct-A-Reno", actual); // first one is Always the expected result and the second one is Always the actual result. These are usually called yoda assertions from Star wars..
    }

}
