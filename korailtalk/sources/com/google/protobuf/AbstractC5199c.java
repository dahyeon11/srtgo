package com.google.protobuf;

import com.google.protobuf.AbstractC5196b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5199c implements Z0 {
    private static final M EMPTY_REGISTRY = M.getEmptyRegistry();

    private K0 a(K0 k02) throws C5230m0 {
        if (k02 == null || k02.isInitialized()) {
            return k02;
        }
        throw b(k02).asInvalidProtocolBufferException().setUnfinishedMessage(k02);
    }

    private E1 b(K0 k02) {
        return k02 instanceof AbstractC5196b ? ((AbstractC5196b) k02).newUninitializedMessageException() : new E1(k02);
    }

    @Override // com.google.protobuf.Z0
    public abstract /* synthetic */ Object parsePartialFrom(r rVar, M m8);

    @Override // com.google.protobuf.Z0
    public K0 parseDelimitedFrom(InputStream inputStream, M m8) {
        return a(parsePartialDelimitedFrom(inputStream, m8));
    }

    @Override // com.google.protobuf.Z0
    public K0 parsePartialDelimitedFrom(InputStream inputStream, M m8) throws IOException {
        try {
            int i8 = inputStream.read();
            if (i8 == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new AbstractC5196b.a.C0219a(inputStream, r.readRawVarint32(i8, inputStream)), m8);
        } catch (IOException e8) {
            throw new C5230m0(e8);
        }
    }

    @Override // com.google.protobuf.Z0
    public K0 parseDelimitedFrom(InputStream inputStream) {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parsePartialDelimitedFrom(InputStream inputStream) {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parsePartialFrom(r rVar) {
        return (K0) parsePartialFrom(rVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parsePartialFrom(AbstractC5235o abstractC5235o, M m8) throws C5230m0 {
        r rVarNewCodedInput = abstractC5235o.newCodedInput();
        K0 k02 = (K0) parsePartialFrom(rVarNewCodedInput, m8);
        try {
            rVarNewCodedInput.checkLastTagWas(0);
            return k02;
        } catch (C5230m0 e8) {
            throw e8.setUnfinishedMessage(k02);
        }
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(r rVar, M m8) {
        return a((K0) parsePartialFrom(rVar, m8));
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(r rVar) {
        return parseFrom(rVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return a(parsePartialFrom(abstractC5235o, m8));
    }

    @Override // com.google.protobuf.Z0
    public K0 parsePartialFrom(AbstractC5235o abstractC5235o) {
        return parsePartialFrom(abstractC5235o, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(AbstractC5235o abstractC5235o) {
        return parseFrom(abstractC5235o, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parsePartialFrom(byte[] bArr, int i8, int i9, M m8) throws C5230m0 {
        r rVarNewInstance = r.newInstance(bArr, i8, i9);
        K0 k02 = (K0) parsePartialFrom(rVarNewInstance, m8);
        try {
            rVarNewInstance.checkLastTagWas(0);
            return k02;
        } catch (C5230m0 e8) {
            throw e8.setUnfinishedMessage(k02);
        }
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(ByteBuffer byteBuffer, M m8) throws C5230m0 {
        r rVarNewInstance = r.newInstance(byteBuffer);
        K0 k02 = (K0) parsePartialFrom(rVarNewInstance, m8);
        try {
            rVarNewInstance.checkLastTagWas(0);
            return a(k02);
        } catch (C5230m0 e8) {
            throw e8.setUnfinishedMessage(k02);
        }
    }

    @Override // com.google.protobuf.Z0
    public K0 parsePartialFrom(byte[] bArr, int i8, int i9) {
        return parsePartialFrom(bArr, i8, i9, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parsePartialFrom(byte[] bArr, M m8) {
        return parsePartialFrom(bArr, 0, bArr.length, m8);
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(ByteBuffer byteBuffer) {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parsePartialFrom(byte[] bArr) {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(byte[] bArr, int i8, int i9, M m8) {
        return a(parsePartialFrom(bArr, i8, i9, m8));
    }

    @Override // com.google.protobuf.Z0
    public K0 parsePartialFrom(InputStream inputStream, M m8) throws C5230m0 {
        r rVarNewInstance = r.newInstance(inputStream);
        K0 k02 = (K0) parsePartialFrom(rVarNewInstance, m8);
        try {
            rVarNewInstance.checkLastTagWas(0);
            return k02;
        } catch (C5230m0 e8) {
            throw e8.setUnfinishedMessage(k02);
        }
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(byte[] bArr, int i8, int i9) {
        return parseFrom(bArr, i8, i9, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(byte[] bArr, M m8) {
        return parseFrom(bArr, 0, bArr.length, m8);
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(byte[] bArr) {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(InputStream inputStream, M m8) {
        return a(parsePartialFrom(inputStream, m8));
    }

    @Override // com.google.protobuf.Z0
    public K0 parsePartialFrom(InputStream inputStream) {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.Z0
    public K0 parseFrom(InputStream inputStream) {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
