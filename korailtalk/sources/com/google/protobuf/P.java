package com.google.protobuf;

import com.google.protobuf.AbstractC5206e0;
import com.google.protobuf.K0;
import com.google.protobuf.P1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class P extends N {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26244a;

        static {
            int[] iArr = new int[P1.b.values().length];
            f26244a = iArr;
            try {
                iArr[P1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26244a[P1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26244a[P1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26244a[P1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26244a[P1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26244a[P1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26244a[P1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26244a[P1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26244a[P1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26244a[P1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26244a[P1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26244a[P1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26244a[P1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26244a[P1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26244a[P1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26244a[P1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26244a[P1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26244a[P1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    P() {
    }

    @Override // com.google.protobuf.N
    int a(Map.Entry entry) {
        return ((AbstractC5206e0.d) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.N
    Object b(M m8, K0 k02, int i8) {
        return m8.findLiteExtensionByNumber(k02, i8);
    }

    @Override // com.google.protobuf.N
    W c(Object obj) {
        return ((AbstractC5206e0.b) obj).v();
    }

    @Override // com.google.protobuf.N
    boolean d(K0 k02) {
        return k02 instanceof AbstractC5206e0.b;
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
        AbstractC5206e0.e eVar = (AbstractC5206e0.e) obj2;
        int number = eVar.getNumber();
        if (eVar.f26419d.isRepeated() && eVar.f26419d.isPacked()) {
            switch (a.f26244a[eVar.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC5210f1.readEnumList(arrayList);
                    obj3 = AbstractC5225k1.z(obj, number, arrayList, eVar.f26419d.getEnumType(), obj3, f12);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f26419d.getLiteType());
            }
            w8.setField(eVar.f26419d, arrayList);
        } else {
            if (eVar.getLiteType() != P1.b.ENUM) {
                switch (a.f26244a[eVar.getLiteType().ordinal()]) {
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
                        if (!eVar.isRepeated()) {
                            Object field2 = w8.getField(eVar.f26419d);
                            if (field2 instanceof AbstractC5206e0) {
                                InterfaceC5219i1 interfaceC5219i1SchemaFor = C5201c1.getInstance().schemaFor((C5201c1) field2);
                                if (!((AbstractC5206e0) field2).q()) {
                                    Object objNewInstance = interfaceC5219i1SchemaFor.newInstance();
                                    interfaceC5219i1SchemaFor.mergeFrom(objNewInstance, field2);
                                    w8.setField(eVar.f26419d, objNewInstance);
                                    field2 = objNewInstance;
                                }
                                interfaceC5210f1.mergeGroupField(field2, interfaceC5219i1SchemaFor, m8);
                                return obj3;
                            }
                        }
                        objValueOf = interfaceC5210f1.readGroup(eVar.getMessageDefaultInstance().getClass(), m8);
                        break;
                    case 18:
                        if (!eVar.isRepeated()) {
                            Object field3 = w8.getField(eVar.f26419d);
                            if (field3 instanceof AbstractC5206e0) {
                                InterfaceC5219i1 interfaceC5219i1SchemaFor2 = C5201c1.getInstance().schemaFor((C5201c1) field3);
                                if (!((AbstractC5206e0) field3).q()) {
                                    Object objNewInstance2 = interfaceC5219i1SchemaFor2.newInstance();
                                    interfaceC5219i1SchemaFor2.mergeFrom(objNewInstance2, field3);
                                    w8.setField(eVar.f26419d, objNewInstance2);
                                    field3 = objNewInstance2;
                                }
                                interfaceC5210f1.mergeMessageField(field3, interfaceC5219i1SchemaFor2, m8);
                                return obj3;
                            }
                        }
                        objValueOf = interfaceC5210f1.readMessage(eVar.getMessageDefaultInstance().getClass(), m8);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int int32 = interfaceC5210f1.readInt32();
                if (eVar.f26419d.getEnumType().findValueByNumber(int32) == null) {
                    return AbstractC5225k1.J(obj, number, int32, obj3, f12);
                }
                objValueOf = Integer.valueOf(int32);
            }
            if (eVar.isRepeated()) {
                w8.addRepeatedField(eVar.f26419d, objValueOf);
            } else {
                int i8 = a.f26244a[eVar.getLiteType().ordinal()];
                if ((i8 == 17 || i8 == 18) && (field = w8.getField(eVar.f26419d)) != null) {
                    objValueOf = AbstractC5227l0.d(field, objValueOf);
                }
                w8.setField(eVar.f26419d, objValueOf);
            }
        }
        return obj3;
    }

    @Override // com.google.protobuf.N
    void g(InterfaceC5210f1 interfaceC5210f1, Object obj, M m8, W w8) {
        AbstractC5206e0.e eVar = (AbstractC5206e0.e) obj;
        w8.setField(eVar.f26419d, interfaceC5210f1.readMessage(eVar.getMessageDefaultInstance().getClass(), m8));
    }

    @Override // com.google.protobuf.N
    W getExtensions(Object obj) {
        return ((AbstractC5206e0.b) obj).f26410d;
    }

    @Override // com.google.protobuf.N
    void h(AbstractC5235o abstractC5235o, Object obj, M m8, W w8) {
        AbstractC5206e0.e eVar = (AbstractC5206e0.e) obj;
        K0.a aVarNewBuilderForType = eVar.getMessageDefaultInstance().newBuilderForType();
        r rVarNewCodedInput = abstractC5235o.newCodedInput();
        aVarNewBuilderForType.mergeFrom(rVarNewCodedInput, m8);
        w8.setField(eVar.f26419d, aVarNewBuilderForType.buildPartial());
        rVarNewCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.N
    void i(R1 r12, Map.Entry entry) {
        AbstractC5206e0.d dVar = (AbstractC5206e0.d) entry.getKey();
        if (!dVar.isRepeated()) {
            switch (a.f26244a[dVar.getLiteType().ordinal()]) {
                case 1:
                    r12.writeDouble(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    r12.writeFloat(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    r12.writeInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    r12.writeUInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    r12.writeInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    r12.writeFixed64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    r12.writeFixed32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    r12.writeBool(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    r12.writeUInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    r12.writeSFixed32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    r12.writeSFixed64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    r12.writeSInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    r12.writeSInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    r12.writeInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    r12.writeBytes(dVar.getNumber(), (AbstractC5235o) entry.getValue());
                    break;
                case 16:
                    r12.writeString(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    r12.writeGroup(dVar.getNumber(), entry.getValue(), C5201c1.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
                case 18:
                    r12.writeMessage(dVar.getNumber(), entry.getValue(), C5201c1.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f26244a[dVar.getLiteType().ordinal()]) {
            case 1:
                AbstractC5225k1.writeDoubleList(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 2:
                AbstractC5225k1.writeFloatList(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 3:
                AbstractC5225k1.writeInt64List(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 4:
                AbstractC5225k1.writeUInt64List(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 5:
                AbstractC5225k1.writeInt32List(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 6:
                AbstractC5225k1.writeFixed64List(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 7:
                AbstractC5225k1.writeFixed32List(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 8:
                AbstractC5225k1.writeBoolList(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 9:
                AbstractC5225k1.writeUInt32List(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 10:
                AbstractC5225k1.writeSFixed32List(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 11:
                AbstractC5225k1.writeSFixed64List(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 12:
                AbstractC5225k1.writeSInt32List(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 13:
                AbstractC5225k1.writeSInt64List(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 14:
                AbstractC5225k1.writeInt32List(dVar.getNumber(), (List) entry.getValue(), r12, dVar.isPacked());
                break;
            case 15:
                AbstractC5225k1.writeBytesList(dVar.getNumber(), (List) entry.getValue(), r12);
                break;
            case 16:
                AbstractC5225k1.writeStringList(dVar.getNumber(), (List) entry.getValue(), r12);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    AbstractC5225k1.writeGroupList(dVar.getNumber(), (List) entry.getValue(), r12, C5201c1.getInstance().schemaFor((Class) list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    AbstractC5225k1.writeMessageList(dVar.getNumber(), (List) entry.getValue(), r12, C5201c1.getInstance().schemaFor((Class) list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
