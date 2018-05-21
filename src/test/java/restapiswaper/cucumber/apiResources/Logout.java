package restapiswaper.cucumber.apiResources;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import restapiswaper.cucumber.RestApiClient;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Logout extends AbstrasctApiResource {
    private String url = "/rest/public/logout";

    public Logout(){

    }

    public void post() throws IOException {
        this.httpClient = RestApiClient.getInstance().httpClient;
        HttpPost request = new HttpPost(baseUrl+url);
        HttpResponse response;
        httpClient = RestApiClient.getInstance().httpClient;
        request = (HttpPost) authenticateRequest(request);

        response = httpClient.execute(request);
        request.releaseConnection();
        httpClient.close();

        assertEquals(200, response.getStatusLine().getStatusCode());
    }
}
