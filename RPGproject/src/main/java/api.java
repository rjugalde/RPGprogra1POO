import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.logging.Level;
import java.util.logging.Logger;

//import java.net.http.HttpResponse;

/**
 *
 * @author Ricardo
 */
public class api {


    public JsonNode unireststatic (String key){
        HttpResponse<JsonNode> response = null;
        try {
            response = Unirest.get("https://rapidapi.p.rapidapi.com/product/details?country=US&asin="+key)
                    .header("x-rapidapi-host", "amazon-product-reviews-keywords.p.rapidapi.com")
                    .header("x-rapidapi-key", "3cec1f6b7bmsh9f48b3ab5ae4713p100bd0jsnc1ebec8aa09e")
                    .asJson();
        } catch (UnirestException ex) {
            Logger.getLogger(api.class.getName()).log(Level.SEVERE, null, ex);
        }
        assert response !=  null;
        return response.getBody();
        //return response.getBody().string();
    }

}