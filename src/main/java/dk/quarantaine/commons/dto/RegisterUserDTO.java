package dk.quarantaine.commons.dto;

import dk.quarantaine.commons.interfaces.JSONConverable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserDTO implements JSONConverable{
    String username;

    String password;

    String phoneNumber;

    String name;


    public RegisterUserDTO() {
    }
}