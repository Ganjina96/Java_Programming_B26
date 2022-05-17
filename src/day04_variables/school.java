package day04_variables;

public class school {
    public static void main(String[] args) {
        /*
        Task:

    class name: School

declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school

    print all of the variables with unique messages

         */
        int grade1 = 35;
        int grade2 = 40;
        int grade3 = 25;
        int grade4 = 10;
        int grade5 = 75;

        int totalNumberOfStudents = grade1 + grade2 + grade3 + grade4 + grade5;

        System.out.println(totalNumberOfStudents);


    }
}
