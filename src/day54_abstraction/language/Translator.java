package day54_abstraction.language;

public class Translator {
    public static void main(String[] args) {

        // Language obj = new Language(); cannot make object of an interface

        Spanish obj1 = new Spanish();
        obj1.hi();
        obj1.bye();

        Turkish obj2 = new Turkish();
        obj2.hi();
        obj2.bye();


        System.out.println(Language.planet);
    }
}
