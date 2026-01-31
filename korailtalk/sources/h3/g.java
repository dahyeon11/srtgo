package h3;

import e3.AbstractC5358c;
import e3.w;
import f3.AbstractC5465h0;
import g3.AbstractC5553b;
import g3.AbstractC5554c;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class g {

    class a extends k {

        /* renamed from: a */
        final Charset f31493a;

        a(Charset charset) {
            this.f31493a = (Charset) w.checkNotNull(charset);
        }

        @Override // h3.k
        public g asByteSource(Charset charset) {
            return charset.equals(this.f31493a) ? g.this : super.asByteSource(charset);
        }

        @Override // h3.k
        public Reader openStream() {
            return new InputStreamReader(g.this.openStream(), this.f31493a);
        }

        @Override // h3.k
        public String read() {
            return new String(g.this.read(), this.f31493a);
        }

        public String toString() {
            return g.this.toString() + ".asCharSource(" + this.f31493a + ")";
        }
    }

    private static class b extends g {

        /* renamed from: a */
        final byte[] f31495a;

        /* renamed from: b */
        final int f31496b;

        /* renamed from: c */
        final int f31497c;

        b(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // h3.g
        public long copyTo(OutputStream outputStream) throws IOException {
            outputStream.write(this.f31495a, this.f31496b, this.f31497c);
            return this.f31497c;
        }

        @Override // h3.g
        public AbstractC5554c hash(g3.d dVar) {
            return dVar.b(this.f31495a, this.f31496b, this.f31497c);
        }

        @Override // h3.g
        public boolean isEmpty() {
            return this.f31497c == 0;
        }

        @Override // h3.g
        public InputStream openBufferedStream() {
            return openStream();
        }

        @Override // h3.g
        public InputStream openStream() {
            return new ByteArrayInputStream(this.f31495a, this.f31496b, this.f31497c);
        }

        @Override // h3.g
        public byte[] read() {
            byte[] bArr = this.f31495a;
            int i8 = this.f31496b;
            return Arrays.copyOfRange(bArr, i8, this.f31497c + i8);
        }

        @Override // h3.g
        public long size() {
            return this.f31497c;
        }

        @Override // h3.g
        public e3.s sizeIfKnown() {
            return e3.s.of(Long.valueOf(this.f31497c));
        }

        @Override // h3.g
        public g slice(long j8, long j9) {
            w.checkArgument(j8 >= 0, "offset (%s) may not be negative", j8);
            w.checkArgument(j9 >= 0, "length (%s) may not be negative", j9);
            long jMin = Math.min(j8, this.f31497c);
            return new b(this.f31495a, this.f31496b + ((int) jMin), (int) Math.min(j9, this.f31497c - jMin));
        }

        public String toString() {
            return "ByteSource.wrap(" + AbstractC5358c.truncate(h3.b.base16().encode(this.f31495a, this.f31496b, this.f31497c), 30, "...") + ")";
        }

        b(byte[] bArr, int i8, int i9) {
            this.f31495a = bArr;
            this.f31496b = i8;
            this.f31497c = i9;
        }

        @Override // h3.g
        public <T> T read(h3.e eVar) {
            eVar.a(this.f31495a, this.f31496b, this.f31497c);
            return (T) eVar.getResult();
        }
    }

    private static final class c extends g {

        /* renamed from: a */
        final Iterable f31498a;

        c(Iterable iterable) {
            this.f31498a = (Iterable) w.checkNotNull(iterable);
        }

        @Override // h3.g
        public boolean isEmpty() {
            Iterator it = this.f31498a.iterator();
            while (it.hasNext()) {
                if (!((g) it.next()).isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // h3.g
        public InputStream openStream() {
            return new s(this.f31498a.iterator());
        }

        @Override // h3.g
        public long size() {
            Iterator it = this.f31498a.iterator();
            long size = 0;
            while (it.hasNext()) {
                size += ((g) it.next()).size();
                if (size < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return size;
        }

        @Override // h3.g
        public e3.s sizeIfKnown() {
            Iterable iterable = this.f31498a;
            if (!(iterable instanceof Collection)) {
                return e3.s.absent();
            }
            Iterator it = iterable.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                e3.s sVarSizeIfKnown = ((g) it.next()).sizeIfKnown();
                if (!sVarSizeIfKnown.isPresent()) {
                    return e3.s.absent();
                }
                jLongValue += ((Long) sVarSizeIfKnown.get()).longValue();
                if (jLongValue < 0) {
                    return e3.s.of(Long.MAX_VALUE);
                }
            }
            return e3.s.of(Long.valueOf(jLongValue));
        }

        public String toString() {
            return "ByteSource.concat(" + this.f31498a + ")";
        }
    }

    private static final class d extends b {

        /* renamed from: d */
        static final d f31499d = new d();

        d() {
            super(new byte[0]);
        }

        @Override // h3.g
        public k asCharSource(Charset charset) {
            w.checkNotNull(charset);
            return k.empty();
        }

        @Override // h3.g.b, h3.g
        public byte[] read() {
            return this.f31495a;
        }

        @Override // h3.g.b
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    private final class e extends g {

        /* renamed from: a */
        final long f31500a;

        /* renamed from: b */
        final long f31501b;

        e(long j8, long j9) {
            w.checkArgument(j8 >= 0, "offset (%s) may not be negative", j8);
            w.checkArgument(j9 >= 0, "length (%s) may not be negative", j9);
            this.f31500a = j8;
            this.f31501b = j9;
        }

        private InputStream b(InputStream inputStream) throws IOException {
            long j8 = this.f31500a;
            if (j8 > 0) {
                try {
                    if (h.d(inputStream, j8) < this.f31500a) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return h.limit(inputStream, this.f31501b);
        }

        @Override // h3.g
        public boolean isEmpty() {
            return this.f31501b == 0 || super.isEmpty();
        }

        @Override // h3.g
        public InputStream openBufferedStream() {
            return b(g.this.openBufferedStream());
        }

        @Override // h3.g
        public InputStream openStream() {
            return b(g.this.openStream());
        }

        @Override // h3.g
        public e3.s sizeIfKnown() {
            e3.s sVarSizeIfKnown = g.this.sizeIfKnown();
            if (!sVarSizeIfKnown.isPresent()) {
                return e3.s.absent();
            }
            long jLongValue = ((Long) sVarSizeIfKnown.get()).longValue();
            return e3.s.of(Long.valueOf(Math.min(this.f31501b, jLongValue - Math.min(this.f31500a, jLongValue))));
        }

        @Override // h3.g
        public g slice(long j8, long j9) {
            w.checkArgument(j8 >= 0, "offset (%s) may not be negative", j8);
            w.checkArgument(j9 >= 0, "length (%s) may not be negative", j9);
            long j10 = this.f31501b - j8;
            return j10 <= 0 ? g.empty() : g.this.slice(this.f31500a + j8, Math.min(j9, j10));
        }

        public String toString() {
            return g.this.toString() + ".slice(" + this.f31500a + ", " + this.f31501b + ")";
        }
    }

    protected g() {
    }

    private long a(InputStream inputStream) throws IOException {
        long j8 = 0;
        while (true) {
            long jD = h.d(inputStream, 2147483647L);
            if (jD <= 0) {
                return j8;
            }
            j8 += jD;
        }
    }

    public static g concat(Iterable<? extends g> iterable) {
        return new c(iterable);
    }

    public static g empty() {
        return d.f31499d;
    }

    public static g wrap(byte[] bArr) {
        return new b(bArr);
    }

    public k asCharSource(Charset charset) {
        return new a(charset);
    }

    public boolean contentEquals(g gVar) {
        int i8;
        w.checkNotNull(gVar);
        byte[] bArrB = h.b();
        byte[] bArrB2 = h.b();
        n nVarCreate = n.create();
        try {
            InputStream inputStream = (InputStream) nVarCreate.register(openStream());
            InputStream inputStream2 = (InputStream) nVarCreate.register(gVar.openStream());
            do {
                i8 = h.read(inputStream, bArrB, 0, bArrB.length);
                if (i8 == h.read(inputStream2, bArrB2, 0, bArrB2.length) && Arrays.equals(bArrB, bArrB2)) {
                }
                return false;
            } while (i8 == bArrB.length);
            nVarCreate.close();
            return true;
        } finally {
        }
    }

    public long copyTo(OutputStream outputStream) {
        w.checkNotNull(outputStream);
        try {
            return h.copy((InputStream) n.create().register(openStream()), outputStream);
        } finally {
        }
    }

    public AbstractC5554c hash(g3.d dVar) {
        dVar.a();
        copyTo(AbstractC5553b.asOutputStream(null));
        throw null;
    }

    public boolean isEmpty() {
        e3.s sVarSizeIfKnown = sizeIfKnown();
        if (sVarSizeIfKnown.isPresent()) {
            return ((Long) sVarSizeIfKnown.get()).longValue() == 0;
        }
        n nVarCreate = n.create();
        try {
            return ((InputStream) nVarCreate.register(openStream())).read() == -1;
        } catch (Throwable th) {
            try {
                throw nVarCreate.rethrow(th);
            } finally {
                nVarCreate.close();
            }
        }
    }

    public InputStream openBufferedStream() {
        InputStream inputStreamOpenStream = openStream();
        return inputStreamOpenStream instanceof BufferedInputStream ? (BufferedInputStream) inputStreamOpenStream : new BufferedInputStream(inputStreamOpenStream);
    }

    public abstract InputStream openStream();

    public byte[] read() {
        n nVarCreate = n.create();
        try {
            InputStream inputStream = (InputStream) nVarCreate.register(openStream());
            e3.s sVarSizeIfKnown = sizeIfKnown();
            return sVarSizeIfKnown.isPresent() ? h.e(inputStream, ((Long) sVarSizeIfKnown.get()).longValue()) : h.toByteArray(inputStream);
        } catch (Throwable th) {
            try {
                throw nVarCreate.rethrow(th);
            } finally {
                nVarCreate.close();
            }
        }
    }

    public long size() {
        e3.s sVarSizeIfKnown = sizeIfKnown();
        if (sVarSizeIfKnown.isPresent()) {
            return ((Long) sVarSizeIfKnown.get()).longValue();
        }
        n nVarCreate = n.create();
        try {
            return a((InputStream) nVarCreate.register(openStream()));
        } catch (IOException unused) {
            nVarCreate.close();
            try {
                return h.exhaust((InputStream) n.create().register(openStream()));
            } finally {
            }
        } finally {
        }
    }

    public e3.s sizeIfKnown() {
        return e3.s.absent();
    }

    public g slice(long j8, long j9) {
        return new e(j8, j9);
    }

    public static g concat(Iterator<? extends g> it) {
        return concat(AbstractC5465h0.copyOf(it));
    }

    public static g concat(g... gVarArr) {
        return concat(AbstractC5465h0.copyOf(gVarArr));
    }

    public long copyTo(f fVar) {
        w.checkNotNull(fVar);
        n nVarCreate = n.create();
        try {
            return h.copy((InputStream) nVarCreate.register(openStream()), (OutputStream) nVarCreate.register(fVar.openStream()));
        } finally {
        }
    }

    public <T> T read(h3.e eVar) {
        w.checkNotNull(eVar);
        try {
            return (T) h.readBytes((InputStream) n.create().register(openStream()), eVar);
        } finally {
        }
    }
}
