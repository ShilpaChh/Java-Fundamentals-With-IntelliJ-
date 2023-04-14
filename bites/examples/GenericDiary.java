package bites.examples;

// Ch 12 - Exercise:
// Note that removeEntry and readEntry take ints not Integers. Try changing them to Integers to see what happens.
//
//        Define an interface called GenericDiary which has the following methods:
//
//        addEntry, which takes one String argument - a new diary entry
//        removeEntry, which takes one int argument - the index of the entry to be removed
//        readEntry, which takes one int argument - the index of the entry to be read
//        Now define two classes, one called TenDayDiary and another called InfiniteDiary. Both of these classes should implement the GenericDiary interface but...
//
//        TenDayDiary stores entries in a String[10]
//        InfiniteDiary stores entries in an ArrayList<String>
//QUESTION: What benefit does this set up bring?


public interface GenericDiary {
    public void addEntry(String diaryEntry);
    public void removeEntry(int entryIndex);
    public String readEntry(int entryIndex);
}
