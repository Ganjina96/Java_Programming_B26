package day44_custom_classes;

public class ChainEx {

    public ChainEx(){
//        this(4); this is not valid because the chaining contain themselves
        System.out.println("First");
    }

    public ChainEx(int i){
        this();
        System.out.println("Second");
    }

    public ChainEx(String s){
        this();
        System.out.println("Third");
    }

    public ChainEx(double d){
        this(0);
        System.out.println("Fourth");
    }
}
