package restapiswaper.cucumber.apiResources.profile;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import restapiswaper.cucumber.RestApiClient;
import restapiswaper.cucumber.apiResources.AbstrasctApiResource;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class AccountEntries extends AbstrasctApiResource {
    private String url = "/rest/public/profile/account-entries";

    public JSONObject post(String dateFrom, String dateTo) throws IOException, ParseException {
        HttpPost request = new HttpPost(baseUrl+url);
        HttpResponse response;
        request.addHeader("content-type", "application/json");
        httpClient = RestApiClient.getInstance().httpClient;
        request = (HttpPost) authenticateRequest(request);

        JSONObject body = new JSONObject();
        body.put("bookingDateFrom", dateFrom);
        body.put("bookingDateTo", dateTo);

        StringEntity entity = new StringEntity(body.toJSONString());
        request.setEntity(entity);
        response = httpClient.execute(request);
        request.releaseConnection();

        assertEquals(200, response.getStatusLine().getStatusCode());
        return convertResponseToJson(response);
    }
}
