package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface Z0 {
    Object parseDelimitedFrom(InputStream inputStream);

    Object parseDelimitedFrom(InputStream inputStream, M m8);

    Object parseFrom(AbstractC5235o abstractC5235o);

    Object parseFrom(AbstractC5235o abstractC5235o, M m8);

    Object parseFrom(r rVar);

    Object parseFrom(r rVar, M m8);

    Object parseFrom(InputStream inputStream);

    Object parseFrom(InputStream inputStream, M m8);

    Object parseFrom(ByteBuffer byteBuffer);

    Object parseFrom(ByteBuffer byteBuffer, M m8);

    Object parseFrom(byte[] bArr);

    Object parseFrom(byte[] bArr, int i8, int i9);

    Object parseFrom(byte[] bArr, int i8, int i9, M m8);

    Object parseFrom(byte[] bArr, M m8);

    Object parsePartialDelimitedFrom(InputStream inputStream);

    Object parsePartialDelimitedFrom(InputStream inputStream, M m8);

    Object parsePartialFrom(AbstractC5235o abstractC5235o);

    Object parsePartialFrom(AbstractC5235o abstractC5235o, M m8);

    Object parsePartialFrom(r rVar);

    Object parsePartialFrom(r rVar, M m8);

    Object parsePartialFrom(InputStream inputStream);

    Object parsePartialFrom(InputStream inputStream, M m8);

    Object parsePartialFrom(byte[] bArr);

    Object parsePartialFrom(byte[] bArr, int i8, int i9);

    Object parsePartialFrom(byte[] bArr, int i8, int i9, M m8);

    Object parsePartialFrom(byte[] bArr, M m8);
}
