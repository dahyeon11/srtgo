package com.google.protobuf;

import com.google.protobuf.C5230m0;
import com.google.protobuf.P1;
import java.util.List;

/* renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5246s implements InterfaceC5210f1 {

    /* renamed from: a, reason: collision with root package name */
    private final r f26713a;

    /* renamed from: b, reason: collision with root package name */
    private int f26714b;

    /* renamed from: c, reason: collision with root package name */
    private int f26715c;

    /* renamed from: d, reason: collision with root package name */
    private int f26716d = 0;

    /* renamed from: com.google.protobuf.s$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26717a;

        static {
            int[] iArr = new int[P1.b.values().length];
            f26717a = iArr;
            try {
                iArr[P1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26717a[P1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26717a[P1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26717a[P1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26717a[P1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26717a[P1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26717a[P1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26717a[P1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26717a[P1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26717a[P1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26717a[P1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26717a[P1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26717a[P1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26717a[P1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26717a[P1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26717a[P1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26717a[P1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C5246s(r rVar) {
        r rVar2 = (r) AbstractC5227l0.b(rVar, "input");
        this.f26713a = rVar2;
        rVar2.f26655d = this;
    }

    private void a(Object obj, InterfaceC5219i1 interfaceC5219i1, M m8) {
        int i8 = this.f26715c;
        this.f26715c = P1.a(P1.getTagFieldNumber(this.f26714b), 4);
        try {
            interfaceC5219i1.mergeFrom(obj, this, m8);
            if (this.f26714b == this.f26715c) {
            } else {
                throw C5230m0.g();
            }
        } finally {
            this.f26715c = i8;
        }
    }

    private void b(Object obj, InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0 {
        int uInt32 = this.f26713a.readUInt32();
        r rVar = this.f26713a;
        if (rVar.f26652a >= rVar.f26653b) {
            throw C5230m0.h();
        }
        int iPushLimit = rVar.pushLimit(uInt32);
        this.f26713a.f26652a++;
        interfaceC5219i1.mergeFrom(obj, this, m8);
        this.f26713a.checkLastTagWas(0);
        r5.f26652a--;
        this.f26713a.popLimit(iPushLimit);
    }

    private Object c(P1.b bVar, Class cls, M m8) {
        switch (a.f26717a[bVar.ordinal()]) {
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
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private Object d(InterfaceC5219i1 interfaceC5219i1, M m8) {
        Object objNewInstance = interfaceC5219i1.newInstance();
        a(objNewInstance, interfaceC5219i1, m8);
        interfaceC5219i1.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    private Object e(InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0 {
        Object objNewInstance = interfaceC5219i1.newInstance();
        b(objNewInstance, interfaceC5219i1, m8);
        interfaceC5219i1.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    private void f(int i8) throws C5230m0 {
        if (this.f26713a.getTotalBytesRead() != i8) {
            throw C5230m0.k();
        }
    }

    public static C5246s forCodedInput(r rVar) {
        C5246s c5246s = rVar.f26655d;
        return c5246s != null ? c5246s : new C5246s(rVar);
    }

    private void g(int i8) throws C5230m0.a {
        if (P1.getTagWireType(this.f26714b) != i8) {
            throw C5230m0.d();
        }
    }

    private void h(int i8) throws C5230m0 {
        if ((i8 & 3) != 0) {
            throw C5230m0.g();
        }
    }

    private void i(int i8) throws C5230m0 {
        if ((i8 & 7) != 0) {
            throw C5230m0.g();
        }
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public int getFieldNumber() {
        int i8 = this.f26716d;
        if (i8 != 0) {
            this.f26714b = i8;
            this.f26716d = 0;
        } else {
            this.f26714b = this.f26713a.readTag();
        }
        int i9 = this.f26714b;
        if (i9 == 0 || i9 == this.f26715c) {
            return Integer.MAX_VALUE;
        }
        return P1.getTagFieldNumber(i9);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public int getTag() {
        return this.f26714b;
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public <T> void mergeGroupField(T t8, InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0.a {
        g(3);
        a(t8, interfaceC5219i1, m8);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public <T> void mergeMessageField(T t8, InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0 {
        g(2);
        b(t8, interfaceC5219i1, m8);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public boolean readBool() throws C5230m0.a {
        g(0);
        return this.f26713a.readBool();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readBoolList(List<Boolean> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5229m)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(this.f26713a.readBool()));
                    if (this.f26713a.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f26713a.readTag();
                    }
                } while (tag == this.f26714b);
                this.f26716d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw C5230m0.d();
            }
            int totalBytesRead = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
            do {
                list.add(Boolean.valueOf(this.f26713a.readBool()));
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
            f(totalBytesRead);
            return;
        }
        C5229m c5229m = (C5229m) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 0) {
            do {
                c5229m.addBoolean(this.f26713a.readBool());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f26713a.readTag();
                }
            } while (tag2 == this.f26714b);
            this.f26716d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw C5230m0.d();
        }
        int totalBytesRead2 = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
        do {
            c5229m.addBoolean(this.f26713a.readBool());
        } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
        f(totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public AbstractC5235o readBytes() throws C5230m0.a {
        g(2);
        return this.f26713a.readBytes();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readBytesList(List<AbstractC5235o> list) throws C5230m0.a {
        int tag;
        if (P1.getTagWireType(this.f26714b) != 2) {
            throw C5230m0.d();
        }
        do {
            list.add(readBytes());
            if (this.f26713a.isAtEnd()) {
                return;
            } else {
                tag = this.f26713a.readTag();
            }
        } while (tag == this.f26714b);
        this.f26716d = tag;
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public double readDouble() throws C5230m0.a {
        g(1);
        return this.f26713a.readDouble();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readDoubleList(List<Double> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5271y)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(this.f26713a.readDouble()));
                    if (this.f26713a.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f26713a.readTag();
                    }
                } while (tag == this.f26714b);
                this.f26716d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw C5230m0.d();
            }
            int uInt32 = this.f26713a.readUInt32();
            i(uInt32);
            int totalBytesRead = this.f26713a.getTotalBytesRead() + uInt32;
            do {
                list.add(Double.valueOf(this.f26713a.readDouble()));
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        C5271y c5271y = (C5271y) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 1) {
            do {
                c5271y.addDouble(this.f26713a.readDouble());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f26713a.readTag();
                }
            } while (tag2 == this.f26714b);
            this.f26716d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw C5230m0.d();
        }
        int uInt322 = this.f26713a.readUInt32();
        i(uInt322);
        int totalBytesRead2 = this.f26713a.getTotalBytesRead() + uInt322;
        do {
            c5271y.addDouble(this.f26713a.readDouble());
        } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public int readEnum() throws C5230m0.a {
        g(0);
        return this.f26713a.readEnum();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readEnumList(List<Integer> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5224k0)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.f26713a.readEnum()));
                    if (this.f26713a.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f26713a.readTag();
                    }
                } while (tag == this.f26714b);
                this.f26716d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw C5230m0.d();
            }
            int totalBytesRead = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
            do {
                list.add(Integer.valueOf(this.f26713a.readEnum()));
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
            f(totalBytesRead);
            return;
        }
        C5224k0 c5224k0 = (C5224k0) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 0) {
            do {
                c5224k0.addInt(this.f26713a.readEnum());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f26713a.readTag();
                }
            } while (tag2 == this.f26714b);
            this.f26716d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw C5230m0.d();
        }
        int totalBytesRead2 = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
        do {
            c5224k0.addInt(this.f26713a.readEnum());
        } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
        f(totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public int readFixed32() throws C5230m0.a {
        g(5);
        return this.f26713a.readFixed32();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readFixed32List(List<Integer> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5224k0)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 2) {
                int uInt32 = this.f26713a.readUInt32();
                h(uInt32);
                int totalBytesRead = this.f26713a.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(this.f26713a.readFixed32()));
                } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw C5230m0.d();
            }
            do {
                list.add(Integer.valueOf(this.f26713a.readFixed32()));
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag = this.f26713a.readTag();
                }
            } while (tag == this.f26714b);
            this.f26716d = tag;
            return;
        }
        C5224k0 c5224k0 = (C5224k0) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 2) {
            int uInt322 = this.f26713a.readUInt32();
            h(uInt322);
            int totalBytesRead2 = this.f26713a.getTotalBytesRead() + uInt322;
            do {
                c5224k0.addInt(this.f26713a.readFixed32());
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw C5230m0.d();
        }
        do {
            c5224k0.addInt(this.f26713a.readFixed32());
            if (this.f26713a.isAtEnd()) {
                return;
            } else {
                tag2 = this.f26713a.readTag();
            }
        } while (tag2 == this.f26714b);
        this.f26716d = tag2;
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public long readFixed64() throws C5230m0.a {
        g(1);
        return this.f26713a.readFixed64();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readFixed64List(List<Long> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5270x0)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(this.f26713a.readFixed64()));
                    if (this.f26713a.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f26713a.readTag();
                    }
                } while (tag == this.f26714b);
                this.f26716d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw C5230m0.d();
            }
            int uInt32 = this.f26713a.readUInt32();
            i(uInt32);
            int totalBytesRead = this.f26713a.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(this.f26713a.readFixed64()));
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        C5270x0 c5270x0 = (C5270x0) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 1) {
            do {
                c5270x0.addLong(this.f26713a.readFixed64());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f26713a.readTag();
                }
            } while (tag2 == this.f26714b);
            this.f26716d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw C5230m0.d();
        }
        int uInt322 = this.f26713a.readUInt32();
        i(uInt322);
        int totalBytesRead2 = this.f26713a.getTotalBytesRead() + uInt322;
        do {
            c5270x0.addLong(this.f26713a.readFixed64());
        } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public float readFloat() throws C5230m0.a {
        g(5);
        return this.f26713a.readFloat();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readFloatList(List<Float> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof Y)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 2) {
                int uInt32 = this.f26713a.readUInt32();
                h(uInt32);
                int totalBytesRead = this.f26713a.getTotalBytesRead() + uInt32;
                do {
                    list.add(Float.valueOf(this.f26713a.readFloat()));
                } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw C5230m0.d();
            }
            do {
                list.add(Float.valueOf(this.f26713a.readFloat()));
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag = this.f26713a.readTag();
                }
            } while (tag == this.f26714b);
            this.f26716d = tag;
            return;
        }
        Y y8 = (Y) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 2) {
            int uInt322 = this.f26713a.readUInt32();
            h(uInt322);
            int totalBytesRead2 = this.f26713a.getTotalBytesRead() + uInt322;
            do {
                y8.addFloat(this.f26713a.readFloat());
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw C5230m0.d();
        }
        do {
            y8.addFloat(this.f26713a.readFloat());
            if (this.f26713a.isAtEnd()) {
                return;
            } else {
                tag2 = this.f26713a.readTag();
            }
        } while (tag2 == this.f26714b);
        this.f26716d = tag2;
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    @Deprecated
    public <T> T readGroup(Class<T> cls, M m8) throws C5230m0.a {
        g(3);
        return (T) d(C5201c1.getInstance().schemaFor((Class) cls), m8);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    @Deprecated
    public <T> T readGroupBySchemaWithCheck(InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0.a {
        g(3);
        return (T) d(interfaceC5219i1, m8);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    @Deprecated
    public <T> void readGroupList(List<T> list, Class<T> cls, M m8) throws C5230m0.a {
        readGroupList(list, C5201c1.getInstance().schemaFor((Class) cls), m8);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public int readInt32() throws C5230m0.a {
        g(0);
        return this.f26713a.readInt32();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readInt32List(List<Integer> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5224k0)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.f26713a.readInt32()));
                    if (this.f26713a.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f26713a.readTag();
                    }
                } while (tag == this.f26714b);
                this.f26716d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw C5230m0.d();
            }
            int totalBytesRead = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
            do {
                list.add(Integer.valueOf(this.f26713a.readInt32()));
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
            f(totalBytesRead);
            return;
        }
        C5224k0 c5224k0 = (C5224k0) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 0) {
            do {
                c5224k0.addInt(this.f26713a.readInt32());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f26713a.readTag();
                }
            } while (tag2 == this.f26714b);
            this.f26716d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw C5230m0.d();
        }
        int totalBytesRead2 = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
        do {
            c5224k0.addInt(this.f26713a.readInt32());
        } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
        f(totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public long readInt64() throws C5230m0.a {
        g(0);
        return this.f26713a.readInt64();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readInt64List(List<Long> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5270x0)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.f26713a.readInt64()));
                    if (this.f26713a.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f26713a.readTag();
                    }
                } while (tag == this.f26714b);
                this.f26716d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw C5230m0.d();
            }
            int totalBytesRead = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
            do {
                list.add(Long.valueOf(this.f26713a.readInt64()));
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
            f(totalBytesRead);
            return;
        }
        C5270x0 c5270x0 = (C5270x0) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 0) {
            do {
                c5270x0.addLong(this.f26713a.readInt64());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f26713a.readTag();
                }
            } while (tag2 == this.f26714b);
            this.f26716d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw C5230m0.d();
        }
        int totalBytesRead2 = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
        do {
            c5270x0.addLong(this.f26713a.readInt64());
        } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
        f(totalBytesRead2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f26713a.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC5210f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void readMap(java.util.Map<K, V> r8, com.google.protobuf.A0.b r9, com.google.protobuf.M r10) throws com.google.protobuf.C5230m0.a {
        /*
            r7 = this;
            r0 = 2
            r7.g(r0)
            com.google.protobuf.r r1 = r7.f26713a
            int r1 = r1.readUInt32()
            com.google.protobuf.r r2 = r7.f26713a
            int r1 = r2.pushLimit(r1)
            java.lang.Object r2 = r9.defaultKey
            java.lang.Object r3 = r9.defaultValue
        L14:
            int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.google.protobuf.r r5 = r7.f26713a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C5230m0.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.m0 r4 = new com.google.protobuf.m0     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C5230m0.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C5230m0.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C5230m0.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.google.protobuf.P1$b r4 = r9.valueType     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C5230m0.a -> L51
            java.lang.Object r5 = r9.defaultValue     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C5230m0.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C5230m0.a -> L51
            java.lang.Object r3 = r7.c(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C5230m0.a -> L51
            goto L14
        L49:
            com.google.protobuf.P1$b r4 = r9.keyType     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C5230m0.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.c(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C5230m0.a -> L51
            goto L14
        L51:
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.google.protobuf.m0 r8 = new com.google.protobuf.m0     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.protobuf.r r8 = r7.f26713a
            r8.popLimit(r1)
            return
        L67:
            com.google.protobuf.r r9 = r7.f26713a
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5246s.readMap(java.util.Map, com.google.protobuf.A0$b, com.google.protobuf.M):void");
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public <T> T readMessage(Class<T> cls, M m8) throws C5230m0.a {
        g(2);
        return (T) e(C5201c1.getInstance().schemaFor((Class) cls), m8);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public <T> T readMessageBySchemaWithCheck(InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0.a {
        g(2);
        return (T) e(interfaceC5219i1, m8);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public <T> void readMessageList(List<T> list, Class<T> cls, M m8) throws C5230m0.a {
        readMessageList(list, C5201c1.getInstance().schemaFor((Class) cls), m8);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public int readSFixed32() throws C5230m0.a {
        g(5);
        return this.f26713a.readSFixed32();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readSFixed32List(List<Integer> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5224k0)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 2) {
                int uInt32 = this.f26713a.readUInt32();
                h(uInt32);
                int totalBytesRead = this.f26713a.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(this.f26713a.readSFixed32()));
                } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw C5230m0.d();
            }
            do {
                list.add(Integer.valueOf(this.f26713a.readSFixed32()));
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag = this.f26713a.readTag();
                }
            } while (tag == this.f26714b);
            this.f26716d = tag;
            return;
        }
        C5224k0 c5224k0 = (C5224k0) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 2) {
            int uInt322 = this.f26713a.readUInt32();
            h(uInt322);
            int totalBytesRead2 = this.f26713a.getTotalBytesRead() + uInt322;
            do {
                c5224k0.addInt(this.f26713a.readSFixed32());
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw C5230m0.d();
        }
        do {
            c5224k0.addInt(this.f26713a.readSFixed32());
            if (this.f26713a.isAtEnd()) {
                return;
            } else {
                tag2 = this.f26713a.readTag();
            }
        } while (tag2 == this.f26714b);
        this.f26716d = tag2;
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public long readSFixed64() throws C5230m0.a {
        g(1);
        return this.f26713a.readSFixed64();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readSFixed64List(List<Long> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5270x0)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(this.f26713a.readSFixed64()));
                    if (this.f26713a.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f26713a.readTag();
                    }
                } while (tag == this.f26714b);
                this.f26716d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw C5230m0.d();
            }
            int uInt32 = this.f26713a.readUInt32();
            i(uInt32);
            int totalBytesRead = this.f26713a.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(this.f26713a.readSFixed64()));
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
            return;
        }
        C5270x0 c5270x0 = (C5270x0) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 1) {
            do {
                c5270x0.addLong(this.f26713a.readSFixed64());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f26713a.readTag();
                }
            } while (tag2 == this.f26714b);
            this.f26716d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw C5230m0.d();
        }
        int uInt322 = this.f26713a.readUInt32();
        i(uInt322);
        int totalBytesRead2 = this.f26713a.getTotalBytesRead() + uInt322;
        do {
            c5270x0.addLong(this.f26713a.readSFixed64());
        } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public int readSInt32() throws C5230m0.a {
        g(0);
        return this.f26713a.readSInt32();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readSInt32List(List<Integer> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5224k0)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.f26713a.readSInt32()));
                    if (this.f26713a.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f26713a.readTag();
                    }
                } while (tag == this.f26714b);
                this.f26716d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw C5230m0.d();
            }
            int totalBytesRead = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
            do {
                list.add(Integer.valueOf(this.f26713a.readSInt32()));
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
            f(totalBytesRead);
            return;
        }
        C5224k0 c5224k0 = (C5224k0) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 0) {
            do {
                c5224k0.addInt(this.f26713a.readSInt32());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f26713a.readTag();
                }
            } while (tag2 == this.f26714b);
            this.f26716d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw C5230m0.d();
        }
        int totalBytesRead2 = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
        do {
            c5224k0.addInt(this.f26713a.readSInt32());
        } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
        f(totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public long readSInt64() throws C5230m0.a {
        g(0);
        return this.f26713a.readSInt64();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readSInt64List(List<Long> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5270x0)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.f26713a.readSInt64()));
                    if (this.f26713a.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f26713a.readTag();
                    }
                } while (tag == this.f26714b);
                this.f26716d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw C5230m0.d();
            }
            int totalBytesRead = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
            do {
                list.add(Long.valueOf(this.f26713a.readSInt64()));
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
            f(totalBytesRead);
            return;
        }
        C5270x0 c5270x0 = (C5270x0) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 0) {
            do {
                c5270x0.addLong(this.f26713a.readSInt64());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f26713a.readTag();
                }
            } while (tag2 == this.f26714b);
            this.f26716d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw C5230m0.d();
        }
        int totalBytesRead2 = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
        do {
            c5270x0.addLong(this.f26713a.readSInt64());
        } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
        f(totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public String readString() throws C5230m0.a {
        g(2);
        return this.f26713a.readString();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readStringList(List<String> list) throws C5230m0.a {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z8) throws C5230m0.a {
        int tag;
        int tag2;
        if (P1.getTagWireType(this.f26714b) != 2) {
            throw C5230m0.d();
        }
        if (!(list instanceof InterfaceC5249t0) || z8) {
            do {
                list.add(z8 ? readStringRequireUtf8() : readString());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag = this.f26713a.readTag();
                }
            } while (tag == this.f26714b);
            this.f26716d = tag;
            return;
        }
        InterfaceC5249t0 interfaceC5249t0 = (InterfaceC5249t0) list;
        do {
            interfaceC5249t0.add(readBytes());
            if (this.f26713a.isAtEnd()) {
                return;
            } else {
                tag2 = this.f26713a.readTag();
            }
        } while (tag2 == this.f26714b);
        this.f26716d = tag2;
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readStringListRequireUtf8(List<String> list) throws C5230m0.a {
        readStringListInternal(list, true);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public String readStringRequireUtf8() throws C5230m0.a {
        g(2);
        return this.f26713a.readStringRequireUtf8();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public int readUInt32() throws C5230m0.a {
        g(0);
        return this.f26713a.readUInt32();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readUInt32List(List<Integer> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5224k0)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.f26713a.readUInt32()));
                    if (this.f26713a.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f26713a.readTag();
                    }
                } while (tag == this.f26714b);
                this.f26716d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw C5230m0.d();
            }
            int totalBytesRead = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
            do {
                list.add(Integer.valueOf(this.f26713a.readUInt32()));
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
            f(totalBytesRead);
            return;
        }
        C5224k0 c5224k0 = (C5224k0) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 0) {
            do {
                c5224k0.addInt(this.f26713a.readUInt32());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f26713a.readTag();
                }
            } while (tag2 == this.f26714b);
            this.f26716d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw C5230m0.d();
        }
        int totalBytesRead2 = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
        do {
            c5224k0.addInt(this.f26713a.readUInt32());
        } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
        f(totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public long readUInt64() throws C5230m0.a {
        g(0);
        return this.f26713a.readUInt64();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public void readUInt64List(List<Long> list) throws C5230m0 {
        int tag;
        int tag2;
        if (!(list instanceof C5270x0)) {
            int tagWireType = P1.getTagWireType(this.f26714b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.f26713a.readUInt64()));
                    if (this.f26713a.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f26713a.readTag();
                    }
                } while (tag == this.f26714b);
                this.f26716d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw C5230m0.d();
            }
            int totalBytesRead = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
            do {
                list.add(Long.valueOf(this.f26713a.readUInt64()));
            } while (this.f26713a.getTotalBytesRead() < totalBytesRead);
            f(totalBytesRead);
            return;
        }
        C5270x0 c5270x0 = (C5270x0) list;
        int tagWireType2 = P1.getTagWireType(this.f26714b);
        if (tagWireType2 == 0) {
            do {
                c5270x0.addLong(this.f26713a.readUInt64());
                if (this.f26713a.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f26713a.readTag();
                }
            } while (tag2 == this.f26714b);
            this.f26716d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw C5230m0.d();
        }
        int totalBytesRead2 = this.f26713a.getTotalBytesRead() + this.f26713a.readUInt32();
        do {
            c5270x0.addLong(this.f26713a.readUInt64());
        } while (this.f26713a.getTotalBytesRead() < totalBytesRead2);
        f(totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public boolean shouldDiscardUnknownFields() {
        return this.f26713a.d();
    }

    @Override // com.google.protobuf.InterfaceC5210f1
    public boolean skipField() {
        int i8;
        if (this.f26713a.isAtEnd() || (i8 = this.f26714b) == this.f26715c) {
            return false;
        }
        return this.f26713a.skipField(i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC5210f1
    @Deprecated
    public <T> void readGroupList(List<T> list, InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0.a {
        int tag;
        if (P1.getTagWireType(this.f26714b) == 3) {
            int i8 = this.f26714b;
            do {
                list.add(d(interfaceC5219i1, m8));
                if (this.f26713a.isAtEnd() || this.f26716d != 0) {
                    return;
                } else {
                    tag = this.f26713a.readTag();
                }
            } while (tag == i8);
            this.f26716d = tag;
            return;
        }
        throw C5230m0.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC5210f1
    public <T> void readMessageList(List<T> list, InterfaceC5219i1 interfaceC5219i1, M m8) throws C5230m0.a {
        int tag;
        if (P1.getTagWireType(this.f26714b) == 2) {
            int i8 = this.f26714b;
            do {
                list.add(e(interfaceC5219i1, m8));
                if (this.f26713a.isAtEnd() || this.f26716d != 0) {
                    return;
                } else {
                    tag = this.f26713a.readTag();
                }
            } while (tag == i8);
            this.f26716d = tag;
            return;
        }
        throw C5230m0.d();
    }
}
