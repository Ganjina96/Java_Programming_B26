package day05_variables;

public class TypeCasting {
    public static void main(String[] args) {

        // typecasting is how to change one datatype to another

        byte b = 40;
        int i = b;
        // works cause byte is smaller than int, so it automatically converts

        int i2 = 100;
        byte b2 = (byte) i2;
        // int is bigger than byte, so we must cast. We cast the int type - i2 to a byte type using (byte).

        int i3 = 500;
        long l1 = i3;
        // int is smaller than long therefore it will automatically cast

        long l2 = 750;
        int i4 =  (int) l2;
        // long is bigger than int, must cast

        double d = 50;
        int i5 = (int) d;
        // trying to go from bigger to smaller, so must cast

        System.out.println(d);
        System.out.println(i5);






    }
}
