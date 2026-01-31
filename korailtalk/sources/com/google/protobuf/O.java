package com.google.protobuf;

import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import com.google.protobuf.K;
import com.google.protobuf.P1;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class O extends N {

    /* renamed from: a, reason: collision with root package name */
    private static final long f26235a = j();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26236b = 0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26237a;

        static {
            int[] iArr = new int[P1.b.values().length];
            f26237a = iArr;
            try {
                iArr[P1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26237a[P1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26237a[P1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26237a[P1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26237a[P1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26237a[P1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26237a[P1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26237a[P1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26237a[P1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26237a[P1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26237a[P1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26237a[P1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26237a[P1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26237a[P1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26237a[P1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26237a[P1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26237a[P1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26237a[P1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    O() {
    }

    private static long j() {
        return L1.N(AbstractC5209f0.e.class.getDeclaredField(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A));
    }

    @Override // com.google.protobuf.N
    int a(Map.Entry entry) {
        return ((C5269x.g) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.N
    Object b(M m8, K0 k02, int i8) {
        return ((K) m8).findImmutableExtensionByNumber(((H0) k02).getDescriptorForType(), i8);
    }

    @Override // com.google.protobuf.N
    W c(Object obj) {
        W extensions = getExtensions(obj);
        if (!extensions.isImmutable()) {
            return extensions;
        }
        W wM397clone = extensions.m397clone();
        k(obj, wM397clone);
        return wM397clone;
    }

    @Override // com.google.protobuf.N
    boolean d(K0 k02) {
        return k02 instanceof AbstractC5209f0.e;
    }

    @Override // com.google.protobuf.N
    void e(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // com.google.protobuf.N
    Object f(Object obj, InterfaceC5210f1 interfaceC5210f1, Object obj2, M m8, W w8, Object obj3, F1 f12) {
        Object objValueOf;
        Object field;
        ArrayList arrayList;
        ArrayList arrayList2;
        K.c cVar = (K.c) obj2;
        int number = cVar.descriptor.getNumber();
        if (cVar.descriptor.isRepeated() && cVar.descriptor.isPacked()) {
            switch (a.f26237a[cVar.descriptor.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readDoubleList(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readFloatList(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readInt64List(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readUInt64List(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readInt32List(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readFixed64List(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readFixed32List(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readBoolList(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readUInt32List(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readSFixed32List(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readSFixed64List(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readSInt32List(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readSInt64List(arrayList);
                    arrayList2 = arrayList;
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                case 14:
                    ArrayList arrayList3 = new ArrayList();
                    interfaceC5210f1.readEnumList(arrayList3);
                    arrayList2 = new ArrayList();
                    Iterator<Integer> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        C5269x.f fVarFindValueByNumber = cVar.descriptor.getEnumType().findValueByNumber(iIntValue);
                        if (fVarFindValueByNumber != null) {
                            arrayList2.add(fVarFindValueByNumber);
                        } else {
                            obj3 = AbstractC5225k1.J(obj, number, iIntValue, obj3, f12);
                        }
                    }
                    w8.setField(cVar.descriptor, arrayList2);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + cVar.descriptor.getLiteType());
            }
        } else {
            if (cVar.descriptor.getLiteType() != P1.b.ENUM) {
                switch (a.f26237a[cVar.descriptor.getLiteType().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(interfaceC5210f1.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(interfaceC5210f1.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(interfaceC5210f1.readInt64());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(interfaceC5210f1.readUInt64());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(interfaceC5210f1.readInt32());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(interfaceC5210f1.readFixed64());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(interfaceC5210f1.readFixed32());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(interfaceC5210f1.readBool());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(interfaceC5210f1.readUInt32());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(interfaceC5210f1.readSFixed32());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(interfaceC5210f1.readSFixed64());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(interfaceC5210f1.readSInt32());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(interfaceC5210f1.readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = interfaceC5210f1.readBytes();
                        break;
                    case 16:
                        objValueOf = interfaceC5210f1.readString();
                        break;
                    case 17:
                        objValueOf = interfaceC5210f1.readGroup(cVar.defaultInstance.getClass(), m8);
                        break;
                    case 18:
                        objValueOf = interfaceC5210f1.readMessage(cVar.defaultInstance.getClass(), m8);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int int32 = interfaceC5210f1.readInt32();
                objValueOf = cVar.descriptor.getEnumType().findValueByNumber(int32);
                if (objValueOf == null) {
                    return AbstractC5225k1.J(obj, number, int32, obj3, f12);
                }
            }
            if (cVar.descriptor.isRepeated()) {
                w8.addRepeatedField(cVar.descriptor, objValueOf);
            } else {
                int i8 = a.f26237a[cVar.descriptor.getLiteType().ordinal()];
                if ((i8 == 17 || i8 == 18) && (field = w8.getField(cVar.descriptor)) != null) {
                    objValueOf = AbstractC5227l0.d(field, objValueOf);
                }
                w8.setField(cVar.descriptor, objValueOf);
            }
        }
        return obj3;
    }

    @Override // com.google.protobuf.N
    void g(InterfaceC5210f1 interfaceC5210f1, Object obj, M m8, W w8) {
        K.c cVar = (K.c) obj;
        if (!M.isEagerlyParseMessageSets()) {
            w8.setField(cVar.descriptor, new C5242q0(cVar.defaultInstance, m8, interfaceC5210f1.readBytes()));
        } else {
            w8.setField(cVar.descriptor, interfaceC5210f1.readMessage(cVar.defaultInstance.getClass(), m8));
        }
    }

    @Override // com.google.protobuf.N
    public W getExtensions(Object obj) {
        return (W) L1.H(obj, f26235a);
    }

    @Override // com.google.protobuf.N
    void h(AbstractC5235o abstractC5235o, Object obj, M m8, W w8) throws C5230m0 {
        K.c cVar = (K.c) obj;
        H0 h0BuildPartial = cVar.defaultInstance.newBuilderForType().buildPartial();
        if (!M.isEagerlyParseMessageSets()) {
            w8.setField(cVar.descriptor, new C5242q0(cVar.defaultInstance, m8, abstractC5235o));
            return;
        }
        AbstractC5220j abstractC5220jNewInstance = AbstractC5220j.newInstance(ByteBuffer.wrap(abstractC5235o.toByteArray()), true);
        C5201c1.getInstance().mergeFrom(h0BuildPartial, abstractC5220jNewInstance, m8);
        w8.setField(cVar.descriptor, h0BuildPartial);
        if (abstractC5220jNewInstance.getFieldNumber() != Integer.MAX_VALUE) {
            throw C5230m0.a();
        }
    }

    @Override // com.google.protobuf.N
    void i(R1 r12, Map.Entry entry) {
        C5269x.g gVar = (C5269x.g) entry.getKey();
        if (!gVar.isRepeated()) {
            switch (a.f26237a[gVar.getLiteType().ordinal()]) {
                case 1:
                    r12.writeDouble(gVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    r12.writeFloat(gVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    r12.writeInt64(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    r12.writeUInt64(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    r12.writeInt32(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    r12.writeFixed64(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    r12.writeFixed32(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    r12.writeBool(gVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    r12.writeUInt32(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    r12.writeSFixed32(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    r12.writeSFixed64(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    r12.writeSInt32(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    r12.writeSInt64(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    r12.writeInt32(gVar.getNumber(), ((C5269x.f) entry.getValue()).getNumber());
                    break;
                case 15:
                    r12.writeBytes(gVar.getNumber(), (AbstractC5235o) entry.getValue());
                    break;
                case 16:
                    r12.writeString(gVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    r12.writeGroup(gVar.getNumber(), entry.getValue());
                    break;
                case 18:
                    r12.writeMessage(gVar.getNumber(), entry.getValue());
                    break;
            }
        }
        switch (a.f26237a[gVar.getLiteType().ordinal()]) {
            case 1:
                AbstractC5225k1.writeDoubleList(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 2:
                AbstractC5225k1.writeFloatList(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 3:
                AbstractC5225k1.writeInt64List(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 4:
                AbstractC5225k1.writeUInt64List(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 5:
                AbstractC5225k1.writeInt32List(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 6:
                AbstractC5225k1.writeFixed64List(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 7:
                AbstractC5225k1.writeFixed32List(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 8:
                AbstractC5225k1.writeBoolList(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 9:
                AbstractC5225k1.writeUInt32List(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 10:
                AbstractC5225k1.writeSFixed32List(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 11:
                AbstractC5225k1.writeSFixed64List(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 12:
                AbstractC5225k1.writeSInt32List(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 13:
                AbstractC5225k1.writeSInt64List(gVar.getNumber(), (List) entry.getValue(), r12, gVar.isPacked());
                break;
            case 14:
                List list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C5269x.f) it.next()).getNumber()));
                }
                AbstractC5225k1.writeInt32List(gVar.getNumber(), arrayList, r12, gVar.isPacked());
                break;
            case 15:
                AbstractC5225k1.writeBytesList(gVar.getNumber(), (List) entry.getValue(), r12);
                break;
            case 16:
                AbstractC5225k1.writeStringList(gVar.getNumber(), (List) entry.getValue(), r12);
                break;
            case 17:
                AbstractC5225k1.writeGroupList(gVar.getNumber(), (List) entry.getValue(), r12);
                break;
            case 18:
                AbstractC5225k1.writeMessageList(gVar.getNumber(), (List) entry.getValue(), r12);
                break;
        }
    }

    void k(Object obj, W w8) {
        L1.Z(obj, f26235a, w8);
    }
}
