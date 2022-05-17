package day23_loops;

public class CountHi {
    public static void main(String[] args) {
        String str = "aaaaaahiahhhihimamfvbh";
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            // if you check for characters next to the current index using i + 1 then you should stop the loop earlier using i < length - 1 because it will give you error
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){ // checking one index at a time but also checking the index right after it to make sure we have both chars we are looking for in the same iteration
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
String str = "aaaaaahiahhhihimamfvbh";
in order to find "hi" we need to go one character at a time but also checking 2 characters at a time and if they are there then the count++
aa
aa
ah
hi
etc
 */
