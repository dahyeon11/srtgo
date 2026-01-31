package com.google.protobuf;

import com.google.protobuf.A0;
import java.util.Map;

/* loaded from: classes2.dex */
class F0 implements D0 {
    F0() {
    }

    private static int a(int i8, Object obj, Object obj2) {
        C0 c02 = (C0) obj;
        A0 a02 = (A0) obj2;
        int iComputeMessageSize = 0;
        if (c02.isEmpty()) {
            return 0;
        }
        for (Map.Entry<Object, Object> entry : c02.entrySet()) {
            iComputeMessageSize += a02.computeMessageSize(i8, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }

    private static C0 b(Object obj, Object obj2) {
        C0 c0MutableCopy = (C0) obj;
        C0 c02 = (C0) obj2;
        if (!c02.isEmpty()) {
            if (!c0MutableCopy.isMutable()) {
                c0MutableCopy = c0MutableCopy.mutableCopy();
            }
            c0MutableCopy.mergeFrom(c02);
        }
        return c0MutableCopy;
    }

    @Override // com.google.protobuf.D0
    public Map<?, ?> forMapData(Object obj) {
        return (C0) obj;
    }

    @Override // com.google.protobuf.D0
    public A0.b forMapMetadata(Object obj) {
        return ((A0) obj).b();
    }

    @Override // com.google.protobuf.D0
    public Map<?, ?> forMutableMapData(Object obj) {
        return (C0) obj;
    }

    @Override // com.google.protobuf.D0
    public int getSerializedSize(int i8, Object obj, Object obj2) {
        return a(i8, obj, obj2);
    }

    @Override // com.google.protobuf.D0
    public boolean isImmutable(Object obj) {
        return !((C0) obj).isMutable();
    }

    @Override // com.google.protobuf.D0
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // com.google.protobuf.D0
    public Object newMapField(Object obj) {
        return C0.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.D0
    public Object toImmutable(Object obj) {
        ((C0) obj).makeImmutable();
        return obj;
    }
}
