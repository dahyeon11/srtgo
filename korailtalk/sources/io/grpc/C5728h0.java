package io.grpc;

import e3.AbstractC5364f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5728h0 {
    public static final String BINARY_HEADER_SUFFIX = "-bin";

    /* renamed from: a, reason: collision with root package name */
    private Object[] f32131a;

    /* renamed from: b, reason: collision with root package name */
    private int f32132b;

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f32129c = Logger.getLogger(C5728h0.class.getName());
    public static final f BINARY_BYTE_MARSHALLER = new a();
    public static final d ASCII_STRING_MARSHALLER = new b();

    /* renamed from: d, reason: collision with root package name */
    static final h3.b f32130d = h3.b.base64().omitPadding();

    /* renamed from: io.grpc.h0$a */
    class a implements f {
        a() {
        }

        @Override // io.grpc.C5728h0.f
        public byte[] parseBytes(byte[] bArr) {
            return bArr;
        }

        @Override // io.grpc.C5728h0.f
        public byte[] toBytes(byte[] bArr) {
            return bArr;
        }
    }

    /* renamed from: io.grpc.h0$b */
    class b implements d {
        b() {
        }

        @Override // io.grpc.C5728h0.d
        public String parseAsciiString(String str) {
            return str;
        }

        @Override // io.grpc.C5728h0.d
        public String toAsciiString(String str) {
            return str;
        }
    }

    /* renamed from: io.grpc.h0$c */
    private static class c extends i {

        /* renamed from: f, reason: collision with root package name */
        private final d f32133f;

        /* synthetic */ c(String str, boolean z8, d dVar, a aVar) {
            this(str, z8, dVar);
        }

        @Override // io.grpc.C5728h0.i
        Object f(byte[] bArr) {
            return this.f32133f.parseAsciiString(new String(bArr, AbstractC5364f.US_ASCII));
        }

        @Override // io.grpc.C5728h0.i
        byte[] h(Object obj) {
            return ((String) e3.w.checkNotNull(this.f32133f.toAsciiString(obj), "null marshaller.toAsciiString()")).getBytes(AbstractC5364f.US_ASCII);
        }

        private c(String str, boolean z8, d dVar) {
            super(str, z8, dVar, null);
            e3.w.checkArgument(!str.endsWith(C5728h0.BINARY_HEADER_SUFFIX), "ASCII header is named %s.  Only binary headers may end with %s", str, C5728h0.BINARY_HEADER_SUFFIX);
            this.f32133f = (d) e3.w.checkNotNull(dVar, "marshaller");
        }
    }

    /* renamed from: io.grpc.h0$d */
    public interface d {
        Object parseAsciiString(String str);

        String toAsciiString(Object obj);
    }

    /* renamed from: io.grpc.h0$e */
    private static class e extends i {

        /* renamed from: f, reason: collision with root package name */
        private final f f32134f;

        /* synthetic */ e(String str, f fVar, a aVar) {
            this(str, fVar);
        }

        @Override // io.grpc.C5728h0.i
        Object f(byte[] bArr) {
            return this.f32134f.parseBytes(bArr);
        }

        @Override // io.grpc.C5728h0.i
        byte[] h(Object obj) {
            return (byte[]) e3.w.checkNotNull(this.f32134f.toBytes(obj), "null marshaller.toBytes()");
        }

        private e(String str, f fVar) {
            super(str, false, fVar, null);
            e3.w.checkArgument(str.endsWith(C5728h0.BINARY_HEADER_SUFFIX), "Binary header is named %s. It must end with %s", str, C5728h0.BINARY_HEADER_SUFFIX);
            e3.w.checkArgument(str.length() > 4, "empty key name");
            this.f32134f = (f) e3.w.checkNotNull(fVar, "marshaller is null");
        }
    }

    /* renamed from: io.grpc.h0$f */
    public interface f {
        Object parseBytes(byte[] bArr);

        byte[] toBytes(Object obj);
    }

    /* renamed from: io.grpc.h0$g */
    public interface g {
    }

    /* renamed from: io.grpc.h0$h */
    private final class h implements Iterable {

        /* renamed from: a, reason: collision with root package name */
        private final i f32135a;

        /* renamed from: b, reason: collision with root package name */
        private int f32136b;

        /* renamed from: io.grpc.h0$h$a */
        class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            private boolean f32138a = true;

            /* renamed from: b, reason: collision with root package name */
            private int f32139b;

            a() {
                this.f32139b = h.this.f32136b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f32138a) {
                    return true;
                }
                while (this.f32139b < C5728h0.this.f32132b) {
                    h hVar = h.this;
                    if (C5728h0.this.g(hVar.f32135a.a(), C5728h0.this.o(this.f32139b))) {
                        this.f32138a = true;
                        return true;
                    }
                    this.f32139b++;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f32138a = false;
                h hVar = h.this;
                C5728h0 c5728h0 = C5728h0.this;
                int i8 = this.f32139b;
                this.f32139b = i8 + 1;
                return c5728h0.x(i8, hVar.f32135a);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* synthetic */ h(C5728h0 c5728h0, i iVar, int i8, a aVar) {
            this(iVar, i8);
        }

        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            return new a();
        }

        private h(i iVar, int i8) {
            this.f32135a = iVar;
            this.f32136b = i8;
        }
    }

    /* renamed from: io.grpc.h0$i */
    public static abstract class i {

        /* renamed from: e, reason: collision with root package name */
        private static final BitSet f32141e = b();

        /* renamed from: a, reason: collision with root package name */
        private final String f32142a;

        /* renamed from: b, reason: collision with root package name */
        private final String f32143b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f32144c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f32145d;

        /* synthetic */ i(String str, boolean z8, Object obj, a aVar) {
            this(str, z8, obj);
        }

        private static BitSet b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c9 = '0'; c9 <= '9'; c9 = (char) (c9 + 1)) {
                bitSet.set(c9);
            }
            for (char c10 = 'a'; c10 <= 'z'; c10 = (char) (c10 + 1)) {
                bitSet.set(c10);
            }
            return bitSet;
        }

        static i d(String str, boolean z8, d dVar) {
            return new c(str, z8, dVar, null);
        }

        static i e(String str, boolean z8, m mVar) {
            return new l(str, z8, mVar, null);
        }

        private static String i(String str, boolean z8) {
            e3.w.checkNotNull(str, "name");
            e3.w.checkArgument(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                C5728h0.f32129c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i8 = 0; i8 < str.length(); i8++) {
                char cCharAt = str.charAt(i8);
                if (!z8 || cCharAt != ':' || i8 != 0) {
                    e3.w.checkArgument(f32141e.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, (Object) str);
                }
            }
            return str;
        }

        public static <T> i of(String str, f fVar) {
            return new e(str, fVar, null);
        }

        byte[] a() {
            return this.f32144c;
        }

        final Object c(Class cls) {
            if (cls.isInstance(this.f32145d)) {
                return cls.cast(this.f32145d);
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f32143b.equals(((i) obj).f32143b);
        }

        abstract Object f(byte[] bArr);

        boolean g() {
            return false;
        }

        abstract byte[] h(Object obj);

        public final int hashCode() {
            return this.f32143b.hashCode();
        }

        public final String name() {
            return this.f32143b;
        }

        public final String originalName() {
            return this.f32142a;
        }

        public String toString() {
            return "Key{name='" + this.f32143b + "'}";
        }

        private i(String str, boolean z8, Object obj) {
            String str2 = (String) e3.w.checkNotNull(str, "name");
            this.f32142a = str2;
            String strI = i(str2.toLowerCase(Locale.ROOT), z8);
            this.f32143b = strI;
            this.f32144c = strI.getBytes(AbstractC5364f.US_ASCII);
            this.f32145d = obj;
        }

        public static <T> i of(String str, g gVar) {
            return new j(str, gVar, null);
        }

        public static <T> i of(String str, d dVar) {
            return d(str, false, dVar);
        }
    }

    /* renamed from: io.grpc.h0$j */
    private static class j extends i {
        /* synthetic */ j(String str, g gVar, a aVar) {
            this(str, gVar);
        }

        @Override // io.grpc.C5728h0.i
        Object f(byte[] bArr) {
            new ByteArrayInputStream(bArr);
            throw null;
        }

        @Override // io.grpc.C5728h0.i
        boolean g() {
            return true;
        }

        @Override // io.grpc.C5728h0.i
        byte[] h(Object obj) {
            throw null;
        }

        private j(String str, g gVar) {
            super(str, false, gVar, null);
            e3.w.checkArgument(str.endsWith(C5728h0.BINARY_HEADER_SUFFIX), "Binary header is named %s. It must end with %s", str, C5728h0.BINARY_HEADER_SUFFIX);
            e3.w.checkArgument(str.length() > 4, "empty key name");
            android.support.v4.media.session.f.a(e3.w.checkNotNull(gVar, "marshaller is null"));
        }
    }

    /* renamed from: io.grpc.h0$k */
    static final class k {

        /* renamed from: a, reason: collision with root package name */
        private final Object f32146a;

        /* renamed from: b, reason: collision with root package name */
        private volatile byte[] f32147b;

        k(g gVar, Object obj) {
            this.f32146a = obj;
        }

        static k a(i iVar, Object obj) {
            b(iVar);
            android.support.v4.media.session.f.a(e3.w.checkNotNull(null));
            return new k(null, obj);
        }

        private static g b(i iVar) {
            android.support.v4.media.session.f.a(iVar.c(g.class));
            return null;
        }

        byte[] c() {
            if (this.f32147b == null) {
                synchronized (this) {
                    try {
                        if (this.f32147b == null) {
                            this.f32147b = C5728h0.r(e());
                        }
                    } finally {
                    }
                }
            }
            return this.f32147b;
        }

        Object d(i iVar) {
            if (iVar.g()) {
                b(iVar);
            }
            return iVar.f(c());
        }

        InputStream e() {
            throw null;
        }
    }

    /* renamed from: io.grpc.h0$l */
    private static final class l extends i {

        /* renamed from: f, reason: collision with root package name */
        private final m f32148f;

        /* synthetic */ l(String str, boolean z8, m mVar, a aVar) {
            this(str, z8, mVar);
        }

        @Override // io.grpc.C5728h0.i
        Object f(byte[] bArr) {
            return this.f32148f.parseAsciiString(bArr);
        }

        @Override // io.grpc.C5728h0.i
        byte[] h(Object obj) {
            return (byte[]) e3.w.checkNotNull(this.f32148f.toAsciiString(obj), "null marshaller.toAsciiString()");
        }

        private l(String str, boolean z8, m mVar) {
            super(str, z8, mVar, null);
            e3.w.checkArgument(!str.endsWith(C5728h0.BINARY_HEADER_SUFFIX), "ASCII header is named %s.  Only binary headers may end with %s", str, C5728h0.BINARY_HEADER_SUFFIX);
            this.f32148f = (m) e3.w.checkNotNull(mVar, "marshaller");
        }
    }

    /* renamed from: io.grpc.h0$m */
    interface m {
        Object parseAsciiString(byte[] bArr);

        byte[] toAsciiString(Object obj);
    }

    C5728h0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private int h() {
        Object[] objArr = this.f32131a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private void i(int i8) {
        Object[] objArr = new Object[i8];
        if (!k()) {
            System.arraycopy(this.f32131a, 0, objArr, 0, l());
        }
        this.f32131a = objArr;
    }

    private boolean k() {
        return this.f32132b == 0;
    }

    private int l() {
        return this.f32132b * 2;
    }

    private void m() {
        if (l() == 0 || l() == h()) {
            i(Math.max(l() * 2, 8));
        }
    }

    private void n(int i8, byte[] bArr) {
        this.f32131a[i8 * 2] = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] o(int i8) {
        return (byte[]) this.f32131a[i8 * 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] r(InputStream inputStream) {
        try {
            return h3.h.toByteArray(inputStream);
        } catch (IOException e8) {
            throw new RuntimeException("failure reading serialized stream", e8);
        }
    }

    private Object s(int i8) {
        return this.f32131a[(i8 * 2) + 1];
    }

    private void t(int i8, Object obj) {
        if (this.f32131a instanceof byte[][]) {
            i(h());
        }
        this.f32131a[(i8 * 2) + 1] = obj;
    }

    private void u(int i8, byte[] bArr) {
        this.f32131a[(i8 * 2) + 1] = bArr;
    }

    private byte[] v(int i8) {
        Object objS = s(i8);
        return objS instanceof byte[] ? (byte[]) objS : ((k) objS).c();
    }

    private Object w(int i8) {
        Object objS = s(i8);
        return objS instanceof byte[] ? objS : ((k) objS).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object x(int i8, i iVar) {
        Object objS = s(i8);
        return objS instanceof byte[] ? iVar.f((byte[]) objS) : ((k) objS).d(iVar);
    }

    public boolean containsKey(i iVar) {
        for (int i8 = 0; i8 < this.f32132b; i8++) {
            if (g(iVar.a(), o(i8))) {
                return true;
            }
        }
        return false;
    }

    public <T> void discardAll(i iVar) {
        if (k()) {
            return;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f32132b; i9++) {
            if (!g(iVar.a(), o(i9))) {
                n(i8, o(i9));
                t(i8, s(i9));
                i8++;
            }
        }
        Arrays.fill(this.f32131a, i8 * 2, l(), (Object) null);
        this.f32132b = i8;
    }

    public <T> T get(i iVar) {
        for (int i8 = this.f32132b - 1; i8 >= 0; i8--) {
            if (g(iVar.a(), o(i8))) {
                return (T) x(i8, iVar);
            }
        }
        return null;
    }

    public <T> Iterable<T> getAll(i iVar) {
        int i8 = 0;
        while (true) {
            a aVar = null;
            if (i8 >= this.f32132b) {
                return null;
            }
            if (g(iVar.a(), o(i8))) {
                return new h(this, iVar, i8, aVar);
            }
            i8++;
        }
    }

    int j() {
        return this.f32132b;
    }

    public Set<String> keys() {
        if (k()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f32132b);
        for (int i8 = 0; i8 < this.f32132b; i8++) {
            hashSet.add(new String(o(i8), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void merge(C5728h0 c5728h0) {
        if (c5728h0.k()) {
            return;
        }
        int iH = h() - l();
        if (k() || iH < c5728h0.l()) {
            i(l() + c5728h0.l());
        }
        System.arraycopy(c5728h0.f32131a, 0, this.f32131a, l(), c5728h0.l());
        this.f32132b += c5728h0.f32132b;
    }

    byte[][] p() {
        byte[][] bArr = new byte[l()][];
        Object[] objArr = this.f32131a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, l());
        } else {
            for (int i8 = 0; i8 < this.f32132b; i8++) {
                int i9 = i8 * 2;
                bArr[i9] = o(i8);
                bArr[i9 + 1] = v(i8);
            }
        }
        return bArr;
    }

    public <T> void put(i iVar, T t8) {
        e3.w.checkNotNull(iVar, "key");
        e3.w.checkNotNull(t8, "value");
        m();
        n(this.f32132b, iVar.a());
        if (iVar.g()) {
            t(this.f32132b, k.a(iVar, t8));
        } else {
            u(this.f32132b, iVar.h(t8));
        }
        this.f32132b++;
    }

    Object[] q() {
        Object[] objArr = new Object[l()];
        for (int i8 = 0; i8 < this.f32132b; i8++) {
            int i9 = i8 * 2;
            objArr[i9] = o(i8);
            objArr[i9 + 1] = w(i8);
        }
        return objArr;
    }

    public <T> boolean remove(i iVar, T t8) {
        e3.w.checkNotNull(iVar, "key");
        e3.w.checkNotNull(t8, "value");
        for (int i8 = 0; i8 < this.f32132b; i8++) {
            if (g(iVar.a(), o(i8)) && t8.equals(x(i8, iVar))) {
                int i9 = i8 * 2;
                int i10 = (i8 + 1) * 2;
                int iL = l() - i10;
                Object[] objArr = this.f32131a;
                System.arraycopy(objArr, i10, objArr, i9, iL);
                int i11 = this.f32132b - 1;
                this.f32132b = i11;
                n(i11, null);
                u(this.f32132b, null);
                return true;
            }
        }
        return false;
    }

    public <T> Iterable<T> removeAll(i iVar) {
        if (k()) {
            return null;
        }
        int i8 = 0;
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < this.f32132b; i9++) {
            if (g(iVar.a(), o(i9))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(x(i9, iVar));
            } else {
                n(i8, o(i9));
                t(i8, s(i9));
                i8++;
            }
        }
        Arrays.fill(this.f32131a, i8 * 2, l(), (Object) null);
        this.f32132b = i8;
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i8 = 0; i8 < this.f32132b; i8++) {
            if (i8 != 0) {
                sb.append(',');
            }
            byte[] bArrO = o(i8);
            Charset charset = AbstractC5364f.US_ASCII;
            String str = new String(bArrO, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith(BINARY_HEADER_SUFFIX)) {
                sb.append(f32130d.encode(v(i8)));
            } else {
                sb.append(new String(v(i8), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    C5728h0(int i8, byte[]... bArr) {
        this(i8, (Object[]) bArr);
    }

    C5728h0(int i8, Object[] objArr) {
        this.f32132b = i8;
        this.f32131a = objArr;
    }

    public C5728h0() {
    }

    public void merge(C5728h0 c5728h0, Set<i> set) {
        e3.w.checkNotNull(c5728h0, "other");
        HashMap map = new HashMap(set.size());
        for (i iVar : set) {
            map.put(ByteBuffer.wrap(iVar.a()), iVar);
        }
        for (int i8 = 0; i8 < c5728h0.f32132b; i8++) {
            if (map.containsKey(ByteBuffer.wrap(c5728h0.o(i8)))) {
                m();
                n(this.f32132b, c5728h0.o(i8));
                t(this.f32132b, c5728h0.s(i8));
                this.f32132b++;
            }
        }
    }
}
