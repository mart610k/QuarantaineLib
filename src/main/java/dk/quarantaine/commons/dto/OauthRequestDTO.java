package dk.quarantaine.commons.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OauthRequestDTO {
    String grant_type;
    String username;
    String password;


}
