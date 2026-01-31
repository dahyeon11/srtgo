package com.google.protobuf;

import com.google.protobuf.C5269x;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface N0 extends L0 {
    List<String> findInitializationErrors();

    Map<C5269x.g, Object> getAllFields();

    H0 getDefaultInstanceForType();

    C5269x.b getDescriptorForType();

    Object getField(C5269x.g gVar);

    String getInitializationErrorString();

    C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

    Object getRepeatedField(C5269x.g gVar, int i8);

    int getRepeatedFieldCount(C5269x.g gVar);

    G1 getUnknownFields();

    boolean hasField(C5269x.g gVar);

    boolean hasOneof(C5269x.l lVar);

    /* synthetic */ boolean isInitialized();
}
