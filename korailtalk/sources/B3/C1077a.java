package b3;

import O.h;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c0.AbstractC1087a;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1077a extends AbstractC1087a {
    public static final Parcelable.Creator<C1077a> CREATOR = new C0187a();
    public final h extendableStates;

    /* renamed from: b3.a$a, reason: collision with other inner class name */
    static class C0187a implements Parcelable.ClassLoaderCreator {
        C0187a() {
        }

        @Override // android.os.Parcelable.Creator
        public C1077a[] newArray(int i8) {
            return new C1077a[i8];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public C1077a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C1077a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        public C1077a createFromParcel(Parcel parcel) {
            return new C1077a(parcel, null, 0 == true ? 1 : 0);
        }
    }

    /* synthetic */ C1077a(Parcel parcel, ClassLoader classLoader, C0187a c0187a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.extendableStates + "}";
    }

    @Override // c0.AbstractC1087a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        int size = this.extendableStates.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i9 = 0; i9 < size; i9++) {
            strArr[i9] = (String) this.extendableStates.keyAt(i9);
            bundleArr[i9] = (Bundle) this.extendableStates.valueAt(i9);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C1077a(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new h();
    }

    private C1077a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i8 = parcel.readInt();
        String[] strArr = new String[i8];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i8];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new h(i8);
        for (int i9 = 0; i9 < i8; i9++) {
            this.extendableStates.put(strArr[i9], bundleArr[i9]);
        }
    }
}
