package com.google.protobuf;

import com.google.protobuf.C5269x;
import com.google.protobuf.N1;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface O1 extends N0 {
    @Override // com.google.protobuf.N0
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.N0
    /* synthetic */ Map getAllFields();

    boolean getBoolValue();

    @Override // com.google.protobuf.N0, A7.a.c
    /* synthetic */ H0 getDefaultInstanceForType();

    @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.N0, A7.a.c
    /* synthetic */ C5269x.b getDescriptorForType();

    @Override // com.google.protobuf.N0
    /* synthetic */ Object getField(C5269x.g gVar);

    @Override // com.google.protobuf.N0
    /* synthetic */ String getInitializationErrorString();

    N1.d getKindCase();

    C5253v0 getListValue();

    InterfaceC5268w0 getListValueOrBuilder();

    X0 getNullValue();

    int getNullValueValue();

    double getNumberValue();

    @Override // com.google.protobuf.N0
    /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

    @Override // com.google.protobuf.N0
    /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

    @Override // com.google.protobuf.N0
    /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

    String getStringValue();

    AbstractC5235o getStringValueBytes();

    C5240p1 getStructValue();

    InterfaceC5243q1 getStructValueOrBuilder();

    @Override // com.google.protobuf.N0
    /* synthetic */ G1 getUnknownFields();

    boolean hasBoolValue();

    @Override // com.google.protobuf.N0
    /* synthetic */ boolean hasField(C5269x.g gVar);

    boolean hasListValue();

    boolean hasNullValue();

    boolean hasNumberValue();

    @Override // com.google.protobuf.N0
    /* synthetic */ boolean hasOneof(C5269x.l lVar);

    boolean hasStringValue();

    boolean hasStructValue();

    @Override // com.google.protobuf.N0, A7.a.c
    /* synthetic */ boolean isInitialized();
}
