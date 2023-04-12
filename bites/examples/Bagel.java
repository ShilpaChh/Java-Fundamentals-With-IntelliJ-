package bites.examples;

//Define a class called Bagel that has three instance methods
//
//        seeds -> returns a String describing what seeds are on the bread.
//        filling -> returns a String describing what is inside the bagel.
//        price -> returns an Integer representing the price of this tasty Bagel.
//        Call each instance method inside the main method and print the return values.
public class Bagel {
    public static void main(String[] args) {
        Bagel myBagel = new Bagel();
        System.out.println(myBagel.seeds());
        System.out.println(myBagel.filling());
        System.out.println(myBagel.price());

    }

    public String seeds() {
        return "Sunflower seeds";
    }
    public String filling() {
        return "Cream";
    }
    public Integer price() {
        return 2;
    }
}
