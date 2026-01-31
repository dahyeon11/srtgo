package com.google.protobuf;

import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5249t0 extends InterfaceC5207e1 {
    void add(AbstractC5235o abstractC5235o);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends AbstractC5235o> collection);

    List<byte[]> asByteArrayList();

    @Override // com.google.protobuf.InterfaceC5207e1
    /* synthetic */ List asByteStringList();

    byte[] getByteArray(int i8);

    AbstractC5235o getByteString(int i8);

    Object getRaw(int i8);

    List<?> getUnderlyingElements();

    InterfaceC5249t0 getUnmodifiableView();

    void mergeFrom(InterfaceC5249t0 interfaceC5249t0);

    void set(int i8, AbstractC5235o abstractC5235o);

    void set(int i8, byte[] bArr);
}
