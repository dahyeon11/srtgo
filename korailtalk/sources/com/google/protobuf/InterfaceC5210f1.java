package com.google.protobuf;

import com.google.protobuf.A0;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
interface InterfaceC5210f1 {
    public static final int READ_DONE = Integer.MAX_VALUE;
    public static final int TAG_UNKNOWN = 0;

    int getFieldNumber();

    int getTag();

    <T> void mergeGroupField(T t8, InterfaceC5219i1 interfaceC5219i1, M m8);

    <T> void mergeMessageField(T t8, InterfaceC5219i1 interfaceC5219i1, M m8);

    boolean readBool();

    void readBoolList(List<Boolean> list);

    AbstractC5235o readBytes();

    void readBytesList(List<AbstractC5235o> list);

    double readDouble();

    void readDoubleList(List<Double> list);

    int readEnum();

    void readEnumList(List<Integer> list);

    int readFixed32();

    void readFixed32List(List<Integer> list);

    long readFixed64();

    void readFixed64List(List<Long> list);

    float readFloat();

    void readFloatList(List<Float> list);

    @Deprecated
    <T> T readGroup(Class<T> cls, M m8);

    @Deprecated
    <T> T readGroupBySchemaWithCheck(InterfaceC5219i1 interfaceC5219i1, M m8);

    @Deprecated
    <T> void readGroupList(List<T> list, InterfaceC5219i1 interfaceC5219i1, M m8);

    @Deprecated
    <T> void readGroupList(List<T> list, Class<T> cls, M m8);

    int readInt32();

    void readInt32List(List<Integer> list);

    long readInt64();

    void readInt64List(List<Long> list);

    <K, V> void readMap(Map<K, V> map, A0.b bVar, M m8);

    <T> T readMessage(Class<T> cls, M m8);

    <T> T readMessageBySchemaWithCheck(InterfaceC5219i1 interfaceC5219i1, M m8);

    <T> void readMessageList(List<T> list, InterfaceC5219i1 interfaceC5219i1, M m8);

    <T> void readMessageList(List<T> list, Class<T> cls, M m8);

    int readSFixed32();

    void readSFixed32List(List<Integer> list);

    long readSFixed64();

    void readSFixed64List(List<Long> list);

    int readSInt32();

    void readSInt32List(List<Integer> list);

    long readSInt64();

    void readSInt64List(List<Long> list);

    String readString();

    void readStringList(List<String> list);

    void readStringListRequireUtf8(List<String> list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List<Integer> list);

    long readUInt64();

    void readUInt64List(List<Long> list);

    boolean shouldDiscardUnknownFields();

    boolean skipField();
}
