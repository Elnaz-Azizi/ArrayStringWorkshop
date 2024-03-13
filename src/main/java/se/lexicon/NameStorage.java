package se.lexicon;

public class NameStorage {
    public static void main(String[] args) {
        NameStorage nameStorage = new NameStorage(10);
        nameStorage.addName("Erik", "Svensson");
        nameStorage.addName("Elnaz", "Azizi");
        String[] storedNames = nameStorage.getNames();
        for (String name : storedNames) {
            System.out.println(name);

        }
    }//main

    private String[] names;
    private int size;

    public NameStorage(int capacity) {
        names = new String[capacity];
        size = 0;
    }

    public void addName(String firstName, String lastName) {
        if (size >= names.length) {
            System.out.println("No space left");
            return;
        }
        names[size] = firstName + " " + lastName;
        size++;
    }

    public String[] getNames() {
        String[] storedNames = new String[size];
        for (int i = 0; i < size; i++) {
            storedNames[i] = names[i];
        }
        return storedNames;
    }
}//class
