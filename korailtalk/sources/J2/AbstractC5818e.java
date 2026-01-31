package j2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.gridlayout.widget.GridLayout;
import i2.AbstractC5683p;
import java.util.ArrayList;
import java.util.Iterator;
import o2.C6031c;
import z2.h;

/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5818e {
    private static byte[] a(Iterable iterable) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeTypedList(h.zzj(iterable));
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static <T extends InterfaceC5817d> T deserializeFromBytes(byte[] bArr, Parcelable.Creator<T> creator) {
        AbstractC5683p.checkNotNull(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    public static <T extends InterfaceC5817d> T deserializeFromIntentExtra(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) deserializeFromBytes(byteArrayExtra, creator);
    }

    public static <T extends InterfaceC5817d> T deserializeFromString(String str, Parcelable.Creator<T> creator) {
        return (T) deserializeFromBytes(C6031c.decodeUrlSafe(str), creator);
    }

    @Deprecated
    public static <T extends InterfaceC5817d> ArrayList<T> deserializeIterableFromBundle(Bundle bundle, String str, Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        GridLayout.k kVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            kVar.add(deserializeFromBytes((byte[]) arrayList.get(i8), creator));
        }
        return kVar;
    }

    public static <T extends InterfaceC5817d> ArrayList<T> deserializeIterableFromBundleSafe(Bundle bundle, String str, Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(bundle.getByteArray(str), creator);
    }

    public static <T extends InterfaceC5817d> ArrayList<T> deserializeIterableFromBytes(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            parcelObtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            parcelObtain.recycle();
        }
    }

    @Deprecated
    public static <T extends InterfaceC5817d> ArrayList<T> deserializeIterableFromIntentExtra(Intent intent, String str, Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        GridLayout.k kVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            kVar.add(deserializeFromBytes((byte[]) arrayList.get(i8), creator));
        }
        return kVar;
    }

    public static <T extends InterfaceC5817d> ArrayList<T> deserializeIterableFromIntentExtraSafe(Intent intent, String str, Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends InterfaceC5817d> void serializeIterableToBundle(Iterable<T> iterable, Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends InterfaceC5817d> void serializeIterableToBundleSafe(Iterable<T> iterable, Bundle bundle, String str) {
        bundle.putByteArray(str, a(iterable));
    }

    @Deprecated
    public static <T extends InterfaceC5817d> void serializeIterableToIntentExtra(Iterable<T> iterable, Intent intent, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    public static <T extends InterfaceC5817d> void serializeIterableToIntentExtraSafe(Iterable<T> iterable, Intent intent, String str) {
        intent.putExtra(str, a(iterable));
    }

    public static <T extends InterfaceC5817d> byte[] serializeToBytes(T t8) {
        Parcel parcelObtain = Parcel.obtain();
        t8.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static <T extends InterfaceC5817d> void serializeToIntentExtra(T t8, Intent intent, String str) {
        intent.putExtra(str, serializeToBytes(t8));
    }

    public static <T extends InterfaceC5817d> String serializeToString(T t8) {
        return C6031c.encodeUrlSafe(serializeToBytes(t8));
    }
}
