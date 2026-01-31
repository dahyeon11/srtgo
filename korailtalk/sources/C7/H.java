package C7;

import C7.z;
import io.grpc.internal.U;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    final A f531a;

    /* renamed from: b, reason: collision with root package name */
    final String f532b;

    /* renamed from: c, reason: collision with root package name */
    final z f533c;

    /* renamed from: d, reason: collision with root package name */
    final I f534d;

    /* renamed from: e, reason: collision with root package name */
    final Map f535e;

    /* renamed from: f, reason: collision with root package name */
    private volatile C0471e f536f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        A f537a;

        /* renamed from: b, reason: collision with root package name */
        String f538b;

        /* renamed from: c, reason: collision with root package name */
        z.a f539c;

        /* renamed from: d, reason: collision with root package name */
        I f540d;

        /* renamed from: e, reason: collision with root package name */
        Map f541e;

        public a() {
            this.f541e = Collections.emptyMap();
            this.f538b = "GET";
            this.f539c = new z.a();
        }

        public a addHeader(String str, String str2) {
            this.f539c.add(str, str2);
            return this;
        }

        public H build() {
            if (this.f537a != null) {
                return new H(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a cacheControl(C0471e c0471e) {
            String string = c0471e.toString();
            return string.isEmpty() ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public a delete(I i8) {
            return method("DELETE", i8);
        }

        public a get() {
            return method("GET", null);
        }

        public a head() {
            return method("HEAD", null);
        }

        public a header(String str, String str2) {
            this.f539c.set(str, str2);
            return this;
        }

        public a headers(z zVar) {
            this.f539c = zVar.newBuilder();
            return this;
        }

        public a method(String str, I i8) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (i8 != null && !G7.f.permitsRequestBody(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (i8 != null || !G7.f.requiresRequestBody(str)) {
                this.f538b = str;
                this.f540d = i8;
                return this;
            }
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        }

        public a patch(I i8) {
            return method("PATCH", i8);
        }

        public a post(I i8) {
            return method(U.HTTP_METHOD, i8);
        }

        public a put(I i8) {
            return method("PUT", i8);
        }

        public a removeHeader(String str) {
            this.f539c.removeAll(str);
            return this;
        }

        public a tag(Object obj) {
            return tag(Object.class, obj);
        }

        public a url(A a9) {
            if (a9 == null) {
                throw new NullPointerException("url == null");
            }
            this.f537a = a9;
            return this;
        }

        public a delete() {
            return delete(D7.e.EMPTY_REQUEST);
        }

        public <T> a tag(Class<? super T> cls, T t8) {
            if (cls == null) {
                throw new NullPointerException("type == null");
            }
            if (t8 == null) {
                this.f541e.remove(cls);
            } else {
                if (this.f541e.isEmpty()) {
                    this.f541e = new LinkedHashMap();
                }
                this.f541e.put(cls, cls.cast(t8));
            }
            return this;
        }

        public a url(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str = "https:" + str.substring(4);
                }
                return url(A.get(str));
            }
            throw new NullPointerException("url == null");
        }

        a(H h8) {
            Map linkedHashMap;
            this.f541e = Collections.emptyMap();
            this.f537a = h8.f531a;
            this.f538b = h8.f532b;
            this.f540d = h8.f534d;
            if (h8.f535e.isEmpty()) {
                linkedHashMap = Collections.emptyMap();
            } else {
                linkedHashMap = new LinkedHashMap(h8.f535e);
            }
            this.f541e = linkedHashMap;
            this.f539c = h8.f533c.newBuilder();
        }

        public a url(URL url) {
            if (url != null) {
                return url(A.get(url.toString()));
            }
            throw new NullPointerException("url == null");
        }
    }

    H(a aVar) {
        this.f531a = aVar.f537a;
        this.f532b = aVar.f538b;
        this.f533c = aVar.f539c.build();
        this.f534d = aVar.f540d;
        this.f535e = D7.e.immutableMap(aVar.f541e);
    }

    public I body() {
        return this.f534d;
    }

    public C0471e cacheControl() {
        C0471e c0471e = this.f536f;
        if (c0471e != null) {
            return c0471e;
        }
        C0471e c0471e2 = C0471e.parse(this.f533c);
        this.f536f = c0471e2;
        return c0471e2;
    }

    public String header(String str) {
        return this.f533c.get(str);
    }

    public z headers() {
        return this.f533c;
    }

    public boolean isHttps() {
        return this.f531a.isHttps();
    }

    public String method() {
        return this.f532b;
    }

    public a newBuilder() {
        return new a(this);
    }

    public Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        return "Request{method=" + this.f532b + ", url=" + this.f531a + ", tags=" + this.f535e + '}';
    }

    public A url() {
        return this.f531a;
    }

    public List<String> headers(String str) {
        return this.f533c.values(str);
    }

    public <T> T tag(Class<? extends T> cls) {
        return cls.cast(this.f535e.get(cls));
    }
}
