package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4712w3 implements InterfaceC3894ot {
    public static final Parcelable.Creator<C4712w3> CREATOR = new C4256s3();
    public final List zza;

    public C4712w3(List list) {
        this.zza = list;
        boolean z8 = false;
        if (!list.isEmpty()) {
            long j8 = ((C4598v3) list.get(0)).zzc;
            int i8 = 1;
            while (true) {
                if (i8 >= list.size()) {
                    break;
                }
                if (((C4598v3) list.get(i8)).zzb < j8) {
                    z8 = true;
                    break;
                } else {
                    j8 = ((C4598v3) list.get(i8)).zzc;
                    i8++;
                }
            }
        }
        F10.zzd(!z8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4712w3.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((C4712w3) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeList(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3894ot
    public final /* synthetic */ void zza(C3207ir c3207ir) {
    }
}
