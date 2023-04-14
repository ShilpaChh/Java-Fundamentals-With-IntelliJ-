package bites.examples;

import java.util.ArrayList;

// Ch 10 Challenge:
//Define a class called Queue which has an instance field called people that holds an ArrayList of Strings. Each item
// in the people ArrayList will be the name of a person in a queue. The class should have three methods.
//        add - which adds people to the end of the people ArrayList
//        next - which gets and removes the first person in the people ArrayList
//        state - which prints a list of all the people who are currently queuing

public class Queue {
    ArrayList people;
    public static void main(String[] args) {
        Queue instanceofQueue = new Queue();
        instanceofQueue.people = new ArrayList<String>();
        instanceofQueue.addPeople("Nathan");
        instanceofQueue.addPeople("Shilpa");
        instanceofQueue.addPeople("Ray");
        instanceofQueue.addPeople("James");
        instanceofQueue.next();
        instanceofQueue.state();
    }
    public void addPeople(String newPeople) {
        people.add(newPeople);
//    System.out.println(people);
    }
    public void state(){
        System.out.println(people);
//        System.out.println(people.get (0));
//        System.out.println(people.get (1));
//        System.out.println(people.get (2));
    }
    public void next() {
        people.remove(2);
    }
}
