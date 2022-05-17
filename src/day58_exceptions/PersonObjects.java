package day58_exceptions;

public class PersonObjects {
    public static void main(String[] args){

        Person obj = new Person();
        obj.setAge(50);
        try {
            obj.setName("James Bond");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        System.out.println();

        Person obj2 = new Person();
        obj2.setAge(-50);
        try {
            obj2.setName("Ganjina");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(obj2.getName());
        System.out.println(obj2.getAge());

        System.out.println();

        Person obj3 = new Person();
        obj3.setAge(26);
        try {
            obj3.setName(null);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(obj3.getAge());
        System.out.println(obj3.getName());
    }
}
