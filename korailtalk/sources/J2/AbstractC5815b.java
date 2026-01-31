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
import java.util.ArrayList;
import java.util.List;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5815b {

    /* renamed from: j2.b$a */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private static void a(Parcel parcel, int i8, int i9, int i10) {
        if (i9 == i10) {
            return;
        }
        throw new a("Expected size " + i10 + " got " + i9 + " (0x" + Integer.toHexString(i9) + ")", parcel);
    }

    private static void b(Parcel parcel, int i8, int i9) {
        int size = readSize(parcel, i8);
        if (size == i9) {
            return;
        }
        throw new a("Expected size " + i9 + " got " + size + " (0x" + Integer.toHexString(size) + ")", parcel);
    }

    public static BigDecimal createBigDecimal(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i9 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + size);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i9);
    }

    public static BigDecimal[] createBigDecimalArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i9 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[i10] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + size);
        return bigDecimalArr;
    }

    public static BigInteger createBigInteger(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + size);
        return new BigInteger(bArrCreateByteArray);
    }

    public static BigInteger[] createBigIntegerArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i9 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bigIntegerArr[i10] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + size);
        return bigIntegerArr;
    }

    public static boolean[] createBooleanArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + size);
        return zArrCreateBooleanArray;
    }

    public static ArrayList<Boolean> createBooleanList(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int i9 = parcel.readInt();
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add(Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static Bundle createBundle(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + size);
        return bundle;
    }

    public static byte[] createByteArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + size);
        return bArrCreateByteArray;
    }

    public static byte[][] createByteArrayArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i9 = parcel.readInt();
        byte[][] bArr = new byte[i9][];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i10] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + size);
        return bArr;
    }

    public static SparseArray<byte[]> createByteArraySparseArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i9 = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static char[] createCharArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        char[] cArrCreateCharArray = parcel.createCharArray();
        parcel.setDataPosition(iDataPosition + size);
        return cArrCreateCharArray;
    }

    public static double[] createDoubleArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iDataPosition + size);
        return dArrCreateDoubleArray;
    }

    public static ArrayList<Double> createDoubleList(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int i9 = parcel.readInt();
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static SparseArray<Double> createDoubleSparseArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int i9 = parcel.readInt();
        for (int i10 = 0; i10 < i9; i10++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static float[] createFloatArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + size);
        return fArrCreateFloatArray;
    }

    public static ArrayList<Float> createFloatList(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int i9 = parcel.readInt();
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static SparseArray<Float> createFloatSparseArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int i9 = parcel.readInt();
        for (int i10 = 0; i10 < i9; i10++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static IBinder[] createIBinderArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        IBinder[] iBinderArrCreateBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(iDataPosition + size);
        return iBinderArrCreateBinderArray;
    }

    public static ArrayList<IBinder> createIBinderList(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<IBinder> arrayListCreateBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(iDataPosition + size);
        return arrayListCreateBinderArrayList;
    }

    public static SparseArray<IBinder> createIBinderSparseArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i9 = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static int[] createIntArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + size);
        return iArrCreateIntArray;
    }

    public static ArrayList<Integer> createIntegerList(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i9 = parcel.readInt();
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static long[] createLongArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + size);
        return jArrCreateLongArray;
    }

    public static ArrayList<Long> createLongList(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int i9 = parcel.readInt();
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static Parcel createParcel(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, size);
        parcel.setDataPosition(iDataPosition + size);
        return parcelObtain;
    }

    public static Parcel[] createParcelArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i9 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = parcel.readInt();
            if (i11 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i11);
                parcelArr[i10] = parcelObtain;
                parcel.setDataPosition(iDataPosition2 + i11);
            } else {
                parcelArr[i10] = null;
            }
        }
        parcel.setDataPosition(iDataPosition + size);
        return parcelArr;
    }

    public static ArrayList<Parcel> createParcelList(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i9 = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = parcel.readInt();
            if (i11 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i11);
                arrayList.add(parcelObtain);
                parcel.setDataPosition(iDataPosition2 + i11);
            } else {
                arrayList.add(null);
            }
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static SparseArray<Parcel> createParcelSparseArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i9 = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            if (i12 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i12);
                sparseArray.append(i11, parcelObtain);
                parcel.setDataPosition(iDataPosition2 + i12);
            } else {
                sparseArray.append(i11, null);
            }
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static <T extends Parcelable> T createParcelable(Parcel parcel, int i8, Parcelable.Creator<T> creator) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + size);
        return tCreateFromParcel;
    }

    public static SparseBooleanArray createSparseBooleanArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(iDataPosition + size);
        return sparseBooleanArray;
    }

    public static SparseIntArray createSparseIntArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i9 = parcel.readInt();
        for (int i10 = 0; i10 < i9; i10++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseIntArray;
    }

    public static SparseLongArray createSparseLongArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int i9 = parcel.readInt();
        for (int i10 = 0; i10 < i9; i10++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseLongArray;
    }

    public static String createString(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + size);
        return string;
    }

    public static String[] createStringArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + size);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> createStringList(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + size);
        return arrayListCreateStringArrayList;
    }

    public static SparseArray<String> createStringSparseArray(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int i9 = parcel.readInt();
        for (int i10 = 0; i10 < i9; i10++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static <T> T[] createTypedArray(Parcel parcel, int i8, Parcelable.Creator<T> creator) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + size);
        return tArr;
    }

    public static <T> ArrayList<T> createTypedList(Parcel parcel, int i8, Parcelable.Creator<T> creator) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + size);
        return arrayListCreateTypedArrayList;
    }

    public static <T> SparseArray<T> createTypedSparseArray(Parcel parcel, int i8, Parcelable.Creator<T> creator) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i9 = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < i9; i10++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static void ensureAtEnd(Parcel parcel, int i8) {
        if (parcel.dataPosition() == i8) {
            return;
        }
        throw new a("Overread allowed size end=" + i8, parcel);
    }

    public static int getFieldId(int i8) {
        return (char) i8;
    }

    public static boolean readBoolean(Parcel parcel, int i8) {
        b(parcel, i8, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean readBooleanObject(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        if (size == 0) {
            return null;
        }
        a(parcel, i8, size, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte readByte(Parcel parcel, int i8) {
        b(parcel, i8, 4);
        return (byte) parcel.readInt();
    }

    public static char readChar(Parcel parcel, int i8) {
        b(parcel, i8, 4);
        return (char) parcel.readInt();
    }

    public static double readDouble(Parcel parcel, int i8) {
        b(parcel, i8, 8);
        return parcel.readDouble();
    }

    public static Double readDoubleObject(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        if (size == 0) {
            return null;
        }
        a(parcel, i8, size, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float readFloat(Parcel parcel, int i8) {
        b(parcel, i8, 4);
        return parcel.readFloat();
    }

    public static Float readFloatObject(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        if (size == 0) {
            return null;
        }
        a(parcel, i8, size, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int readHeader(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder readIBinder(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + size);
        return strongBinder;
    }

    public static int readInt(Parcel parcel, int i8) {
        b(parcel, i8, 4);
        return parcel.readInt();
    }

    public static Integer readIntegerObject(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        if (size == 0) {
            return null;
        }
        a(parcel, i8, size, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void readList(Parcel parcel, int i8, List list, ClassLoader classLoader) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(iDataPosition + size);
    }

    public static long readLong(Parcel parcel, int i8) {
        b(parcel, i8, 8);
        return parcel.readLong();
    }

    public static Long readLongObject(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        if (size == 0) {
            return null;
        }
        a(parcel, i8, size, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static PendingIntent readPendingIntent(Parcel parcel, int i8) {
        int size = readSize(parcel, i8);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        PendingIntent pendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + size);
        return pendingIntentOrNullFromParcel;
    }

    public static short readShort(Parcel parcel, int i8) {
        b(parcel, i8, 4);
        return (short) parcel.readInt();
    }

    public static int readSize(Parcel parcel, int i8) {
        return (i8 & W.a.CATEGORY_MASK) != -65536 ? (char) (i8 >> 16) : parcel.readInt();
    }

    public static void skipUnknownField(Parcel parcel, int i8) {
        parcel.setDataPosition(parcel.dataPosition() + readSize(parcel, i8));
    }

    public static int validateObjectHeader(Parcel parcel) {
        int header = readHeader(parcel);
        int size = readSize(parcel, header);
        int fieldId = getFieldId(header);
        int iDataPosition = parcel.dataPosition();
        if (fieldId != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(header))), parcel);
        }
        int i8 = size + iDataPosition;
        if (i8 >= iDataPosition && i8 <= parcel.dataSize()) {
            return i8;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i8, parcel);
    }
}
