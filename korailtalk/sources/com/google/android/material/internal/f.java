package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes2.dex */
public class f extends SparseArray implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    static class a implements Parcelable.ClassLoaderCreator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i8) {
            return new f[i8];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new f(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }
    }

    public f() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr[i9] = keyAt(i9);
            parcelableArr[i9] = (Parcelable) valueAt(i9);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i8);
    }

    public f(Parcel parcel, ClassLoader classLoader) {
        int i8 = parcel.readInt();
        int[] iArr = new int[i8];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i9 = 0; i9 < i8; i9++) {
            put(iArr[i9], parcelableArray[i9]);
        }
    }
}
