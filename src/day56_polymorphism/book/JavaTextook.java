package day56_polymorphism.book;
/*
Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods
 */

public class JavaTextook extends EBook {

    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading Java textbook");

    }

    @Override
    public void download() {
        System.out.println("Downloading java textbook");

    }

    @Override
    public void open() {
        System.out.println("Opening java text book");

    }
}
