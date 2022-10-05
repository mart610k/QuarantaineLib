package dk.quarantaine.commons.dto;

import dk.quarantaine.commons.interfaces.JSONConvertable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserDTO implements JSONConvertable{
    String username;

    String password;

    String phoneNumber;

    String name;


    public RegisterUserDTO() {
    }
}