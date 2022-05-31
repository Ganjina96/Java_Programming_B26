package Practice;


import java.util.HashMap;
import java.util.Map;

public class MapsPractice {
    public static void main(String[] args) {

//        Create a map that has a couple data to use. The data will be a name as the
//        key and a salary as the value
//        Use the created map to find the following:
//        1.1 who has the maximum salary?
//                1.2 who has the minimum salary?
//                1.3 how many employees has the salary between 120k ~ 150K?
//                1.4 display the names of the employees who are making less than 118k?
//                1.5 increase the salary of each employee by 10K

        Map<String, Double> map = new HashMap<>();
        map.put("Sasha", 150_000.0);
        map.put("Ganjina", 80_000.0);
        map.put("Vika", 125_000.0);
        map.put("Alex", 30_000.0);

        double maxSalary = 0.0;
        String nameOfMax = "";
        double minSalary = Double.MAX_VALUE;
        String nameOfMin = "";

        for (String key : map.keySet()) {
            if (map.get(key) > maxSalary){
                maxSalary = map.get(key);
                nameOfMax = key;

            }
        }
        System.out.println("Name of max: " + nameOfMax);

        for (String key : map.keySet()) {
            if (map.get(key) < minSalary){
                minSalary = map.get(key);
                nameOfMin = key;
            }
        }
        System.out.println("Name of min: " + nameOfMin);

        int count = 0;

        for (String key : map.keySet()) {
            if (map.get(key) >= 120_000.0 && map.get(key) <= 150_000.0 ){
                count++;
            }

        }
        System.out.println("Num of employees with 120k-150k: " + count );

        for (String key : map.keySet()) {
            if (map.get(key) < 118_000.0){
                System.out.println("Makes less than 118k " + key);
            }

        }

        for (String key : map.keySet()) {
            map.put(key, map.get(key) + 10_000.0);

        }

        System.out.println(map);












    }
}
