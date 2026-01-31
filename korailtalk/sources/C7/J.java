package C7;

import C7.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class J implements Closeable {

    /* renamed from: a */
    final H f550a;

    /* renamed from: b */
    final F f551b;

    /* renamed from: c */
    final int f552c;

    /* renamed from: d */
    final String f553d;

    /* renamed from: e */
    final w f554e;

    /* renamed from: f */
    final z f555f;

    /* renamed from: g */
    final K f556g;

    /* renamed from: h */
    final J f557h;

    /* renamed from: i */
    final J f558i;

    /* renamed from: j */
    final J f559j;

    /* renamed from: k */
    final long f560k;

    /* renamed from: l */
    final long f561l;

    /* renamed from: m */
    final F7.c f562m;

    /* renamed from: n */
    private volatile C0471e f563n;

    J(a aVar) {
        this.f550a = aVar.f564a;
        this.f551b = aVar.f565b;
        this.f552c = aVar.f566c;
        this.f553d = aVar.f567d;
        this.f554e = aVar.f568e;
        this.f555f = aVar.f569f.build();
        this.f556g = aVar.f570g;
        this.f557h = aVar.f571h;
        this.f558i = aVar.f572i;
        this.f559j = aVar.f573j;
        this.f560k = aVar.f574k;
        this.f561l = aVar.f575l;
        this.f562m = aVar.f576m;
    }

    public K body() {
        return this.f556g;
    }

    public C0471e cacheControl() {
        C0471e c0471e = this.f563n;
        if (c0471e != null) {
            return c0471e;
        }
        C0471e c0471e2 = C0471e.parse(this.f555f);
        this.f563n = c0471e2;
        return c0471e2;
    }

    public J cacheResponse() {
        return this.f558i;
    }

    public List<C0475i> challenges() {
        String str;
        int i8 = this.f552c;
        if (i8 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i8 != 407) {
                return Collections.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return G7.e.parseChallenges(headers(), str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        K k8 = this.f556g;
        if (k8 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        k8.close();
    }

    public int code() {
        return this.f552c;
    }

    public w handshake() {
        return this.f554e;
    }

    public String header(String str) {
        return header(str, null);
    }

    public List<String> headers(String str) {
        return this.f555f.values(str);
    }

    public boolean isRedirect() {
        int i8 = this.f552c;
        if (i8 == 307 || i8 == 308) {
            return true;
        }
        switch (i8) {
            case 300:
            case AUTH_IS_VAILD_FAILED_VALUE:
            case AUTH_INVALID_AUTH_TOKEN_VALUE:
            case AUTH_FAILED_VALUE:
                return true;
            default:
                return false;
        }
    }

    public boolean isSuccessful() {
        int i8 = this.f552c;
        return i8 >= 200 && i8 < 300;
    }

    public String message() {
        return this.f553d;
    }

    public J networkResponse() {
        return this.f557h;
    }

    public a newBuilder() {
        return new a(this);
    }

    public K peekBody(long j8) throws EOFException {
        P7.e eVarPeek = this.f556g.source().peek();
        P7.c cVar = new P7.c();
        eVarPeek.request(j8);
        cVar.write(eVarPeek, Math.min(j8, eVarPeek.getBuffer().size()));
        return K.create(this.f556g.contentType(), cVar.size(), cVar);
    }

    public J priorResponse() {
        return this.f559j;
    }

    public F protocol() {
        return this.f551b;
    }

    public long receivedResponseAtMillis() {
        return this.f561l;
    }

    public H request() {
        return this.f550a;
    }

    public long sentRequestAtMillis() {
        return this.f560k;
    }

    public String toString() {
        return "Response{protocol=" + this.f551b + ", code=" + this.f552c + ", message=" + this.f553d + ", url=" + this.f550a.url() + '}';
    }

    public z trailers() {
        F7.c cVar = this.f562m;
        if (cVar != null) {
            return cVar.trailers();
        }
        throw new IllegalStateException("trailers not available");
    }

    public String header(String str, String str2) {
        String str3 = this.f555f.get(str);
        return str3 != null ? str3 : str2;
    }

    public z headers() {
        return this.f555f;
    }

    public static class a {

        /* renamed from: a */
        H f564a;

        /* renamed from: b */
        F f565b;

        /* renamed from: c */
        int f566c;

        /* renamed from: d */
        String f567d;

        /* renamed from: e */
        w f568e;

        /* renamed from: f */
        z.a f569f;

        /* renamed from: g */
        K f570g;

        /* renamed from: h */
        J f571h;

        /* renamed from: i */
        J f572i;

        /* renamed from: j */
        J f573j;

        /* renamed from: k */
        long f574k;

        /* renamed from: l */
        long f575l;

        /* renamed from: m */
        F7.c f576m;

        public a() {
            this.f566c = -1;
            this.f569f = new z.a();
        }

        private void a(J j8) {
            if (j8.f556g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void b(String str, J j8) {
            if (j8.f556g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (j8.f557h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (j8.f558i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (j8.f559j == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        public a addHeader(String str, String str2) {
            this.f569f.add(str, str2);
            return this;
        }

        public a body(K k8) {
            this.f570g = k8;
            return this;
        }

        public J build() {
            if (this.f564a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f565b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f566c >= 0) {
                if (this.f567d != null) {
                    return new J(this);
                }
                throw new IllegalStateException("message == null");
            }
            throw new IllegalStateException("code < 0: " + this.f566c);
        }

        void c(F7.c cVar) {
            this.f576m = cVar;
        }

        public a cacheResponse(J j8) {
            if (j8 != null) {
                b("cacheResponse", j8);
            }
            this.f572i = j8;
            return this;
        }

        public a code(int i8) {
            this.f566c = i8;
            return this;
        }

        public a handshake(w wVar) {
            this.f568e = wVar;
            return this;
        }

        public a header(String str, String str2) {
            this.f569f.set(str, str2);
            return this;
        }

        public a headers(z zVar) {
            this.f569f = zVar.newBuilder();
            return this;
        }

        public a message(String str) {
            this.f567d = str;
            return this;
        }

        public a networkResponse(J j8) {
            if (j8 != null) {
                b("networkResponse", j8);
            }
            this.f571h = j8;
            return this;
        }

        public a priorResponse(J j8) {
            if (j8 != null) {
                a(j8);
            }
            this.f573j = j8;
            return this;
        }

        public a protocol(F f8) {
            this.f565b = f8;
            return this;
        }

        public a receivedResponseAtMillis(long j8) {
            this.f575l = j8;
            return this;
        }

        public a removeHeader(String str) {
            this.f569f.removeAll(str);
            return this;
        }

        public a request(H h8) {
            this.f564a = h8;
            return this;
        }

        public a sentRequestAtMillis(long j8) {
            this.f574k = j8;
            return this;
        }

        a(J j8) {
            this.f566c = -1;
            this.f564a = j8.f550a;
            this.f565b = j8.f551b;
            this.f566c = j8.f552c;
            this.f567d = j8.f553d;
            this.f568e = j8.f554e;
            this.f569f = j8.f555f.newBuilder();
            this.f570g = j8.f556g;
            this.f571h = j8.f557h;
            this.f572i = j8.f558i;
            this.f573j = j8.f559j;
            this.f574k = j8.f560k;
            this.f575l = j8.f561l;
            this.f576m = j8.f562m;
        }
    }
}
