package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(NameRepository.getSize());
        boolean isAddElnaz = NameRepository.add("Elnaz Azizi");
        System.out.println(isAddElnaz);
        System.out.println(NameRepository.getSize()); // 1



    }
}
