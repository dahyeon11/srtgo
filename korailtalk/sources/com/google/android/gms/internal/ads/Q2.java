package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Q2 extends AbstractC2544d3 {
    public static final Parcelable.Creator<Q2> CREATOR = new P2();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    Q2(Parcel parcel) {
        String string = parcel.readString();
        int i8 = AbstractC2281am0.zza;
        super(string);
        this.zza = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q2.class == obj.getClass()) {
            Q2 q22 = (Q2) obj;
            if (this.zzf.equals(q22.zzf) && Arrays.equals(this.zza, q22.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public Q2(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
