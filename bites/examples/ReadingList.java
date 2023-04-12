package bites.examples;

// Ch 10 - Exercise: Define a class called ReadingList that has an instance field called unread that holds an Array of
// Strings. Also, define a method called add which takes one argument (a book title) and adds it to the first empty
// slot in your unread Array. NOTE: We're using Arrays here, not ArrayLists. This will make the task of adding items a
// bit more complex!
public class ReadingList {
    String[] unread = new String[4];

    public static void main(String[] args) {
        ReadingList readingList = new ReadingList();
        readingList.add("War and peace");
        readingList.add("The software craftsman");
        System.out.println(readingList.unread[0]);
        System.out.println(readingList.unread[1]);
        System.out.println(readingList.unread[2]);
        System.out.println(readingList.unread[3]);
    }

    private void add(String book) {
        Boolean continueSearch = true;
        Integer index = 0;
        while(continueSearch) {
            if(unread[index] == null) {
                unread[index] = book;
                continueSearch = false;
            } else {
                index++;
            }
        }
    }
}
