package day54_abstraction.animal;

import day54_abstraction.language.Language;

public final class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Parrot wobble over to the seeds");

    }

    @Override
    public void fly() {
        System.out.println("Parrots can fly");
    }

    @Override
    public void hi() {
        System.out.println("Parrot can say hi");
    }

    @Override
    public void bye() {
        System.out.println("Parrot cannot say bye");
    }
}
