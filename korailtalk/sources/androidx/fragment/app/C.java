package androidx.fragment.app;

import java.io.Writer;

/* loaded from: classes.dex */
final class C extends Writer {

    /* renamed from: a, reason: collision with root package name */
    private final String f9432a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f9433b = new StringBuilder(128);

    C(String str) {
        this.f9432a = str;
    }

    private void a() {
        if (this.f9433b.length() > 0) {
            this.f9433b.toString();
            StringBuilder sb = this.f9433b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            char c9 = cArr[i8 + i10];
            if (c9 == '\n') {
                a();
            } else {
                this.f9433b.append(c9);
            }
        }
    }
}
