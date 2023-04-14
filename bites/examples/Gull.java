package bites.examples;

public class Gull implements BirdBehaviours{
    //ArrayList<String> behaviours = new ArrayList<String>();
    @Override
    public String fly(String flying) {
        String flyingFact = "Can Gulls fly? " + flying ;
        return flyingFact;
    }

    @Override
    public String sing(String singing) {
        String singingFact = "Do Gulls sing? " + singing ;
        return singingFact;
    }

    @Override
    public String eat(String eating) {
        String eatingFact = "What do Gulls eat? " + eating ;
        return eatingFact;
    }

    public static void main(String[] args) {
        Gull habit = new Gull();
        System.out.println(habit.fly(" Gulls are able to fly long distances and glide over the open ocean for hours in search of food. Gulls can fly as fast as 28 mph"));
        System.out.println(habit.sing(" Different seagulls make different sounds. Some purr, some grunt, squawk, laugh, croon, cry, squeal, hoot, or coo."));
        System.out.println(habit.eat(" The food taken by gulls includes fish and marine and freshwater invertebrates, both alive and already dead; insects and earthworms; rodents, eggs, reptiles, amphibians, seeds, fruit, human refuse, and even other birds."));
    }
}
