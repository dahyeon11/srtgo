package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4142r3 implements InterfaceC3894ot {
    public static final Parcelable.Creator<C4142r3> CREATOR = new C3915p3();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public C4142r3(long j8, long j9, long j10, long j11, long j12) {
        this.zza = j8;
        this.zzb = j9;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4142r3.class == obj.getClass()) {
            C4142r3 c4142r3 = (C4142r3) obj;
            if (this.zza == c4142r3.zza && this.zzb == c4142r3.zzb && this.zzc == c4142r3.zzc && this.zzd == c4142r3.zzd && this.zze == c4142r3.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.zza;
        int i8 = (int) (j8 ^ (j8 >>> 32));
        long j9 = this.zze;
        long j10 = this.zzd;
        long j11 = this.zzc;
        long j12 = this.zzb;
        return ((((((((i8 + 527) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3894ot
    public final /* synthetic */ void zza(C3207ir c3207ir) {
    }

    /* synthetic */ C4142r3(Parcel parcel, AbstractC4029q3 abstractC4029q3) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }
}
