package bites.examples;

// Ch 7 - Strings
        // Concatenation: joining two Strings together, end to end
        // Interpolation: inserting values into the middle of Strings
public class Concatenation {
    public static void main(String[] args) {
        String hello = "Hello, ";
        String world = "world";
        System.out.println(hello + world);
        //concat with arg
        System.out.println(greeting("Shilpa"));
        System.out.println(greeting1("Shilpa"));
        System.out.println(greeting2("Shilpa", 35));
    }

    // concatenate strings passed as args in methods:
    public static String greeting(String name) {
        return "Hello and how are you, " + name;
    }

    //interpolation:
    public static String greeting1(String name) {
        return String.format("Hello, %s and how are you today?", name); // %s is used for string. Can also use %d for integer and so on.
    }

    public static String greeting2(String name, Integer temperature) {
        return String.format("Hello, %s and how are you today? Is temperature, %d centigrade, too hot for you?", name, temperature);
    }

}
