package Practice;

public class PlusMinus {

    public static void main(String[] args) {

        int [] arr = {1,1, 1, 0, -1,-1};
        plusMinus(arr);
    }

    /*
    Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  6 places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Example: arr [1,1,0,-1,-1]

There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:

     */

    public static void plusMinus(int arr[]){

        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        int n = arr.length;
        double resPos = 0.0;
        double resNeg = 0.0;
        double resZero = 0.0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                countPos++;
            } else if (arr[i] < 0) {
                countNeg++;
            }else {
                countZero++;
            }
        }
        resPos = (double) countPos / n;
        resNeg = (double) countNeg / n;
        resZero = (double) countZero / n;

        System.out.format("%.6f", resPos);
        System.out.println();
        System.out.format("%.6f", resNeg);
        System.out.println();
        System.out.format("%.6f", resZero);



    }
}
