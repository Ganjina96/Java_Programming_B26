package day49_inheritance;

public class Building {
    public static void main(String[] args) {

        Person obj1 = new Person();
        obj1.name = "James Bond";
        obj1.age = 40;
        obj1.favoriteHobby = "spy stuff";
        obj1.talk();
        //obj1.study(); this was a method made in the child class

        Student obj2 = new Student();
        obj2.name = "Jorge";
        obj2.age = 10;
        obj2.favoriteHobby = "drawing";
        obj2.talk();
        // the above variables and methods were inherited from the parent class, Person

        obj2.funLevel = 100;
        obj2.study();
    }
}
