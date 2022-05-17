package day53_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {

        //Exercise obj1 = new Exercise(); cannot make an object of an abstract class

        Running obj2 = new Running();
        System.out.println(obj2.name);
        obj2.performExercise();
        System.out.println(obj2.getCaloriesBurned(20));
    }
}
