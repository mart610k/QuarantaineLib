package dk.quarantaine.commons.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionMessage {
    String field;
    String message;
    String data;
}
