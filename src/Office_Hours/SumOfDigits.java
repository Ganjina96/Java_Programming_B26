package Office_Hours;

public class SumOfDigits {

    /*
Task 01 : SumOfDigits

        Write a program that can return the sum of digits from  a  string
             		Ex:
             			input: A1B2C3

             			output: 6
     */

    public static void main(String[] args) {
        String str = "A1B2C34";
        //            012345
        // manually - hardcoded it will run and give correct output only for this data
        // str.charAt(1) -- returns char data

        System.out.println("Hardcoded " + (str.charAt(1) - 48 + str.charAt(3)-48 + str.charAt(5)-48)); // used 48 == 0 in the ASCII table to get the actual # for the integers



        // dynamic = it will run for all kind of data

        // first check each char which means we will have to use a loop for anything that repeats

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); // refers to each iteration of characters

            if (each >= '0' && each <= '9'){ // condition to get only number values
                sum += each -48;
            }
        }
        System.out.println("Dynamic " + sum);



    }

}
