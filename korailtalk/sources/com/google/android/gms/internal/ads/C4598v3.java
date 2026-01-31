package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4598v3 implements Parcelable {
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.t3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C4598v3 c4598v3 = (C4598v3) obj;
            C4598v3 c4598v32 = (C4598v3) obj2;
            return AbstractC1763Pk0.zzk().zzc(c4598v3.zzb, c4598v32.zzb).zzc(c4598v3.zzc, c4598v32.zzc).zzb(c4598v3.zzd, c4598v32.zzd).zza();
        }
    };
    public static final Parcelable.Creator<C4598v3> CREATOR = new C4484u3();

    public C4598v3(long j8, long j9, int i8) {
        F10.zzd(j8 < j9);
        this.zzb = j8;
        this.zzc = j9;
        this.zzd = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4598v3.class == obj.getClass()) {
            C4598v3 c4598v3 = (C4598v3) obj;
            if (this.zzb == c4598v3.zzb && this.zzc == c4598v3.zzc && this.zzd == c4598v3.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeInt(this.zzd);
    }
}
