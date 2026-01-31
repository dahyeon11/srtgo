package h3;

import e3.w;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5609a extends Writer {

    /* renamed from: a, reason: collision with root package name */
    private final Appendable f31443a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31444b;

    C5609a(Appendable appendable) {
        this.f31443a = (Appendable) w.checkNotNull(appendable);
    }

    private void a() throws IOException {
        if (this.f31444b) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31444b = true;
        Appendable appendable = this.f31443a;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        a();
        Appendable appendable = this.f31443a;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i8, int i9) throws IOException {
        a();
        this.f31443a.append(new String(cArr, i8, i9));
    }

    @Override // java.io.Writer
    public void write(int i8) throws IOException {
        a();
        this.f31443a.append((char) i8);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c9) throws IOException {
        a();
        this.f31443a.append(c9);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        w.checkNotNull(str);
        a();
        this.f31443a.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        a();
        this.f31443a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i8, int i9) throws IOException {
        a();
        this.f31443a.append(charSequence, i8, i9);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i8, int i9) throws IOException {
        w.checkNotNull(str);
        a();
        this.f31443a.append(str, i8, i9 + i8);
    }
}
