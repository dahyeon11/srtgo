package com.google.protobuf;

import com.google.protobuf.A0;
import java.util.Map;

/* loaded from: classes2.dex */
interface D0 {
    Map<?, ?> forMapData(Object obj);

    A0.b forMapMetadata(Object obj);

    Map<?, ?> forMutableMapData(Object obj);

    int getSerializedSize(int i8, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
