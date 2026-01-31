package retrofit.client;

import androidx.core.view.accessibility.H;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedOutput;

/* loaded from: classes3.dex */
public class ApacheClient implements Client {
    private final HttpClient client;

    private static class GenericEntityHttpRequest extends HttpEntityEnclosingRequestBase {
        private final String method;

        GenericEntityHttpRequest(Request request) {
            this.method = request.getMethod();
            setURI(URI.create(request.getUrl()));
            for (Header header : request.getHeaders()) {
                addHeader(new BasicHeader(header.getName(), header.getValue()));
            }
            setEntity(new TypedOutputEntity(request.getBody()));
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return this.method;
        }
    }

    private static class GenericHttpRequest extends HttpRequestBase {
        private final String method;

        public GenericHttpRequest(Request request) {
            this.method = request.getMethod();
            setURI(URI.create(request.getUrl()));
            for (Header header : request.getHeaders()) {
                addHeader(new BasicHeader(header.getName(), header.getValue()));
            }
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return this.method;
        }
    }

    static class TypedOutputEntity extends AbstractHttpEntity {
        final TypedOutput typedOutput;

        TypedOutputEntity(TypedOutput typedOutput) {
            this.typedOutput = typedOutput;
            setContentType(typedOutput.mimeType());
        }

        @Override // org.apache.http.HttpEntity
        public InputStream getContent() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.typedOutput.writeTo(byteArrayOutputStream);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        }

        @Override // org.apache.http.HttpEntity
        public long getContentLength() {
            return this.typedOutput.length();
        }

        @Override // org.apache.http.HttpEntity
        public boolean isRepeatable() {
            return true;
        }

        @Override // org.apache.http.HttpEntity
        public boolean isStreaming() {
            return false;
        }

        @Override // org.apache.http.HttpEntity
        public void writeTo(OutputStream outputStream) {
            this.typedOutput.writeTo(outputStream);
        }
    }

    public ApacheClient() {
        this(createDefaultClient());
    }

    private static HttpClient createDefaultClient() {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, H.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        return new DefaultHttpClient(basicHttpParams);
    }

    static HttpUriRequest createRequest(Request request) {
        return request.getBody() != null ? new GenericEntityHttpRequest(request) : new GenericHttpRequest(request);
    }

    static Response parseResponse(String str, HttpResponse httpResponse) {
        StatusLine statusLine = httpResponse.getStatusLine();
        int statusCode = statusLine.getStatusCode();
        String reasonPhrase = statusLine.getReasonPhrase();
        ArrayList arrayList = new ArrayList();
        String str2 = "application/octet-stream";
        for (org.apache.http.Header header : httpResponse.getAllHeaders()) {
            String name = header.getName();
            String value = header.getValue();
            if ("Content-Type".equalsIgnoreCase(name)) {
                str2 = value;
            }
            arrayList.add(new Header(name, value));
        }
        HttpEntity entity = httpResponse.getEntity();
        return new Response(str, statusCode, reasonPhrase, arrayList, entity != null ? new TypedByteArray(str2, EntityUtils.toByteArray(entity)) : null);
    }

    @Override // retrofit.client.Client
    public Response execute(Request request) {
        return parseResponse(request.getUrl(), execute(this.client, createRequest(request)));
    }

    public ApacheClient(HttpClient httpClient) {
        this.client = httpClient;
    }

    protected HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return httpClient.execute(httpUriRequest);
    }
}
