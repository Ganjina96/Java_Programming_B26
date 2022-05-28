package Office_Hours.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args)  {

       // Thread.sleep(3000);

      //  FileInputStream fileInputStream = new FileInputStream("path");


        System.out.println("Before Read file");
        waitFor(3);
        readFromFile("path");
        System.out.println("After REad file");
    }

    public static void waitFor(int second)  {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFromFile(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException is handled");
        }
    }
}
