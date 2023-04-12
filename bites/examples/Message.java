package bites.examples;

class Message {
    public static void main(String[] args) {
        System.out.println(args); // o/p: [Ljava.lang.String;@4617c264
        System.out.println("Hello? Is there anyone out there?");
        Message.hello();

        // Chapter 4 - Instance Methods
//        String name = "Shilpa";
//        Integer age = 46;
       // Message.secret();
            // System.out.println(Message.secret());
        Message myMessage = new Message(); // variable, myMessage is of type Message and we are creating a new instance of class Message
        myMessage.secret();
        System.out.println(myMessage.secret());
    }

    public static void hello() {
        System.out.println("Hello");
    }

    // Chapter 4 - Instance Methods
    public String secret() {
        return "jfewjhfuewhrufgru";
    }
}
