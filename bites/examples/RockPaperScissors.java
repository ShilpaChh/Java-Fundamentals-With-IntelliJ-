package bites.examples;

import java.util.HashMap;

// Ch 11 - Exercise:
// Define a class called RockPaperScissors that has
//        a static field called rules which holds a nested HashMap (see below for further guidance)
//a static method called play which takes of either "rock", "paper" or "scissors" and declares a winner.
public class RockPaperScissors {
    static HashMap<String, HashMap<String, String>> rules = new HashMap<>();
    // key is String and value is another HashMap.
    // HashMap has String as key and String as value and a static field which is called rules
    // outer new HashMap is null and assign to rules - to incorporate lines 33 - 35
    public static void main(String[] args) {

        // Outer HashMap would contain 3 inner HashMaps
        // so, creating inner HashMaps now:
        HashMap<String, String> rockOutcomes = new HashMap<>();
        rockOutcomes.put("rock", "draw");
        rockOutcomes.put("paper", "player two wins");
        rockOutcomes.put("scissors", "player one wins");

        HashMap<String, String> paperOutcomes = new HashMap<>();
        paperOutcomes.put("paper", "draw");
        paperOutcomes.put("scissors", "player two wins");
        paperOutcomes.put("rock", "player one wins");

        HashMap<String, String> scissorsOutcomes = new HashMap<>();
        scissorsOutcomes.put("scissors", "draw");
        scissorsOutcomes.put("rock", "player two wins");
        scissorsOutcomes.put("paper", "player one wins");

        rules.put("rock", rockOutcomes);
        rules.put("paper", paperOutcomes);
        rules.put("scissors", scissorsOutcomes);

        String outcome = rules.get("rock").get("paper"); //static field which is a Nested HashMap
        System.out.println("When the selections are:- Player 1: Rock & Player 2: Paper. The outcome is: " + outcome);

        String outcome1 = rules.get("rock").get("rock"); //static field which is a Nested HashMap
        System.out.println("When the selections are:- Player 1: Rock & Player 2: Rock. The outcome is: " + outcome1);

        String outcome2 = rules.get("rock").get("scissors"); //static field which is a Nested HashMap
        System.out.println("When the selections are:- Player 1: Rock & Player 2: Scissors. The outcome is: " + outcome2);

        String outcome3 = rules.get("paper").get("paper"); //static field which is a Nested HashMap
        System.out.println("When the selections are:- Player 1: Paper & Player 2: Paper. The outcome is: " + outcome3);

        String outcome4 = rules.get("paper").get("rock"); //static field which is a Nested HashMap
        System.out.println("When the selections are:- Player 1: Paper & Player 2: Rock. The outcome is: " + outcome4);

        String outcome5 = rules.get("paper").get("scissors"); //static field which is a Nested HashMap
        System.out.println("When the selections are:- Player 1: Paper & Player 2: Scissors. The outcome is: " + outcome5);

        String outcome6 = rules.get("scissors").get("paper"); //static field which is a Nested HashMap
        System.out.println("When the selections are:- Player 1: Scissors & Player 2: Paper. The outcome is: " + outcome6);

        String outcome7 = rules.get("scissors").get("rock"); //static field which is a Nested HashMap
        System.out.println("When the selections are:- Player 1: Scissors & Player 2: Rock. The outcome is: " + outcome7);

        String outcome8 = rules.get("scissors").get("scissors"); //static field which is a Nested HashMap
        System.out.println("When the selections are:- Player 1: Scissors & Player 2: Scissors. The outcome is: " + outcome8);

    }

}
