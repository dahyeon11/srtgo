package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import org.tensorflow.lite.j;

/* loaded from: classes3.dex */
final class TensorImpl implements j {

    /* renamed from: a, reason: collision with root package name */
    private long f34528a;

    /* renamed from: b, reason: collision with root package name */
    private final a f34529b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f34530c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f34531d;

    /* renamed from: e, reason: collision with root package name */
    private final j.a f34532e;

    private TensorImpl(long j8) {
        this.f34528a = j8;
        this.f34529b = b.a(dtype(j8));
        this.f34530c = shape(j8);
        this.f34531d = shapeSignature(j8);
        this.f34532e = new j.a(quantizationScale(j8), quantizationZeroPoint(j8));
    }

    private ByteBuffer a() {
        return buffer(this.f34528a).order(ByteOrder.nativeOrder());
    }

    private static native ByteBuffer buffer(long j8);

    static int c(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return c(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native long create(long j8, int i8, int i9);

    private static native long createSignatureInputTensor(long j8, String str);

    private static native long createSignatureOutputTensor(long j8, String str);

    static int d(int[] iArr) {
        int i8 = 1;
        for (int i9 : iArr) {
            i8 *= i9;
        }
        return i8;
    }

    private static native void delete(long j8);

    private static native int dtype(long j8);

    private int[] e(Object obj) {
        int iC = c(obj);
        if (this.f34529b == a.STRING) {
            Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Byte.TYPE.equals(componentType)) {
                    iC--;
                }
            }
        }
        int[] iArr = new int[iC];
        i(obj, 0, iArr);
        return iArr;
    }

