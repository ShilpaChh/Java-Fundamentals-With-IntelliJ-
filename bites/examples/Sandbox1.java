package bites.examples;
import java.util.ArrayList;

public class Sandbox1 {

    public static void main(String[] args) {
        ArrayList<String> contentsOfMyPockets = new ArrayList<String>();
        contentsOfMyPockets.add("keys");
        contentsOfMyPockets.add("mobile");
        contentsOfMyPockets.add("mask");

        System.out.println(contentsOfMyPockets.get(0));
        System.out.println(contentsOfMyPockets.get(1));
        System.out.println(contentsOfMyPockets.get(2));

        ArrayList<Integer> greatNumbers = new ArrayList<Integer>();

        // add things:
        greatNumbers.add(3);
        greatNumbers.add(5);
        greatNumbers.add(7);
        greatNumbers.add(11);

        // getting them:
        System.out.println(greatNumbers.get(0));
        System.out.println(greatNumbers.get(1));
        System.out.println(greatNumbers.get(2));
        System.out.println(greatNumbers.get(3));

        // setting new values:
        // e.g. to change the value of say first index to 1 and so on and print them:
        greatNumbers.set(0, 1);
        greatNumbers.set(1, 2);
        greatNumbers.set(2, 3);
        greatNumbers.set(3, 4);

        System.out.println(greatNumbers.get(0));
        System.out.println(greatNumbers.get(1));
        System.out.println(greatNumbers.get(2));
        System.out.println(greatNumbers.get(3));

        // To remove them:
        greatNumbers.remove(0);

        System.out.println(greatNumbers.get(0));
        System.out.println(greatNumbers.get(1));
        System.out.println(greatNumbers.get(2));
        // System.out.println(greatNumbers.get(3)); as one item has been removed we now no longer have 3rd item, so removing it to avoid error.
    }
}
