package com.google.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5227l0 {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final r EMPTY_CODED_INPUT_STREAM;

    /* renamed from: a, reason: collision with root package name */
    static final Charset f26566a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f26567b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f26568c = Charset.forName("ISO-8859-1");

    /* renamed from: com.google.protobuf.l0$a */
    public interface a extends i {
        void addBoolean(boolean z8);

        boolean getBoolean(int i8);

        @Override // com.google.protobuf.AbstractC5227l0.i
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.AbstractC5227l0.i
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.AbstractC5227l0.i, com.google.protobuf.AbstractC5227l0.f
        a mutableCopyWithCapacity(int i8);

        boolean setBoolean(int i8, boolean z8);
    }

    /* renamed from: com.google.protobuf.l0$b */
    public interface b extends i {
        void addDouble(double d9);

        double getDouble(int i8);

        @Override // com.google.protobuf.AbstractC5227l0.i
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.AbstractC5227l0.i
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.AbstractC5227l0.i, com.google.protobuf.AbstractC5227l0.f
        b mutableCopyWithCapacity(int i8);

        double setDouble(int i8, double d9);
    }

    /* renamed from: com.google.protobuf.l0$c */
    public interface c {
        int getNumber();
    }

    /* renamed from: com.google.protobuf.l0$d */
    public interface d {
        c findValueByNumber(int i8);
    }

    /* renamed from: com.google.protobuf.l0$e */
    public interface e {
        boolean isInRange(int i8);
    }

    /* renamed from: com.google.protobuf.l0$f */
    public interface f extends i {
        void addFloat(float f8);

        float getFloat(int i8);

        @Override // com.google.protobuf.AbstractC5227l0.i
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.AbstractC5227l0.i
        /* synthetic */ void makeImmutable();

        f mutableCopyWithCapacity(int i8);

        float setFloat(int i8, float f8);
    }

    /* renamed from: com.google.protobuf.l0$g */
    public interface g extends i {
        void addInt(int i8);

        int getInt(int i8);

        @Override // com.google.protobuf.AbstractC5227l0.i
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.AbstractC5227l0.i
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.AbstractC5227l0.i, com.google.protobuf.AbstractC5227l0.f
        g mutableCopyWithCapacity(int i8);

        int setInt(int i8, int i9);
    }

    /* renamed from: com.google.protobuf.l0$h */
    public interface h extends i {
        void addLong(long j8);

        long getLong(int i8);

        @Override // com.google.protobuf.AbstractC5227l0.i
        /* synthetic */ boolean isModifiable();

        @Override // com.google.protobuf.AbstractC5227l0.i
        /* synthetic */ void makeImmutable();

        @Override // com.google.protobuf.AbstractC5227l0.i, com.google.protobuf.AbstractC5227l0.f
        h mutableCopyWithCapacity(int i8);

        long setLong(int i8, long j8);
    }

    /* renamed from: com.google.protobuf.l0$i */
    public interface i extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        i mutableCopyWithCapacity(int i8);
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = r.newInstance(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(f26568c);
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static AbstractC5235o bytesDefaultValue(String str) {
        return AbstractC5235o.copyFrom(str.getBytes(f26568c));
    }

    static int c(byte[] bArr, int i8, int i9) {
        int iE = e(i9, bArr, i8, i9);
        if (iE == 0) {
            return 1;
        }
        return iE;
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferDuplicate.capacity());
        byteBufferAllocate.put(byteBufferDuplicate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    static Object d(Object obj, Object obj2) {
        return ((K0) obj).toBuilder().mergeFrom((K0) obj2).buildPartial();
    }

    static int e(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!Arrays.equals(list.get(i8), list2.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        AbstractC5236o0.a(byteBufferDuplicate);
        ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
        AbstractC5236o0.a(byteBufferDuplicate2);
        return byteBufferDuplicate.equals(byteBufferDuplicate2);
    }

    public static <T extends K0> T getDefaultInstance(Class<T> cls) throws NoSuchMethodException, SecurityException {
        try {
            Method method = cls.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e8) {
            throw new RuntimeException("Failed to get default instance for " + cls, e8);
        }
    }

    public static int hashBoolean(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + hashCode(it.next());
        }
        return iHashCode;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int iHashCodeByteBuffer = 1;
        while (it.hasNext()) {
            iHashCodeByteBuffer = (iHashCodeByteBuffer * 31) + hashCodeByteBuffer(it.next());
        }
        return iHashCodeByteBuffer;
    }

    public static int hashEnum(c cVar) {
        return cVar.getNumber();
    }

    public static int hashEnumList(List<? extends c> list) {
        Iterator<? extends c> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    public static int hashLong(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static boolean isValidUtf8(AbstractC5235o abstractC5235o) {
        return abstractC5235o.isValidUtf8();
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(f26568c), f26567b);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(f26567b);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, f26567b);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return M1.t(bArr);
    }

    public static int hashCode(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int iE = e(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (iE == 0) {
                return 1;
            }
            return iE;
        }
        int iCapacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        AbstractC5236o0.a(byteBufferDuplicate);
        int iCapacity2 = byteBuffer.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = e(iCapacity2, bArr, 0, iRemaining);
        }
        if (iCapacity2 == 0) {
            return 1;
        }
        return iCapacity2;
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!equalsByteBuffer(list.get(i8), list2.get(i8))) {
                return false;
            }
        }
        return true;
    }
}
