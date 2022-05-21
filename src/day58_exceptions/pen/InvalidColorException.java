package day58_exceptions.pen;

public class InvalidColorException extends Exception{
    // Creating a class as a sub class of the Exception class will create a checked exception


    public InvalidColorException(String message) {
        super(message);
    }
}
