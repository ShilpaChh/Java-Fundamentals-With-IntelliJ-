package bites.examples;
//
//Define a class called Quiz. When instantiated, it should take two questions as arguments. For example...
//
//        new Quiz("what is the capital of Burkina Faso?", "What is the capital of Bhutan?");
//        There should be two instance methods:
//
//        getQuestionOne -> returns the first question
//        getQuestionTwo -> returns the second question
//        Inside the main method, create an instance of Quiz, call the two instance methods and print the return values.
public class Quiz {

    // type being declared here and can have defaults here as well. Then assign them in constructor
    // instance fields
    String questionOne;
    String questionTwo;

    // adding a constructor - name shd be the same as the class
    public Quiz(String questionOne, String questionTwo) {
        // now assigning to instance fields:
        this.questionOne = questionOne;
        this.questionTwo = questionTwo;
    }

    // Two getter methods -> used to return instance fields
    public String getQuestionOne() {
        return this.questionOne;
    }

    public String getQuestionTwo() {

        return this.questionTwo;
    }
    public static void main(String[] args) {
        Quiz myQuiz= new Quiz("What is the capital of Burkina Faso?", "What is the capital of Bhutan?");
        System.out.println(myQuiz.getQuestionOne()); // first method
        System.out.println("Ouagadougou");
        System.out.println(myQuiz.getQuestionTwo()); // second method
        System.out.println("Thimphu");
    }

}
