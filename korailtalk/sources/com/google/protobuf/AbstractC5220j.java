package com.google.protobuf;

import com.google.protobuf.A0;
import com.google.protobuf.C5230m0;
import com.google.protobuf.P1;
import e3.AbstractC5358c;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.j */
/* loaded from: classes2.dex */
abstract class AbstractC5220j implements InterfaceC5210f1 {

    /* renamed from: com.google.protobuf.j$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26545a;

        static {
            int[] iArr = new int[P1.b.values().length];
            f26545a = iArr;
            try {
                iArr[P1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26545a[P1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26545a[P1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26545a[P1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26545a[P1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26545a[P1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26545a[P1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26545a[P1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26545a[P1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26545a[P1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26545a[P1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26545a[P1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26545a[P1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26545a[P1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26545a[P1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26545a[P1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26545a[P1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* synthetic */ AbstractC5220j(a aVar) {
        this();
    }

    public static AbstractC5220j newInstance(ByteBuffer byteBuffer, boolean z8) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z8);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ int getFieldNumber();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ int getTag();

    public abstract int getTotalBytesRead();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void mergeGroupField(Object obj, InterfaceC5219i1 interfaceC5219i1, M m8);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void mergeMessageField(Object obj, InterfaceC5219i1 interfaceC5219i1, M m8);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ boolean readBool();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readBoolList(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ AbstractC5235o readBytes();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readBytesList(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ double readDouble();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readDoubleList(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ int readEnum();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readEnumList(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ int readFixed32();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readFixed32List(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ long readFixed64();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readFixed64List(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ float readFloat();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readFloatList(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    @Deprecated
    public abstract /* synthetic */ Object readGroup(Class cls, M m8);

    @Override // com.google.protobuf.InterfaceC5210f1
    @Deprecated
    public abstract /* synthetic */ Object readGroupBySchemaWithCheck(InterfaceC5219i1 interfaceC5219i1, M m8);

    @Override // com.google.protobuf.InterfaceC5210f1
    @Deprecated
    public abstract /* synthetic */ void readGroupList(List list, InterfaceC5219i1 interfaceC5219i1, M m8);

    @Override // com.google.protobuf.InterfaceC5210f1
    @Deprecated
    public abstract /* synthetic */ void readGroupList(List list, Class cls, M m8);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ int readInt32();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readInt32List(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ long readInt64();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readInt64List(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readMap(Map map, A0.b bVar, M m8);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ Object readMessage(Class cls, M m8);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ Object readMessageBySchemaWithCheck(InterfaceC5219i1 interfaceC5219i1, M m8);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readMessageList(List list, InterfaceC5219i1 interfaceC5219i1, M m8);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readMessageList(List list, Class cls, M m8);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ int readSFixed32();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readSFixed32List(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ long readSFixed64();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readSFixed64List(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ int readSInt32();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readSInt32List(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ long readSInt64();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readSInt64List(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ String readString();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readStringList(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readStringListRequireUtf8(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ String readStringRequireUtf8();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ int readUInt32();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readUInt32List(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ long readUInt64();

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ void readUInt64List(List list);

    @Override // com.google.protobuf.InterfaceC5210f1
    public boolean shouldDiscardUnknownFields() {
        return false;
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public abstract /* synthetic */ boolean skipField();

    /* renamed from: com.google.protobuf.j$b */
    private static final class b extends AbstractC5220j {

        /* renamed from: a */
        private final boolean f26546a;

        /* renamed from: b */
        private final byte[] f26547b;

        /* renamed from: c */
        private int f26548c;

        /* renamed from: d */
        private final int f26549d;

        /* renamed from: e */
        private int f26550e;

        /* renamed from: f */
        private int f26551f;

        /* renamed from: g */
        private int f26552g;

        public b(ByteBuffer byteBuffer, boolean z8) {
            super(null);
            this.f26546a = z8;
            this.f26547b = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f26548c = iArrayOffset;
            this.f26549d = iArrayOffset;
            this.f26550e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean a() {
            return this.f26548c == this.f26550e;
        }

        private byte b() throws C5230m0 {
            int i8 = this.f26548c;
            if (i8 == this.f26550e) {
                throw C5230m0.k();
            }
            byte[] bArr = this.f26547b;
            this.f26548c = i8 + 1;
            return bArr[i8];
        }

        private Object c(P1.b bVar, Class cls, M m8) {
            switch (a.f26545a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(readBool());
                case 2:
                    return readBytes();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(readEnum());
                case 5:
                    return Integer.valueOf(readFixed32());
                case 6:
                    return Long.valueOf(readFixed64());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(readInt32());
                case 9:
                    return Long.valueOf(readInt64());
                case 10:
                    return readMessage(cls, m8);
                case 11:
                    return Integer.valueOf(readSFixed32());
                case 12:
                    return Long.valueOf(readSFixed64());
                case 13:
                    return Integer.valueOf(readSInt32());
                case 14:
                    return Long.valueOf(readSInt64());
                case 15:
                    return readStringRequireUtf8();
                case 16:
                    return Integer.valueOf(readUInt32());
                case 17:
                    return Long.valueOf(readUInt64());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private Object d(InterfaceC5219i1 interfaceC5219i1, M m8) {
            Object objNewInstance = interfaceC5219i1.newInstance();
            mergeGroupField(objNewInstance, interfaceC5219i1, m8);
            interfaceC5219i1.makeImmutable(objNewInstance);
            return objNewInstance;
        }

        private int e() throws C5230m0 {
            l(4);
            return f();
        }

        private int f() {
            int i8 = this.f26548c;
            byte[] bArr = this.f26547b;
            this.f26548c = i8 + 4;
            return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        }

        private long g() throws C5230m0 {
            l(8);
            return h();
        }

        private long h() {
            int i8 = this.f26548c;
            byte[] bArr = this.f26547b;
            this.f26548c = i8 + 8;
            return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
        }

        private Object i(InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0 {
            Object objNewInstance = interfaceC5219i1.newInstance();
            mergeMessageField(objNewInstance, interfaceC5219i1, m8);
            interfaceC5219i1.makeImmutable(objNewInstance);
            return objNewInstance;
        }

        private int j() throws C5230m0 {
            int i8;
            int i9 = this.f26548c;
            int i10 = this.f26550e;
            if (i10 == i9) {
                throw C5230m0.k();
            }
            byte[] bArr = this.f26547b;
            int i11 = i9 + 1;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.f26548c = i11;
                return b9;
            }
            if (i10 - i11 < 9) {
                return (int) k();
            }
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
                                            if (bArr[i14] < 0) {
                                                throw C5230m0.e();
                                            }
                                            i12 = i19;
                                            i8 = i18;
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
            this.f26548c = i12;
            return i8;
        }

        private long k() throws C5230m0 {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & 127) << i8;
                if ((b() & 128) == 0) {
                    return j8;
                }
            }
            throw C5230m0.e();
        }

        private void l(int i8) throws C5230m0 {
            if (i8 < 0 || i8 > this.f26550e - this.f26548c) {
                throw C5230m0.k();
            }
        }

        private void m(int i8) throws C5230m0 {
            if (this.f26548c != i8) {
                throw C5230m0.k();
            }
        }

        private void n(int i8) throws C5230m0.a {
            if (P1.getTagWireType(this.f26551f) != i8) {
                throw C5230m0.d();
            }
        }

        private void o(int i8) throws C5230m0 {
            l(i8);
            this.f26548c += i8;
        }

        private void p() throws C5230m0 {
            int i8 = this.f26552g;
            this.f26552g = P1.a(P1.getTagFieldNumber(this.f26551f), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.f26551f != this.f26552g) {
                throw C5230m0.g();
            }
            this.f26552g = i8;
        }

        private void q() throws C5230m0 {
            int i8 = this.f26550e;
            int i9 = this.f26548c;
            if (i8 - i9 >= 10) {
                byte[] bArr = this.f26547b;
                int i10 = 0;
                while (i10 < 10) {
                    int i11 = i9 + 1;
                    if (bArr[i9] >= 0) {
                        this.f26548c = i11;
                        return;
                    } else {
                        i10++;
                        i9 = i11;
                    }
                }
            }
            r();
        }

        private void r() throws C5230m0 {
            for (int i8 = 0; i8 < 10; i8++) {
                if (b() >= 0) {
                    return;
                }
            }
            throw C5230m0.e();
        }

        private void s(int i8) throws C5230m0 {
            l(i8);
            if ((i8 & 3) != 0) {
                throw C5230m0.g();
            }
        }

        private void t(int i8) throws C5230m0 {
            l(i8);
            if ((i8 & 7) != 0) {
                throw C5230m0.g();
            }
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public int getFieldNumber() throws C5230m0 {
            if (a()) {
                return Integer.MAX_VALUE;
            }
            int iJ = j();
            this.f26551f = iJ;
            if (iJ == this.f26552g) {
                return Integer.MAX_VALUE;
            }
            return P1.getTagFieldNumber(iJ);
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public int getTag() {
            return this.f26551f;
        }

        @Override // com.google.protobuf.AbstractC5220j
        public int getTotalBytesRead() {
            return this.f26548c - this.f26549d;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public <T> void mergeGroupField(T t8, InterfaceC5219i1 interfaceC5219i1, M m8) {
            int i8 = this.f26552g;
            this.f26552g = P1.a(P1.getTagFieldNumber(this.f26551f), 4);
            try {
                interfaceC5219i1.mergeFrom(t8, this, m8);
                if (this.f26551f == this.f26552g) {
                } else {
                    throw C5230m0.g();
                }
            } finally {
                this.f26552g = i8;
            }
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public <T> void mergeMessageField(T t8, InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0 {
            int iJ = j();
            l(iJ);
            int i8 = this.f26550e;
            int i9 = this.f26548c + iJ;
            this.f26550e = i9;
            try {
                interfaceC5219i1.mergeFrom(t8, this, m8);
                if (this.f26548c == i9) {
                } else {
                    throw C5230m0.g();
                }
            } finally {
                this.f26550e = i8;
            }
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public boolean readBool() throws C5230m0.a {
            n(0);
            return j() != 0;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readBoolList(List<Boolean> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5229m)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw C5230m0.d();
                    }
                    int iJ = this.f26548c + j();
                    while (this.f26548c < iJ) {
                        list.add(Boolean.valueOf(j() != 0));
                    }
                    m(iJ);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(readBool()));
                    if (a()) {
                        return;
                    } else {
                        i8 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i8;
                return;
            }
            C5229m c5229m = (C5229m) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw C5230m0.d();
                }
                int iJ2 = this.f26548c + j();
                while (this.f26548c < iJ2) {
                    c5229m.addBoolean(j() != 0);
                }
                m(iJ2);
                return;
            }
            do {
                c5229m.addBoolean(readBool());
                if (a()) {
                    return;
                } else {
                    i9 = this.f26548c;
                }
            } while (j() == this.f26551f);
            this.f26548c = i9;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public AbstractC5235o readBytes() throws C5230m0 {
            n(2);
            int iJ = j();
            if (iJ == 0) {
                return AbstractC5235o.EMPTY;
            }
            l(iJ);
            AbstractC5235o abstractC5235oT = this.f26546a ? AbstractC5235o.t(this.f26547b, this.f26548c, iJ) : AbstractC5235o.copyFrom(this.f26547b, this.f26548c, iJ);
            this.f26548c += iJ;
            return abstractC5235oT;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readBytesList(List<AbstractC5235o> list) throws C5230m0.a {
            int i8;
            if (P1.getTagWireType(this.f26551f) != 2) {
                throw C5230m0.d();
            }
            do {
                list.add(readBytes());
                if (a()) {
                    return;
                } else {
                    i8 = this.f26548c;
                }
            } while (j() == this.f26551f);
            this.f26548c = i8;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public double readDouble() throws C5230m0.a {
            n(1);
            return Double.longBitsToDouble(g());
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readDoubleList(List<Double> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5271y)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (a()) {
                            return;
                        } else {
                            i8 = this.f26548c;
                        }
                    } while (j() == this.f26551f);
                    this.f26548c = i8;
                    return;
                }
                if (tagWireType != 2) {
                    throw C5230m0.d();
                }
                int iJ = j();
                t(iJ);
                int i10 = this.f26548c + iJ;
                while (this.f26548c < i10) {
                    list.add(Double.valueOf(Double.longBitsToDouble(h())));
                }
                return;
            }
            C5271y c5271y = (C5271y) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 == 1) {
                do {
                    c5271y.addDouble(readDouble());
                    if (a()) {
                        return;
                    } else {
                        i9 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i9;
                return;
            }
            if (tagWireType2 != 2) {
                throw C5230m0.d();
            }
            int iJ2 = j();
            t(iJ2);
            int i11 = this.f26548c + iJ2;
            while (this.f26548c < i11) {
                c5271y.addDouble(Double.longBitsToDouble(h()));
            }
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public int readEnum() throws C5230m0.a {
            n(0);
            return j();
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readEnumList(List<Integer> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5224k0)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw C5230m0.d();
                    }
                    int iJ = this.f26548c + j();
                    while (this.f26548c < iJ) {
                        list.add(Integer.valueOf(j()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readEnum()));
                    if (a()) {
                        return;
                    } else {
                        i8 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i8;
                return;
            }
            C5224k0 c5224k0 = (C5224k0) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw C5230m0.d();
                }
                int iJ2 = this.f26548c + j();
                while (this.f26548c < iJ2) {
                    c5224k0.addInt(j());
                }
                return;
            }
            do {
                c5224k0.addInt(readEnum());
                if (a()) {
                    return;
                } else {
                    i9 = this.f26548c;
                }
            } while (j() == this.f26551f);
            this.f26548c = i9;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public int readFixed32() throws C5230m0.a {
            n(5);
            return e();
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readFixed32List(List<Integer> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5224k0)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType == 2) {
                    int iJ = j();
                    s(iJ);
                    int i10 = this.f26548c + iJ;
                    while (this.f26548c < i10) {
                        list.add(Integer.valueOf(f()));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw C5230m0.d();
                }
                do {
                    list.add(Integer.valueOf(readFixed32()));
                    if (a()) {
                        return;
                    } else {
                        i8 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i8;
                return;
            }
            C5224k0 c5224k0 = (C5224k0) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 == 2) {
                int iJ2 = j();
                s(iJ2);
                int i11 = this.f26548c + iJ2;
                while (this.f26548c < i11) {
                    c5224k0.addInt(f());
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw C5230m0.d();
            }
            do {
                c5224k0.addInt(readFixed32());
                if (a()) {
                    return;
                } else {
                    i9 = this.f26548c;
                }
            } while (j() == this.f26551f);
            this.f26548c = i9;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public long readFixed64() throws C5230m0.a {
            n(1);
            return g();
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readFixed64List(List<Long> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5270x0)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType == 1) {
                    do {
                        list.add(Long.valueOf(readFixed64()));
                        if (a()) {
                            return;
                        } else {
                            i8 = this.f26548c;
                        }
                    } while (j() == this.f26551f);
                    this.f26548c = i8;
                    return;
                }
                if (tagWireType != 2) {
                    throw C5230m0.d();
                }
                int iJ = j();
                t(iJ);
                int i10 = this.f26548c + iJ;
                while (this.f26548c < i10) {
                    list.add(Long.valueOf(h()));
                }
                return;
            }
            C5270x0 c5270x0 = (C5270x0) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 == 1) {
                do {
                    c5270x0.addLong(readFixed64());
                    if (a()) {
                        return;
                    } else {
                        i9 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i9;
                return;
            }
            if (tagWireType2 != 2) {
                throw C5230m0.d();
            }
            int iJ2 = j();
            t(iJ2);
            int i11 = this.f26548c + iJ2;
            while (this.f26548c < i11) {
                c5270x0.addLong(h());
            }
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public float readFloat() throws C5230m0.a {
            n(5);
            return Float.intBitsToFloat(e());
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readFloatList(List<Float> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof Y)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType == 2) {
                    int iJ = j();
                    s(iJ);
                    int i10 = this.f26548c + iJ;
                    while (this.f26548c < i10) {
                        list.add(Float.valueOf(Float.intBitsToFloat(f())));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw C5230m0.d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (a()) {
                        return;
                    } else {
                        i8 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i8;
                return;
            }
            Y y8 = (Y) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 == 2) {
                int iJ2 = j();
                s(iJ2);
                int i11 = this.f26548c + iJ2;
                while (this.f26548c < i11) {
                    y8.addFloat(Float.intBitsToFloat(f()));
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw C5230m0.d();
            }
            do {
                y8.addFloat(readFloat());
                if (a()) {
                    return;
                } else {
                    i9 = this.f26548c;
                }
            } while (j() == this.f26551f);
            this.f26548c = i9;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        @Deprecated
        public <T> T readGroup(Class<T> cls, M m8) throws C5230m0.a {
            n(3);
            return (T) d(C5201c1.getInstance().schemaFor((Class) cls), m8);
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        @Deprecated
        public <T> T readGroupBySchemaWithCheck(InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0.a {
            n(3);
            return (T) d(interfaceC5219i1, m8);
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        @Deprecated
        public <T> void readGroupList(List<T> list, Class<T> cls, M m8) throws C5230m0.a {
            readGroupList(list, C5201c1.getInstance().schemaFor((Class) cls), m8);
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public int readInt32() throws C5230m0.a {
            n(0);
            return j();
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readInt32List(List<Integer> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5224k0)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType == 0) {
                    do {
                        list.add(Integer.valueOf(readInt32()));
                        if (a()) {
                            return;
                        } else {
                            i8 = this.f26548c;
                        }
                    } while (j() == this.f26551f);
                    this.f26548c = i8;
                    return;
                }
                if (tagWireType != 2) {
                    throw C5230m0.d();
                }
                int iJ = this.f26548c + j();
                while (this.f26548c < iJ) {
                    list.add(Integer.valueOf(j()));
                }
                m(iJ);
                return;
            }
            C5224k0 c5224k0 = (C5224k0) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 == 0) {
                do {
                    c5224k0.addInt(readInt32());
                    if (a()) {
                        return;
                    } else {
                        i9 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i9;
                return;
            }
            if (tagWireType2 != 2) {
                throw C5230m0.d();
            }
            int iJ2 = this.f26548c + j();
            while (this.f26548c < iJ2) {
                c5224k0.addInt(j());
            }
            m(iJ2);
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public long readInt64() throws C5230m0.a {
            n(0);
            return readVarint64();
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readInt64List(List<Long> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5270x0)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType == 0) {
                    do {
                        list.add(Long.valueOf(readInt64()));
                        if (a()) {
                            return;
                        } else {
                            i8 = this.f26548c;
                        }
                    } while (j() == this.f26551f);
                    this.f26548c = i8;
                    return;
                }
                if (tagWireType != 2) {
                    throw C5230m0.d();
                }
                int iJ = this.f26548c + j();
                while (this.f26548c < iJ) {
                    list.add(Long.valueOf(readVarint64()));
                }
                m(iJ);
                return;
            }
            C5270x0 c5270x0 = (C5270x0) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 == 0) {
                do {
                    c5270x0.addLong(readInt64());
                    if (a()) {
                        return;
                    } else {
                        i9 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i9;
                return;
            }
            if (tagWireType2 != 2) {
                throw C5230m0.d();
            }
            int iJ2 = this.f26548c + j();
            while (this.f26548c < iJ2) {
                c5270x0.addLong(readVarint64());
            }
            m(iJ2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public <K, V> void readMap(Map<K, V> map, A0.b bVar, M m8) throws C5230m0 {
            n(2);
            int iJ = j();
            l(iJ);
            int i8 = this.f26550e;
            this.f26550e = this.f26548c + iJ;
            try {
                Object objC = bVar.defaultKey;
                Object objC2 = bVar.defaultValue;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        map.put(objC, objC2);
                        return;
                    }
                    if (fieldNumber == 1) {
                        objC = c(bVar.keyType, null, null);
                    } else if (fieldNumber != 2) {
                        try {
                            if (!skipField()) {
                                throw new C5230m0("Unable to parse map entry.");
                            }
                        } catch (C5230m0.a unused) {
                            if (!skipField()) {
                                throw new C5230m0("Unable to parse map entry.");
                            }
                        }
                    } else {
                        objC2 = c(bVar.valueType, bVar.defaultValue.getClass(), m8);
                    }
                }
            } finally {
                this.f26550e = i8;
            }
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public <T> T readMessage(Class<T> cls, M m8) throws C5230m0.a {
            n(2);
            return (T) i(C5201c1.getInstance().schemaFor((Class) cls), m8);
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public <T> T readMessageBySchemaWithCheck(InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0.a {
            n(2);
            return (T) i(interfaceC5219i1, m8);
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public <T> void readMessageList(List<T> list, Class<T> cls, M m8) throws C5230m0.a {
            readMessageList(list, C5201c1.getInstance().schemaFor((Class) cls), m8);
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public int readSFixed32() throws C5230m0.a {
            n(5);
            return e();
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readSFixed32List(List<Integer> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5224k0)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType == 2) {
                    int iJ = j();
                    s(iJ);
                    int i10 = this.f26548c + iJ;
                    while (this.f26548c < i10) {
                        list.add(Integer.valueOf(f()));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw C5230m0.d();
                }
                do {
                    list.add(Integer.valueOf(readSFixed32()));
                    if (a()) {
                        return;
                    } else {
                        i8 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i8;
                return;
            }
            C5224k0 c5224k0 = (C5224k0) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 == 2) {
                int iJ2 = j();
                s(iJ2);
                int i11 = this.f26548c + iJ2;
                while (this.f26548c < i11) {
                    c5224k0.addInt(f());
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw C5230m0.d();
            }
            do {
                c5224k0.addInt(readSFixed32());
                if (a()) {
                    return;
                } else {
                    i9 = this.f26548c;
                }
            } while (j() == this.f26551f);
            this.f26548c = i9;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public long readSFixed64() throws C5230m0.a {
            n(1);
            return g();
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readSFixed64List(List<Long> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5270x0)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType == 1) {
                    do {
                        list.add(Long.valueOf(readSFixed64()));
                        if (a()) {
                            return;
                        } else {
                            i8 = this.f26548c;
                        }
                    } while (j() == this.f26551f);
                    this.f26548c = i8;
                    return;
                }
                if (tagWireType != 2) {
                    throw C5230m0.d();
                }
                int iJ = j();
                t(iJ);
                int i10 = this.f26548c + iJ;
                while (this.f26548c < i10) {
                    list.add(Long.valueOf(h()));
                }
                return;
            }
            C5270x0 c5270x0 = (C5270x0) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 == 1) {
                do {
                    c5270x0.addLong(readSFixed64());
                    if (a()) {
                        return;
                    } else {
                        i9 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i9;
                return;
            }
            if (tagWireType2 != 2) {
                throw C5230m0.d();
            }
            int iJ2 = j();
            t(iJ2);
            int i11 = this.f26548c + iJ2;
            while (this.f26548c < i11) {
                c5270x0.addLong(h());
            }
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public int readSInt32() throws C5230m0.a {
            n(0);
            return r.decodeZigZag32(j());
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readSInt32List(List<Integer> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5224k0)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw C5230m0.d();
                    }
                    int iJ = this.f26548c + j();
                    while (this.f26548c < iJ) {
                        list.add(Integer.valueOf(r.decodeZigZag32(j())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readSInt32()));
                    if (a()) {
                        return;
                    } else {
                        i8 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i8;
                return;
            }
            C5224k0 c5224k0 = (C5224k0) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw C5230m0.d();
                }
                int iJ2 = this.f26548c + j();
                while (this.f26548c < iJ2) {
                    c5224k0.addInt(r.decodeZigZag32(j()));
                }
                return;
            }
            do {
                c5224k0.addInt(readSInt32());
                if (a()) {
                    return;
                } else {
                    i9 = this.f26548c;
                }
            } while (j() == this.f26551f);
            this.f26548c = i9;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public long readSInt64() throws C5230m0.a {
            n(0);
            return r.decodeZigZag64(readVarint64());
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readSInt64List(List<Long> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5270x0)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw C5230m0.d();
                    }
                    int iJ = this.f26548c + j();
                    while (this.f26548c < iJ) {
                        list.add(Long.valueOf(r.decodeZigZag64(readVarint64())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(readSInt64()));
                    if (a()) {
                        return;
                    } else {
                        i8 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i8;
                return;
            }
            C5270x0 c5270x0 = (C5270x0) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw C5230m0.d();
                }
                int iJ2 = this.f26548c + j();
                while (this.f26548c < iJ2) {
                    c5270x0.addLong(r.decodeZigZag64(readVarint64()));
                }
                return;
            }
            do {
                c5270x0.addLong(readSInt64());
                if (a()) {
                    return;
                } else {
                    i9 = this.f26548c;
                }
            } while (j() == this.f26551f);
            this.f26548c = i9;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public String readString() {
            return readStringInternal(false);
        }

        public String readStringInternal(boolean z8) throws C5230m0 {
            n(2);
            int iJ = j();
            if (iJ == 0) {
                return "";
            }
            l(iJ);
            if (z8) {
                byte[] bArr = this.f26547b;
                int i8 = this.f26548c;
                if (!M1.u(bArr, i8, i8 + iJ)) {
                    throw C5230m0.c();
                }
            }
            String str = new String(this.f26547b, this.f26548c, iJ, AbstractC5227l0.f26567b);
            this.f26548c += iJ;
            return str;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readStringList(List<String> list) throws C5230m0.a {
            readStringListInternal(list, false);
        }

        public void readStringListInternal(List<String> list, boolean z8) throws C5230m0.a {
            int i8;
            int i9;
            if (P1.getTagWireType(this.f26551f) != 2) {
                throw C5230m0.d();
            }
            if (!(list instanceof InterfaceC5249t0) || z8) {
                do {
                    list.add(readStringInternal(z8));
                    if (a()) {
                        return;
                    } else {
                        i8 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i8;
                return;
            }
            InterfaceC5249t0 interfaceC5249t0 = (InterfaceC5249t0) list;
            do {
                interfaceC5249t0.add(readBytes());
                if (a()) {
                    return;
                } else {
                    i9 = this.f26548c;
                }
            } while (j() == this.f26551f);
            this.f26548c = i9;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readStringListRequireUtf8(List<String> list) throws C5230m0.a {
            readStringListInternal(list, true);
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public String readStringRequireUtf8() {
            return readStringInternal(true);
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public int readUInt32() throws C5230m0.a {
            n(0);
            return j();
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readUInt32List(List<Integer> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5224k0)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw C5230m0.d();
                    }
                    int iJ = this.f26548c + j();
                    while (this.f26548c < iJ) {
                        list.add(Integer.valueOf(j()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readUInt32()));
                    if (a()) {
                        return;
                    } else {
                        i8 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i8;
                return;
            }
            C5224k0 c5224k0 = (C5224k0) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw C5230m0.d();
                }
                int iJ2 = this.f26548c + j();
                while (this.f26548c < iJ2) {
                    c5224k0.addInt(j());
                }
                return;
            }
            do {
                c5224k0.addInt(readUInt32());
                if (a()) {
                    return;
                } else {
                    i9 = this.f26548c;
                }
            } while (j() == this.f26551f);
            this.f26548c = i9;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public long readUInt64() throws C5230m0.a {
            n(0);
            return readVarint64();
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public void readUInt64List(List<Long> list) throws C5230m0 {
            int i8;
            int i9;
            if (!(list instanceof C5270x0)) {
                int tagWireType = P1.getTagWireType(this.f26551f);
                if (tagWireType == 0) {
                    do {
                        list.add(Long.valueOf(readUInt64()));
                        if (a()) {
                            return;
                        } else {
                            i8 = this.f26548c;
                        }
                    } while (j() == this.f26551f);
                    this.f26548c = i8;
                    return;
                }
                if (tagWireType != 2) {
                    throw C5230m0.d();
                }
                int iJ = this.f26548c + j();
                while (this.f26548c < iJ) {
                    list.add(Long.valueOf(readVarint64()));
                }
                m(iJ);
                return;
            }
            C5270x0 c5270x0 = (C5270x0) list;
            int tagWireType2 = P1.getTagWireType(this.f26551f);
            if (tagWireType2 == 0) {
                do {
                    c5270x0.addLong(readUInt64());
                    if (a()) {
                        return;
                    } else {
                        i9 = this.f26548c;
                    }
                } while (j() == this.f26551f);
                this.f26548c = i9;
                return;
            }
            if (tagWireType2 != 2) {
                throw C5230m0.d();
            }
            int iJ2 = this.f26548c + j();
            while (this.f26548c < iJ2) {
                c5270x0.addLong(readVarint64());
            }
            m(iJ2);
        }

        public long readVarint64() throws C5230m0 {
            long j8;
            long j9;
            long j10;
            int i8 = this.f26548c;
            int i9 = this.f26550e;
            if (i9 == i8) {
                throw C5230m0.k();
            }
            byte[] bArr = this.f26547b;
            int i10 = i8 + 1;
            byte b9 = bArr[i8];
            if (b9 >= 0) {
                this.f26548c = i10;
                return b9;
            }
            if (i9 - i10 < 9) {
                return k();
            }
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
                                            if (bArr[i11] < 0) {
                                                throw C5230m0.e();
                                            }
                                            i11 = i18;
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
            this.f26548c = i11;
            return j8;
        }

        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public boolean skipField() throws C5230m0 {
            int i8;
            if (a() || (i8 = this.f26551f) == this.f26552g) {
                return false;
            }
            int tagWireType = P1.getTagWireType(i8);
            if (tagWireType == 0) {
                q();
                return true;
            }
            if (tagWireType == 1) {
                o(8);
                return true;
            }
            if (tagWireType == 2) {
                o(j());
                return true;
            }
            if (tagWireType == 3) {
                p();
                return true;
            }
            if (tagWireType != 5) {
                throw C5230m0.d();
            }
            o(4);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        @Deprecated
        public <T> void readGroupList(List<T> list, InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0.a {
            int i8;
            if (P1.getTagWireType(this.f26551f) == 3) {
                int i9 = this.f26551f;
                do {
                    list.add(d(interfaceC5219i1, m8));
                    if (a()) {
                        return;
                    } else {
                        i8 = this.f26548c;
                    }
                } while (j() == i9);
                this.f26548c = i8;
                return;
            }
            throw C5230m0.d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractC5220j, com.google.protobuf.InterfaceC5210f1
        public <T> void readMessageList(List<T> list, InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0.a {
            int i8;
            if (P1.getTagWireType(this.f26551f) == 2) {
                int i9 = this.f26551f;
                do {
                    list.add(i(interfaceC5219i1, m8));
                    if (a()) {
                        return;
                    } else {
                        i8 = this.f26548c;
                    }
                } while (j() == i9);
                this.f26548c = i8;
                return;
            }
            throw C5230m0.d();
        }
    }

    private AbstractC5220j() {
    }
}
