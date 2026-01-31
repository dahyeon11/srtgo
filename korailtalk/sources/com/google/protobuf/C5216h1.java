package com.google.protobuf;

import com.google.protobuf.AbstractC5235o;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5216h1 extends AbstractC5235o {

    /* renamed from: i, reason: collision with root package name */
    static final int[] f26520i = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: d, reason: collision with root package name */
    private final int f26521d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5235o f26522e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5235o f26523f;

    /* renamed from: g, reason: collision with root package name */
    private final int f26524g;

    /* renamed from: h, reason: collision with root package name */
    private final int f26525h;

    /* renamed from: com.google.protobuf.h1$a */
    class a extends AbstractC5235o.c {

        /* renamed from: a, reason: collision with root package name */
        final c f26526a;

        /* renamed from: b, reason: collision with root package name */
        AbstractC5235o.g f26527b = a();

        a() {
            this.f26526a = new c(C5216h1.this, null);
        }

        private AbstractC5235o.g a() {
            if (this.f26526a.hasNext()) {
                return this.f26526a.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26527b != null;
        }

        @Override // com.google.protobuf.AbstractC5235o.c, com.google.protobuf.AbstractC5235o.g
        public byte nextByte() {
            AbstractC5235o.g gVar = this.f26527b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = gVar.nextByte();
            if (!this.f26527b.hasNext()) {
                this.f26527b = a();
            }
            return bNextByte;
        }
    }

    /* renamed from: com.google.protobuf.h1$c */
    private static final class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque f26530a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5235o.i f26531b;

        /* synthetic */ c(AbstractC5235o abstractC5235o, a aVar) {
            this(abstractC5235o);
        }

        private AbstractC5235o.i a(AbstractC5235o abstractC5235o) {
            while (abstractC5235o instanceof C5216h1) {
                C5216h1 c5216h1 = (C5216h1) abstractC5235o;
                this.f26530a.push(c5216h1);
                abstractC5235o = c5216h1.f26522e;
            }
            return (AbstractC5235o.i) abstractC5235o;
        }

        private AbstractC5235o.i b() {
            AbstractC5235o.i iVarA;
            do {
                ArrayDeque arrayDeque = this.f26530a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                iVarA = a(((C5216h1) this.f26530a.pop()).f26523f);
            } while (iVarA.isEmpty());
            return iVarA;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26531b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(AbstractC5235o abstractC5235o) {
            if (!(abstractC5235o instanceof C5216h1)) {
                this.f26530a = null;
                this.f26531b = (AbstractC5235o.i) abstractC5235o;
                return;
            }
            C5216h1 c5216h1 = (C5216h1) abstractC5235o;
            ArrayDeque arrayDeque = new ArrayDeque(c5216h1.g());
            this.f26530a = arrayDeque;
            arrayDeque.push(c5216h1);
            this.f26531b = a(c5216h1.f26522e);
        }

        @Override // java.util.Iterator
        public AbstractC5235o.i next() {
            AbstractC5235o.i iVar = this.f26531b;
            if (iVar == null) {
                throw new NoSuchElementException();
            }
            this.f26531b = b();
            return iVar;
        }
    }

    /* synthetic */ C5216h1(AbstractC5235o abstractC5235o, AbstractC5235o abstractC5235o2, a aVar) {
        this(abstractC5235o, abstractC5235o2);
    }

    static int A(int i8) {
        int[] iArr = f26520i;
        if (i8 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i8];
    }

    static AbstractC5235o x(AbstractC5235o abstractC5235o, AbstractC5235o abstractC5235o2) {
        if (abstractC5235o2.size() == 0) {
            return abstractC5235o;
        }
        if (abstractC5235o.size() == 0) {
            return abstractC5235o2;
        }
        int size = abstractC5235o.size() + abstractC5235o2.size();
        if (size < 128) {
            return y(abstractC5235o, abstractC5235o2);
        }
        if (abstractC5235o instanceof C5216h1) {
            C5216h1 c5216h1 = (C5216h1) abstractC5235o;
            if (c5216h1.f26523f.size() + abstractC5235o2.size() < 128) {
                return new C5216h1(c5216h1.f26522e, y(c5216h1.f26523f, abstractC5235o2));
            }
            if (c5216h1.f26522e.g() > c5216h1.f26523f.g() && c5216h1.g() > abstractC5235o2.g()) {
                return new C5216h1(c5216h1.f26522e, new C5216h1(c5216h1.f26523f, abstractC5235o2));
            }
        }
        return size >= A(Math.max(abstractC5235o.g(), abstractC5235o2.g()) + 1) ? new C5216h1(abstractC5235o, abstractC5235o2) : new b(null).b(abstractC5235o, abstractC5235o2);
    }

    private static AbstractC5235o y(AbstractC5235o abstractC5235o, AbstractC5235o abstractC5235o2) {
        int size = abstractC5235o.size();
        int size2 = abstractC5235o2.size();
        byte[] bArr = new byte[size + size2];
        abstractC5235o.copyTo(bArr, 0, 0, size);
        abstractC5235o2.copyTo(bArr, 0, size, size2);
        return AbstractC5235o.s(bArr);
    }

    private boolean z(AbstractC5235o abstractC5235o) {
        a aVar = null;
        c cVar = new c(this, aVar);
        AbstractC5235o.i iVar = (AbstractC5235o.i) cVar.next();
        c cVar2 = new c(abstractC5235o, aVar);
        AbstractC5235o.i iVar2 = (AbstractC5235o.i) cVar2.next();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int size = iVar.size() - i8;
            int size2 = iVar2.size() - i9;
            int iMin = Math.min(size, size2);
            if (!(i8 == 0 ? iVar.v(iVar2, i9, iMin) : iVar2.v(iVar, i8, iMin))) {
                return false;
            }
            i10 += iMin;
            int i11 = this.f26521d;
            if (i10 >= i11) {
                if (i10 == i11) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i8 = 0;
                iVar = (AbstractC5235o.i) cVar.next();
            } else {
                i8 += iMin;
                iVar = iVar;
            }
            if (iMin == size2) {
                iVar2 = (AbstractC5235o.i) cVar2.next();
                i9 = 0;
            } else {
                i9 += iMin;
            }
        }
    }

    @Override // com.google.protobuf.AbstractC5235o
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC5235o
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.AbstractC5235o
    public byte byteAt(int i8) {
        AbstractC5235o.c(i8, this.f26521d);
        return internalByteAt(i8);
    }

    @Override // com.google.protobuf.AbstractC5235o
    public void copyTo(ByteBuffer byteBuffer) {
        this.f26522e.copyTo(byteBuffer);
        this.f26523f.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.AbstractC5235o
    protected void e(byte[] bArr, int i8, int i9, int i10) {
        int i11 = i8 + i10;
        int i12 = this.f26524g;
        if (i11 <= i12) {
            this.f26522e.e(bArr, i8, i9, i10);
        } else {
            if (i8 >= i12) {
                this.f26523f.e(bArr, i8 - i12, i9, i10);
                return;
            }
            int i13 = i12 - i8;
            this.f26522e.e(bArr, i8, i9, i13);
            this.f26523f.e(bArr, 0, i9 + i13, i10 - i13);
        }
    }

    @Override // com.google.protobuf.AbstractC5235o
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5235o)) {
            return false;
        }
        AbstractC5235o abstractC5235o = (AbstractC5235o) obj;
        if (this.f26521d != abstractC5235o.size()) {
            return false;
        }
        if (this.f26521d == 0) {
            return true;
        }
        int iM = m();
        int iM2 = abstractC5235o.m();
        if (iM == 0 || iM2 == 0 || iM == iM2) {
            return z(abstractC5235o);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC5235o
    protected int g() {
        return this.f26525h;
    }

    @Override // com.google.protobuf.AbstractC5235o
    protected boolean i() {
        return this.f26521d >= A(this.f26525h);
    }

    @Override // com.google.protobuf.AbstractC5235o
    byte internalByteAt(int i8) {
        int i9 = this.f26524g;
        return i8 < i9 ? this.f26522e.internalByteAt(i8) : this.f26523f.internalByteAt(i8 - i9);
    }

    @Override // com.google.protobuf.AbstractC5235o
    public boolean isValidUtf8() {
        int iL = this.f26522e.l(0, 0, this.f26524g);
        AbstractC5235o abstractC5235o = this.f26523f;
        return abstractC5235o.l(iL, 0, abstractC5235o.size()) == 0;
    }

    @Override // com.google.protobuf.AbstractC5235o
    protected int k(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.f26524g;
        if (i11 <= i12) {
            return this.f26522e.k(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.f26523f.k(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.f26523f.k(this.f26522e.k(i8, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.protobuf.AbstractC5235o
    protected int l(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.f26524g;
        if (i11 <= i12) {
            return this.f26522e.l(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.f26523f.l(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.f26523f.l(this.f26522e.l(i8, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.protobuf.AbstractC5235o
    public r newCodedInput() {
        return r.a(asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.AbstractC5235o
    public InputStream newInput() {
        return new d();
    }

    @Override // com.google.protobuf.AbstractC5235o
    protected String p(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.AbstractC5235o
    public int size() {
        return this.f26521d;
    }

    @Override // com.google.protobuf.AbstractC5235o
    public AbstractC5235o substring(int i8, int i9) {
        int iD = AbstractC5235o.d(i8, i9, this.f26521d);
        if (iD == 0) {
            return AbstractC5235o.EMPTY;
        }
        if (iD == this.f26521d) {
            return this;
        }
        int i10 = this.f26524g;
        return i9 <= i10 ? this.f26522e.substring(i8, i9) : i8 >= i10 ? this.f26523f.substring(i8 - i10, i9 - i10) : new C5216h1(this.f26522e.substring(i8), this.f26523f.substring(0, i9 - this.f26524g));
    }

    @Override // com.google.protobuf.AbstractC5235o
    void u(AbstractC5232n abstractC5232n) {
        this.f26522e.u(abstractC5232n);
        this.f26523f.u(abstractC5232n);
    }

    @Override // com.google.protobuf.AbstractC5235o
    public void writeTo(OutputStream outputStream) {
        this.f26522e.writeTo(outputStream);
        this.f26523f.writeTo(outputStream);
    }

    /* renamed from: com.google.protobuf.h1$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque f26529a;

        private b() {
            this.f26529a = new ArrayDeque();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AbstractC5235o b(AbstractC5235o abstractC5235o, AbstractC5235o abstractC5235o2) {
            c(abstractC5235o);
            c(abstractC5235o2);
            AbstractC5235o c5216h1 = (AbstractC5235o) this.f26529a.pop();
            while (!this.f26529a.isEmpty()) {
                c5216h1 = new C5216h1((AbstractC5235o) this.f26529a.pop(), c5216h1, null);
            }
            return c5216h1;
        }

        private void c(AbstractC5235o abstractC5235o) {
            if (abstractC5235o.i()) {
                e(abstractC5235o);
                return;
            }
            if (abstractC5235o instanceof C5216h1) {
                C5216h1 c5216h1 = (C5216h1) abstractC5235o;
                c(c5216h1.f26522e);
                c(c5216h1.f26523f);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC5235o.getClass());
            }
        }

        private int d(int i8) {
            int iBinarySearch = Arrays.binarySearch(C5216h1.f26520i, i8);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(AbstractC5235o abstractC5235o) {
            a aVar;
            int iD = d(abstractC5235o.size());
            int iA = C5216h1.A(iD + 1);
            if (this.f26529a.isEmpty() || ((AbstractC5235o) this.f26529a.peek()).size() >= iA) {
                this.f26529a.push(abstractC5235o);
                return;
            }
            int iA2 = C5216h1.A(iD);
            AbstractC5235o c5216h1 = (AbstractC5235o) this.f26529a.pop();
            while (true) {
                aVar = null;
                if (this.f26529a.isEmpty() || ((AbstractC5235o) this.f26529a.peek()).size() >= iA2) {
                    break;
                } else {
                    c5216h1 = new C5216h1((AbstractC5235o) this.f26529a.pop(), c5216h1, aVar);
                }
            }
            C5216h1 c5216h12 = new C5216h1(c5216h1, abstractC5235o, aVar);
            while (!this.f26529a.isEmpty()) {
                if (((AbstractC5235o) this.f26529a.peek()).size() >= C5216h1.A(d(c5216h12.size()) + 1)) {
                    break;
                } else {
                    c5216h12 = new C5216h1((AbstractC5235o) this.f26529a.pop(), c5216h12, aVar);
                }
            }
            this.f26529a.push(c5216h12);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private C5216h1(AbstractC5235o abstractC5235o, AbstractC5235o abstractC5235o2) {
        this.f26522e = abstractC5235o;
        this.f26523f = abstractC5235o2;
        int size = abstractC5235o.size();
        this.f26524g = size;
        this.f26521d = size + abstractC5235o2.size();
        this.f26525h = Math.max(abstractC5235o.g(), abstractC5235o2.g()) + 1;
    }

    @Override // com.google.protobuf.AbstractC5235o, java.lang.Iterable
    public AbstractC5235o.g iterator() {
        return new a();
    }

    /* renamed from: com.google.protobuf.h1$d */
    private class d extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private c f26532a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5235o.i f26533b;

        /* renamed from: c, reason: collision with root package name */
        private int f26534c;

        /* renamed from: d, reason: collision with root package name */
        private int f26535d;

        /* renamed from: e, reason: collision with root package name */
        private int f26536e;

        /* renamed from: f, reason: collision with root package name */
        private int f26537f;

        public d() {
            c();
        }

        private void a() {
            if (this.f26533b != null) {
                int i8 = this.f26535d;
                int i9 = this.f26534c;
                if (i8 == i9) {
                    this.f26536e += i9;
                    this.f26535d = 0;
                    if (!this.f26532a.hasNext()) {
                        this.f26533b = null;
                        this.f26534c = 0;
                    } else {
                        AbstractC5235o.i next = this.f26532a.next();
                        this.f26533b = next;
                        this.f26534c = next.size();
                    }
                }
            }
        }

        private int b() {
            return C5216h1.this.size() - (this.f26536e + this.f26535d);
        }

        private void c() {
            c cVar = new c(C5216h1.this, null);
            this.f26532a = cVar;
            AbstractC5235o.i next = cVar.next();
            this.f26533b = next;
            this.f26534c = next.size();
            this.f26535d = 0;
            this.f26536e = 0;
        }

        private int d(byte[] bArr, int i8, int i9) {
            int i10 = i9;
            while (i10 > 0) {
                a();
                if (this.f26533b == null) {
                    break;
                }
                int iMin = Math.min(this.f26534c - this.f26535d, i10);
                if (bArr != null) {
                    this.f26533b.copyTo(bArr, this.f26535d, i8, iMin);
                    i8 += iMin;
                }
                this.f26535d += iMin;
                i10 -= iMin;
            }
            return i9 - i10;
        }

        @Override // java.io.InputStream
        public int available() {
            return b();
        }

        @Override // java.io.InputStream
        public void mark(int i8) {
            this.f26537f = this.f26536e + this.f26535d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            bArr.getClass();
            if (i8 < 0 || i9 < 0 || i9 > bArr.length - i8) {
                throw new IndexOutOfBoundsException();
            }
            int iD = d(bArr, i8, i9);
            if (iD != 0) {
                return iD;
            }
            if (i9 > 0 || b() == 0) {
                return -1;
            }
            return iD;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            c();
            d(null, 0, this.f26537f);
        }

        @Override // java.io.InputStream
        public long skip(long j8) {
            if (j8 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j8 > 2147483647L) {
                j8 = 2147483647L;
            }
            return d(null, 0, (int) j8);
        }

        @Override // java.io.InputStream
        public int read() {
            a();
            AbstractC5235o.i iVar = this.f26533b;
            if (iVar == null) {
                return -1;
            }
            int i8 = this.f26535d;
            this.f26535d = i8 + 1;
            return iVar.byteAt(i8) & 255;
        }
    }
}
