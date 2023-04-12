package bites.examples;

// Ch 8 - If statements
public class Weather {
    public static void main(String[] args) {
        String weather = weather();
        if(weather == "sunny") {
            System.out.println("Don't forget the sunscreen!");
        } else if (weather == "rainy") {
            System.out.println("You might need an umbrella!");
        } else if (weather == "cold") {
            System.out.println("Better wrap up warm!");
        } else {
            System.out.println("There is nothing remarkable about today's weather");
        }
    }

    public static String weather() {
        //return "rainy";
        return "cold";
    }
}
