package day24_loops;

public class Syllables {
    public static void main(String[] args) {

        String word = "ja-va";
        int syllables = 1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) ==  '-'){
                syllables++;
            }
        }

        System.out.println(syllables);

    }
}
