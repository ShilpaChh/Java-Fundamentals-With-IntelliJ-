package bites.examples;

public class Announcement {
    public static void main(String[] args) {
        Announcement.alert();
        Announcement.alert1("All trains to London are running early today - better sprint!");
        // printing the return value of the celebration method:
        System.out.println(Announcement.celebration());
        System.out.println(Announcement.changeOfPlan());
        System.out.println(Announcement.apology());
        System.out.println(Announcement.politeNotice());
        System.out.println(Announcement.helpNeeded());
    }

    public static void alert() {
        System.out.println("Be careful not to forget your main method. //This method doesn't have args passed and is a static alert method");
    }

    // calling the static method that takes a argument
    //This method has argument, message, which is of type, String"
    public static void alert1(String message) {
        System.out.println(message);
    }

    //Ch3 - Static Methods - Exercise:
    // Define a new class called Announcement, give it a static method called celebration and call it like this inside the main method.
    // Here we have a static method that returns string this time:
    public static String celebration() {
        return "I came third in Rifle Shooting!";
    }

    // Challenge:
    // Add more static methods to the Announcement class, all of which print appropriate messages of your choosing, then call them inside the main method
    // 1. changeOfPlan
    public static String changeOfPlan() {
        return "Today's's Dental appointment stands cancelled and has been rescheduled for 12th April 2023 at 12:05";
    }

    // 2. apology
    public static String apology() {
        return "Apologies, I broke the vase!";
    }

    // 3. politeNotice
    public static String politeNotice() {
        return "Gentle reminder to approve my edit request for this module's tracker.";
    }

    // 4. helpNeeded
    public static String helpNeeded() {
        return "I required help while installing Java for this module and for Intellij IDEA CE version!";
    }

    // Chapter 4 - Instance Methods

}
