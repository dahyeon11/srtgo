package com.google.protobuf;

import com.google.protobuf.C5269x;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5194a0 extends N0 {
    @Override // com.google.protobuf.N0
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.N0
    /* synthetic */ Map getAllFields();

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

    @Override // com.google.protobuf.N0
    /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

    @Override // com.google.protobuf.N0
    /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

    @Override // com.google.protobuf.N0
    /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

    @Override // com.google.protobuf.N0
    /* synthetic */ G1 getUnknownFields();

    float getValue();

    @Override // com.google.protobuf.N0
    /* synthetic */ boolean hasField(C5269x.g gVar);

    @Override // com.google.protobuf.N0
    /* synthetic */ boolean hasOneof(C5269x.l lVar);

    @Override // com.google.protobuf.N0, A7.a.c
    /* synthetic */ boolean isInitialized();
}
