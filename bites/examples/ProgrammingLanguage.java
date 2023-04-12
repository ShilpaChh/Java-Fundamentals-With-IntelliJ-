package bites.examples;

// Ch5 - Challenge:
// Create a class called ProgrammingLanguage which has three instance fields
//
//        String name
//        Integer yearOfCreation
//        String creator
//        In the main method, create three instances of the ProgrammingLanguage class and print the three instance fields of each one.

public class ProgrammingLanguage {

    String name;
    Integer yearOfCreation;
    String creator;
    public ProgrammingLanguage(String name, Integer yearOfCreation, String creator) {
        // now assigning to instance fields:
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;
    }

    public String name() {
        return this.name;
    }

    public Integer yearOfCreation() {
        return this.yearOfCreation;
    }

    public String creator() {
        return this.creator;
    }

    public static void main(String[] args) {
        ProgrammingLanguage myProgrammingLanguage = new ProgrammingLanguage("Ruby", 2023, "Shilpa");
        System.out.println(myProgrammingLanguage.name);
        System.out.println((myProgrammingLanguage.yearOfCreation));
        System.out.println(myProgrammingLanguage.creator);
    }

}
