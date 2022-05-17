package Office_Hours;

import java.util.Scanner;

public class LongestRepetitiveSubstring {
    /*
    Real Interview Task-->  Longest Repetitive Substring

    Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
    Your program should return longest substring K, and
    if there is none it should be return "There is no repetitive substring"

            For Example is str ="abcababcababcab"                 output should be abcab
                           str ="abcdefabcdef"                    output should be abcdef

                           str ="abcdefabcdef abcdefabcdef"    output should be abcdefabcdef
                           str ="abcdefxabcdef"                   output should be "There is no repetitive substring"
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = input.nextLine();
        String str1 = str;
        String temp = "";
        int count = 0;
        String res = "";
        int max = Integer.MIN_VALUE;
        boolean isRepetitive = false;

        for(int i = 0; i < str.length()/2 ; i++){
            temp += str.charAt(i);

            while (str1.contains(temp)){
                str1 = str1.replaceFirst(temp, "");
                count++;
            }
            if(count > 1 && str1.isBlank()){
                if(temp.length() > max){
                    isRepetitive = true;
                    max = temp.length();
                    res = temp;
                }
            }
            str1 = str;
            count = 0;

        }
        System.out.println("\n---------RESULT---------");
        System.out.println(isRepetitive ? res : "There is no repetitive substring");
    }
}
