package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName = "Ganjina";
        String lastName = "Nagzibekova";
        char gender = 'F';
        byte age = 25;
        String companyName = "Henkel";
        boolean fullTime = true;
        String jobTitle = "QC Tech";
        int salary = 46_000;
        byte numberOfPto = 4;
        boolean areTheyMarried = false;
        char suite = 'D';

        String fullDetails = "Employment Information for " + firstName + " " + lastName + ". " + "Gender: " + gender + ".\n" + jobTitle + " at " + companyName + " currently " + age + " years old.\n" + companyName + " is located in suite " + suite + ". This year's salary comes to $" + salary + ".\nOther deatils: PTO: " + numberOfPto + ", full time? " + fullTime + ", married? " + areTheyMarried;

        System.out.println(fullDetails);






    }
}
