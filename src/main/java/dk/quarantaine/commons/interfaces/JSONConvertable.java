package dk.quarantaine.commons.interfaces;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONObject;

public interface JSONConvertable {
    default JSONObject toJson(){
            ObjectMapper mapper = new ObjectMapper();
            try{
                String jsonString = mapper.writeValueAsString(this);

                return new JSONObject(jsonString);
            }
            catch(Exception e){
                return null;
            }
        }
}

