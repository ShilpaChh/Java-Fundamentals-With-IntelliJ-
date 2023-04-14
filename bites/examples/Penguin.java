package bites.examples;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Penguin implements BirdBehaviours{
    //ArrayList<String> behaviours = new ArrayList<String>();
    @Override
    public String fly(String flying) {
        String flyingFact = "Can Penguins fly? " + flying ;
        return flyingFact;
    }

    @Override
    public String sing(String singing) {
        String singingFact = "Do Penguins sing? " + singing ;
        return singingFact;
    }

    @Override
    public String eat(String eating) {
        String eatingFact = "What do Penguins eat? " + eating ;
        return eatingFact;
    }

    public static void main(String[] args) {
        Penguin habit = new Penguin();
        System.out.println(habit.fly(" Even though Penguins are birds, they technically can't fly!."));
        System.out.println(habit.sing(" Penguins are not songbirds, but that does not prevent them from 'singing'."));
        System.out.println(habit.eat(" Penguins eat krill, squids, and fishes."));
    }
}
