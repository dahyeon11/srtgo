package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3231j3 extends AbstractC2544d3 {
    public static final Parcelable.Creator<C3231j3> CREATOR = new C3118i3();
    public final String zza;
    public final byte[] zzb;

    C3231j3(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i8 = AbstractC2281am0.zza;
        this.zza = string;
        this.zzb = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3231j3.class == obj.getClass()) {
            C3231j3 c3231j3 = (C3231j3) obj;
            if (AbstractC2281am0.zzG(this.zza, c3231j3.zza) && Arrays.equals(this.zzb, c3231j3.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2544d3
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public C3231j3(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}
