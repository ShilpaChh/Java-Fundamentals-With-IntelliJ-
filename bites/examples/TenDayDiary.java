package bites.examples;

public class TenDayDiary implements GenericDiary{

    String[] entries = new String[10];
    @Override
    public void addEntry(String diaryEntry) {
        for(int index = 0; index < this.entries.length; index++) {
            if(this.entries[index] == null) {
                this.entries[index] = diaryEntry;
                break; // stop the loop
            }
        }
    }

    @Override
    public void removeEntry(int entryIndex) {
        this.entries[entryIndex] = null;
    }

    @Override
    public String readEntry(int entryIndex) {
        return this.entries[entryIndex];
    }

    public static void main(String[] args) {
        TenDayDiary diary = new TenDayDiary();
        diary.addEntry("Hello, I'm building a diary");
        diary.addEntry("But, I'm unsure if the addEntry method worked..");
        diary.addEntry("So, I'm testing it here in the main method");
        System.out.println(diary.readEntry(0));
        System.out.println(diary.readEntry(1));
        System.out.println(diary.readEntry(2));
        System.out.println("Removing first entry...");
        diary.removeEntry(0);
        System.out.println(diary.readEntry(0));
        System.out.println(diary.readEntry(1));
        System.out.println(diary.readEntry(2));
        diary.addEntry("This is a new entry which should be at index 0");
        System.out.println(diary.readEntry(0));
        System.out.println(diary.readEntry(1));
        System.out.println(diary.readEntry(2));
        //diary.entries.size();
        ;
    }
}
