package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.vr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4688vr0 implements InterfaceC3894ot {
    public static final Parcelable.Creator<C4688vr0> CREATOR = new C4458tq0();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public C4688vr0(long j8, long j9, long j10) {
        this.zza = j8;
        this.zzb = j9;
        this.zzc = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4688vr0)) {
            return false;
        }
        C4688vr0 c4688vr0 = (C4688vr0) obj;
        return this.zza == c4688vr0.zza && this.zzb == c4688vr0.zzb && this.zzc == c4688vr0.zzc;
    }

    public final int hashCode() {
        long j8 = this.zza;
        int i8 = (int) (j8 ^ (j8 >>> 32));
        long j9 = this.zzc;
        long j10 = this.zzb;
        return ((((i8 + 527) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3894ot
    public final /* synthetic */ void zza(C3207ir c3207ir) {
    }

    /* synthetic */ C4688vr0(Parcel parcel, Uq0 uq0) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }
}
