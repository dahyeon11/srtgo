package com.google.protobuf;

import com.google.protobuf.A0;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
interface R1 {

    public enum a {
        ASCENDING,
        DESCENDING
    }

    a fieldOrder();

    void writeBool(int i8, boolean z8);

    void writeBoolList(int i8, List<Boolean> list, boolean z8);

    void writeBytes(int i8, AbstractC5235o abstractC5235o);

    void writeBytesList(int i8, List<AbstractC5235o> list);

    void writeDouble(int i8, double d9);

    void writeDoubleList(int i8, List<Double> list, boolean z8);

    @Deprecated
    void writeEndGroup(int i8);

    void writeEnum(int i8, int i9);

    void writeEnumList(int i8, List<Integer> list, boolean z8);

    void writeFixed32(int i8, int i9);

    void writeFixed32List(int i8, List<Integer> list, boolean z8);

    void writeFixed64(int i8, long j8);

    void writeFixed64List(int i8, List<Long> list, boolean z8);

    void writeFloat(int i8, float f8);

    void writeFloatList(int i8, List<Float> list, boolean z8);

    @Deprecated
    void writeGroup(int i8, Object obj);

    @Deprecated
    void writeGroup(int i8, Object obj, InterfaceC5219i1 interfaceC5219i1);

    @Deprecated
    void writeGroupList(int i8, List<?> list);

    @Deprecated
    void writeGroupList(int i8, List<?> list, InterfaceC5219i1 interfaceC5219i1);

    void writeInt32(int i8, int i9);

    void writeInt32List(int i8, List<Integer> list, boolean z8);

    void writeInt64(int i8, long j8);

    void writeInt64List(int i8, List<Long> list, boolean z8);

    <K, V> void writeMap(int i8, A0.b bVar, Map<K, V> map);

    void writeMessage(int i8, Object obj);

    void writeMessage(int i8, Object obj, InterfaceC5219i1 interfaceC5219i1);

    void writeMessageList(int i8, List<?> list);

    void writeMessageList(int i8, List<?> list, InterfaceC5219i1 interfaceC5219i1);

    void writeMessageSetItem(int i8, Object obj);

    void writeSFixed32(int i8, int i9);

    void writeSFixed32List(int i8, List<Integer> list, boolean z8);

    void writeSFixed64(int i8, long j8);

    void writeSFixed64List(int i8, List<Long> list, boolean z8);

    void writeSInt32(int i8, int i9);

    void writeSInt32List(int i8, List<Integer> list, boolean z8);

    void writeSInt64(int i8, long j8);

    void writeSInt64List(int i8, List<Long> list, boolean z8);

    @Deprecated
    void writeStartGroup(int i8);

    void writeString(int i8, String str);

    void writeStringList(int i8, List<String> list);

    void writeUInt32(int i8, int i9);

    void writeUInt32List(int i8, List<Integer> list, boolean z8);

    void writeUInt64(int i8, long j8);

    void writeUInt64List(int i8, List<Long> list, boolean z8);
}
