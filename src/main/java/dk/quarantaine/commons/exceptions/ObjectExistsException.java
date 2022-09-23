package dk.quarantaine.commons.exceptions;

public class ObjectExistsException extends Exception{
    public ObjectExistsException(String message) {
        super(message);
    }
}