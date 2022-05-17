package day17_string;

public class StringMemory {
    public static void main(String[] args) {
        String first = "java"; // this is a string literal, and it is directly in the string pool

        String second = new String("java"); // this is a string object not in the string pool but directly in the heap

        System.out.println(first == second); // == w/ String types gives you false. The == doesn't compare the characters, it compares the memory location of the object

        String third = "java";
        System.out.println(first == third);

        String fourth = "Java"; // at this line, we have 2 objects in the string pool, one lowercase and one uppercase java word
        System.out.println(first == fourth);
        // at this point there 3 total objects. 2 in the string pool and 1 directly in the heap

        String fifth = new String("java");
        System.out.println(second == fifth);

    }
}
