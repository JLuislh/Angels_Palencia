package FELclass;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class RestApiClient {
    
    private static final String BASE_URL = "https://felgtaws.digifact.com.gt/gt.com.apinuc/api/Shared";
    //private static final String BASE_URL = "https://felgttestaws.digifact.com.gt/gt.com.apinuc/api/Shared";
    private static final String AUTHORIZATION_HEADER = "Authorization";

    private OkHttpClient client;

    public RestApiClient() {
        this.client = new OkHttpClient();
    }

    public String get( String apiKey, String accessToken) throws IOException {
        Request request = new Request.Builder()
                .url(BASE_URL + "?" + apiKey)
                .header("Content-Type",   "application/xml")
                .header(AUTHORIZATION_HEADER,   accessToken)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            return response.body().string();
        }
    }
}