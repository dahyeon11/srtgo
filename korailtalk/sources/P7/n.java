package P7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f3795a = Logger.getLogger(n.class.getName());

    final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f3796a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OutputStream f3797b;

        a(x xVar, OutputStream outputStream) {
            this.f3796a = xVar;
            this.f3797b = outputStream;
        }

        @Override // P7.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f3797b.close();
        }

        @Override // P7.v, java.io.Flushable
        public void flush() throws IOException {
            this.f3797b.flush();
        }

        @Override // P7.v
        public x timeout() {
            return this.f3796a;
        }

        public String toString() {
            return "sink(" + this.f3797b + ")";
        }

        @Override // P7.v
        public void write(P7.c cVar, long j8) throws IOException {
            y.checkOffsetAndCount(cVar.f3775b, 0L, j8);
            while (j8 > 0) {
                this.f3796a.throwIfReached();
                s sVar = cVar.f3774a;
                int iMin = (int) Math.min(j8, sVar.f3815c - sVar.f3814b);
                this.f3797b.write(sVar.f3813a, sVar.f3814b, iMin);
                int i8 = sVar.f3814b + iMin;
                sVar.f3814b = i8;
                long j9 = iMin;
                j8 -= j9;
                cVar.f3775b -= j9;
                if (i8 == sVar.f3815c) {
                    cVar.f3774a = sVar.pop();
                    t.a(sVar);
                }
            }
        }
    }

    final class b implements w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f3798a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f3799b;

        b(x xVar, InputStream inputStream) {
            this.f3798a = xVar;
            this.f3799b = inputStream;
        }

        @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f3799b.close();
        }

        @Override // P7.w
        public long read(P7.c cVar, long j8) throws IOException {
            if (j8 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j8);
            }
            if (j8 == 0) {
                return 0L;
            }
            try {
                this.f3798a.throwIfReached();
                s sVarG = cVar.g(1);
                int i8 = this.f3799b.read(sVarG.f3813a, sVarG.f3815c, (int) Math.min(j8, 8192 - sVarG.f3815c));
                if (i8 != -1) {
                    sVarG.f3815c += i8;
                    long j9 = i8;
                    cVar.f3775b += j9;
                    return j9;
                }
                if (sVarG.f3814b != sVarG.f3815c) {
                    return -1L;
                }
                cVar.f3774a = sVarG.pop();
                t.a(sVarG);
                return -1L;
            } catch (AssertionError e8) {
                if (n.a(e8)) {
                    throw new IOException(e8);
                }
                throw e8;
            }
        }

        @Override // P7.w
        public x timeout() {
            return this.f3798a;
        }

        public String toString() {
            return "source(" + this.f3799b + ")";
        }
    }

    final class d extends P7.a {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Socket f3800j;

        d(Socket socket) {
            this.f3800j = socket;
        }

        @Override // P7.a
        protected IOException e(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // P7.a
        protected void h() throws IOException {
            try {
                this.f3800j.close();
            } catch (AssertionError e8) {
                if (!n.a(e8)) {
                    throw e8;
                }
                n.f3795a.log(Level.WARNING, "Failed to close timed out socket " + this.f3800j, (Throwable) e8);
            } catch (Exception e9) {
                n.f3795a.log(Level.WARNING, "Failed to close timed out socket " + this.f3800j, (Throwable) e9);
            }
        }
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static v appendingSink(File file) {
        if (file != null) {
            return sink(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    private static v b(OutputStream outputStream, x xVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (xVar != null) {
            return new a(xVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static v blackhole() {
        return new c();
    }

    public static e buffer(w wVar) {
        return new r(wVar);
    }

    private static w c(InputStream inputStream, x xVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (xVar != null) {
            return new b(xVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    private static P7.a d(Socket socket) {
        return new d(socket);
    }

    public static v sink(OutputStream outputStream) {
        return b(outputStream, new x());
    }

    public static w source(InputStream inputStream) {
        return c(inputStream, new x());
    }

    public static P7.d buffer(v vVar) {
        return new q(vVar);
    }

    public static v sink(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        P7.a aVarD = d(socket);
        return aVarD.sink(b(socket.getOutputStream(), aVarD));
    }

    public static w source(File file) {
        if (file != null) {
            return source(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static w source(Path path, OpenOption... openOptionArr) {
        if (path != null) {
            return source(Files.newInputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static w source(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                P7.a aVarD = d(socket);
                return aVarD.source(c(socket.getInputStream(), aVarD));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static v sink(File file) {
        if (file != null) {
            return sink(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static v sink(Path path, OpenOption... openOptionArr) {
        if (path != null) {
            return sink(Files.newOutputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    final class c implements v {
        c() {
        }

        @Override // P7.v
        public x timeout() {
            return x.NONE;
        }

        @Override // P7.v
        public void write(P7.c cVar, long j8) throws EOFException {
            cVar.skip(j8);
        }

        @Override // P7.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // P7.v, java.io.Flushable
        public void flush() {
        }
    }
}
