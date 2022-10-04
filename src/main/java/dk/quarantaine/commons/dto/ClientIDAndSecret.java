package dk.quarantaine.commons.dto;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ClientIDAndSecret {
    String clientID;
    String clientSecret; 

    public String createBasicHeader(){
        return "Basic " + Base64.getEncoder().encode((clientID + ":"+ clientSecret).getBytes(StandardCharsets.UTF_8)).toString();
    }
}
