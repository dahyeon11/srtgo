package h3;

import e3.w;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Readable f31530a;

    /* renamed from: b, reason: collision with root package name */
    private final Reader f31531b;

    /* renamed from: c, reason: collision with root package name */
    private final CharBuffer f31532c;

    /* renamed from: d, reason: collision with root package name */
    private final char[] f31533d;

    /* renamed from: e, reason: collision with root package name */
    private final Queue f31534e;

    /* renamed from: f, reason: collision with root package name */
    private final p f31535f;

    class a extends p {
        a() {
        }

        @Override // h3.p
        protected void d(String str, String str2) {
            r.this.f31534e.add(str);
        }
    }

    public r(Readable readable) {
        CharBuffer charBufferC = l.c();
        this.f31532c = charBufferC;
        this.f31533d = charBufferC.array();
        this.f31534e = new ArrayDeque();
        this.f31535f = new a();
        this.f31530a = (Readable) w.checkNotNull(readable);
        this.f31531b = readable instanceof Reader ? (Reader) readable : null;
    }

    public String readLine() throws IOException {
        int i8;
        while (true) {
            if (this.f31534e.peek() != null) {
                break;
            }
            o.a(this.f31532c);
            Reader reader = this.f31531b;
            if (reader != null) {
                char[] cArr = this.f31533d;
                i8 = reader.read(cArr, 0, cArr.length);
            } else {
                i8 = this.f31530a.read(this.f31532c);
            }
            if (i8 == -1) {
                this.f31535f.b();
                break;
            }
            this.f31535f.a(this.f31533d, 0, i8);
        }
        return (String) this.f31534e.poll();
    }
}