    private void g(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(a());
            return;
        }
        if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(a().asFloatBuffer());
            return;
        }
        if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(a().asLongBuffer());
            return;
        }
        if (buffer instanceof IntBuffer) {
            ((IntBuffer) buffer).put(a().asIntBuffer());
        } else {
            if (buffer instanceof ShortBuffer) {
                ((ShortBuffer) buffer).put(a().asShortBuffer());
                return;
            }
            throw new IllegalArgumentException("Unexpected output buffer type: " + buffer);
        }
    }

    private static native boolean hasDelegateBufferHandle(long j8);

    static void i(Object obj, int i8, int[] iArr) {
        if (iArr == null || i8 == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i9 = iArr[i8];
        if (i9 == 0) {
            iArr[i8] = length;
        } else if (i9 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(iArr[i8]), Integer.valueOf(length), Integer.valueOf(i8)));
        }
        int i10 = i8 + 1;
        if (i10 == iArr.length) {
            return;
        }
        for (int i11 = 0; i11 < length; i11++) {
            i(Array.get(obj, i11), i10, iArr);
        }
    }

    private static native int index(long j8);

    static TensorImpl j(long j8, int i8) {
        return new TensorImpl(create(j8, i8, 0));
    }

    static TensorImpl k(long j8, String str) {
        return new TensorImpl(createSignatureInputTensor(j8, str));
    }

    static TensorImpl l(long j8, String str) {
        return new TensorImpl(createSignatureOutputTensor(j8, str));
    }

    private static boolean n(Object obj) {
        return obj instanceof Buffer;
    }

    private static native String name(long j8);

    private static native int numBytes(long j8);

    private static boolean o(Object obj) {
        return obj instanceof ByteBuffer;
    }

    private static native float quantizationScale(long j8);

    private static native int quantizationZeroPoint(long j8);

    private void r(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f34528a, buffer);
                return;
            } else {
                a().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f34528a, buffer);
                return;
            } else {
                a().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f34528a, buffer);
                return;
            } else {
                a().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) buffer;
            if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f34528a, buffer);
                return;
            } else {
                a().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (!(buffer instanceof ShortBuffer)) {
            throw new IllegalArgumentException("Unexpected input buffer type: " + buffer);
        }
        ShortBuffer shortBuffer = (ShortBuffer) buffer;
        if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.f34528a, buffer);
        } else {
            a().asShortBuffer().put(shortBuffer);
        }
    }

    private static native void readMultiDimensionalArray(long j8, Object obj);

    private void s(Object obj) {
        if (!n(obj)) {
            int[] iArrE = e(obj);
            if (!Arrays.equals(iArrE, this.f34530c)) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", name(), Arrays.toString(this.f34530c), Arrays.toString(iArrE)));
            }
        } else {
            Buffer buffer = (Buffer) obj;
            int iNumBytes = numBytes();
            int iCapacity = o(obj) ? buffer.capacity() : buffer.capacity() * this.f34529b.byteSize();
            if (iNumBytes > iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
        }
    }

    private static native int[] shape(long j8);

    private static native int[] shapeSignature(long j8);

    private void t(Object obj) {
        if (!n(obj)) {
            int[] iArrE = e(obj);
            if (!Arrays.equals(iArrE, this.f34530c)) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", name(), Arrays.toString(this.f34530c), Arrays.toString(iArrE)));
            }
        } else {
            Buffer buffer = (Buffer) obj;
            int iNumBytes = numBytes();
            int iCapacity = o(obj) ? buffer.capacity() : buffer.capacity() * this.f34529b.byteSize();
            if (iNumBytes != iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
        }
    }

    private void u(Object obj) {
        a aVarH;
        if (!o(obj) && (aVarH = h(obj)) != this.f34529b && !b.b(aVarH).equals(b.b(this.f34529b))) {
            throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", this.f34529b, obj.getClass().getName(), aVarH));
        }
    }

    private static native void writeDirectBuffer(long j8, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j8, Object obj);

    private static native void writeScalar(long j8, Object obj);

    @Override // org.tensorflow.lite.j
    public ByteBuffer asReadOnlyBuffer() {
        return a().asReadOnlyBuffer().order(ByteOrder.nativeOrder());
    }

    void b() {
        delete(this.f34528a);
        this.f34528a = 0L;
    }

    @Override // org.tensorflow.lite.j
    public a dataType() {
        return this.f34529b;
    }

    void f(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.f34528a)) {
                throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        u(obj);
        s(obj);
        if (n(obj)) {
            g((Buffer) obj);
        } else {
            readMultiDimensionalArray(this.f34528a, obj);
        }
    }

    a h(Object obj) {
        Class<?> componentType = obj.getClass();
        if (componentType.isArray()) {
            while (componentType.isArray()) {
                componentType = componentType.getComponentType();
            }
            if (Float.TYPE.equals(componentType)) {
                return a.FLOAT32;
            }
            if (Integer.TYPE.equals(componentType)) {
                return a.INT32;
            }
            if (Short.TYPE.equals(componentType)) {
                return a.INT16;
            }
            if (Byte.TYPE.equals(componentType)) {
                a aVar = this.f34529b;
                a aVar2 = a.STRING;
                return aVar == aVar2 ? aVar2 : a.UINT8;
            }
            if (Long.TYPE.equals(componentType)) {
                return a.INT64;
            }
            if (Boolean.TYPE.equals(componentType)) {
                return a.BOOL;
            }
            if (String.class.equals(componentType)) {
                return a.STRING;
            }
        } else {
            if (Float.class.equals(componentType) || (obj instanceof FloatBuffer)) {
                return a.FLOAT32;
            }
            if (Integer.class.equals(componentType) || (obj instanceof IntBuffer)) {
                return a.INT32;
            }
            if (Short.class.equals(componentType) || (obj instanceof ShortBuffer)) {
                return a.INT16;
            }
            if (Byte.class.equals(componentType)) {
                return a.UINT8;
            }
            if (Long.class.equals(componentType) || (obj instanceof LongBuffer)) {
                return a.INT64;
            }
            if (Boolean.class.equals(componentType)) {
                return a.BOOL;
            }
            if (String.class.equals(componentType)) {
                return a.STRING;
            }
        }
        throw new IllegalArgumentException("DataType error: cannot resolve DataType of " + obj.getClass().getName());
    }

    @Override // org.tensorflow.lite.j
    public int index() {
        return index(this.f34528a);
    }

    int[] m(Object obj) {
        if (obj == null || n(obj)) {
            return null;
        }
        u(obj);
        int[] iArrE = e(obj);
        if (Arrays.equals(this.f34530c, iArrE)) {
            return null;
        }
        return iArrE;
    }

    @Override // org.tensorflow.lite.j
    public String name() {
        return name(this.f34528a);
    }

    @Override // org.tensorflow.lite.j
    public int numBytes() {
        return numBytes(this.f34528a);
    }

    @Override // org.tensorflow.lite.j
    public int numDimensions() {
        return this.f34530c.length;
    }

    @Override // org.tensorflow.lite.j
    public int numElements() {
        return d(this.f34530c);
    }

    void p() {
        this.f34530c = shape(this.f34528a);
    }

    void q(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.f34528a)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        u(obj);
        t(obj);
        if (n(obj)) {
            r((Buffer) obj);
            return;
        }
        if (this.f34529b == a.STRING && this.f34530c.length == 0) {
            writeScalar(this.f34528a, obj);
        } else if (obj.getClass().isArray()) {
            writeMultiDimensionalArray(this.f34528a, obj);
        } else {
            writeScalar(this.f34528a, obj);
        }
    }

    @Override // org.tensorflow.lite.j
    public j.a quantizationParams() {
        return this.f34532e;
    }

    @Override // org.tensorflow.lite.j
    public int[] shape() {
        return this.f34530c;
    }

    @Override // org.tensorflow.lite.j
    public int[] shapeSignature() {
        return this.f34531d;
    }
}
