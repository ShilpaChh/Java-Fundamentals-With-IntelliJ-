package bites.examples;

public class Order {

    Integer total = 0; // instance fields

    // Two methods:
    public void addAmount(Integer amount) {
        this.total += amount;
    }

    public void addDiscount(Integer discount) {
        this.total -= discount;
    }

    public Integer getTotal() {
        return this.total;
    }
    public static void main(String[] args) {
        Order myOrder = new Order();
        myOrder.addAmount(10);
        myOrder.addDiscount(1);
        Integer total = myOrder.getTotal();
        System.out.println(total);

        // Ch 7 Exercise:
        String friendlyTotal = myOrder.friendlyTotal();
        System.out.println(friendlyTotal);
    }

    // Ch 7 Exercise:
    private String friendlyTotal() {
        return String.format("Thanks! The total value of your order is £%d.", this.total);
    }


}
