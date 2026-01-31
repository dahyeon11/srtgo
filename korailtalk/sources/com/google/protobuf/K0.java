package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public interface K0 extends L0 {

    public interface a extends L0, Cloneable {
        K0 build();

        K0 buildPartial();

        a clear();

        a clone();

        @Override // com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* synthetic */ K0 getDefaultInstanceForType();

        @Override // com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream);

        boolean mergeDelimitedFrom(InputStream inputStream, M m8);

        a mergeFrom(K0 k02);

        a mergeFrom(AbstractC5235o abstractC5235o);

        a mergeFrom(AbstractC5235o abstractC5235o, M m8);

        a mergeFrom(r rVar);

        a mergeFrom(r rVar, M m8);

        a mergeFrom(InputStream inputStream);

        a mergeFrom(InputStream inputStream, M m8);

        a mergeFrom(byte[] bArr);

        a mergeFrom(byte[] bArr, int i8, int i9);

        a mergeFrom(byte[] bArr, int i8, int i9, M m8);

        a mergeFrom(byte[] bArr, M m8);
    }

    @Override // com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    /* synthetic */ K0 getDefaultInstanceForType();

    Z0 getParserForType();

    int getSerializedSize();

    @Override // com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    /* synthetic */ boolean isInitialized();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    AbstractC5235o toByteString();

    void writeDelimitedTo(OutputStream outputStream);

    void writeTo(AbstractC5248t abstractC5248t);

    void writeTo(OutputStream outputStream);
}
