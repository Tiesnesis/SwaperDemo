package restapiswaper.cucumber.apiResources.notifications;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import restapiswaper.cucumber.RestApiClient;
import restapiswaper.cucumber.apiResources.AbstrasctApiResource;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Settings extends AbstrasctApiResource {
    private String url = "/rest/public/profile/notifications/settings";

    public JSONObject get() throws IOException, ParseException {
        HttpGet request = new HttpGet(baseUrl+url);
        HttpResponse response;
        httpClient = RestApiClient.getInstance().httpClient;
        request = (HttpGet) authenticateRequest(request);

        response = httpClient.execute(request);
        request.releaseConnection();

        assertEquals(200, response.getStatusLine().getStatusCode());
        return convertResponseToJson(response);
    }
}
