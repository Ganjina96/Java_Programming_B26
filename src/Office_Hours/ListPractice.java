package Office_Hours;


import java.sql.Array;
import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,4,3,2,1};

        System.out.println("----ARRAYLIST----");

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));

        System.out.println("---LINKEDLIST---");

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(arr));
        System.out.println(linkedList);
        linkedList.addFirst(0);
        linkedList.addLast(100);
        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        System.out.println("linkedList.getLast() = " + linkedList.getLast());

        System.out.println("---VECTOR---");

        Vector<Integer> vector = new Vector<>(Arrays.asList(arr));
        System.out.println(vector);
        System.out.println("vector.get(0) = " + vector.get(0));
        System.out.println(vector.size());
        vector.add(10);
        vector.remove(9);
        vector.remove(8);
        System.out.println("---------------");
        System.out.println(vector);

        System.out.println("----STACK----");
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
        System.out.println(stack);
        System.out.println("stack.get(0) = " + stack.get(0));
        System.out.println("stack.size() = " + stack.size());

        // push()
        stack.push(10);


        // pop()
        Integer a = stack.pop(); // remove last element from the top of the stack and returns it
        System.out.println(a);

        System.out.println("-------Difference btw add() and push()-------");
        System.out.println(stack.add(11)); // true
        System.out.println(stack.push(12)); // 12

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");

        }
        System.out.println();

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop()+ " ");

        }
        System.out.println(stack.empty());


    }
}
