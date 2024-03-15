package se.lexicon;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println(NameRepository.getSize()); // 0

        boolean isAddElnaz = NameRepository.add("Elnaz Azizi");

        System.out.println(isAddElnaz);

        System.out.println(NameRepository.getSize()); // 1

        String[] newData = {"Nick Dick", "Melina Sonic"};
        NameRepository.setNames(newData);

        System.out.println(NameRepository.getSize()); // 2

        System.out.println(NameRepository.find("Nick Nick")); // null
        System.out.println(NameRepository.find("Nick Dick")); // Nick Dick


        System.out.println(NameRepository.update("Melina Sonic","Elnaz Azizi")); // true
        System.out.println(Arrays.toString(NameRepository.findAll())); // [Nick Dick, Elnaz Azizi]

        System.out.println(NameRepository.update("Nick Dick","Elnaz Azizi")); // false
        System.out.println(NameRepository.update("Sara Sami","Elnaz Azizi")); // false
        System.out.println(NameRepository.remove("Nick Dick")); // true
        System.out.println(NameRepository.getSize()); // 1

        System.out.println(Arrays.toString(NameRepository.findAll())); // [Nick Dick, Elnaz Azizi]






    }
}
