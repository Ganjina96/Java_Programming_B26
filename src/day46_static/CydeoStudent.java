package day46_static;

import java.util.Arrays;

public class CydeoStudent {

    public String name;
    public int groupNum;

    public static int batchNum;
    public static String [] instructors;
    public static String schoolName;

    // you can assign and declare at the same time but it is not recommended, we will use static block to assign

    static {
        batchNum = 26;
        instructors = new String[]{"Nadir", "Mehmet", "Austin", "Aysun", "Saim"};
        schoolName = "Cydeo";
        printInfo(); // automatically print our info the first time we run the class
    }

    public CydeoStudent(String name, int groupNum){
        this.name = name;
        this.groupNum = groupNum;
    }

    public static void printInfo(){
        System.out.println("School name: " + schoolName);
        System.out.println("Batch number: " + batchNum);
        System.out.println("Instructors: " + Arrays.toString(instructors));
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", groupNum=" + groupNum +
                '}';
    }
}
