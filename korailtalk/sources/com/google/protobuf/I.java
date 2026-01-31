package com.google.protobuf;

import com.google.protobuf.C5269x;

/* loaded from: classes2.dex */
public abstract class I extends J {

    protected enum a {
        IMMUTABLE,
        MUTABLE,
        PROTO1
    }

    public enum b {
        PROTO1,
        PROTO2
    }

    @Override // com.google.protobuf.J
    final boolean a() {
        return false;
    }

    protected abstract Object b(Object obj);

    protected abstract a c();

    protected abstract Object d(Object obj);

    protected abstract Object e(Object obj);

    protected abstract Object f(Object obj);

    public abstract C5269x.g getDescriptor();

    @Override // com.google.protobuf.J
    public abstract H0 getMessageDefaultInstance();

    public b getMessageType() {
        return b.PROTO2;
    }
}
