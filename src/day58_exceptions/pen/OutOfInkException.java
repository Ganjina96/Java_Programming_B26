package day58_exceptions.pen;

public class OutOfInkException extends RuntimeException{
    // Creating a class as a sub class of the RuntimeException class will create an unchecked exception

    public OutOfInkException(String message) {
        super(message);
    }
}
