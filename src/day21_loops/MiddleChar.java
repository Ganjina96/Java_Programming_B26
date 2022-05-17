package day21_loops;

public class MiddleChar {
    public static void main(String[] args) {

        String s = "abcdef";
                //  01234
        int mid = s.length()/2;

        if (s.length() % 2 == 0){
            // our word is even length, which means there will be 2 middle char
            // length / 2 => 6/2 = 3 gives you the second index of the  middle characters
            char firstMiddle = s.charAt(mid - 1);
            char secondMiddle = s.charAt(mid);
            System.out.println("With charAt: " + firstMiddle + secondMiddle);
            System.out.println("With substring: " + s.substring(mid - 1, mid + 1));
        } else {
            // our word is odd length
            // length / 2: 5/2 == 2 to get middle character, for odd #s we will get the whole number of the actual middle char
//            char middle = s.charAt(2); // hardcoded not ideal if the string changes
            char middle = s.charAt(mid);
            System.out.println("With charAt: " + middle);
            System.out.println("With substring: " + s.substring(mid, mid + 1));
        }

    }

}
