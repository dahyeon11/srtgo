package com.google.protobuf;

import com.google.protobuf.A0;
import java.util.Map;

/* loaded from: classes2.dex */
class E0 implements D0 {
    E0() {
    }

    private static int a(int i8, Object obj, Object obj2) {
        int iComputeTagSize = 0;
        if (obj == null) {
            return 0;
        }
        Map<Object, Object> map = ((B0) obj).getMap();
        C5274z0 c5274z0 = (C5274z0) obj2;
        if (map.isEmpty()) {
            return 0;
        }
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            iComputeTagSize += AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(A0.a(c5274z0.k(), entry.getKey(), entry.getValue()));
        }
        return iComputeTagSize;
    }

    private static Object b(Object obj, Object obj2) {
        B0 b02 = (B0) obj;
        B0 b03 = (B0) obj2;
        if (!b02.isMutable()) {
            b02.copy();
        }
        b02.mergeFrom(b03);
        return b02;
    }

    @Override // com.google.protobuf.D0
    public Map<?, ?> forMapData(Object obj) {
        return ((B0) obj).getMap();
    }

    @Override // com.google.protobuf.D0
    public A0.b forMapMetadata(Object obj) {
        return ((C5274z0) obj).k();
    }

    @Override // com.google.protobuf.D0
    public Map<?, ?> forMutableMapData(Object obj) {
        return ((B0) obj).getMutableMap();
    }

    @Override // com.google.protobuf.D0
    public int getSerializedSize(int i8, Object obj, Object obj2) {
        return a(i8, obj, obj2);
    }

    @Override // com.google.protobuf.D0
    public boolean isImmutable(Object obj) {
        return !((B0) obj).isMutable();
    }

    @Override // com.google.protobuf.D0
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // com.google.protobuf.D0
    public Object newMapField(Object obj) {
        return B0.newMapField((C5274z0) obj);
    }

    @Override // com.google.protobuf.D0
    public Object toImmutable(Object obj) {
        ((B0) obj).makeImmutable();
        return obj;
    }
}
