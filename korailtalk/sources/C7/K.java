package C7;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public abstract class K implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private Reader f577a;

    class a extends K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f578b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f579c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ P7.e f580d;

        a(C c9, long j8, P7.e eVar) {
            this.f578b = c9;
            this.f579c = j8;
            this.f580d = eVar;
        }

        @Override // C7.K
        public long contentLength() {
            return this.f579c;
        }

        @Override // C7.K
        public C contentType() {
            return this.f578b;
        }

        @Override // C7.K
        public P7.e source() {
            return this.f580d;
        }
    }

    static final class b extends Reader {

        /* renamed from: a, reason: collision with root package name */
        private final P7.e f581a;

        /* renamed from: b, reason: collision with root package name */
        private final Charset f582b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f583c;

        /* renamed from: d, reason: collision with root package name */
        private Reader f584d;

        b(P7.e eVar, Charset charset) {
            this.f581a = eVar;
            this.f582b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f583c = true;
            Reader reader = this.f584d;
            if (reader != null) {
                reader.close();
            } else {
                this.f581a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i8, int i9) throws IOException {
            if (this.f583c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f584d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f581a.inputStream(), D7.e.bomAwareCharset(this.f581a, this.f582b));
                this.f584d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i8, i9);
        }
    }

    private static /* synthetic */ void a(Throwable th, AutoCloseable autoCloseable) throws Exception {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    private Charset b() {
        C cContentType = contentType();
        return cContentType != null ? cContentType.charset(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    public static K create(C c9, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (c9 != null) {
            Charset charset2 = c9.charset();
            if (charset2 == null) {
                c9 = C.parse(c9 + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        P7.c cVarWriteString = new P7.c().writeString(str, charset);
        return create(c9, cVarWriteString.size(), cVarWriteString);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final byte[] bytes() throws Exception {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        P7.e eVarSource = source();
        try {
            byte[] byteArray = eVarSource.readByteArray();
            a(null, eVarSource);
            if (jContentLength == -1 || jContentLength == byteArray.length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + byteArray.length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.f577a;
        if (reader != null) {
            return reader;
        }
        b bVar = new b(source(), b());
        this.f577a = bVar;
        return bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        D7.e.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract C contentType();

    public abstract P7.e source();

    public final String string() throws Exception {
        P7.e eVarSource = source();
        try {
            String string = eVarSource.readString(D7.e.bomAwareCharset(eVarSource, b()));
            a(null, eVarSource);
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (eVarSource != null) {
                    a(th, eVarSource);
                }
                throw th2;
            }
        }
    }

    public static K create(C c9, byte[] bArr) {
        return create(c9, bArr.length, new P7.c().write(bArr));
    }

    public static K create(C c9, P7.f fVar) {
        return create(c9, fVar.size(), new P7.c().write(fVar));
    }

    public static K create(C c9, long j8, P7.e eVar) {
        if (eVar != null) {
            return new a(c9, j8, eVar);
        }
        throw new NullPointerException("source == null");
    }
}
