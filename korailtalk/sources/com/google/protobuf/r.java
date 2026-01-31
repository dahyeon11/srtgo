package com.google.protobuf;

import com.google.protobuf.K0;
import e3.AbstractC5358c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: f */
    private static volatile int f26651f = 100;

    /* renamed from: a */
    int f26652a;

    /* renamed from: b */
    int f26653b;

    /* renamed from: c */
    int f26654c;

    /* renamed from: d */
    C5246s f26655d;

    /* renamed from: e */
    private boolean f26656e;

    private static final class b extends r {

        /* renamed from: g */
        private final byte[] f26657g;

        /* renamed from: h */
        private final boolean f26658h;

        /* renamed from: i */
        private int f26659i;

        /* renamed from: j */
        private int f26660j;

        /* renamed from: k */
        private int f26661k;

        /* renamed from: l */
        private int f26662l;

        /* renamed from: m */
        private int f26663m;

        /* renamed from: n */
        private boolean f26664n;

        /* renamed from: o */
        private int f26665o;

        /* synthetic */ b(byte[] bArr, int i8, int i9, boolean z8, a aVar) {
            this(bArr, i8, i9, z8);
        }

        private void f() {
            int i8 = this.f26659i + this.f26660j;
            this.f26659i = i8;
            int i9 = i8 - this.f26662l;
            int i10 = this.f26665o;
            if (i9 <= i10) {
                this.f26660j = 0;
                return;
            }
            int i11 = i9 - i10;
            this.f26660j = i11;
            this.f26659i = i8 - i11;
        }

        private void g() throws C5230m0 {
            if (this.f26659i - this.f26661k >= 10) {
                h();
            } else {
                i();
            }
        }

        private void h() throws C5230m0 {
            for (int i8 = 0; i8 < 10; i8++) {
                byte[] bArr = this.f26657g;
                int i9 = this.f26661k;
                this.f26661k = i9 + 1;
                if (bArr[i9] >= 0) {
                    return;
                }
            }
            throw C5230m0.e();
        }

        private void i() throws C5230m0 {
            for (int i8 = 0; i8 < 10; i8++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw C5230m0.e();
        }

        @Override // com.google.protobuf.r
        public void checkLastTagWas(int i8) throws C5230m0 {
            if (this.f26663m != i8) {
                throw C5230m0.a();
            }
        }

        long e() throws C5230m0 {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & 127) << i8;
                if ((readRawByte() & 128) == 0) {
                    return j8;
                }
            }
            throw C5230m0.e();
        }

        @Override // com.google.protobuf.r
        public void enableAliasing(boolean z8) {
            this.f26664n = z8;
        }

        @Override // com.google.protobuf.r
        public int getBytesUntilLimit() {
            int i8 = this.f26665o;
            if (i8 == Integer.MAX_VALUE) {
                return -1;
            }
            return i8 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.r
        public int getLastTag() {
            return this.f26663m;
        }

        @Override // com.google.protobuf.r
        public int getTotalBytesRead() {
            return this.f26661k - this.f26662l;
        }

        @Override // com.google.protobuf.r
        public boolean isAtEnd() {
            return this.f26661k == this.f26659i;
        }

        @Override // com.google.protobuf.r
        public void popLimit(int i8) {
            this.f26665o = i8;
            f();
        }

        @Override // com.google.protobuf.r
        public int pushLimit(int i8) throws C5230m0 {
            if (i8 < 0) {
                throw C5230m0.f();
            }
            int totalBytesRead = i8 + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw C5230m0.g();
            }
            int i9 = this.f26665o;
            if (totalBytesRead > i9) {
                throw C5230m0.k();
            }
            this.f26665o = totalBytesRead;
            f();
            return i9;
        }

        @Override // com.google.protobuf.r
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.r
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.r
        public ByteBuffer readByteBuffer() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i8 = this.f26659i;
                int i9 = this.f26661k;
                if (rawVarint32 <= i8 - i9) {
                    ByteBuffer byteBufferWrap = (this.f26658h || !this.f26664n) ? ByteBuffer.wrap(Arrays.copyOfRange(this.f26657g, i9, i9 + rawVarint32)) : ByteBuffer.wrap(this.f26657g, i9, rawVarint32).slice();
                    this.f26661k += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return AbstractC5227l0.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw C5230m0.f();
            }
            throw C5230m0.k();
        }

        @Override // com.google.protobuf.r
        public AbstractC5235o readBytes() {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i8 = this.f26659i;
                int i9 = this.f26661k;
                if (rawVarint32 <= i8 - i9) {
                    AbstractC5235o abstractC5235oT = (this.f26658h && this.f26664n) ? AbstractC5235o.t(this.f26657g, i9, rawVarint32) : AbstractC5235o.copyFrom(this.f26657g, i9, rawVarint32);
                    this.f26661k += rawVarint32;
                    return abstractC5235oT;
                }
            }
            return rawVarint32 == 0 ? AbstractC5235o.EMPTY : AbstractC5235o.s(readRawBytes(rawVarint32));
        }

        @Override // com.google.protobuf.r
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.r
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.r
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.r
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.r
        public void readGroup(int i8, K0.a aVar, M m8) throws C5230m0 {
            checkRecursionLimit();
            this.f26652a++;
            aVar.mergeFrom(this, m8);
            checkLastTagWas(P1.a(i8, 4));
            this.f26652a--;
        }

        @Override // com.google.protobuf.r
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.r
        public void readMessage(K0.a aVar, M m8) throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f26652a++;
            aVar.mergeFrom(this, m8);
            checkLastTagWas(0);
            this.f26652a--;
            if (getBytesUntilLimit() != 0) {
                throw C5230m0.k();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.r
        public byte readRawByte() throws C5230m0 {
            int i8 = this.f26661k;
            if (i8 == this.f26659i) {
                throw C5230m0.k();
            }
            byte[] bArr = this.f26657g;
            this.f26661k = i8 + 1;
            return bArr[i8];
        }

        @Override // com.google.protobuf.r
        public byte[] readRawBytes(int i8) throws C5230m0 {
            if (i8 > 0) {
                int i9 = this.f26659i;
                int i10 = this.f26661k;
                if (i8 <= i9 - i10) {
                    int i11 = i8 + i10;
                    this.f26661k = i11;
                    return Arrays.copyOfRange(this.f26657g, i10, i11);
                }
            }
            if (i8 > 0) {
                throw C5230m0.k();
            }
            if (i8 == 0) {
                return AbstractC5227l0.EMPTY_BYTE_ARRAY;
            }
            throw C5230m0.f();
        }

        @Override // com.google.protobuf.r
        public int readRawLittleEndian32() throws C5230m0 {
            int i8 = this.f26661k;
            if (this.f26659i - i8 < 4) {
                throw C5230m0.k();
            }
            byte[] bArr = this.f26657g;
            this.f26661k = i8 + 4;
            return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.r
        public long readRawLittleEndian64() throws C5230m0 {
            int i8 = this.f26661k;
            if (this.f26659i - i8 < 8) {
                throw C5230m0.k();
            }
            byte[] bArr = this.f26657g;
            this.f26661k = i8 + 8;
            return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
        }

        @Override // com.google.protobuf.r
        public int readRawVarint32() {
            int i8;
            int i9 = this.f26661k;
            int i10 = this.f26659i;
            if (i10 != i9) {
                byte[] bArr = this.f26657g;
                int i11 = i9 + 1;
                byte b9 = bArr[i9];
                if (b9 >= 0) {
                    this.f26661k = i11;
                    return b9;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i9 + 2;
                    int i13 = (bArr[i11] << 7) ^ b9;
                    if (i13 < 0) {
                        i8 = i13 ^ (-128);
                    } else {
                        int i14 = i9 + 3;
                        int i15 = (bArr[i12] << AbstractC5358c.SO) ^ i13;
                        if (i15 >= 0) {
                            i8 = i15 ^ 16256;
                        } else {
                            int i16 = i9 + 4;
                            int i17 = i15 ^ (bArr[i14] << AbstractC5358c.NAK);
                            if (i17 < 0) {
                                i8 = (-2080896) ^ i17;
                            } else {
                                i14 = i9 + 5;
                                byte b10 = bArr[i16];
                                int i18 = (i17 ^ (b10 << AbstractC5358c.FS)) ^ 266354560;
                                if (b10 < 0) {
                                    i16 = i9 + 6;
                                    if (bArr[i14] < 0) {
                                        i14 = i9 + 7;
                                        if (bArr[i16] < 0) {
                                            i16 = i9 + 8;
                                            if (bArr[i14] < 0) {
                                                i14 = i9 + 9;
                                                if (bArr[i16] < 0) {
                                                    int i19 = i9 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        i12 = i19;
                                                        i8 = i18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i8 = i18;
                                }
                                i8 = i18;
                            }
                            i12 = i16;
                        }
                        i12 = i14;
                    }
                    this.f26661k = i12;
                    return i8;
                }
            }
            return (int) e();
        }

        @Override // com.google.protobuf.r
        public long readRawVarint64() {
            long j8;
            long j9;
            long j10;
            int i8 = this.f26661k;
            int i9 = this.f26659i;
            if (i9 != i8) {
                byte[] bArr = this.f26657g;
                int i10 = i8 + 1;
                byte b9 = bArr[i8];
                if (b9 >= 0) {
                    this.f26661k = i10;
                    return b9;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b9;
                    if (i12 < 0) {
                        j8 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << AbstractC5358c.SO) ^ i12;
                        if (i14 >= 0) {
                            j8 = i14 ^ 16256;
                            i11 = i13;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << AbstractC5358c.NAK);
                            if (i16 < 0) {
                                long j11 = (-2080896) ^ i16;
                                i11 = i15;
                                j8 = j11;
                            } else {
                                long j12 = i16;
                                i11 = i8 + 5;
                                long j13 = j12 ^ (bArr[i15] << 28);
                                if (j13 >= 0) {
                                    j10 = 266354560;
                                } else {
                                    int i17 = i8 + 6;
                                    long j14 = j13 ^ (bArr[i11] << 35);
                                    if (j14 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        i11 = i8 + 7;
                                        j13 = j14 ^ (bArr[i17] << 42);
                                        if (j13 >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            i17 = i8 + 8;
                                            j14 = j13 ^ (bArr[i11] << 49);
                                            if (j14 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                i11 = i8 + 9;
                                                long j15 = (j14 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                                if (j15 < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i11] >= 0) {
                                                        i11 = i18;
                                                    }
                                                }
                                                j8 = j15;
                                            }
                                        }
                                    }
                                    j8 = j14 ^ j9;
                                    i11 = i17;
                                }
                                j8 = j13 ^ j10;
                            }
                        }
                    }
                    this.f26661k = i11;
                    return j8;
                }
            }
            return e();
        }

        @Override // com.google.protobuf.r
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.r
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.r
        public int readSInt32() {
            return r.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.r
        public long readSInt64() {
            return r.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.r
        public String readString() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i8 = this.f26659i;
                int i9 = this.f26661k;
                if (rawVarint32 <= i8 - i9) {
                    String str = new String(this.f26657g, i9, rawVarint32, AbstractC5227l0.f26567b);
                    this.f26661k += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw C5230m0.f();
            }
            throw C5230m0.k();
        }

        @Override // com.google.protobuf.r
        public String readStringRequireUtf8() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i8 = this.f26659i;
                int i9 = this.f26661k;
                if (rawVarint32 <= i8 - i9) {
                    String strH = M1.h(this.f26657g, i9, rawVarint32);
                    this.f26661k += rawVarint32;
                    return strH;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw C5230m0.f();
            }
            throw C5230m0.k();
        }

        @Override // com.google.protobuf.r
        public int readTag() throws C5230m0 {
            if (isAtEnd()) {
                this.f26663m = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f26663m = rawVarint32;
            if (P1.getTagFieldNumber(rawVarint32) != 0) {
                return this.f26663m;
            }
            throw C5230m0.b();
        }

        @Override // com.google.protobuf.r
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.r
        @Deprecated
        public void readUnknownGroup(int i8, K0.a aVar) throws C5230m0 {
            readGroup(i8, aVar, M.getEmptyRegistry());
        }

        @Override // com.google.protobuf.r
        public void resetSizeCounter() {
            this.f26662l = this.f26661k;
        }

        @Override // com.google.protobuf.r
        public boolean skipField(int i8) throws C5230m0 {
            int tagWireType = P1.getTagWireType(i8);
            if (tagWireType == 0) {
                g();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(P1.a(P1.getTagFieldNumber(i8), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw C5230m0.d();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.r
        public void skipMessage() throws C5230m0 {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.r
        public void skipRawBytes(int i8) throws C5230m0 {
            if (i8 >= 0) {
                int i9 = this.f26659i;
                int i10 = this.f26661k;
                if (i8 <= i9 - i10) {
                    this.f26661k = i10 + i8;
                    return;
                }
            }
            if (i8 >= 0) {
                throw C5230m0.k();
            }
            throw C5230m0.f();
        }

        private b(byte[] bArr, int i8, int i9, boolean z8) {
            super();
            this.f26665o = Integer.MAX_VALUE;
            this.f26657g = bArr;
            this.f26659i = i9 + i8;
            this.f26661k = i8;
            this.f26662l = i8;
            this.f26658h = z8;
        }

        @Override // com.google.protobuf.r
        public void skipMessage(AbstractC5248t abstractC5248t) throws C5230m0 {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, abstractC5248t));
        }

        @Override // com.google.protobuf.r
        public <T extends K0> T readGroup(int i8, Z0 z02, M m8) throws C5230m0 {
            checkRecursionLimit();
            this.f26652a++;
            T t8 = (T) z02.parsePartialFrom(this, m8);
            checkLastTagWas(P1.a(i8, 4));
            this.f26652a--;
            return t8;
        }

        @Override // com.google.protobuf.r
        public boolean skipField(int i8, AbstractC5248t abstractC5248t) throws C5230m0 {
            int tagWireType = P1.getTagWireType(i8);
            if (tagWireType == 0) {
                long int64 = readInt64();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                AbstractC5235o bytes = readBytes();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                abstractC5248t.writeUInt32NoTag(i8);
                skipMessage(abstractC5248t);
                int iA = P1.a(P1.getTagFieldNumber(i8), 4);
                checkLastTagWas(iA);
                abstractC5248t.writeUInt32NoTag(iA);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw C5230m0.d();
        }

        @Override // com.google.protobuf.r
        public <T extends K0> T readMessage(Z0 z02, M m8) throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f26652a++;
            T t8 = (T) z02.parsePartialFrom(this, m8);
            checkLastTagWas(0);
            this.f26652a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t8;
            }
            throw C5230m0.k();
        }
    }

    private static final class c extends r {

        /* renamed from: g */
        private final Iterable f26666g;

        /* renamed from: h */
        private final Iterator f26667h;

        /* renamed from: i */
        private ByteBuffer f26668i;

        /* renamed from: j */
        private final boolean f26669j;

        /* renamed from: k */
        private boolean f26670k;

        /* renamed from: l */
        private int f26671l;

        /* renamed from: m */
        private int f26672m;

        /* renamed from: n */
        private int f26673n;

        /* renamed from: o */
        private int f26674o;

        /* renamed from: p */
        private int f26675p;

        /* renamed from: q */
        private int f26676q;

        /* renamed from: r */
        private long f26677r;

        /* renamed from: s */
        private long f26678s;

        /* renamed from: t */
        private long f26679t;

        /* renamed from: u */
        private long f26680u;

        /* synthetic */ c(Iterable iterable, int i8, boolean z8, a aVar) {
            this(iterable, i8, z8);
        }

        private long e() {
            return this.f26680u - this.f26677r;
        }

        private void f() throws C5230m0 {
            if (!this.f26667h.hasNext()) {
                throw C5230m0.k();
            }
            m();
        }

        private void g(byte[] bArr, int i8, int i9) throws C5230m0 {
            if (i9 < 0 || i9 > j()) {
                if (i9 > 0) {
                    throw C5230m0.k();
                }
                if (i9 != 0) {
                    throw C5230m0.f();
                }
                return;
            }
            int i10 = i9;
            while (i10 > 0) {
                if (e() == 0) {
                    f();
                }
                int iMin = Math.min(i10, (int) e());
                long j8 = iMin;
                L1.p(this.f26677r, bArr, (i9 - i10) + i8, j8);
                i10 -= iMin;
                this.f26677r += j8;
            }
        }

        private void i() {
            int i8 = this.f26671l + this.f26672m;
            this.f26671l = i8;
            int i9 = i8 - this.f26676q;
            int i10 = this.f26673n;
            if (i9 <= i10) {
                this.f26672m = 0;
                return;
            }
            int i11 = i9 - i10;
            this.f26672m = i11;
            this.f26671l = i8 - i11;
        }

        private int j() {
            return (int) (((this.f26671l - this.f26675p) - this.f26677r) + this.f26678s);
        }

        private void k() throws C5230m0 {
            for (int i8 = 0; i8 < 10; i8++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw C5230m0.e();
        }

        private ByteBuffer l(int i8, int i9) {
            int iPosition = this.f26668i.position();
            int iLimit = this.f26668i.limit();
            ByteBuffer byteBuffer = this.f26668i;
            try {
                try {
                    byteBuffer.position(i8);
                    byteBuffer.limit(i9);
                    return this.f26668i.slice();
                } catch (IllegalArgumentException unused) {
                    throw C5230m0.k();
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        private void m() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f26667h.next();
            this.f26668i = byteBuffer;
            this.f26675p += (int) (this.f26677r - this.f26678s);
            long jPosition = byteBuffer.position();
            this.f26677r = jPosition;
            this.f26678s = jPosition;
            this.f26680u = this.f26668i.limit();
            long jK = L1.k(this.f26668i);
            this.f26679t = jK;
            this.f26677r += jK;
            this.f26678s += jK;
            this.f26680u += jK;
        }

        @Override // com.google.protobuf.r
        public void checkLastTagWas(int i8) throws C5230m0 {
            if (this.f26674o != i8) {
                throw C5230m0.a();
            }
        }

        @Override // com.google.protobuf.r
        public void enableAliasing(boolean z8) {
            this.f26670k = z8;
        }

        @Override // com.google.protobuf.r
        public int getBytesUntilLimit() {
            int i8 = this.f26673n;
            if (i8 == Integer.MAX_VALUE) {
                return -1;
            }
            return i8 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.r
        public int getLastTag() {
            return this.f26674o;
        }

        @Override // com.google.protobuf.r
        public int getTotalBytesRead() {
            return (int) (((this.f26675p - this.f26676q) + this.f26677r) - this.f26678s);
        }

        long h() throws C5230m0 {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & 127) << i8;
                if ((readRawByte() & 128) == 0) {
                    return j8;
                }
            }
            throw C5230m0.e();
        }

        @Override // com.google.protobuf.r
        public boolean isAtEnd() {
            return (((long) this.f26675p) + this.f26677r) - this.f26678s == ((long) this.f26671l);
        }

        @Override // com.google.protobuf.r
        public void popLimit(int i8) {
            this.f26673n = i8;
            i();
        }

        @Override // com.google.protobuf.r
        public int pushLimit(int i8) throws C5230m0 {
            if (i8 < 0) {
                throw C5230m0.f();
            }
            int totalBytesRead = i8 + getTotalBytesRead();
            int i9 = this.f26673n;
            if (totalBytesRead > i9) {
                throw C5230m0.k();
            }
            this.f26673n = totalBytesRead;
            i();
            return i9;
        }

        @Override // com.google.protobuf.r
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.r
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.r
        public ByteBuffer readByteBuffer() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j8 = rawVarint32;
                if (j8 <= e()) {
                    if (this.f26669j || !this.f26670k) {
                        byte[] bArr = new byte[rawVarint32];
                        L1.p(this.f26677r, bArr, 0L, j8);
                        this.f26677r += j8;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j9 = this.f26677r + j8;
                    this.f26677r = j9;
                    long j10 = this.f26679t;
                    return l((int) ((j9 - j10) - j8), (int) (j9 - j10));
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= j()) {
                byte[] bArr2 = new byte[rawVarint32];
                g(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return AbstractC5227l0.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw C5230m0.f();
            }
            throw C5230m0.k();
        }

        @Override // com.google.protobuf.r
        public AbstractC5235o readBytes() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j8 = rawVarint32;
                long j9 = this.f26680u;
                long j10 = this.f26677r;
                if (j8 <= j9 - j10) {
                    if (this.f26669j && this.f26670k) {
                        int i8 = (int) (j10 - this.f26679t);
                        AbstractC5235o abstractC5235oR = AbstractC5235o.r(l(i8, rawVarint32 + i8));
                        this.f26677r += j8;
                        return abstractC5235oR;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    L1.p(j10, bArr, 0L, j8);
                    this.f26677r += j8;
                    return AbstractC5235o.s(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > j()) {
                if (rawVarint32 == 0) {
                    return AbstractC5235o.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw C5230m0.f();
                }
                throw C5230m0.k();
            }
            if (!this.f26669j || !this.f26670k) {
                byte[] bArr2 = new byte[rawVarint32];
                g(bArr2, 0, rawVarint32);
                return AbstractC5235o.s(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (rawVarint32 > 0) {
                if (e() == 0) {
                    f();
                }
                int iMin = Math.min(rawVarint32, (int) e());
                int i9 = (int) (this.f26677r - this.f26679t);
                arrayList.add(AbstractC5235o.r(l(i9, i9 + iMin)));
                rawVarint32 -= iMin;
                this.f26677r += iMin;
            }
            return AbstractC5235o.copyFrom(arrayList);
        }

        @Override // com.google.protobuf.r
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.r
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.r
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.r
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.r
        public void readGroup(int i8, K0.a aVar, M m8) throws C5230m0 {
            checkRecursionLimit();
            this.f26652a++;
            aVar.mergeFrom(this, m8);
            checkLastTagWas(P1.a(i8, 4));
            this.f26652a--;
        }

        @Override // com.google.protobuf.r
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.r
        public void readMessage(K0.a aVar, M m8) throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f26652a++;
            aVar.mergeFrom(this, m8);
            checkLastTagWas(0);
            this.f26652a--;
            if (getBytesUntilLimit() != 0) {
                throw C5230m0.k();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.r
        public byte readRawByte() throws C5230m0 {
            if (e() == 0) {
                f();
            }
            long j8 = this.f26677r;
            this.f26677r = 1 + j8;
            return L1.x(j8);
        }

        @Override // com.google.protobuf.r
        public byte[] readRawBytes(int i8) throws C5230m0 {
            if (i8 >= 0) {
                long j8 = i8;
                if (j8 <= e()) {
                    byte[] bArr = new byte[i8];
                    L1.p(this.f26677r, bArr, 0L, j8);
                    this.f26677r += j8;
                    return bArr;
                }
            }
            if (i8 >= 0 && i8 <= j()) {
                byte[] bArr2 = new byte[i8];
                g(bArr2, 0, i8);
                return bArr2;
            }
            if (i8 > 0) {
                throw C5230m0.k();
            }
            if (i8 == 0) {
                return AbstractC5227l0.EMPTY_BYTE_ARRAY;
            }
            throw C5230m0.f();
        }

        @Override // com.google.protobuf.r
        public int readRawLittleEndian32() {
            if (e() < 4) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
            }
            long j8 = this.f26677r;
            this.f26677r = 4 + j8;
            return ((L1.x(j8 + 3) & 255) << 24) | (L1.x(j8) & 255) | ((L1.x(1 + j8) & 255) << 8) | ((L1.x(2 + j8) & 255) << 16);
        }

        @Override // com.google.protobuf.r
        public long readRawLittleEndian64() throws C5230m0 {
            long rawByte;
            byte rawByte2;
            if (e() >= 8) {
                long j8 = this.f26677r;
                this.f26677r = 8 + j8;
                rawByte = (L1.x(j8) & 255) | ((L1.x(1 + j8) & 255) << 8) | ((L1.x(2 + j8) & 255) << 16) | ((L1.x(3 + j8) & 255) << 24) | ((L1.x(4 + j8) & 255) << 32) | ((L1.x(5 + j8) & 255) << 40) | ((L1.x(6 + j8) & 255) << 48);
                rawByte2 = L1.x(j8 + 7);
            } else {
                rawByte = (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48);
                rawByte2 = readRawByte();
            }
            return ((rawByte2 & 255) << 56) | rawByte;
        }

        @Override // com.google.protobuf.r
        public int readRawVarint32() {
            int i8;
            long j8 = this.f26677r;
            if (this.f26680u != j8) {
                long j9 = j8 + 1;
                byte bX = L1.x(j8);
                if (bX >= 0) {
                    this.f26677r++;
                    return bX;
                }
                if (this.f26680u - this.f26677r >= 10) {
                    long j10 = 2 + j8;
                    int iX = (L1.x(j9) << 7) ^ bX;
                    if (iX < 0) {
                        i8 = iX ^ (-128);
                    } else {
                        long j11 = 3 + j8;
                        int iX2 = (L1.x(j10) << AbstractC5358c.SO) ^ iX;
                        if (iX2 >= 0) {
                            i8 = iX2 ^ 16256;
                        } else {
                            long j12 = 4 + j8;
                            int iX3 = iX2 ^ (L1.x(j11) << AbstractC5358c.NAK);
                            if (iX3 < 0) {
                                i8 = (-2080896) ^ iX3;
                            } else {
                                j11 = 5 + j8;
                                byte bX2 = L1.x(j12);
                                int i9 = (iX3 ^ (bX2 << AbstractC5358c.FS)) ^ 266354560;
                                if (bX2 < 0) {
                                    j12 = 6 + j8;
                                    if (L1.x(j11) < 0) {
                                        j11 = 7 + j8;
                                        if (L1.x(j12) < 0) {
                                            j12 = 8 + j8;
                                            if (L1.x(j11) < 0) {
                                                j11 = 9 + j8;
                                                if (L1.x(j12) < 0) {
                                                    long j13 = j8 + 10;
                                                    if (L1.x(j11) >= 0) {
                                                        i8 = i9;
                                                        j10 = j13;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i8 = i9;
                                }
                                i8 = i9;
                            }
                            j10 = j12;
                        }
                        j10 = j11;
                    }
                    this.f26677r = j10;
                    return i8;
                }
            }
            return (int) h();
        }

        @Override // com.google.protobuf.r
        public long readRawVarint64() {
            long j8;
            long j9;
            long j10;
            long j11 = this.f26677r;
            if (this.f26680u != j11) {
                long j12 = j11 + 1;
                byte bX = L1.x(j11);
                if (bX >= 0) {
                    this.f26677r++;
                    return bX;
                }
                if (this.f26680u - this.f26677r >= 10) {
                    long j13 = 2 + j11;
                    int iX = (L1.x(j12) << 7) ^ bX;
                    if (iX < 0) {
                        j8 = iX ^ (-128);
                    } else {
                        long j14 = 3 + j11;
                        int iX2 = (L1.x(j13) << AbstractC5358c.SO) ^ iX;
                        if (iX2 >= 0) {
                            j8 = iX2 ^ 16256;
                            j13 = j14;
                        } else {
                            long j15 = 4 + j11;
                            int iX3 = iX2 ^ (L1.x(j14) << AbstractC5358c.NAK);
                            if (iX3 < 0) {
                                j8 = (-2080896) ^ iX3;
                                j13 = j15;
                            } else {
                                long j16 = 5 + j11;
                                long jX = (L1.x(j15) << 28) ^ iX3;
                                if (jX >= 0) {
                                    j10 = 266354560;
                                } else {
                                    long j17 = 6 + j11;
                                    long jX2 = jX ^ (L1.x(j16) << 35);
                                    if (jX2 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        j16 = 7 + j11;
                                        jX = jX2 ^ (L1.x(j17) << 42);
                                        if (jX >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            j17 = 8 + j11;
                                            jX2 = jX ^ (L1.x(j16) << 49);
                                            if (jX2 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                j16 = 9 + j11;
                                                long jX3 = (jX2 ^ (L1.x(j17) << 56)) ^ 71499008037633920L;
                                                if (jX3 < 0) {
                                                    long j18 = j11 + 10;
                                                    if (L1.x(j16) >= 0) {
                                                        j8 = jX3;
                                                        j13 = j18;
                                                    }
                                                } else {
                                                    j8 = jX3;
                                                    j13 = j16;
                                                }
                                            }
                                        }
                                    }
                                    j8 = j9 ^ jX2;
                                    j13 = j17;
                                }
                                j8 = j10 ^ jX;
                                j13 = j16;
                            }
                        }
                    }
                    this.f26677r = j13;
                    return j8;
                }
            }
            return h();
        }

        @Override // com.google.protobuf.r
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.r
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.r
        public int readSInt32() {
            return r.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.r
        public long readSInt64() {
            return r.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.r
        public String readString() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j8 = rawVarint32;
                long j9 = this.f26680u;
                long j10 = this.f26677r;
                if (j8 <= j9 - j10) {
                    byte[] bArr = new byte[rawVarint32];
                    L1.p(j10, bArr, 0L, j8);
                    String str = new String(bArr, AbstractC5227l0.f26567b);
                    this.f26677r += j8;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= j()) {
                byte[] bArr2 = new byte[rawVarint32];
                g(bArr2, 0, rawVarint32);
                return new String(bArr2, AbstractC5227l0.f26567b);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw C5230m0.f();
            }
            throw C5230m0.k();
        }

        @Override // com.google.protobuf.r
        public String readStringRequireUtf8() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j8 = rawVarint32;
                long j9 = this.f26680u;
                long j10 = this.f26677r;
                if (j8 <= j9 - j10) {
                    String strG = M1.g(this.f26668i, (int) (j10 - this.f26678s), rawVarint32);
                    this.f26677r += j8;
                    return strG;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= j()) {
                byte[] bArr = new byte[rawVarint32];
                g(bArr, 0, rawVarint32);
                return M1.h(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw C5230m0.f();
            }
            throw C5230m0.k();
        }

        @Override // com.google.protobuf.r
        public int readTag() throws C5230m0 {
            if (isAtEnd()) {
                this.f26674o = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f26674o = rawVarint32;
            if (P1.getTagFieldNumber(rawVarint32) != 0) {
                return this.f26674o;
            }
            throw C5230m0.b();
        }

        @Override // com.google.protobuf.r
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.r
        @Deprecated
        public void readUnknownGroup(int i8, K0.a aVar) throws C5230m0 {
            readGroup(i8, aVar, M.getEmptyRegistry());
        }

        @Override // com.google.protobuf.r
        public void resetSizeCounter() {
            this.f26676q = (int) ((this.f26675p + this.f26677r) - this.f26678s);
        }

        @Override // com.google.protobuf.r
        public boolean skipField(int i8) throws C5230m0 {
            int tagWireType = P1.getTagWireType(i8);
            if (tagWireType == 0) {
                k();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(P1.a(P1.getTagFieldNumber(i8), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw C5230m0.d();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.r
        public void skipMessage() throws C5230m0 {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.r
        public void skipRawBytes(int i8) throws C5230m0 {
            if (i8 < 0 || i8 > ((this.f26671l - this.f26675p) - this.f26677r) + this.f26678s) {
                if (i8 >= 0) {
                    throw C5230m0.k();
                }
                throw C5230m0.f();
            }
            while (i8 > 0) {
                if (e() == 0) {
                    f();
                }
                int iMin = Math.min(i8, (int) e());
                i8 -= iMin;
                this.f26677r += iMin;
            }
        }

        private c(Iterable iterable, int i8, boolean z8) {
            super();
            this.f26673n = Integer.MAX_VALUE;
            this.f26671l = i8;
            this.f26666g = iterable;
            this.f26667h = iterable.iterator();
            this.f26669j = z8;
            this.f26675p = 0;
            this.f26676q = 0;
            if (i8 != 0) {
                m();
                return;
            }
            this.f26668i = AbstractC5227l0.EMPTY_BYTE_BUFFER;
            this.f26677r = 0L;
            this.f26678s = 0L;
            this.f26680u = 0L;
            this.f26679t = 0L;
        }

        @Override // com.google.protobuf.r
        public void skipMessage(AbstractC5248t abstractC5248t) throws C5230m0 {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, abstractC5248t));
        }

        @Override // com.google.protobuf.r
        public <T extends K0> T readGroup(int i8, Z0 z02, M m8) throws C5230m0 {
            checkRecursionLimit();
            this.f26652a++;
            T t8 = (T) z02.parsePartialFrom(this, m8);
            checkLastTagWas(P1.a(i8, 4));
            this.f26652a--;
            return t8;
        }

        @Override // com.google.protobuf.r
        public boolean skipField(int i8, AbstractC5248t abstractC5248t) throws C5230m0 {
            int tagWireType = P1.getTagWireType(i8);
            if (tagWireType == 0) {
                long int64 = readInt64();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                AbstractC5235o bytes = readBytes();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                abstractC5248t.writeUInt32NoTag(i8);
                skipMessage(abstractC5248t);
                int iA = P1.a(P1.getTagFieldNumber(i8), 4);
                checkLastTagWas(iA);
                abstractC5248t.writeUInt32NoTag(iA);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw C5230m0.d();
        }

        @Override // com.google.protobuf.r
        public <T extends K0> T readMessage(Z0 z02, M m8) throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f26652a++;
            T t8 = (T) z02.parsePartialFrom(this, m8);
            checkLastTagWas(0);
            this.f26652a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t8;
            }
            throw C5230m0.k();
        }
    }

    private static final class d extends r {

        /* renamed from: g */
        private final InputStream f26681g;

        /* renamed from: h */
        private final byte[] f26682h;

        /* renamed from: i */
        private int f26683i;

        /* renamed from: j */
        private int f26684j;

        /* renamed from: k */
        private int f26685k;

        /* renamed from: l */
        private int f26686l;

        /* renamed from: m */
        private int f26687m;

        /* renamed from: n */
        private int f26688n;

        /* synthetic */ d(InputStream inputStream, int i8, a aVar) {
            this(inputStream, i8);
        }

        private static int e(InputStream inputStream) throws C5230m0 {
            try {
                return inputStream.available();
            } catch (C5230m0 e8) {
                e8.i();
                throw e8;
            }
        }

        private static int f(InputStream inputStream, byte[] bArr, int i8, int i9) throws C5230m0 {
            try {
                return inputStream.read(bArr, i8, i9);
            } catch (C5230m0 e8) {
                e8.i();
                throw e8;
            }
        }

        private AbstractC5235o g(int i8) throws IOException {
            byte[] bArrI = i(i8);
            if (bArrI != null) {
                return AbstractC5235o.copyFrom(bArrI);
            }
            int i9 = this.f26685k;
            int i10 = this.f26683i;
            int length = i10 - i9;
            this.f26687m += i10;
            this.f26685k = 0;
            this.f26683i = 0;
            List<byte[]> listJ = j(i8 - length);
            byte[] bArr = new byte[i8];
            System.arraycopy(this.f26682h, i9, bArr, 0, length);
            for (byte[] bArr2 : listJ) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC5235o.s(bArr);
        }

        private byte[] h(int i8, boolean z8) throws IOException {
            byte[] bArrI = i(i8);
            if (bArrI != null) {
                return z8 ? (byte[]) bArrI.clone() : bArrI;
            }
            int i9 = this.f26685k;
            int i10 = this.f26683i;
            int length = i10 - i9;
            this.f26687m += i10;
            this.f26685k = 0;
            this.f26683i = 0;
            List<byte[]> listJ = j(i8 - length);
            byte[] bArr = new byte[i8];
            System.arraycopy(this.f26682h, i9, bArr, 0, length);
            for (byte[] bArr2 : listJ) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] i(int i8) throws C5230m0 {
            if (i8 == 0) {
                return AbstractC5227l0.EMPTY_BYTE_ARRAY;
            }
            if (i8 < 0) {
                throw C5230m0.f();
            }
            int i9 = this.f26687m;
            int i10 = this.f26685k;
            int i11 = i9 + i10 + i8;
            if (i11 - this.f26654c > 0) {
                throw C5230m0.j();
            }
            int i12 = this.f26688n;
            if (i11 > i12) {
                skipRawBytes((i12 - i9) - i10);
                throw C5230m0.k();
            }
            int i13 = this.f26683i - i10;
            int i14 = i8 - i13;
            if (i14 >= 4096 && i14 > e(this.f26681g)) {
                return null;
            }
            byte[] bArr = new byte[i8];
            System.arraycopy(this.f26682h, this.f26685k, bArr, 0, i13);
            this.f26687m += this.f26683i;
            this.f26685k = 0;
            this.f26683i = 0;
            while (i13 < i8) {
                int iF = f(this.f26681g, bArr, i13, i8 - i13);
                if (iF == -1) {
                    throw C5230m0.k();
                }
                this.f26687m += iF;
                i13 += iF;
            }
            return bArr;
        }

        private List j(int i8) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i8 > 0) {
                int iMin = Math.min(i8, 4096);
                byte[] bArr = new byte[iMin];
                int i9 = 0;
                while (i9 < iMin) {
                    int i10 = this.f26681g.read(bArr, i9, iMin - i9);
                    if (i10 == -1) {
                        throw C5230m0.k();
                    }
                    this.f26687m += i10;
                    i9 += i10;
                }
                i8 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void l() {
            int i8 = this.f26683i + this.f26684j;
            this.f26683i = i8;
            int i9 = this.f26687m + i8;
            int i10 = this.f26688n;
            if (i9 <= i10) {
                this.f26684j = 0;
                return;
            }
            int i11 = i9 - i10;
            this.f26684j = i11;
            this.f26683i = i8 - i11;
        }

        private void m(int i8) throws C5230m0 {
            if (s(i8)) {
                return;
            }
            if (i8 <= (this.f26654c - this.f26687m) - this.f26685k) {
                throw C5230m0.k();
            }
            throw C5230m0.j();
        }

        private static long n(InputStream inputStream, long j8) throws C5230m0 {
            try {
                return inputStream.skip(j8);
            } catch (C5230m0 e8) {
                e8.i();
                throw e8;
            }
        }

        private void o(int i8) throws C5230m0 {
            if (i8 < 0) {
                throw C5230m0.f();
            }
            int i9 = this.f26687m;
            int i10 = this.f26685k;
            int i11 = i9 + i10 + i8;
            int i12 = this.f26688n;
            if (i11 > i12) {
                skipRawBytes((i12 - i9) - i10);
                throw C5230m0.k();
            }
            this.f26687m = i9 + i10;
            int i13 = this.f26683i - i10;
            this.f26683i = 0;
            this.f26685k = 0;
            while (i13 < i8) {
                try {
                    long j8 = i8 - i13;
                    long jN = n(this.f26681g, j8);
                    if (jN < 0 || jN > j8) {
                        throw new IllegalStateException(this.f26681g.getClass() + "#skip returned invalid result: " + jN + "\nThe InputStream implementation is buggy.");
                    }
                    if (jN == 0) {
                        break;
                    } else {
                        i13 += (int) jN;
                    }
                } finally {
                    this.f26687m += i13;
                    l();
                }
            }
            if (i13 >= i8) {
                return;
            }
            int i14 = this.f26683i;
            int i15 = i14 - this.f26685k;
            this.f26685k = i14;
            m(1);
            while (true) {
                int i16 = i8 - i15;
                int i17 = this.f26683i;
                if (i16 <= i17) {
                    this.f26685k = i16;
                    return;
                } else {
                    i15 += i17;
                    this.f26685k = i17;
                    m(1);
                }
            }
        }

        private void p() throws C5230m0 {
            if (this.f26683i - this.f26685k >= 10) {
                q();
            } else {
                r();
            }
        }

        private void q() throws C5230m0 {
            for (int i8 = 0; i8 < 10; i8++) {
                byte[] bArr = this.f26682h;
                int i9 = this.f26685k;
                this.f26685k = i9 + 1;
                if (bArr[i9] >= 0) {
                    return;
                }
            }
            throw C5230m0.e();
        }

        private void r() throws C5230m0 {
            for (int i8 = 0; i8 < 10; i8++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw C5230m0.e();
        }

        private boolean s(int i8) throws C5230m0 {
            int i9 = this.f26685k;
            int i10 = i9 + i8;
            int i11 = this.f26683i;
            if (i10 <= i11) {
                throw new IllegalStateException("refillBuffer() called when " + i8 + " bytes were already available in buffer");
            }
            int i12 = this.f26654c;
            int i13 = this.f26687m;
            if (i8 > (i12 - i13) - i9 || i13 + i9 + i8 > this.f26688n) {
                return false;
            }
            if (i9 > 0) {
                if (i11 > i9) {
                    byte[] bArr = this.f26682h;
                    System.arraycopy(bArr, i9, bArr, 0, i11 - i9);
                }
                this.f26687m += i9;
                this.f26683i -= i9;
                this.f26685k = 0;
            }
            InputStream inputStream = this.f26681g;
            byte[] bArr2 = this.f26682h;
            int i14 = this.f26683i;
            int iF = f(inputStream, bArr2, i14, Math.min(bArr2.length - i14, (this.f26654c - this.f26687m) - i14));
            if (iF == 0 || iF < -1 || iF > this.f26682h.length) {
                throw new IllegalStateException(this.f26681g.getClass() + "#read(byte[]) returned invalid result: " + iF + "\nThe InputStream implementation is buggy.");
            }
            if (iF <= 0) {
                return false;
            }
            this.f26683i += iF;
            l();
            if (this.f26683i >= i8) {
                return true;
            }
            return s(i8);
        }

        @Override // com.google.protobuf.r
        public void checkLastTagWas(int i8) throws C5230m0 {
            if (this.f26686l != i8) {
                throw C5230m0.a();
            }
        }

        @Override // com.google.protobuf.r
        public void enableAliasing(boolean z8) {
        }

        @Override // com.google.protobuf.r
        public int getBytesUntilLimit() {
            int i8 = this.f26688n;
            if (i8 == Integer.MAX_VALUE) {
                return -1;
            }
            return i8 - (this.f26687m + this.f26685k);
        }

        @Override // com.google.protobuf.r
        public int getLastTag() {
            return this.f26686l;
        }

        @Override // com.google.protobuf.r
        public int getTotalBytesRead() {
            return this.f26687m + this.f26685k;
        }

        @Override // com.google.protobuf.r
        public boolean isAtEnd() {
            return this.f26685k == this.f26683i && !s(1);
        }

        long k() throws C5230m0 {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & 127) << i8;
                if ((readRawByte() & 128) == 0) {
                    return j8;
                }
            }
            throw C5230m0.e();
        }

        @Override // com.google.protobuf.r
        public void popLimit(int i8) {
            this.f26688n = i8;
            l();
        }

        @Override // com.google.protobuf.r
        public int pushLimit(int i8) throws C5230m0 {
            if (i8 < 0) {
                throw C5230m0.f();
            }
            int i9 = i8 + this.f26687m + this.f26685k;
            int i10 = this.f26688n;
            if (i9 > i10) {
                throw C5230m0.k();
            }
            this.f26688n = i9;
            l();
            return i10;
        }

        @Override // com.google.protobuf.r
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.r
        public byte[] readByteArray() {
            int rawVarint32 = readRawVarint32();
            int i8 = this.f26683i;
            int i9 = this.f26685k;
            if (rawVarint32 > i8 - i9 || rawVarint32 <= 0) {
                return h(rawVarint32, false);
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f26682h, i9, i9 + rawVarint32);
            this.f26685k += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // com.google.protobuf.r
        public ByteBuffer readByteBuffer() {
            int rawVarint32 = readRawVarint32();
            int i8 = this.f26683i;
            int i9 = this.f26685k;
            if (rawVarint32 > i8 - i9 || rawVarint32 <= 0) {
                return rawVarint32 == 0 ? AbstractC5227l0.EMPTY_BYTE_BUFFER : ByteBuffer.wrap(h(rawVarint32, true));
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f26682h, i9, i9 + rawVarint32));
            this.f26685k += rawVarint32;
            return byteBufferWrap;
        }

        @Override // com.google.protobuf.r
        public AbstractC5235o readBytes() {
            int rawVarint32 = readRawVarint32();
            int i8 = this.f26683i;
            int i9 = this.f26685k;
            if (rawVarint32 > i8 - i9 || rawVarint32 <= 0) {
                return rawVarint32 == 0 ? AbstractC5235o.EMPTY : g(rawVarint32);
            }
            AbstractC5235o abstractC5235oCopyFrom = AbstractC5235o.copyFrom(this.f26682h, i9, rawVarint32);
            this.f26685k += rawVarint32;
            return abstractC5235oCopyFrom;
        }

        @Override // com.google.protobuf.r
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.r
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.r
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.r
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.r
        public void readGroup(int i8, K0.a aVar, M m8) throws C5230m0 {
            checkRecursionLimit();
            this.f26652a++;
            aVar.mergeFrom(this, m8);
            checkLastTagWas(P1.a(i8, 4));
            this.f26652a--;
        }

        @Override // com.google.protobuf.r
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.r
        public void readMessage(K0.a aVar, M m8) throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f26652a++;
            aVar.mergeFrom(this, m8);
            checkLastTagWas(0);
            this.f26652a--;
            if (getBytesUntilLimit() != 0) {
                throw C5230m0.k();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.r
        public byte readRawByte() throws C5230m0 {
            if (this.f26685k == this.f26683i) {
                m(1);
            }
            byte[] bArr = this.f26682h;
            int i8 = this.f26685k;
            this.f26685k = i8 + 1;
            return bArr[i8];
        }

        @Override // com.google.protobuf.r
        public byte[] readRawBytes(int i8) {
            int i9 = this.f26685k;
            if (i8 > this.f26683i - i9 || i8 <= 0) {
                return h(i8, false);
            }
            int i10 = i8 + i9;
            this.f26685k = i10;
            return Arrays.copyOfRange(this.f26682h, i9, i10);
        }

        @Override // com.google.protobuf.r
        public int readRawLittleEndian32() throws C5230m0 {
            int i8 = this.f26685k;
            if (this.f26683i - i8 < 4) {
                m(4);
                i8 = this.f26685k;
            }
            byte[] bArr = this.f26682h;
            this.f26685k = i8 + 4;
            return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.r
        public long readRawLittleEndian64() throws C5230m0 {
            int i8 = this.f26685k;
            if (this.f26683i - i8 < 8) {
                m(8);
                i8 = this.f26685k;
            }
            byte[] bArr = this.f26682h;
            this.f26685k = i8 + 8;
            return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
        }

        @Override // com.google.protobuf.r
        public int readRawVarint32() {
            int i8;
            int i9 = this.f26685k;
            int i10 = this.f26683i;
            if (i10 != i9) {
                byte[] bArr = this.f26682h;
                int i11 = i9 + 1;
                byte b9 = bArr[i9];
                if (b9 >= 0) {
                    this.f26685k = i11;
                    return b9;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i9 + 2;
                    int i13 = (bArr[i11] << 7) ^ b9;
                    if (i13 < 0) {
                        i8 = i13 ^ (-128);
                    } else {
                        int i14 = i9 + 3;
                        int i15 = (bArr[i12] << AbstractC5358c.SO) ^ i13;
                        if (i15 >= 0) {
                            i8 = i15 ^ 16256;
                        } else {
                            int i16 = i9 + 4;
                            int i17 = i15 ^ (bArr[i14] << AbstractC5358c.NAK);
                            if (i17 < 0) {
                                i8 = (-2080896) ^ i17;
                            } else {
                                i14 = i9 + 5;
                                byte b10 = bArr[i16];
                                int i18 = (i17 ^ (b10 << AbstractC5358c.FS)) ^ 266354560;
                                if (b10 < 0) {
                                    i16 = i9 + 6;
                                    if (bArr[i14] < 0) {
                                        i14 = i9 + 7;
                                        if (bArr[i16] < 0) {
                                            i16 = i9 + 8;
                                            if (bArr[i14] < 0) {
                                                i14 = i9 + 9;
                                                if (bArr[i16] < 0) {
                                                    int i19 = i9 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        i12 = i19;
                                                        i8 = i18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i8 = i18;
                                }
                                i8 = i18;
                            }
                            i12 = i16;
                        }
                        i12 = i14;
                    }
                    this.f26685k = i12;
                    return i8;
                }
            }
            return (int) k();
        }

        @Override // com.google.protobuf.r
        public long readRawVarint64() {
            long j8;
            long j9;
            long j10;
            int i8 = this.f26685k;
            int i9 = this.f26683i;
            if (i9 != i8) {
                byte[] bArr = this.f26682h;
                int i10 = i8 + 1;
                byte b9 = bArr[i8];
                if (b9 >= 0) {
                    this.f26685k = i10;
                    return b9;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b9;
                    if (i12 < 0) {
                        j8 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << AbstractC5358c.SO) ^ i12;
                        if (i14 >= 0) {
                            j8 = i14 ^ 16256;
                            i11 = i13;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << AbstractC5358c.NAK);
                            if (i16 < 0) {
                                long j11 = (-2080896) ^ i16;
                                i11 = i15;
                                j8 = j11;
                            } else {
                                long j12 = i16;
                                i11 = i8 + 5;
                                long j13 = j12 ^ (bArr[i15] << 28);
                                if (j13 >= 0) {
                                    j10 = 266354560;
                                } else {
                                    int i17 = i8 + 6;
                                    long j14 = j13 ^ (bArr[i11] << 35);
                                    if (j14 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        i11 = i8 + 7;
                                        j13 = j14 ^ (bArr[i17] << 42);
                                        if (j13 >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            i17 = i8 + 8;
                                            j14 = j13 ^ (bArr[i11] << 49);
                                            if (j14 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                i11 = i8 + 9;
                                                long j15 = (j14 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                                if (j15 < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i11] >= 0) {
                                                        i11 = i18;
                                                    }
                                                }
                                                j8 = j15;
                                            }
                                        }
                                    }
                                    j8 = j14 ^ j9;
                                    i11 = i17;
                                }
                                j8 = j13 ^ j10;
                            }
                        }
                    }
                    this.f26685k = i11;
                    return j8;
                }
            }
            return k();
        }

        @Override // com.google.protobuf.r
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.r
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.r
        public int readSInt32() {
            return r.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.r
        public long readSInt64() {
            return r.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.r
        public String readString() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i8 = this.f26683i;
                int i9 = this.f26685k;
                if (rawVarint32 <= i8 - i9) {
                    String str = new String(this.f26682h, i9, rawVarint32, AbstractC5227l0.f26567b);
                    this.f26685k += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 > this.f26683i) {
                return new String(h(rawVarint32, false), AbstractC5227l0.f26567b);
            }
            m(rawVarint32);
            String str2 = new String(this.f26682h, this.f26685k, rawVarint32, AbstractC5227l0.f26567b);
            this.f26685k += rawVarint32;
            return str2;
        }

        @Override // com.google.protobuf.r
        public String readStringRequireUtf8() throws IOException {
            byte[] bArrH;
            int rawVarint32 = readRawVarint32();
            int i8 = this.f26685k;
            int i9 = this.f26683i;
            if (rawVarint32 <= i9 - i8 && rawVarint32 > 0) {
                bArrH = this.f26682h;
                this.f26685k = i8 + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                i8 = 0;
                if (rawVarint32 <= i9) {
                    m(rawVarint32);
                    bArrH = this.f26682h;
                    this.f26685k = rawVarint32;
                } else {
                    bArrH = h(rawVarint32, false);
                }
            }
            return M1.h(bArrH, i8, rawVarint32);
        }

        @Override // com.google.protobuf.r
        public int readTag() throws C5230m0 {
            if (isAtEnd()) {
                this.f26686l = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f26686l = rawVarint32;
            if (P1.getTagFieldNumber(rawVarint32) != 0) {
                return this.f26686l;
            }
            throw C5230m0.b();
        }

        @Override // com.google.protobuf.r
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.r
        @Deprecated
        public void readUnknownGroup(int i8, K0.a aVar) throws C5230m0 {
            readGroup(i8, aVar, M.getEmptyRegistry());
        }

        @Override // com.google.protobuf.r
        public void resetSizeCounter() {
            this.f26687m = -this.f26685k;
        }

        @Override // com.google.protobuf.r
        public boolean skipField(int i8) throws C5230m0 {
            int tagWireType = P1.getTagWireType(i8);
            if (tagWireType == 0) {
                p();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(P1.a(P1.getTagFieldNumber(i8), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw C5230m0.d();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.r
        public void skipMessage() throws C5230m0 {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.r
        public void skipRawBytes(int i8) throws C5230m0 {
            int i9 = this.f26683i;
            int i10 = this.f26685k;
            if (i8 > i9 - i10 || i8 < 0) {
                o(i8);
            } else {
                this.f26685k = i10 + i8;
            }
        }

        private d(InputStream inputStream, int i8) {
            super();
            this.f26688n = Integer.MAX_VALUE;
            AbstractC5227l0.b(inputStream, "input");
            this.f26681g = inputStream;
            this.f26682h = new byte[i8];
            this.f26683i = 0;
            this.f26685k = 0;
            this.f26687m = 0;
        }

        @Override // com.google.protobuf.r
        public void skipMessage(AbstractC5248t abstractC5248t) throws C5230m0 {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, abstractC5248t));
        }

        @Override // com.google.protobuf.r
        public <T extends K0> T readGroup(int i8, Z0 z02, M m8) throws C5230m0 {
            checkRecursionLimit();
            this.f26652a++;
            T t8 = (T) z02.parsePartialFrom(this, m8);
            checkLastTagWas(P1.a(i8, 4));
            this.f26652a--;
            return t8;
        }

        @Override // com.google.protobuf.r
        public boolean skipField(int i8, AbstractC5248t abstractC5248t) throws C5230m0 {
            int tagWireType = P1.getTagWireType(i8);
            if (tagWireType == 0) {
                long int64 = readInt64();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                AbstractC5235o bytes = readBytes();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                abstractC5248t.writeUInt32NoTag(i8);
                skipMessage(abstractC5248t);
                int iA = P1.a(P1.getTagFieldNumber(i8), 4);
                checkLastTagWas(iA);
                abstractC5248t.writeUInt32NoTag(iA);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw C5230m0.d();
        }

        @Override // com.google.protobuf.r
        public <T extends K0> T readMessage(Z0 z02, M m8) throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f26652a++;
            T t8 = (T) z02.parsePartialFrom(this, m8);
            checkLastTagWas(0);
            this.f26652a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t8;
            }
            throw C5230m0.k();
        }
    }

    private static final class e extends r {

        /* renamed from: g */
        private final ByteBuffer f26689g;

        /* renamed from: h */
        private final boolean f26690h;

        /* renamed from: i */
        private final long f26691i;

        /* renamed from: j */
        private long f26692j;

        /* renamed from: k */
        private long f26693k;

        /* renamed from: l */
        private long f26694l;

        /* renamed from: m */
        private int f26695m;

        /* renamed from: n */
        private int f26696n;

        /* renamed from: o */
        private boolean f26697o;

        /* renamed from: p */
        private int f26698p;

        /* synthetic */ e(ByteBuffer byteBuffer, boolean z8, a aVar) {
            this(byteBuffer, z8);
        }

        private int e(long j8) {
            return (int) (j8 - this.f26691i);
        }

        static boolean f() {
            return L1.L();
        }

        private void h() {
            long j8 = this.f26692j + this.f26695m;
            this.f26692j = j8;
            int i8 = (int) (j8 - this.f26694l);
            int i9 = this.f26698p;
            if (i8 <= i9) {
                this.f26695m = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f26695m = i10;
            this.f26692j = j8 - i10;
        }

        private int i() {
            return (int) (this.f26692j - this.f26693k);
        }

        private void j() throws C5230m0 {
            if (i() >= 10) {
                k();
            } else {
                l();
            }
        }

        private void k() throws C5230m0 {
            for (int i8 = 0; i8 < 10; i8++) {
                long j8 = this.f26693k;
                this.f26693k = 1 + j8;
                if (L1.x(j8) >= 0) {
                    return;
                }
            }
            throw C5230m0.e();
        }

        private void l() throws C5230m0 {
            for (int i8 = 0; i8 < 10; i8++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw C5230m0.e();
        }

        private ByteBuffer m(long j8, long j9) {
            int iPosition = this.f26689g.position();
            int iLimit = this.f26689g.limit();
            ByteBuffer byteBuffer = this.f26689g;
            try {
                try {
                    byteBuffer.position(e(j8));
                    byteBuffer.limit(e(j9));
                    return this.f26689g.slice();
                } catch (IllegalArgumentException e8) {
                    C5230m0 c5230m0K = C5230m0.k();
                    c5230m0K.initCause(e8);
                    throw c5230m0K;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        @Override // com.google.protobuf.r
        public void checkLastTagWas(int i8) throws C5230m0 {
            if (this.f26696n != i8) {
                throw C5230m0.a();
            }
        }

        @Override // com.google.protobuf.r
        public void enableAliasing(boolean z8) {
            this.f26697o = z8;
        }

        long g() throws C5230m0 {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & 127) << i8;
                if ((readRawByte() & 128) == 0) {
                    return j8;
                }
            }
            throw C5230m0.e();
        }

        @Override // com.google.protobuf.r
        public int getBytesUntilLimit() {
            int i8 = this.f26698p;
            if (i8 == Integer.MAX_VALUE) {
                return -1;
            }
            return i8 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.r
        public int getLastTag() {
            return this.f26696n;
        }

        @Override // com.google.protobuf.r
        public int getTotalBytesRead() {
            return (int) (this.f26693k - this.f26694l);
        }

        @Override // com.google.protobuf.r
        public boolean isAtEnd() {
            return this.f26693k == this.f26692j;
        }

        @Override // com.google.protobuf.r
        public void popLimit(int i8) {
            this.f26698p = i8;
            h();
        }

        @Override // com.google.protobuf.r
        public int pushLimit(int i8) throws C5230m0 {
            if (i8 < 0) {
                throw C5230m0.f();
            }
            int totalBytesRead = i8 + getTotalBytesRead();
            int i9 = this.f26698p;
            if (totalBytesRead > i9) {
                throw C5230m0.k();
            }
            this.f26698p = totalBytesRead;
            h();
            return i9;
        }

        @Override // com.google.protobuf.r
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.r
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.r
        public ByteBuffer readByteBuffer() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > i()) {
                if (rawVarint32 == 0) {
                    return AbstractC5227l0.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw C5230m0.f();
                }
                throw C5230m0.k();
            }
            if (this.f26690h || !this.f26697o) {
                byte[] bArr = new byte[rawVarint32];
                long j8 = rawVarint32;
                L1.p(this.f26693k, bArr, 0L, j8);
                this.f26693k += j8;
                return ByteBuffer.wrap(bArr);
            }
            long j9 = this.f26693k;
            long j10 = rawVarint32;
            ByteBuffer byteBufferM = m(j9, j9 + j10);
            this.f26693k += j10;
            return byteBufferM;
        }

        @Override // com.google.protobuf.r
        public AbstractC5235o readBytes() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > i()) {
                if (rawVarint32 == 0) {
                    return AbstractC5235o.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw C5230m0.f();
                }
                throw C5230m0.k();
            }
            if (this.f26690h && this.f26697o) {
                long j8 = this.f26693k;
                long j9 = rawVarint32;
                ByteBuffer byteBufferM = m(j8, j8 + j9);
                this.f26693k += j9;
                return AbstractC5235o.r(byteBufferM);
            }
            byte[] bArr = new byte[rawVarint32];
            long j10 = rawVarint32;
            L1.p(this.f26693k, bArr, 0L, j10);
            this.f26693k += j10;
            return AbstractC5235o.s(bArr);
        }

        @Override // com.google.protobuf.r
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.r
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.r
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.r
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.r
        public void readGroup(int i8, K0.a aVar, M m8) throws C5230m0 {
            checkRecursionLimit();
            this.f26652a++;
            aVar.mergeFrom(this, m8);
            checkLastTagWas(P1.a(i8, 4));
            this.f26652a--;
        }

        @Override // com.google.protobuf.r
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.r
        public void readMessage(K0.a aVar, M m8) throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f26652a++;
            aVar.mergeFrom(this, m8);
            checkLastTagWas(0);
            this.f26652a--;
            if (getBytesUntilLimit() != 0) {
                throw C5230m0.k();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.r
        public byte readRawByte() throws C5230m0 {
            long j8 = this.f26693k;
            if (j8 == this.f26692j) {
                throw C5230m0.k();
            }
            this.f26693k = 1 + j8;
            return L1.x(j8);
        }

        @Override // com.google.protobuf.r
        public byte[] readRawBytes(int i8) throws C5230m0 {
            if (i8 < 0 || i8 > i()) {
                if (i8 > 0) {
                    throw C5230m0.k();
                }
                if (i8 == 0) {
                    return AbstractC5227l0.EMPTY_BYTE_ARRAY;
                }
                throw C5230m0.f();
            }
            byte[] bArr = new byte[i8];
            long j8 = this.f26693k;
            long j9 = i8;
            m(j8, j8 + j9).get(bArr);
            this.f26693k += j9;
            return bArr;
        }

        @Override // com.google.protobuf.r
        public int readRawLittleEndian32() throws C5230m0 {
            long j8 = this.f26693k;
            if (this.f26692j - j8 < 4) {
                throw C5230m0.k();
            }
            this.f26693k = 4 + j8;
            return ((L1.x(j8 + 3) & 255) << 24) | (L1.x(j8) & 255) | ((L1.x(1 + j8) & 255) << 8) | ((L1.x(2 + j8) & 255) << 16);
        }

        @Override // com.google.protobuf.r
        public long readRawLittleEndian64() throws C5230m0 {
            long j8 = this.f26693k;
            if (this.f26692j - j8 < 8) {
                throw C5230m0.k();
            }
            this.f26693k = 8 + j8;
            return ((L1.x(j8 + 7) & 255) << 56) | (L1.x(j8) & 255) | ((L1.x(1 + j8) & 255) << 8) | ((L1.x(2 + j8) & 255) << 16) | ((L1.x(3 + j8) & 255) << 24) | ((L1.x(4 + j8) & 255) << 32) | ((L1.x(5 + j8) & 255) << 40) | ((L1.x(6 + j8) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:73:0x008c, code lost:
        
            if (com.google.protobuf.L1.x(r3) < 0) goto L74;
         */
        @Override // com.google.protobuf.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() {
            /*
                r9 = this;
                long r0 = r9.f26693k
                long r2 = r9.f26692j
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.L1.x(r0)
                if (r4 < 0) goto L16
                r9.f26693k = r2
                return r4
            L16:
                long r5 = r9.f26692j
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.L1.x(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.L1.x(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.L1.x(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.L1.x(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.L1.x(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.L1.x(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.L1.x(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.L1.x(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.L1.x(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.g()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f26693k = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.r.e.readRawVarint32():int");
        }

        @Override // com.google.protobuf.r
        public long readRawVarint64() {
            long j8;
            long j9;
            long j10;
            int i8;
            long j11 = this.f26693k;
            if (this.f26692j != j11) {
                long j12 = 1 + j11;
                byte bX = L1.x(j11);
                if (bX >= 0) {
                    this.f26693k = j12;
                    return bX;
                }
                if (this.f26692j - j12 >= 9) {
                    long j13 = 2 + j11;
                    int iX = (L1.x(j12) << 7) ^ bX;
                    if (iX >= 0) {
                        long j14 = 3 + j11;
                        int iX2 = iX ^ (L1.x(j13) << AbstractC5358c.SO);
                        if (iX2 >= 0) {
                            j8 = iX2 ^ 16256;
                            j13 = j14;
                        } else {
                            j13 = 4 + j11;
                            int iX3 = iX2 ^ (L1.x(j14) << AbstractC5358c.NAK);
                            if (iX3 < 0) {
                                i8 = (-2080896) ^ iX3;
                            } else {
                                long j15 = 5 + j11;
                                long jX = iX3 ^ (L1.x(j13) << 28);
                                if (jX >= 0) {
                                    j10 = 266354560;
                                } else {
                                    long j16 = 6 + j11;
                                    long jX2 = jX ^ (L1.x(j15) << 35);
                                    if (jX2 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        j15 = 7 + j11;
                                        jX = jX2 ^ (L1.x(j16) << 42);
                                        if (jX >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            j16 = 8 + j11;
                                            jX2 = jX ^ (L1.x(j15) << 49);
                                            if (jX2 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                long j17 = j11 + 9;
                                                long jX3 = (jX2 ^ (L1.x(j16) << 56)) ^ 71499008037633920L;
                                                if (jX3 < 0) {
                                                    long j18 = j11 + 10;
                                                    if (L1.x(j17) >= 0) {
                                                        j13 = j18;
                                                        j8 = jX3;
                                                    }
                                                } else {
                                                    j8 = jX3;
                                                    j13 = j17;
                                                }
                                            }
                                        }
                                    }
                                    j8 = j9 ^ jX2;
                                    j13 = j16;
                                }
                                j8 = j10 ^ jX;
                                j13 = j15;
                            }
                        }
                        this.f26693k = j13;
                        return j8;
                    }
                    i8 = iX ^ (-128);
                    j8 = i8;
                    this.f26693k = j13;
                    return j8;
                }
            }
            return g();
        }

        @Override // com.google.protobuf.r
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.r
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.r
        public int readSInt32() {
            return r.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.r
        public long readSInt64() {
            return r.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.r
        public String readString() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > i()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw C5230m0.f();
                }
                throw C5230m0.k();
            }
            byte[] bArr = new byte[rawVarint32];
            long j8 = rawVarint32;
            L1.p(this.f26693k, bArr, 0L, j8);
            String str = new String(bArr, AbstractC5227l0.f26567b);
            this.f26693k += j8;
            return str;
        }

        @Override // com.google.protobuf.r
        public String readStringRequireUtf8() throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= i()) {
                String strG = M1.g(this.f26689g, e(this.f26693k), rawVarint32);
                this.f26693k += rawVarint32;
                return strG;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw C5230m0.f();
            }
            throw C5230m0.k();
        }

        @Override // com.google.protobuf.r
        public int readTag() throws C5230m0 {
            if (isAtEnd()) {
                this.f26696n = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f26696n = rawVarint32;
            if (P1.getTagFieldNumber(rawVarint32) != 0) {
                return this.f26696n;
            }
            throw C5230m0.b();
        }

        @Override // com.google.protobuf.r
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.r
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.r
        @Deprecated
        public void readUnknownGroup(int i8, K0.a aVar) throws C5230m0 {
            readGroup(i8, aVar, M.getEmptyRegistry());
        }

        @Override // com.google.protobuf.r
        public void resetSizeCounter() {
            this.f26694l = this.f26693k;
        }

        @Override // com.google.protobuf.r
        public boolean skipField(int i8) throws C5230m0 {
            int tagWireType = P1.getTagWireType(i8);
            if (tagWireType == 0) {
                j();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(P1.a(P1.getTagFieldNumber(i8), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw C5230m0.d();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.r
        public void skipMessage() throws C5230m0 {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.r
        public void skipRawBytes(int i8) throws C5230m0 {
            if (i8 >= 0 && i8 <= i()) {
                this.f26693k += i8;
            } else {
                if (i8 >= 0) {
                    throw C5230m0.k();
                }
                throw C5230m0.f();
            }
        }

        private e(ByteBuffer byteBuffer, boolean z8) {
            super();
            this.f26698p = Integer.MAX_VALUE;
            this.f26689g = byteBuffer;
            long jK = L1.k(byteBuffer);
            this.f26691i = jK;
            this.f26692j = byteBuffer.limit() + jK;
            long jPosition = jK + byteBuffer.position();
            this.f26693k = jPosition;
            this.f26694l = jPosition;
            this.f26690h = z8;
        }

        @Override // com.google.protobuf.r
        public void skipMessage(AbstractC5248t abstractC5248t) throws C5230m0 {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, abstractC5248t));
        }

        @Override // com.google.protobuf.r
        public <T extends K0> T readGroup(int i8, Z0 z02, M m8) throws C5230m0 {
            checkRecursionLimit();
            this.f26652a++;
            T t8 = (T) z02.parsePartialFrom(this, m8);
            checkLastTagWas(P1.a(i8, 4));
            this.f26652a--;
            return t8;
        }

        @Override // com.google.protobuf.r
        public boolean skipField(int i8, AbstractC5248t abstractC5248t) throws C5230m0 {
            int tagWireType = P1.getTagWireType(i8);
            if (tagWireType == 0) {
                long int64 = readInt64();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                AbstractC5235o bytes = readBytes();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                abstractC5248t.writeUInt32NoTag(i8);
                skipMessage(abstractC5248t);
                int iA = P1.a(P1.getTagFieldNumber(i8), 4);
                checkLastTagWas(iA);
                abstractC5248t.writeUInt32NoTag(iA);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                abstractC5248t.writeUInt32NoTag(i8);
                abstractC5248t.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw C5230m0.d();
        }

        @Override // com.google.protobuf.r
        public <T extends K0> T readMessage(Z0 z02, M m8) throws C5230m0 {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f26652a++;
            T t8 = (T) z02.parsePartialFrom(this, m8);
            checkLastTagWas(0);
            this.f26652a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t8;
            }
            throw C5230m0.k();
        }
    }

    /* synthetic */ r(a aVar) {
        this();
    }

    static r a(Iterable iterable, boolean z8) {
        Iterator it = iterable.iterator();
        int i8 = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            i8 = byteBuffer.hasArray() ? i8 | 1 : byteBuffer.isDirect() ? i8 | 2 : i8 | 4;
        }
        return i8 == 2 ? new c(iterable, iRemaining, z8) : newInstance(new C5233n0(iterable));
    }

    static r b(ByteBuffer byteBuffer, boolean z8) {
        if (byteBuffer.hasArray()) {
            return c(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z8);
        }
        if (byteBuffer.isDirect() && e.f()) {
            return new e(byteBuffer, z8);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return c(bArr, 0, iRemaining, true);
    }

    static r c(byte[] bArr, int i8, int i9, boolean z8) {
        b bVar = new b(bArr, i8, i9, z8);
        try {
            bVar.pushLimit(i9);
            return bVar;
        } catch (C5230m0 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int decodeZigZag32(int i8) {
        return (-(i8 & 1)) ^ (i8 >>> 1);
    }

    public static long decodeZigZag64(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public static r newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i8, InputStream inputStream) throws IOException {
        if ((i8 & 128) == 0) {
            return i8;
        }
        int i9 = i8 & 127;
        int i10 = 7;
        while (i10 < 32) {
            int i11 = inputStream.read();
            if (i11 == -1) {
                throw C5230m0.k();
            }
            i9 |= (i11 & 127) << i10;
            if ((i11 & 128) == 0) {
                return i9;
            }
            i10 += 7;
        }
        while (i10 < 64) {
            int i12 = inputStream.read();
            if (i12 == -1) {
                throw C5230m0.k();
            }
            if ((i12 & 128) == 0) {
                return i9;
            }
            i10 += 7;
        }
        throw C5230m0.e();
    }

    public abstract void checkLastTagWas(int i8);

    public void checkRecursionLimit() throws C5230m0 {
        if (this.f26652a >= this.f26653b) {
            throw C5230m0.h();
        }
    }

    final boolean d() {
        return this.f26656e;
    }

    public abstract void enableAliasing(boolean z8);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd();

    public abstract void popLimit(int i8);

    public abstract int pushLimit(int i8);

    public abstract boolean readBool();

    public abstract byte[] readByteArray();

    public abstract ByteBuffer readByteBuffer();

    public abstract AbstractC5235o readBytes();

    public abstract double readDouble();

    public abstract int readEnum();

    public abstract int readFixed32();

    public abstract long readFixed64();

    public abstract float readFloat();

    public abstract <T extends K0> T readGroup(int i8, Z0 z02, M m8);

    public abstract void readGroup(int i8, K0.a aVar, M m8);

    public abstract int readInt32();

    public abstract long readInt64();

    public abstract <T extends K0> T readMessage(Z0 z02, M m8);

    public abstract void readMessage(K0.a aVar, M m8);

    public abstract byte readRawByte();

    public abstract byte[] readRawBytes(int i8);

    public abstract int readRawLittleEndian32();

    public abstract long readRawLittleEndian64();

    public abstract int readRawVarint32();

    public abstract long readRawVarint64();

    public abstract int readSFixed32();

    public abstract long readSFixed64();

    public abstract int readSInt32();

    public abstract long readSInt64();

    public abstract String readString();

    public abstract String readStringRequireUtf8();

    public abstract int readTag();

    public abstract int readUInt32();

    public abstract long readUInt64();

    @Deprecated
    public abstract void readUnknownGroup(int i8, K0.a aVar);

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i8) {
        if (i8 >= 0) {
            int i9 = this.f26653b;
            this.f26653b = i8;
            return i9;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i8);
    }

    public final int setSizeLimit(int i8) {
        if (i8 >= 0) {
            int i9 = this.f26654c;
            this.f26654c = i8;
            return i9;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i8);
    }

    public abstract boolean skipField(int i8);

    @Deprecated
    public abstract boolean skipField(int i8, AbstractC5248t abstractC5248t);

    public abstract void skipMessage();

    public abstract void skipMessage(AbstractC5248t abstractC5248t);

    public abstract void skipRawBytes(int i8);

    private r() {
        this.f26653b = f26651f;
        this.f26654c = Integer.MAX_VALUE;
        this.f26656e = false;
    }

    public static r newInstance(InputStream inputStream, int i8) {
        if (i8 > 0) {
            return inputStream == null ? newInstance(AbstractC5227l0.EMPTY_BYTE_ARRAY) : new d(inputStream, i8);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static r newInstance(Iterable<ByteBuffer> iterable) {
        if (!e.f()) {
            return newInstance(new C5233n0(iterable));
        }
        return a(iterable, false);
    }

    public static r newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static r newInstance(byte[] bArr, int i8, int i9) {
        return c(bArr, i8, i9, false);
    }

    public static r newInstance(ByteBuffer byteBuffer) {
        return b(byteBuffer, false);
    }
}
