package retrofit;

import retrofit.client.Response;

/* loaded from: classes3.dex */
public interface Callback<T> {
    void failure(RetrofitError retrofitError);

    void success(T t8, Response response);
}
