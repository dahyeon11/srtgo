package g3;

import e3.w;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5553b {

    /* renamed from: g3.b$a */
    private enum a implements InterfaceC5552a {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }

        @Override // g3.InterfaceC5552a
        public void funnel(byte[] bArr, g3.f fVar) {
            fVar.a(bArr);
        }
    }

    /* renamed from: g3.b$b, reason: collision with other inner class name */
    private enum EnumC0304b implements InterfaceC5552a {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }

        @Override // g3.InterfaceC5552a
        public void funnel(Integer num, g3.f fVar) {
            fVar.c(num.intValue());
        }
    }

    /* renamed from: g3.b$c */
    private enum c implements InterfaceC5552a {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }

        @Override // g3.InterfaceC5552a
        public void funnel(Long l8, g3.f fVar) {
            fVar.e(l8.longValue());
        }
    }

    /* renamed from: g3.b$d */
    private static class d implements InterfaceC5552a, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5552a f31320a;

        d(InterfaceC5552a interfaceC5552a) {
            this.f31320a = (InterfaceC5552a) w.checkNotNull(interfaceC5552a);
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f31320a.equals(((d) obj).f31320a);
            }
            return false;
        }

        public int hashCode() {
            return d.class.hashCode() ^ this.f31320a.hashCode();
        }

        public String toString() {
            return "Funnels.sequentialFunnel(" + this.f31320a + ")";
        }

        @Override // g3.InterfaceC5552a
        public void funnel(Iterable<Object> iterable, g3.f fVar) {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                this.f31320a.funnel(it.next(), fVar);
            }
        }
    }

    /* renamed from: g3.b$e */
    private static class e extends OutputStream {
        e(g3.f fVar) {
            android.support.v4.media.session.f.a(w.checkNotNull(fVar));
        }

        public String toString() {
            return "Funnels.asOutputStream(" + ((Object) null) + ")";
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            throw null;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) {
            throw null;
        }
    }

    /* renamed from: g3.b$f */
    private static class f implements InterfaceC5552a, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Charset f31321a;

        f(Charset charset) {
            this.f31321a = (Charset) w.checkNotNull(charset);
        }

        public boolean equals(Object obj) {
            if (obj instanceof f) {
                return this.f31321a.equals(((f) obj).f31321a);
            }
            return false;
        }

        public int hashCode() {
            return f.class.hashCode() ^ this.f31321a.hashCode();
        }

        public String toString() {
            return "Funnels.stringFunnel(" + this.f31321a.name() + ")";
        }

        @Override // g3.InterfaceC5552a
        public void funnel(CharSequence charSequence, g3.f fVar) {
            fVar.d(charSequence, this.f31321a);
        }
    }

    /* renamed from: g3.b$g */
    private enum g implements InterfaceC5552a {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }

        @Override // g3.InterfaceC5552a
        public void funnel(CharSequence charSequence, g3.f fVar) {
            fVar.b(charSequence);
        }
    }

    public static OutputStream asOutputStream(g3.f fVar) {
        return new e(fVar);
    }

    public static InterfaceC5552a byteArrayFunnel() {
        return a.INSTANCE;
    }

    public static InterfaceC5552a integerFunnel() {
        return EnumC0304b.INSTANCE;
    }

    public static InterfaceC5552a longFunnel() {
        return c.INSTANCE;
    }

    public static <E> InterfaceC5552a sequentialFunnel(InterfaceC5552a interfaceC5552a) {
        return new d(interfaceC5552a);
    }

    public static InterfaceC5552a stringFunnel(Charset charset) {
        return new f(charset);
    }

    public static InterfaceC5552a unencodedCharsFunnel() {
        return g.INSTANCE;
    }
}
