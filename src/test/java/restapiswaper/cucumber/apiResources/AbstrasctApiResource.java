package restapiswaper.cucumber.apiResources;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.json.simple.parser.ParseException;
import restapiswaper.cucumber.RestApiClient;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import restapiswaper.cucumber.UrlConfiguration;

public abstract class AbstrasctApiResource {
    public CloseableHttpClient httpClient;
    public String baseUrl = UrlConfiguration.SWAPPER_URL;

    public JSONObject convertResponseToJson(HttpResponse response) throws IOException, ParseException {
        InputStream responseStream = response.getEntity().getContent();
        Scanner scanner = new Scanner(responseStream, "UTF-8");
        String responseString = scanner.useDelimiter("\\Z").next();
        scanner.close();
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(responseString);
        return json;
    }

    public HttpRequestBase authenticateRequest(HttpRequestBase request){
        for (Header header : RestApiClient.getInstance().headers) {
            if (header.getName().equals("_csrf")){
                request.setHeader("X-XSRF-TOKEN", header.getValue());
            }
            if (header.getName().equals("Set-Cookie")){
                request.setHeader("Cookie", header.getValue());
            }
        }
        return request;
    }
}
