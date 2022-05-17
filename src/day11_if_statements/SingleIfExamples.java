package day11_if_statements;

public class SingleIfExamples {
    public static void main(String[] args) {

        if(false){
            System.out.println("Hello World"); // if statement is false so it won't print
        }
        System.out.println("Second line"); // just normal print statement nothing to do with if statements

        if(true){
            System.out.println("Today is Monday"); // the if statement is true, so it will print this value
        }
        int score = 60;
        if(score >= 75){
            System.out.println("passing");
        }
        if(score < 75){
            System.out.println("Failing");
        }
        int year = 2022;
        boolean lockdown = year == 2020 || year == 2021;
        if(lockdown){
            System.out.println("stay at home");
            System.out.println("Practice java");
            System.out.println("wear a mask");
        }
        if(!lockdown){ // value of lockdown is false but the "!" in front makes it not false
            System.out.println("party");
            System.out.println("still practice java");
            System.out.println("maybe travel");
        }
        // in the situation where the lockdown value is true | !true -> false

    }
}
