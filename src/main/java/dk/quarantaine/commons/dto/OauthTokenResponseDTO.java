package dk.quarantaine.commons.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OauthTokenResponseDTO {
    String access_token;
    String refresh_token;
    String token_type;
    int validity;


}
