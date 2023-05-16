package kg.megalab.springdemo.exception;

public class EmptyListException extends RuntimeException{

    public EmptyListException(String message) {
        super(message);
    }
}
