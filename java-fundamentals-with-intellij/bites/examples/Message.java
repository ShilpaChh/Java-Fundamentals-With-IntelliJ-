package bites.examples;

class Message {
    public static void main(String[] args) {
        System.out.println(args); // o/p: [Ljava.lang.String;@4617c264
        System.out.println("Hello? Is there anyone out there?");
        Message.hello();

        // Chapter 4 - Instance Methods
        

    }

    public static void hello() {
        System.out.println("Hello");
    }

}
