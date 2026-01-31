package retrofit.client;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class OkClient extends UrlConnectionClient {
    private final OkUrlFactory okUrlFactory;

    public OkClient() {
        this(generateDefaultOkHttp());
    }

    private static OkHttpClient generateDefaultOkHttp() {
        OkHttpClient okHttpClient = new OkHttpClient();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        okHttpClient.setConnectTimeout(15000L, timeUnit);
        okHttpClient.setReadTimeout(20000L, timeUnit);
        return okHttpClient;
    }

    @Override // retrofit.client.UrlConnectionClient
    protected HttpURLConnection openConnection(Request request) {
        return this.okUrlFactory.open(new URL(request.getUrl()));
    }

    public OkClient(OkHttpClient okHttpClient) {
        this.okUrlFactory = new OkUrlFactory(okHttpClient);
    }
}
