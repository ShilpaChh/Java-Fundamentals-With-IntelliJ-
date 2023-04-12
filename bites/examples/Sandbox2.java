package bites.examples;
import  java.util.ArrayList;

// Arrays for strings
public class Sandbox2 {
    public static void main(String[] args) {
        String[] names = new String[5];
        // fixed array length, if another item needs added then we would need another array else EM:  Index 5 out of bounds for length 5

        // add new item in array
        names[0] = "Nathan"; // if suppose this or any index is removed then we get a "Null", it does not get empty
        names[1] = "James";
        names[2] = "Ray";
        names[3] = "Jack";
        names[4] = "Jay";
        //names[5] = "Shilpa"; // can't have this as we will have out of bounds EM.

        System.out.println(names[0]);

        // to empty an occupied slot:
        names[4] = null;
        System.out.println(names[4]);

        // to create an array with values instead of empty array and also when one item is null at start to add it later
        String[] firstNames = {"Shilpa", "Maido", "George", "Sean", null};
        System.out.println(firstNames[0]);
        System.out.println(firstNames[4]);



    }
}
