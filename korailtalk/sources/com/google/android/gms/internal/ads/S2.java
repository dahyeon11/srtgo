package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class S2 extends AbstractC2544d3 {
    public static final Parcelable.Creator<S2> CREATOR = new R2();

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2544d3[] f16186a;
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;

    S2(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i8 = AbstractC2281am0.zza;
        this.zza = string;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int i9 = parcel.readInt();
        this.f16186a = new AbstractC2544d3[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            this.f16186a[i10] = (AbstractC2544d3) parcel.readParcelable(AbstractC2544d3.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2544d3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S2.class == obj.getClass()) {
            S2 s22 = (S2) obj;
            if (this.zzb == s22.zzb && this.zzc == s22.zzc && this.zzd == s22.zzd && this.zze == s22.zze && AbstractC2281am0.zzG(this.zza, s22.zza) && Arrays.equals(this.f16186a, s22.f16186a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return ((((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.f16186a.length);
        for (AbstractC2544d3 abstractC2544d3 : this.f16186a) {
            parcel.writeParcelable(abstractC2544d3, 0);
        }
    }

    public S2(String str, int i8, int i9, long j8, long j9, AbstractC2544d3[] abstractC2544d3Arr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = j8;
        this.zze = j9;
        this.f16186a = abstractC2544d3Arr;
    }
}
