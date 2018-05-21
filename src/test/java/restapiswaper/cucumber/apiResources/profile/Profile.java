package restapiswaper.cucumber.apiResources.profile;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.entity.StringEntity;
import org.json.simple.parser.ParseException;
import restapiswaper.cucumber.RestApiClient;
import restapiswaper.cucumber.apiResources.AbstrasctApiResource;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Profile extends AbstrasctApiResource {
    private String url = "/rest/public/profile";

    public void patch(String body) throws IOException, ParseException {
        HttpPatch request = new HttpPatch(baseUrl+url);
        HttpResponse response;
        request.addHeader("content-type", "application/json");
        httpClient = RestApiClient.getInstance().httpClient;
        request = (HttpPatch) authenticateRequest(request);
        StringEntity entity = new StringEntity(
                String.format(body)
        );
        request.setEntity(entity);
        response = httpClient.execute(request);
        request.releaseConnection();
        assertEquals(200, response.getStatusLine().getStatusCode());
    }

    public void changePassword(String password, String newPassword) throws IOException, ParseException {
        patch(
            String.format(
                "{\"password\":\"%s\", \"newPassword\":\"%s\"}",
                password,
                newPassword
            )
        );
    }
}
