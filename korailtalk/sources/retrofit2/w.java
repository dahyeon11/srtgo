package retrofit2;

import C7.F;
import C7.H;
import C7.J;
import C7.K;
import retrofit2.l;

/* loaded from: classes3.dex */
public final class w<T> {

    /* renamed from: a */
    private final J f36106a;

    /* renamed from: b */
    private final Object f36107b;

    /* renamed from: c */
    private final K f36108c;

    private w(J j8, Object obj, K k8) {
        this.f36106a = j8;
        this.f36107b = obj;
        this.f36108c = k8;
    }

    public static <T> w<T> error(int i8, K k8) {
        B.b(k8, "body == null");
        if (i8 >= 400) {
            return error(k8, new J.a().body(new l.c(k8.contentType(), k8.contentLength())).code(i8).message("Response.error()").protocol(F.HTTP_1_1).request(new H.a().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 400: " + i8);
    }

    public static <T> w<T> success(T t8) {
        return success(t8, new J.a().code(200).message("OK").protocol(F.HTTP_1_1).request(new H.a().url("http://localhost/").build()).build());
    }

    public T body() {
        return (T) this.f36107b;
    }

    public int code() {
        return this.f36106a.code();
    }

    public K errorBody() {
        return this.f36108c;
    }

    public C7.z headers() {
        return this.f36106a.headers();
    }

    public boolean isSuccessful() {
        return this.f36106a.isSuccessful();
    }

    public String message() {
        return this.f36106a.message();
    }

    public J raw() {
        return this.f36106a;
    }

    public String toString() {
        return this.f36106a.toString();
    }

    public static <T> w<T> success(int i8, T t8) {
        if (i8 >= 200 && i8 < 300) {
            return success(t8, new J.a().code(i8).message("Response.success()").protocol(F.HTTP_1_1).request(new H.a().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i8);
    }

    public static <T> w<T> error(K k8, J j8) {
        B.b(k8, "body == null");
        B.b(j8, "rawResponse == null");
        if (!j8.isSuccessful()) {
            return new w<>(j8, null, k8);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> w<T> success(T t8, C7.z zVar) {
        B.b(zVar, "headers == null");
        return success(t8, new J.a().code(200).message("OK").protocol(F.HTTP_1_1).headers(zVar).request(new H.a().url("http://localhost/").build()).build());
    }

    public static <T> w<T> success(T t8, J j8) {
        B.b(j8, "rawResponse == null");
        if (j8.isSuccessful()) {
            return new w<>(j8, t8, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
