package bites.examples;

public class ReadingList1 {
    String[] unread = new String[4];

    public static void main(String[] args) {
        ReadingList1 readingList1 = new ReadingList1();
        readingList1.add("War and peace");
        readingList1.add("The software craftsman");
        System.out.println(readingList1.unread[0]);
        System.out.println(readingList1.unread[1]);
        System.out.println(readingList1.unread[2]);
        System.out.println(readingList1.unread[3]);
    }

    private void add(String book) {
        for (Integer index = 0; index < unread.length; index++) {
            if(unread[index] == null) {
                unread[index] = book;
                break;
            }
        }
    }


}
