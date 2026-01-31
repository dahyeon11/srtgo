package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class U2 extends AbstractC2544d3 {
    public static final Parcelable.Creator<U2> CREATOR = new T2();

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2544d3[] f16571a;
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;

    U2(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i8 = AbstractC2281am0.zza;
        this.zza = string;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int i9 = parcel.readInt();
        this.f16571a = new AbstractC2544d3[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            this.f16571a[i10] = (AbstractC2544d3) parcel.readParcelable(AbstractC2544d3.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && U2.class == obj.getClass()) {
            U2 u22 = (U2) obj;
            if (this.zzb == u22.zzb && this.zzc == u22.zzc && AbstractC2281am0.zzG(this.zza, u22.zza) && Arrays.equals(this.zzd, u22.zzd) && Arrays.equals(this.f16571a, u22.f16571a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.f16571a.length);
        for (AbstractC2544d3 abstractC2544d3 : this.f16571a) {
            parcel.writeParcelable(abstractC2544d3, 0);
        }
    }

    public U2(String str, boolean z8, boolean z9, String[] strArr, AbstractC2544d3[] abstractC2544d3Arr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z8;
        this.zzc = z9;
        this.zzd = strArr;
        this.f16571a = abstractC2544d3Arr;
    }
}
