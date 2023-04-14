package bites.examples;

import java.util.ArrayList;

public class InfiniteDiary implements GenericDiary {

    ArrayList<String> entries = new ArrayList<String>();
    @Override
    public void addEntry(String diaryEntry) {
        this.entries.add(diaryEntry);
    }

    @Override
    public void removeEntry(int entryIndex) { // int is just a value in memory whereas Integer has an int but also a bunch of methods, so we use int!
        this.entries.remove(entryIndex);
    }

    @Override
    public String readEntry(int entryIndex) {
        return this.entries.get(entryIndex);
    }

    public static void main(String[] args) {
        InfiniteDiary diary = new InfiniteDiary();
        diary.addEntry("What a sunny day it was today!");
        diary.addEntry("We went to the beach.");
        System.out.println("DiaryEntry size is: " + diary.entries.size());
        System.out.println(diary.readEntry(0));
        System.out.println(diary.readEntry(1));
        System.out.println("Removing first entry now..");
        diary.removeEntry(0);
        System.out.println(diary.readEntry(0));
        System.out.println("Current DiaryEntry size is: " + diary.entries.size());
    }

}
