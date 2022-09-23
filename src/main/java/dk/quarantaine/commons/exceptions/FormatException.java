package dk.quarantaine.commons.exceptions;

import lombok.Getter;

@Getter
public class FormatException extends Exception{

    String field;

    String data;

    public FormatException(String message,String field,String data) {
        this(message);

        this.field = field;
        this.data = data;
    }

    public FormatException(String message){
        super(message);
    }
}
