package C7;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public abstract class I {

    class a extends I {

        /* renamed from: a */
        final /* synthetic */ C f542a;

        /* renamed from: b */
        final /* synthetic */ P7.f f543b;

        a(C c9, P7.f fVar) {
            this.f542a = c9;
            this.f543b = fVar;
        }

        @Override // C7.I
        public long contentLength() {
            return this.f543b.size();
        }

        @Override // C7.I
        public C contentType() {
            return this.f542a;
        }

        @Override // C7.I
        public void writeTo(P7.d dVar) {
            dVar.write(this.f543b);
        }
    }

    class b extends I {

        /* renamed from: a */
        final /* synthetic */ C f544a;

        /* renamed from: b */
        final /* synthetic */ int f545b;

        /* renamed from: c */
        final /* synthetic */ byte[] f546c;

        /* renamed from: d */
        final /* synthetic */ int f547d;

        b(C c9, int i8, byte[] bArr, int i9) {
            this.f544a = c9;
            this.f545b = i8;
            this.f546c = bArr;
            this.f547d = i9;
        }

        @Override // C7.I
        public long contentLength() {
            return this.f545b;
        }

        @Override // C7.I
        public C contentType() {
            return this.f544a;
        }

        @Override // C7.I
        public void writeTo(P7.d dVar) {
            dVar.write(this.f546c, this.f547d, this.f545b);
        }
    }

    class c extends I {

        /* renamed from: a */
        final /* synthetic */ C f548a;

        /* renamed from: b */
        final /* synthetic */ File f549b;

        c(C c9, File file) {
            this.f548a = c9;
            this.f549b = file;
        }

        @Override // C7.I
        public long contentLength() {
            return this.f549b.length();
        }

        @Override // C7.I
        public C contentType() {
            return this.f548a;
        }

        @Override // C7.I
        public void writeTo(P7.d dVar) {
            P7.w wVarSource = P7.n.source(this.f549b);
            try {
                dVar.writeAll(wVarSource);
                if (wVarSource != null) {
                    wVarSource.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (wVarSource != null) {
                        try {
                            wVarSource.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }
    }

    public static I create(C c9, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (c9 != null) {
            Charset charset2 = c9.charset();
            if (charset2 == null) {
                c9 = C.parse(c9 + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        return create(c9, str.getBytes(charset));
    }

    public long contentLength() {
        return -1L;
    }

    public abstract C contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(P7.d dVar);

    public static I create(C c9, P7.f fVar) {
        return new a(c9, fVar);
    }

    public static I create(C c9, byte[] bArr) {
        return create(c9, bArr, 0, bArr.length);
    }

    public static I create(C c9, byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            D7.e.checkOffsetAndCount(bArr.length, i8, i9);
            return new b(c9, i9, bArr, i8);
        }
        throw new NullPointerException("content == null");
    }

    public static I create(C c9, File file) {
        if (file != null) {
            return new c(c9, file);
        }
        throw new NullPointerException("file == null");
    }
}
