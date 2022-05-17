package day27_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        /*
        [IQ] Unique characters

Given a String, find and print the unique characters. A character is unique if it only appears once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		BDF

	-> the characters B D and F are only found in the String once so they are unique
         */

        String str = "AAABCCDEEFYZZX";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);
//                System.out.println(eachLetter + " - " + innerLetter);

                if (eachLetter == innerLetter){
                    count++; // find frequency of letters
                }

            }
            if (count == 1){ // the counter will be one when the character is unique. the character will match with itself one time, so it will never be zero but if it's more than one which means it matched with other characters meaning it's not unique
                System.out.print(eachLetter);
            }


        }

    }
}
