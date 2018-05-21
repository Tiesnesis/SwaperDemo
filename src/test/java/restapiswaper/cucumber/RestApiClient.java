package restapiswaper.cucumber;

import org.apache.http.Header;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;

public class RestApiClient {

        public Header[] headers;
        public CloseableHttpClient httpClient = HttpClients.createDefault();

        private static RestApiClient instance = null;

        public static RestApiClient getInstance(){
            if(instance==null){
                instance = new RestApiClient();
            }
            return instance;
        }
}
