package j2;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5816c {
    private static int a(Parcel parcel, int i8) {
        parcel.writeInt(i8 | W.a.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void b(Parcel parcel, int i8) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i8 - 4);
        parcel.writeInt(iDataPosition - i8);
        parcel.setDataPosition(iDataPosition);
    }

    public static int beginObjectHeader(Parcel parcel) {
        return a(parcel, 20293);
    }

    private static void c(Parcel parcel, int i8, int i9) {
        parcel.writeInt(i8 | (i9 << 16));
    }

    private static void d(Parcel parcel, Parcelable parcelable, int i8) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i8);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static void finishObjectHeader(Parcel parcel, int i8) {
        b(parcel, i8);
    }

    public static void writeBigDecimal(Parcel parcel, int i8, BigDecimal bigDecimal, boolean z8) {
        if (bigDecimal == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            b(parcel, iA);
        }
    }

    public static void writeBigDecimalArray(Parcel parcel, int i8, BigDecimal[] bigDecimalArr, boolean z8) {
        if (bigDecimalArr == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i9 = 0; i9 < length; i9++) {
            parcel.writeByteArray(bigDecimalArr[i9].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i9].scale());
        }
        b(parcel, iA);
    }

    public static void writeBigInteger(Parcel parcel, int i8, BigInteger bigInteger, boolean z8) {
        if (bigInteger == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeByteArray(bigInteger.toByteArray());
            b(parcel, iA);
        }
    }

    public static void writeBigIntegerArray(Parcel parcel, int i8, BigInteger[] bigIntegerArr, boolean z8) {
        if (bigIntegerArr == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        b(parcel, iA);
    }

    public static void writeBoolean(Parcel parcel, int i8, boolean z8) {
        c(parcel, i8, 4);
        parcel.writeInt(z8 ? 1 : 0);
    }

    public static void writeBooleanArray(Parcel parcel, int i8, boolean[] zArr, boolean z8) {
        if (zArr == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeBooleanArray(zArr);
            b(parcel, iA);
        }
    }

    public static void writeBooleanList(Parcel parcel, int i8, List<Boolean> list, boolean z8) {
        if (list == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(list.get(i9).booleanValue() ? 1 : 0);
        }
        b(parcel, iA);
    }

    public static void writeBooleanObject(Parcel parcel, int i8, Boolean bool, boolean z8) {
        if (bool != null) {
            c(parcel, i8, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z8) {
            c(parcel, i8, 0);
        }
    }

    public static void writeBundle(Parcel parcel, int i8, Bundle bundle, boolean z8) {
        if (bundle == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeBundle(bundle);
            b(parcel, iA);
        }
    }

    public static void writeByte(Parcel parcel, int i8, byte b9) {
        c(parcel, i8, 4);
        parcel.writeInt(b9);
    }

    public static void writeByteArray(Parcel parcel, int i8, byte[] bArr, boolean z8) {
        if (bArr == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeByteArray(bArr);
            b(parcel, iA);
        }
    }

    public static void writeByteArrayArray(Parcel parcel, int i8, byte[][] bArr, boolean z8) {
        if (bArr == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        b(parcel, iA);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i8, SparseArray<byte[]> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            parcel.writeByteArray(sparseArray.valueAt(i9));
        }
        b(parcel, iA);
    }

    public static void writeChar(Parcel parcel, int i8, char c9) {
        c(parcel, i8, 4);
        parcel.writeInt(c9);
    }

    public static void writeCharArray(Parcel parcel, int i8, char[] cArr, boolean z8) {
        if (cArr == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeCharArray(cArr);
            b(parcel, iA);
        }
    }

    public static void writeDouble(Parcel parcel, int i8, double d9) {
        c(parcel, i8, 8);
        parcel.writeDouble(d9);
    }

    public static void writeDoubleArray(Parcel parcel, int i8, double[] dArr, boolean z8) {
        if (dArr == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeDoubleArray(dArr);
            b(parcel, iA);
        }
    }

    public static void writeDoubleList(Parcel parcel, int i8, List<Double> list, boolean z8) {
        if (list == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeDouble(list.get(i9).doubleValue());
        }
        b(parcel, iA);
    }

    public static void writeDoubleObject(Parcel parcel, int i8, Double d9, boolean z8) {
        if (d9 != null) {
            c(parcel, i8, 8);
            parcel.writeDouble(d9.doubleValue());
        } else if (z8) {
            c(parcel, i8, 0);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i8, SparseArray<Double> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            parcel.writeDouble(sparseArray.valueAt(i9).doubleValue());
        }
        b(parcel, iA);
    }

    public static void writeFloat(Parcel parcel, int i8, float f8) {
        c(parcel, i8, 4);
        parcel.writeFloat(f8);
    }

    public static void writeFloatArray(Parcel parcel, int i8, float[] fArr, boolean z8) {
        if (fArr == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeFloatArray(fArr);
            b(parcel, iA);
        }
    }

    public static void writeFloatList(Parcel parcel, int i8, List<Float> list, boolean z8) {
        if (list == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeFloat(list.get(i9).floatValue());
        }
        b(parcel, iA);
    }

    public static void writeFloatObject(Parcel parcel, int i8, Float f8, boolean z8) {
        if (f8 != null) {
            c(parcel, i8, 4);
            parcel.writeFloat(f8.floatValue());
        } else if (z8) {
            c(parcel, i8, 0);
        }
    }

    public static void writeFloatSparseArray(Parcel parcel, int i8, SparseArray<Float> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            parcel.writeFloat(sparseArray.valueAt(i9).floatValue());
        }
        b(parcel, iA);
    }

    public static void writeIBinder(Parcel parcel, int i8, IBinder iBinder, boolean z8) {
        if (iBinder == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeStrongBinder(iBinder);
            b(parcel, iA);
        }
    }

    public static void writeIBinderArray(Parcel parcel, int i8, IBinder[] iBinderArr, boolean z8) {
        if (iBinderArr == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeBinderArray(iBinderArr);
            b(parcel, iA);
        }
    }

    public static void writeIBinderList(Parcel parcel, int i8, List<IBinder> list, boolean z8) {
        if (list == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeBinderList(list);
            b(parcel, iA);
        }
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i8, SparseArray<IBinder> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            parcel.writeStrongBinder(sparseArray.valueAt(i9));
        }
        b(parcel, iA);
    }

    public static void writeInt(Parcel parcel, int i8, int i9) {
        c(parcel, i8, 4);
        parcel.writeInt(i9);
    }

    public static void writeIntArray(Parcel parcel, int i8, int[] iArr, boolean z8) {
        if (iArr == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeIntArray(iArr);
            b(parcel, iA);
        }
    }

    public static void writeIntegerList(Parcel parcel, int i8, List<Integer> list, boolean z8) {
        if (list == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(list.get(i9).intValue());
        }
        b(parcel, iA);
    }

    public static void writeIntegerObject(Parcel parcel, int i8, Integer num, boolean z8) {
        if (num != null) {
            c(parcel, i8, 4);
            parcel.writeInt(num.intValue());
        } else if (z8) {
            c(parcel, i8, 0);
        }
    }

    public static void writeList(Parcel parcel, int i8, List list, boolean z8) {
        if (list == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeList(list);
            b(parcel, iA);
        }
    }

    public static void writeLong(Parcel parcel, int i8, long j8) {
        c(parcel, i8, 8);
        parcel.writeLong(j8);
    }

    public static void writeLongArray(Parcel parcel, int i8, long[] jArr, boolean z8) {
        if (jArr == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeLongArray(jArr);
            b(parcel, iA);
        }
    }

    public static void writeLongList(Parcel parcel, int i8, List<Long> list, boolean z8) {
        if (list == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeLong(list.get(i9).longValue());
        }
        b(parcel, iA);
    }

    public static void writeLongObject(Parcel parcel, int i8, Long l8, boolean z8) {
        if (l8 != null) {
            c(parcel, i8, 8);
            parcel.writeLong(l8.longValue());
        } else if (z8) {
            c(parcel, i8, 0);
        }
    }

    public static void writeParcel(Parcel parcel, int i8, Parcel parcel2, boolean z8) {
        if (parcel2 == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            b(parcel, iA);
        }
    }

    public static void writeParcelArray(Parcel parcel, int i8, Parcel[] parcelArr, boolean z8) {
        if (parcelArr == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        b(parcel, iA);
    }

    public static void writeParcelList(Parcel parcel, int i8, List<Parcel> list, boolean z8) {
        if (list == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            Parcel parcel2 = list.get(i9);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        b(parcel, iA);
    }

    public static void writeParcelSparseArray(Parcel parcel, int i8, SparseArray<Parcel> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            Parcel parcelValueAt = sparseArray.valueAt(i9);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        b(parcel, iA);
    }

    public static void writeParcelable(Parcel parcel, int i8, Parcelable parcelable, int i9, boolean z8) {
        if (parcelable == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcelable.writeToParcel(parcel, i9);
            b(parcel, iA);
        }
    }

    public static void writePendingIntent(Parcel parcel, int i8, PendingIntent pendingIntent, boolean z8) {
        if (pendingIntent == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            b(parcel, iA);
        }
    }

    public static void writeShort(Parcel parcel, int i8, short s8) {
        c(parcel, i8, 4);
        parcel.writeInt(s8);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i8, SparseBooleanArray sparseBooleanArray, boolean z8) {
        if (sparseBooleanArray == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            b(parcel, iA);
        }
    }

    public static void writeSparseIntArray(Parcel parcel, int i8, SparseIntArray sparseIntArray, boolean z8) {
        if (sparseIntArray == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseIntArray.keyAt(i9));
            parcel.writeInt(sparseIntArray.valueAt(i9));
        }
        b(parcel, iA);
    }

    public static void writeSparseLongArray(Parcel parcel, int i8, SparseLongArray sparseLongArray, boolean z8) {
        if (sparseLongArray == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseLongArray.keyAt(i9));
            parcel.writeLong(sparseLongArray.valueAt(i9));
        }
        b(parcel, iA);
    }

    public static void writeString(Parcel parcel, int i8, String str, boolean z8) {
        if (str == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeString(str);
            b(parcel, iA);
        }
    }

    public static void writeStringArray(Parcel parcel, int i8, String[] strArr, boolean z8) {
        if (strArr == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeStringArray(strArr);
            b(parcel, iA);
        }
    }

    public static void writeStringList(Parcel parcel, int i8, List<String> list, boolean z8) {
        if (list == null) {
            if (z8) {
                c(parcel, i8, 0);
            }
        } else {
            int iA = a(parcel, i8);
            parcel.writeStringList(list);
            b(parcel, iA);
        }
    }

    public static void writeStringSparseArray(Parcel parcel, int i8, SparseArray<String> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            parcel.writeString(sparseArray.valueAt(i9));
        }
        b(parcel, iA);
    }

    public static <T extends Parcelable> void writeTypedArray(Parcel parcel, int i8, T[] tArr, int i9, boolean z8) {
        if (tArr == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        parcel.writeInt(tArr.length);
        for (T t8 : tArr) {
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                d(parcel, t8, i9);
            }
        }
        b(parcel, iA);
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i8, List<T> list, boolean z8) {
        if (list == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            T t8 = list.get(i9);
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                d(parcel, t8, 0);
            }
        }
        b(parcel, iA);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i8, SparseArray<T> sparseArray, boolean z8) {
        if (sparseArray == null) {
            if (z8) {
                c(parcel, i8, 0);
                return;
            }
            return;
        }
        int iA = a(parcel, i8);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            T tValueAt = sparseArray.valueAt(i9);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                d(parcel, tValueAt, 0);
            }
        }
        b(parcel, iA);
    }
}
