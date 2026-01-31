package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.C5269x;

/* loaded from: classes2.dex */
public enum X0 implements InterfaceC5204d1 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5227l0.d f26363b = new AbstractC5227l0.d() { // from class: com.google.protobuf.X0.a
        @Override // com.google.protobuf.AbstractC5227l0.d
        public X0 findValueByNumber(int i8) {
            return X0.forNumber(i8);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final X0[] f26364c = values();

    /* renamed from: a, reason: collision with root package name */
    private final int f26366a;

    X0(int i8) {
        this.f26366a = i8;
    }

    public static X0 forNumber(int i8) {
        if (i8 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static final C5269x.e getDescriptor() {
        return AbstractC5245r1.getDescriptor().getEnumTypes().get(0);
    }

    public static AbstractC5227l0.d internalGetValueMap() {
        return f26363b;
    }

    @Override // com.google.protobuf.InterfaceC5204d1
    public final C5269x.e getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.InterfaceC5204d1, com.google.protobuf.AbstractC5227l0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f26366a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.google.protobuf.InterfaceC5204d1
    public final C5269x.f getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static X0 valueOf(int i8) {
        return forNumber(i8);
    }

    public static X0 valueOf(C5269x.f fVar) {
        if (fVar.getType() == getDescriptor()) {
            if (fVar.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return f26364c[fVar.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
