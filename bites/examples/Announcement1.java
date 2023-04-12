package bites.examples;
// Instance methods - Exercise
//Turn the static methods of your Announcement class into instance methods and call them in the main method.
public class Announcement1 {
    public static void main(String[] args) {
        Announcement1 myAnnouncement1 = new Announcement1();
        System.out.println(myAnnouncement1.celebration());
        System.out.println(myAnnouncement1.changeOfPlan());
        System.out.println(myAnnouncement1.apology());
        System.out.println(myAnnouncement1.politeNotice());
        System.out.println(myAnnouncement1.helpNeeded());
    }

    public String celebration() {
        return "I came third in Rifle Shooting!";
    }

    public String changeOfPlan() {
        return "Today's's Dental appointment stands cancelled and has been rescheduled for 12th April 2023 at 12:05";
    }

    public String apology() {
        return "Apologies, I broke the vase!";
    }

    public static String politeNotice() {
        return "Gentle reminder to approve my edit request for this module's tracker.";
    }
    public static String helpNeeded() {
        return "I required help while installing Java for this module and for Intellij IDEA CE version!";
    }

}
