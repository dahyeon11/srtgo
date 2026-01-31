package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5235o implements Iterable, Serializable {
    public static final AbstractC5235o EMPTY = new j(AbstractC5227l0.EMPTY_BYTE_ARRAY);

    /* renamed from: b, reason: collision with root package name */
    private static final f f26614b;

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f26615c;

    /* renamed from: a, reason: collision with root package name */
    private int f26616a = 0;

    /* renamed from: com.google.protobuf.o$a */
    class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private int f26617a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f26618b;

        a() {
            this.f26618b = AbstractC5235o.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26617a < this.f26618b;
        }

        @Override // com.google.protobuf.AbstractC5235o.c, com.google.protobuf.AbstractC5235o.g
        public byte nextByte() {
            int i8 = this.f26617a;
            if (i8 >= this.f26618b) {
                throw new NoSuchElementException();
            }
            this.f26617a = i8 + 1;
            return AbstractC5235o.this.internalByteAt(i8);
        }
    }

    /* renamed from: com.google.protobuf.o$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        public int compare(AbstractC5235o abstractC5235o, AbstractC5235o abstractC5235o2) {
            g it = abstractC5235o.iterator();
            g it2 = abstractC5235o2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC5235o.o(it.nextByte())).compareTo(Integer.valueOf(AbstractC5235o.o(it2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC5235o.size()).compareTo(Integer.valueOf(abstractC5235o2.size()));
        }
    }

    /* renamed from: com.google.protobuf.o$c */
    static abstract class c implements g {
        c() {
        }

        @Override // com.google.protobuf.AbstractC5235o.g
        public abstract /* synthetic */ byte nextByte();

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    /* renamed from: com.google.protobuf.o$d */
    private static final class d implements f {
        private d() {
        }

        @Override // com.google.protobuf.AbstractC5235o.f
        public byte[] copyFrom(byte[] bArr, int i8, int i9) {
            return Arrays.copyOfRange(bArr, i8, i9 + i8);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.o$e */
    private static final class e extends j {

        /* renamed from: e, reason: collision with root package name */
        private final int f26620e;

        /* renamed from: f, reason: collision with root package name */
        private final int f26621f;

        e(byte[] bArr, int i8, int i9) {
            super(bArr);
            AbstractC5235o.d(i8, i8 + i9, bArr.length);
            this.f26620e = i8;
            this.f26621f = i9;
        }

        @Override // com.google.protobuf.AbstractC5235o.j, com.google.protobuf.AbstractC5235o
        public byte byteAt(int i8) {
            AbstractC5235o.c(i8, size());
            return this.f26624d[this.f26620e + i8];
        }

        @Override // com.google.protobuf.AbstractC5235o.j, com.google.protobuf.AbstractC5235o
        protected void e(byte[] bArr, int i8, int i9, int i10) {
            System.arraycopy(this.f26624d, w() + i8, bArr, i9, i10);
        }

        @Override // com.google.protobuf.AbstractC5235o.j, com.google.protobuf.AbstractC5235o
        byte internalByteAt(int i8) {
            return this.f26624d[this.f26620e + i8];
        }

        @Override // com.google.protobuf.AbstractC5235o.j, com.google.protobuf.AbstractC5235o
        public int size() {
            return this.f26621f;
        }

        @Override // com.google.protobuf.AbstractC5235o.j
        protected int w() {
            return this.f26620e;
        }
    }

    /* renamed from: com.google.protobuf.o$f */
    private interface f {
        byte[] copyFrom(byte[] bArr, int i8, int i9);
    }

    /* renamed from: com.google.protobuf.o$g */
    public interface g extends Iterator {
        byte nextByte();
    }

    /* renamed from: com.google.protobuf.o$h */
    static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5248t f26622a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f26623b;

        /* synthetic */ h(int i8, a aVar) {
            this(i8);
        }

        public AbstractC5235o build() {
            this.f26622a.checkNoSpaceLeft();
            return new j(this.f26623b);
        }

        public AbstractC5248t getCodedOutput() {
            return this.f26622a;
        }

        private h(int i8) {
            byte[] bArr = new byte[i8];
            this.f26623b = bArr;
            this.f26622a = AbstractC5248t.newInstance(bArr);
        }
    }

    /* renamed from: com.google.protobuf.o$i */
    static abstract class i extends AbstractC5235o {
        i() {
        }

        @Override // com.google.protobuf.AbstractC5235o
        protected final int g() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC5235o
        protected final boolean i() {
            return true;
        }

        abstract boolean v(AbstractC5235o abstractC5235o, int i8, int i9);
    }

    /* renamed from: com.google.protobuf.o$j */
    private static class j extends i {

        /* renamed from: d, reason: collision with root package name */
        protected final byte[] f26624d;

        j(byte[] bArr) {
            bArr.getClass();
            this.f26624d = bArr;
        }

        @Override // com.google.protobuf.AbstractC5235o
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.f26624d, w(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.AbstractC5235o
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.AbstractC5235o
        public byte byteAt(int i8) {
            return this.f26624d[i8];
        }

        @Override // com.google.protobuf.AbstractC5235o
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f26624d, w(), size());
        }

        @Override // com.google.protobuf.AbstractC5235o
        protected void e(byte[] bArr, int i8, int i9, int i10) {
            System.arraycopy(this.f26624d, i8, bArr, i9, i10);
        }

        @Override // com.google.protobuf.AbstractC5235o
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC5235o) || size() != ((AbstractC5235o) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iM = m();
            int iM2 = jVar.m();
            if (iM == 0 || iM2 == 0 || iM == iM2) {
                return v(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC5235o
        byte internalByteAt(int i8) {
            return this.f26624d[i8];
        }

        @Override // com.google.protobuf.AbstractC5235o
        public final boolean isValidUtf8() {
            int iW = w();
            return M1.u(this.f26624d, iW, size() + iW);
        }

        @Override // com.google.protobuf.AbstractC5235o
        protected final int k(int i8, int i9, int i10) {
            return AbstractC5227l0.e(i8, this.f26624d, w() + i9, i10);
        }

        @Override // com.google.protobuf.AbstractC5235o
        protected final int l(int i8, int i9, int i10) {
            int iW = w() + i9;
            return M1.w(i8, this.f26624d, iW, i10 + iW);
        }

        @Override // com.google.protobuf.AbstractC5235o
        public final r newCodedInput() {
            return r.c(this.f26624d, w(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC5235o
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.f26624d, w(), size());
        }

        @Override // com.google.protobuf.AbstractC5235o
        protected final String p(Charset charset) {
            return new String(this.f26624d, w(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC5235o
        public int size() {
            return this.f26624d.length;
        }

        @Override // com.google.protobuf.AbstractC5235o
        public final AbstractC5235o substring(int i8, int i9) {
            int iD = AbstractC5235o.d(i8, i9, size());
            return iD == 0 ? AbstractC5235o.EMPTY : new e(this.f26624d, w() + i8, iD);
        }

        @Override // com.google.protobuf.AbstractC5235o
        final void u(AbstractC5232n abstractC5232n) {
            abstractC5232n.writeLazy(this.f26624d, w(), size());
        }

        @Override // com.google.protobuf.AbstractC5235o.i
        final boolean v(AbstractC5235o abstractC5235o, int i8, int i9) {
            if (i9 > abstractC5235o.size()) {
                throw new IllegalArgumentException("Length too large: " + i9 + size());
            }
            int i10 = i8 + i9;
            if (i10 > abstractC5235o.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i8 + ", " + i9 + ", " + abstractC5235o.size());
            }
            if (!(abstractC5235o instanceof j)) {
                return abstractC5235o.substring(i8, i10).equals(substring(0, i9));
            }
            j jVar = (j) abstractC5235o;
            byte[] bArr = this.f26624d;
            byte[] bArr2 = jVar.f26624d;
            int iW = w() + i9;
            int iW2 = w();
            int iW3 = jVar.w() + i8;
            while (iW2 < iW) {
                if (bArr[iW2] != bArr2[iW3]) {
                    return false;
                }
                iW2++;
                iW3++;
            }
            return true;
        }

        protected int w() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC5235o
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }
    }

    /* renamed from: com.google.protobuf.o$l */
    private static final class l implements f {
        private l() {
        }

        @Override // com.google.protobuf.AbstractC5235o.f
        public byte[] copyFrom(byte[] bArr, int i8, int i9) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            return bArr2;
        }

        /* synthetic */ l(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f26614b = AbstractC5205e.c() ? new l(aVar) : new d(aVar);
        f26615c = new b();
    }

    AbstractC5235o() {
    }

    private static AbstractC5235o b(Iterator it, int i8) {
        if (i8 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i8)));
        }
        if (i8 == 1) {
            return (AbstractC5235o) it.next();
        }
        int i9 = i8 >>> 1;
        return b(it, i9).concat(b(it, i8 - i9));
    }

    static void c(int i8, int i9) {
        if (((i9 - (i8 + 1)) | i8) < 0) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
        }
    }

    public static AbstractC5235o copyFrom(byte[] bArr, int i8, int i9) {
        d(i8, i8 + i9, bArr.length);
        return new j(f26614b.copyFrom(bArr, i8, i9));
    }

    public static AbstractC5235o copyFromUtf8(String str) {
        return new j(str.getBytes(AbstractC5227l0.f26567b));
    }

    static int d(int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if ((i8 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i8 + " < 0");
        }
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i8 + ", " + i9);
        }
        throw new IndexOutOfBoundsException("End index: " + i9 + " >= " + i10);
    }

    public static final AbstractC5235o empty() {
        return EMPTY;
    }

    private static int f(String str, int i8) {
        int iH = h(str.charAt(i8));
        if (iH != -1) {
            return iH;
        }
        throw new NumberFormatException("Invalid hexString " + str + " must only contain [0-9a-fA-F] but contained " + str.charAt(i8) + " at index " + i8);
    }

    public static AbstractC5235o fromHex(String str) {
        if (str.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + str + " of length " + str.length() + " must be even.");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            bArr[i8] = (byte) (f(str, i9 + 1) | (f(str, i9) << 4));
        }
        return new j(bArr);
    }

    private static int h(char c9) {
        if (c9 >= '0' && c9 <= '9') {
            return c9 - '0';
        }
        if (c9 >= 'A' && c9 <= 'F') {
            return c9 - '7';
        }
        if (c9 < 'a' || c9 > 'f') {
            return -1;
        }
        return c9 - 'W';
    }

    static h j(int i8) {
        return new h(i8, null);
    }

    private static AbstractC5235o n(InputStream inputStream, int i8) throws IOException {
        byte[] bArr = new byte[i8];
        int i9 = 0;
        while (i9 < i8) {
            int i10 = inputStream.read(bArr, i9, i8 - i9);
            if (i10 == -1) {
                break;
            }
            i9 += i10;
        }
        if (i9 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i9);
    }

    public static k newOutput(int i8) {
        return new k(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(byte b9) {
        return b9 & 255;
    }

    private String q() {
        if (size() <= 50) {
            return u1.a(this);
        }
        return u1.a(substring(0, 47)) + "...";
    }

    static AbstractC5235o r(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new W0(byteBuffer);
        }
        return t(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static AbstractC5235o readFrom(InputStream inputStream) {
        return readFrom(inputStream, 256, 8192);
    }

    static AbstractC5235o s(byte[] bArr) {
        return new j(bArr);
    }

    static AbstractC5235o t(byte[] bArr, int i8, int i9) {
        return new e(bArr, i8, i9);
    }

    public static Comparator<AbstractC5235o> unsignedLexicographicalComparator() {
        return f26615c;
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i8);

    public final AbstractC5235o concat(AbstractC5235o abstractC5235o) {
        if (Integer.MAX_VALUE - size() >= abstractC5235o.size()) {
            return C5216h1.x(this, abstractC5235o);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + abstractC5235o.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i8) {
        copyTo(bArr, 0, i8, size());
    }

    protected abstract void e(byte[] bArr, int i8, int i9, int i10);

    public final boolean endsWith(AbstractC5235o abstractC5235o) {
        return size() >= abstractC5235o.size() && substring(size() - abstractC5235o.size()).equals(abstractC5235o);
    }

    public abstract boolean equals(Object obj);

    protected abstract int g();

    public final int hashCode() {
        int iK = this.f26616a;
        if (iK == 0) {
            int size = size();
            iK = k(size, 0, size);
            if (iK == 0) {
                iK = 1;
            }
            this.f26616a = iK;
        }
        return iK;
    }

    protected abstract boolean i();

    abstract byte internalByteAt(int i8);

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    protected abstract int k(int i8, int i9, int i10);

    protected abstract int l(int i8, int i9, int i10);

    protected final int m() {
        return this.f26616a;
    }

    public abstract r newCodedInput();

    public abstract InputStream newInput();

    protected abstract String p(Charset charset);

    public abstract int size();

    public final boolean startsWith(AbstractC5235o abstractC5235o) {
        return size() >= abstractC5235o.size() && substring(0, abstractC5235o.size()).equals(abstractC5235o);
    }

    public final AbstractC5235o substring(int i8) {
        return substring(i8, size());
    }

    public abstract AbstractC5235o substring(int i8, int i9);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return AbstractC5227l0.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        e(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e8) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e8);
            throw unsupportedEncodingException;
        }
    }

    public final String toStringUtf8() {
        return toString(AbstractC5227l0.f26567b);
    }

    abstract void u(AbstractC5232n abstractC5232n);

    public abstract void writeTo(OutputStream outputStream);

    public static k newOutput() {
        return new k(128);
    }

    public static AbstractC5235o readFrom(InputStream inputStream, int i8) {
        return readFrom(inputStream, i8, i8);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i8, int i9, int i10) {
        d(i8, i8 + i10, size());
        d(i9, i9 + i10, bArr.length);
        if (i10 > 0) {
            e(bArr, i8, i9, i10);
        }
    }

    @Override // java.lang.Iterable
    public g iterator() {
        return new a();
    }

    public static AbstractC5235o copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static AbstractC5235o readFrom(InputStream inputStream, int i8, int i9) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC5235o abstractC5235oN = n(inputStream, i8);
            if (abstractC5235oN == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(abstractC5235oN);
            i8 = Math.min(i8 * 2, i9);
        }
    }

    /* renamed from: com.google.protobuf.o$k */
    public static final class k extends OutputStream {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f26625f = new byte[0];

        /* renamed from: a, reason: collision with root package name */
        private final int f26626a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f26627b;

        /* renamed from: c, reason: collision with root package name */
        private int f26628c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f26629d;

        /* renamed from: e, reason: collision with root package name */
        private int f26630e;

        k(int i8) {
            if (i8 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f26626a = i8;
            this.f26627b = new ArrayList();
            this.f26629d = new byte[i8];
        }

        private void a(int i8) {
            this.f26627b.add(new j(this.f26629d));
            int length = this.f26628c + this.f26629d.length;
            this.f26628c = length;
            this.f26629d = new byte[Math.max(this.f26626a, Math.max(i8, length >>> 1))];
            this.f26630e = 0;
        }

        private void b() {
            int i8 = this.f26630e;
            byte[] bArr = this.f26629d;
            if (i8 >= bArr.length) {
                this.f26627b.add(new j(this.f26629d));
                this.f26629d = f26625f;
            } else if (i8 > 0) {
                this.f26627b.add(new j(Arrays.copyOf(bArr, i8)));
            }
            this.f26628c += this.f26630e;
            this.f26630e = 0;
        }

        public synchronized void reset() {
            this.f26627b.clear();
            this.f26628c = 0;
            this.f26630e = 0;
        }

        public synchronized int size() {
            return this.f26628c + this.f26630e;
        }

        public synchronized AbstractC5235o toByteString() {
            b();
            return AbstractC5235o.copyFrom(this.f26627b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i8) {
            try {
                if (this.f26630e == this.f26629d.length) {
                    a(1);
                }
                byte[] bArr = this.f26629d;
                int i9 = this.f26630e;
                this.f26630e = i9 + 1;
                bArr[i9] = (byte) i8;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            int i8;
            AbstractC5235o[] abstractC5235oArr;
            byte[] bArr;
            int i9;
            synchronized (this) {
                abstractC5235oArr = (AbstractC5235o[]) this.f26627b.toArray(new AbstractC5235o[0]);
                bArr = this.f26629d;
                i9 = this.f26630e;
            }
            for (AbstractC5235o abstractC5235o : abstractC5235oArr) {
                abstractC5235o.writeTo(outputStream);
            }
            outputStream.write(Arrays.copyOf(bArr, i9));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i8, int i9) {
            try {
                byte[] bArr2 = this.f26629d;
                int length = bArr2.length;
                int i10 = this.f26630e;
                if (i9 <= length - i10) {
                    System.arraycopy(bArr, i8, bArr2, i10, i9);
                    this.f26630e += i9;
                } else {
                    int length2 = bArr2.length - i10;
                    System.arraycopy(bArr, i8, bArr2, i10, length2);
                    int i11 = i9 - length2;
                    a(i11);
                    System.arraycopy(bArr, i8 + length2, this.f26629d, 0, i11);
                    this.f26630e = i11;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static AbstractC5235o copyFrom(ByteBuffer byteBuffer, int i8) {
        d(0, i8, byteBuffer.remaining());
        byte[] bArr = new byte[i8];
        byteBuffer.get(bArr);
        return new j(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : p(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), q());
    }

    public static AbstractC5235o copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static AbstractC5235o copyFrom(String str, String str2) {
        return new j(str.getBytes(str2));
    }

    public static AbstractC5235o copyFrom(String str, Charset charset) {
        return new j(str.getBytes(charset));
    }

    public static AbstractC5235o copyFrom(Iterable<AbstractC5235o> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<AbstractC5235o> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return b(iterable.iterator(), size);
    }
}
