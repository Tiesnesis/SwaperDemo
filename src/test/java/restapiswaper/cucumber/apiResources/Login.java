package restapiswaper.cucumber.apiResources;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.JSONObject;
import restapiswaper.cucumber.RestApiClient;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class Login extends AbstrasctApiResource {
    private String url = "/rest/public/login";

    public Login(){

    }

    public void post(String email, String password) throws IOException {
        this.httpClient = HttpClients.createDefault();
        HttpPost request = new HttpPost(baseUrl+url);
        HttpResponse response;

        JSONObject body = new JSONObject();
        body.put("name", email);
        body.put("password", password);

        StringEntity entity = new StringEntity(body.toJSONString());
        request.addHeader("content-type", "application/json");
        request.setEntity(entity);

        response = httpClient.execute(request);

        RestApiClient.getInstance().headers = response.getAllHeaders();

        request.releaseConnection();
        RestApiClient.getInstance().httpClient = httpClient;

        assertEquals(200, response.getStatusLine().getStatusCode());
    }
}
