package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class E2 implements InterfaceC3894ot {
    public static final Parcelable.Creator<E2> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    private static final Q5 f12740b;

    /* renamed from: c, reason: collision with root package name */
    private static final Q5 f12741c;

    /* renamed from: a, reason: collision with root package name */
    private int f12742a;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;

    static {
        O4 o42 = new O4();
        o42.zzX("application/id3");
        f12740b = o42.zzad();
        O4 o43 = new O4();
        o43.zzX("application/x-scte35");
        f12741c = o43.zzad();
        CREATOR = new D2();
    }

    public E2(String str, String str2, long j8, long j9, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j8;
        this.zzd = j9;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E2.class == obj.getClass()) {
            E2 e22 = (E2) obj;
            if (this.zzc == e22.zzc && this.zzd == e22.zzd && AbstractC2281am0.zzG(this.zza, e22.zza) && AbstractC2281am0.zzG(this.zzb, e22.zzb) && Arrays.equals(this.zze, e22.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f12742a;
        if (i8 != 0) {
            return i8;
        }
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j8 = this.zzc;
        long j9 = this.zzd;
        int iHashCode3 = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
        this.f12742a = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3894ot
    public final /* synthetic */ void zza(C3207ir c3207ir) {
    }

    E2(Parcel parcel) {
        String string = parcel.readString();
        int i8 = AbstractC2281am0.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }
}
