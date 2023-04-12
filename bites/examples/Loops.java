package bites.examples;

// Ch8 - For Loop

public class Loops {
    public static void main(String[] args) {
        // counter ++ is similar to counter += 1
        for(Integer counter = 1; counter < 10; counter ++) {
            System.out.println("The counter is " + counter);
        }

        // While Loop:
        Integer anothercounter = 0;
        while(anothercounter < 10) {
            System.out.println("Another counter is: " + anothercounter);
            anothercounter++;
        }

    }
}
