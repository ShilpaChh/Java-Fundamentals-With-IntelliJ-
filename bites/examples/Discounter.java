package bites.examples;

public class Discounter {

    Integer discount = 0; // instance fields

    public Integer applyTo(Integer amount) {
        Integer total = amount - discount;
        System.out.println("The Initial Amount is: " + amount);
        return total;
    }

    public Discounter(Integer discount) {
       this.discount = discount;
       System.out.println("The discount being applied is: " + discount);
    }
    public static void main(String[] args) {
        Discounter mydiscounter = new Discounter(20);
        Integer discount = mydiscounter.applyTo(100);
        // returns 80
        System.out.println("After discount the amount is: " + discount);
        Integer discount1 = mydiscounter.applyTo(200);
        // returns 180
        System.out.println("After discount the amount is: " + discount1);
//        System.out.println(discount);
    }
}
