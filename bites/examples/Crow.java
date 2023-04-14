package bites.examples;

public class Crow implements BirdBehaviours{
    //ArrayList<String> behaviours = new ArrayList<String>();
    @Override
    public String fly(String flying) {
        String flyingFact = "Can Crows fly? " + flying ;
        return flyingFact;
    }

    @Override
    public String sing(String singing) {
        String singingFact = "Do Crows sing? " + singing ;
        return singingFact;
    }

    @Override
    public String eat(String eating) {
        String eatingFact = "What do Crows eat? " + eating ;
        return eatingFact;
    }

    public static void main(String[] args) {
        Crow habit = new Crow();
        System.out.println(habit.fly(" They fly along the same flight lines each day and are joined by other flocks as they go."));
        System.out.println(habit.sing(" Unlike many birds, crows don't sing loudly to attract mates from a distance. Instead, they sing softly—and at close range—during courtship, with a rich mix of soft cooing, rattles, growls, bowing movements, and mutual nuzzling."));
        System.out.println(habit.eat(" Crows are omnivores (eats both plant and animal foods) and will sometimes come to eat one food, such as insects, but then stay around or return to eat another, such as garden produce."));
    }
}
