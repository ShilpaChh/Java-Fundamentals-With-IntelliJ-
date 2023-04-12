package bites.examples;
// Ch5 - Instance Fields
// How to pass values when creating instance of the class - add a constructorn and then pass in between the (new) instance
class Message1 {

    // type being declared here and can have defaults here as well. Then assign them in constructor
    String author;
    String content;
    public static void main(String[] args) {
        Message1 myMessage1 = new Message1("Shilpa", "Hello, I'm writing Java!");
        Message1 myOtherMessage1 = new Message1("Shilpa", "Getting used to Intellij!");
        System.out.println(myMessage1.author);
        System.out.println((myMessage1.content));
        System.out.println(myOtherMessage1.author);
        System.out.println((myOtherMessage1.content));
    }

    // adding a constructor - name shd be the same as the class
    public Message1(String author, String content) {
        // now assigning to instance fields:
            this.author = author;
            this.content = content;
    }
}
