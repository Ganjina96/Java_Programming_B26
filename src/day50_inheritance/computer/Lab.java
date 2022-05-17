package day50_inheritance.computer;

import day50_inheritance.computer.Computer;
import day50_inheritance.computer.Windows;

public class Lab {
    public static void main(String[] args) {

        Computer obj1 = new Computer("generic os", 300);
        System.out.println(obj1);

        Windows obj2 = new Windows(500);
        //             new Computer ("Windows", 500)
        System.out.println(obj2);

       // Mac obj3 = new Mac("Mac", 300); version when you accept both os and memory
        Mac obj3 = new Mac(300);
        System.out.println(obj3);

    }
}
