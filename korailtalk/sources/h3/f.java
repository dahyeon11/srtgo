package h3;

import e3.w;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class f {

    private final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        private final Charset f31491a;

        @Override // h3.j
        public Writer openStream() {
            return new OutputStreamWriter(f.this.openStream(), this.f31491a);
        }

        public String toString() {
            return f.this.toString() + ".asCharSink(" + this.f31491a + ")";
        }

        private b(Charset charset) {
            this.f31491a = (Charset) w.checkNotNull(charset);
        }
    }

    protected f() {
    }

    public j asCharSink(Charset charset) {
        return new b(charset);
    }

    public OutputStream openBufferedStream() {
        OutputStream outputStreamOpenStream = openStream();
        return outputStreamOpenStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStreamOpenStream : new BufferedOutputStream(outputStreamOpenStream);
    }

    public abstract OutputStream openStream();

    public void write(byte[] bArr) {
        w.checkNotNull(bArr);
        try {
            OutputStream outputStream = (OutputStream) n.create().register(openStream());
            outputStream.write(bArr);
            outputStream.flush();
        } finally {
        }
    }

    public long writeFrom(InputStream inputStream) {
        w.checkNotNull(inputStream);
        try {
            OutputStream outputStream = (OutputStream) n.create().register(openStream());
            long jCopy = h.copy(inputStream, outputStream);
            outputStream.flush();
            return jCopy;
        } finally {
        }
    }
}
