package day36_methods;

public class OverloadAndReturn {
    public static void method(){
        System.out.println("default empty method");
    }

    // I will try to overload by changing the return type

//    public static int method(){
//
//    }

    // this is not valid changing the return type does not overload

    public static int method(int a){
        return 0;
    }

    // you can't overload method by changing the return type, but you can change the return type after the method is overloaded
}
