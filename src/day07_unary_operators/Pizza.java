package day07_unary_operators;

public class Pizza {
    public static void main(String[] args) {

        String typeOfPizza = "Pepperoni";
        int numOfSlices = 10;
        int numOfPeopleEating = 4;
        int slicesPerPerson = numOfSlices / numOfPeopleEating;
        int slicesLeftover = numOfSlices % numOfPeopleEating;
        String report = "We ordered " + typeOfPizza + " pizza with " + numOfSlices + " slices, " + numOfPeopleEating + " people ate " + slicesPerPerson + " each with " + slicesLeftover + " leftover";


        System.out.println(report);
    }
}
