package se.lexicon;

import java.sql.Array;
import java.util.Arrays;

public class NameRepository {
    private static String[] names = new String[0]; // storage - memory - where you can store all the names


    public static int getSize() {
        return names.length;
    }

    //
    public static void setNames(String[] newNames) {
        names = Arrays.copyOf(newNames, newNames.length);
    }

    public static void clear() {
        names = new String[0];
    }

    public static String[] findAll() {
        return Arrays.copyOf(names, names.length);
    }

    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equals(fullName)) {
                return name;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        if (find(fullName) != null) {
            return false;
        }
        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = fullName;
        return true;
    }

    /* public static String[] findByFirstName(final String firstName)
Searches the array trying to find all names that has passed in first name. Returns a String array containing all
matches.*/
    public static String[] findByFirstName(final String firstName) {
        String[] matches = new String[0];
        for (String name : names) {
            if (name.startsWith(firstName + " ")) {
                matches = Arrays.copyOf(matches, matches.length + 1);
                matches[matches.length - 1] = name;
            }
        }
        return matches;
    }
    /*public static String[] findByLastName(final String lastName)
Searches the array trying to find all names that has passed in last name. Returns a String array containing all
matches.*/

    public static String[] findByLastName(final String lastName) {
        String[] matches = new String[0];
        for (String name : names) {
            if (name.endsWith(" " + lastName)) {
                matches = Arrays.copyOf(matches, matches.length + 1);
                matches[matches.length - 1] = name;
            }
        }
        return matches;
    }
    /* public static boolean update(final String original, final String updatedName)
Should find a name and replace it with new fullName if available. Returns true if name was found and updated
with the new name. False if name could not be updated because name wasn’t found or name was found but an
existing name matching the updatedName already exists */


}//class
