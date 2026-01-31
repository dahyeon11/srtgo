package retrofit;

import retrofit.client.Response;

/* loaded from: classes3.dex */
final class ResponseWrapper {
    final Response response;
    final Object responseBody;

    ResponseWrapper(Response response, Object obj) {
        this.response = response;
        this.responseBody = obj;
    }
}
