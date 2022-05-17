package day05_variables;

public class RecapVariables {
    public static void main(String[] args) {

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentsInClass;

        // We cannot print the variables because they don't have a value
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentsInClass);


        // Assigning to variable

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalStudentsInClass = 432;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentsInClass);

        System.out.println(numberOfCoffeeCups + totalStudentsInClass);

        // adds the variables together, if we do not want that we can do the following in order to separate the variables

        System.out.println(numberOfCoffeeCups + "$" + totalStudentsInClass);

        // Declaring and assigning at the same time:

        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("\nthis is my temperature: " + temperature);
        System.out.println("we have already been studying java for " + javaDays + " days");






    }
}
