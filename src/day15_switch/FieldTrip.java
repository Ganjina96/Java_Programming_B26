package day15_switch;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 1;
        String location = "", teacher = "";
        int numberOfGroups = 0;

        if (grade >= 1 && grade <= 6){
            if (grade == 1){
                location = "Apple orchard";
                numberOfGroups = 3;
                teacher = "Ms. Smith";

            } else if (grade == 2){

            } else if (grade == 3){

            } else if (grade == 4){

            } else if (grade == 5){

            } else {
                // this one is for grade 6
            }
        } else {
            System.out.println("Grade must be between 1 and 6");
        }
    }
}
