package com.google.protobuf;

import com.google.protobuf.C5269x;
import com.google.protobuf.K0;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface H0 extends K0, N0 {

    public interface a extends K0.a, N0 {
        a addRepeatedField(C5269x.g gVar, Object obj);

        H0 build();

        H0 buildPartial();

        a clear();

        a clearField(C5269x.g gVar);

        a clearOneof(C5269x.l lVar);

        /* renamed from: clone */
        a m395clone();

        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        a getFieldBuilder(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        a getRepeatedFieldBuilder(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();

        @Override // com.google.protobuf.K0.a
        boolean mergeDelimitedFrom(InputStream inputStream);

        @Override // com.google.protobuf.K0.a
        boolean mergeDelimitedFrom(InputStream inputStream, M m8);

        a mergeFrom(H0 h02);

        @Override // com.google.protobuf.K0.a
        a mergeFrom(AbstractC5235o abstractC5235o);

        @Override // com.google.protobuf.K0.a
        a mergeFrom(AbstractC5235o abstractC5235o, M m8);

        @Override // com.google.protobuf.K0.a
        a mergeFrom(r rVar);

        a mergeFrom(r rVar, M m8);

        @Override // com.google.protobuf.K0.a
        a mergeFrom(InputStream inputStream);

        @Override // com.google.protobuf.K0.a
        a mergeFrom(InputStream inputStream, M m8);

        @Override // com.google.protobuf.K0.a
        a mergeFrom(byte[] bArr);

        @Override // com.google.protobuf.K0.a
        a mergeFrom(byte[] bArr, int i8, int i9);

        @Override // com.google.protobuf.K0.a
        a mergeFrom(byte[] bArr, int i8, int i9, M m8);

        @Override // com.google.protobuf.K0.a
        a mergeFrom(byte[] bArr, M m8);

        @Override // com.google.protobuf.K0.a
        /* synthetic */ K0.a mergeFrom(K0 k02);

        a mergeUnknownFields(G1 g12);

        a newBuilderForField(C5269x.g gVar);

        a setField(C5269x.g gVar, Object obj);

        a setRepeatedField(C5269x.g gVar, int i8, Object obj);

        a setUnknownFields(G1 g12);
    }

    boolean equals(Object obj);

    @Override // com.google.protobuf.N0
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.N0
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.N0, A7.a.c
    /* synthetic */ H0 getDefaultInstanceForType();

    @Override // com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
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

    Z0 getParserForType();

    @Override // com.google.protobuf.N0
    /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

    @Override // com.google.protobuf.N0
    /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

    /* synthetic */ int getSerializedSize();

    @Override // com.google.protobuf.N0
    /* synthetic */ G1 getUnknownFields();

    @Override // com.google.protobuf.N0
    /* synthetic */ boolean hasField(C5269x.g gVar);

    @Override // com.google.protobuf.N0
    /* synthetic */ boolean hasOneof(C5269x.l lVar);

    int hashCode();

    @Override // com.google.protobuf.N0, A7.a.c
    /* synthetic */ boolean isInitialized();

    a newBuilderForType();

    a toBuilder();

    @Override // com.google.protobuf.K0
    /* synthetic */ byte[] toByteArray();

    @Override // com.google.protobuf.K0
    /* synthetic */ AbstractC5235o toByteString();

    String toString();

    @Override // com.google.protobuf.K0
    /* synthetic */ void writeDelimitedTo(OutputStream outputStream);

    /* synthetic */ void writeTo(AbstractC5248t abstractC5248t);

    @Override // com.google.protobuf.K0
    /* synthetic */ void writeTo(OutputStream outputStream);
}
