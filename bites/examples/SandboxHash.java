package bites.examples;
import java.util.Map.Entry;
import java.util.HashMap;

public class SandboxHash {
    public static void main(String[] args) {
        HashMap<String, Integer> menu = new HashMap<String, Integer>(); //keys are strings and values are Integers
        menu.put("Coffee", 2); // add things to menu by 'put'
        menu.put("Tea", 1);
        menu.put("Cake", 3);
        menu.put("Sandwich", 4);
        System.out.println(menu);

        System.out.println("Updating value for Coffee from " + menu.put("Coffee", 1)); // to update use put again
        System.out.println("Updated menu: " + menu );

        System.out.println("Retrieving value for key, cake from menu: " + menu.get("cake")); // to retrieve a value of specific key, use get
        System.out.println("Retrieving value from menu for Tea: " + menu.get("Tea"));

        System.out.println("Removing Tea: " + menu.remove("Tea")); // to remove, use remove by passing in key
        System.out.println("Updated menu after removing Tea from the menu: " + menu);
        System.out.println("Removing sandwich by using key-value pair: " + menu.remove("Sandwich", 4)); // removing by using key-value pair
        System.out.println("Updated menu: " + menu);
    }
}
