package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ot, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1735Ot implements Parcelable {
    public static final Parcelable.Creator<C1735Ot> CREATOR = new C1652Ms();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3894ot[] f15159a;
    public final long zza;

    public C1735Ot(long j8, InterfaceC3894ot... interfaceC3894otArr) {
        this.zza = j8;
        this.f15159a = interfaceC3894otArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1735Ot.class == obj.getClass()) {
            C1735Ot c1735Ot = (C1735Ot) obj;
            if (Arrays.equals(this.f15159a, c1735Ot.f15159a) && this.zza == c1735Ot.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f15159a) * 31;
        long j8 = this.zza;
        return iHashCode + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        String str;
        long j8 = this.zza;
        String string = Arrays.toString(this.f15159a);
        if (j8 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j8;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f15159a.length);
        for (InterfaceC3894ot interfaceC3894ot : this.f15159a) {
            parcel.writeParcelable(interfaceC3894ot, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.f15159a.length;
    }

    public final InterfaceC3894ot zzb(int i8) {
        return this.f15159a[i8];
    }

    public final C1735Ot zzc(InterfaceC3894ot... interfaceC3894otArr) {
        int length = interfaceC3894otArr.length;
        if (length == 0) {
            return this;
        }
        long j8 = this.zza;
        InterfaceC3894ot[] interfaceC3894otArr2 = this.f15159a;
        int i8 = AbstractC2281am0.zza;
        int length2 = interfaceC3894otArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC3894otArr2, length2 + length);
        System.arraycopy(interfaceC3894otArr, 0, objArrCopyOf, length2, length);
        return new C1735Ot(j8, (InterfaceC3894ot[]) objArrCopyOf);
    }

    public final C1735Ot zzd(C1735Ot c1735Ot) {
        return c1735Ot == null ? this : zzc(c1735Ot.f15159a);
    }

    C1735Ot(Parcel parcel) {
        this.f15159a = new InterfaceC3894ot[parcel.readInt()];
        int i8 = 0;
        while (true) {
            InterfaceC3894ot[] interfaceC3894otArr = this.f15159a;
            if (i8 >= interfaceC3894otArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                interfaceC3894otArr[i8] = (InterfaceC3894ot) parcel.readParcelable(InterfaceC3894ot.class.getClassLoader());
                i8++;
            }
        }
    }

    public C1735Ot(List list) {
        this(-9223372036854775807L, (InterfaceC3894ot[]) list.toArray(new InterfaceC3894ot[0]));
    }
}
