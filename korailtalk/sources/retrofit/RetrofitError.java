package retrofit;

import Q7.X;
import java.io.IOException;
import java.lang.reflect.Type;
import retrofit.client.Response;
import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.mime.TypedInput;

/* loaded from: classes3.dex */
public class RetrofitError extends RuntimeException {
    private final Converter converter;
    private final boolean networkError;
    private final Response response;
    private final Type successType;
    private final String url;

    RetrofitError(String str, String str2, Response response, Converter converter, Type type, boolean z8, Throwable th) {
        super(str, th);
        this.url = str2;
        this.response = response;
        this.converter = converter;
        this.successType = type;
        this.networkError = z8;
    }

    public static RetrofitError conversionError(String str, Response response, Converter converter, Type type, ConversionException conversionException) {
        return new RetrofitError(conversionException.getMessage(), str, response, converter, type, false, conversionException);
    }

    public static RetrofitError httpError(String str, Response response, Converter converter, Type type) {
        return new RetrofitError(response.getStatus() + X.SPACE + response.getReason(), str, response, converter, type, false, null);
    }

    public static RetrofitError networkError(String str, IOException iOException) {
        return new RetrofitError(iOException.getMessage(), str, null, null, null, true, iOException);
    }

    public static RetrofitError unexpectedError(String str, Throwable th) {
        return new RetrofitError(th.getMessage(), str, null, null, null, false, th);
    }

    public Object getBody() {
        return getBodyAs(this.successType);
    }

    public Object getBodyAs(Type type) {
        TypedInput body;
        Response response = this.response;
        if (response == null || (body = response.getBody()) == null) {
            return null;
        }
        try {
            return this.converter.fromBody(body, type);
        } catch (ConversionException e8) {
            throw new RuntimeException(e8);
        }
    }

    public Response getResponse() {
        return this.response;
    }

    public Type getSuccessType() {
        return this.successType;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isNetworkError() {
        return this.networkError;
    }
}
