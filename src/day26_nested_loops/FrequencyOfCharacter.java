package day26_nested_loops;

public class FrequencyOfCharacter {

    /*
    String apple
    count how many times each letter is in the string
    a - 1
    p - 2
    l - 1
    e - 1

    what we will try to do:
            we will go one character at a time
            charAt(0) --> a
                apple
                    a == a
                    a == p
                    a == p
                    ......
            charAt(1) --> p
                apple
                p == a
                p == p
                .......

     */

    public static void main(String[] args) {

        String s = "apple";
        String checked = "";

        for (int i = 0; i < s.length(); i++) {
            int count = 0; // every time the outer loop iterates the counter is set back to 0. it is reset between every character
            char letter = s.charAt(i);

            if (checked.contains(""+ letter)){
                continue; // not count that char or print again, it will skip your inner loop if the char already exists

            }

            for (int j = 0; j < s.length(); j++) {
                char each = s.charAt(j);

                if (letter == each){
                    count++;
                }
            } // end of inner loop

            System.out.println(letter + " - " + count);
            checked += letter;
        }











    }
}
