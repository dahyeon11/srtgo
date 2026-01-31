package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e3.AbstractC5358c;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.qo0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4113qo0 implements InterfaceC3894ot {
    public static final Parcelable.Creator<C4113qo0> CREATOR = new C3883on0();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public C4113qo0(String str, byte[] bArr, int i8, int i9) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i8;
        this.zzd = i9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4113qo0.class == obj.getClass()) {
            C4113qo0 c4113qo0 = (C4113qo0) obj;
            if (this.zza.equals(c4113qo0.zza) && Arrays.equals(this.zzb, c4113qo0.zzb) && this.zzc == c4113qo0.zzc && this.zzd == c4113qo0.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String strZzA;
        int i8 = this.zzd;
        if (i8 == 1) {
            strZzA = AbstractC2281am0.zzA(this.zzb);
        } else if (i8 == 23) {
            strZzA = String.valueOf(Float.intBitsToFloat(AbstractC1235Cm0.zzd(this.zzb)));
        } else if (i8 != 67) {
            byte[] bArr = this.zzb;
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(length + length);
            for (int i9 = 0; i9 < bArr.length; i9++) {
                sb.append(Character.forDigit((bArr[i9] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i9] & AbstractC5358c.SI, 16));
            }
            strZzA = sb.toString();
        } else {
            strZzA = String.valueOf(AbstractC1235Cm0.zzd(this.zzb));
        }
        return "mdta: key=" + this.zza + ", value=" + strZzA;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3894ot
    public final /* synthetic */ void zza(C3207ir c3207ir) {
    }

    /* synthetic */ C4113qo0(Parcel parcel, AbstractC1769Pn0 abstractC1769Pn0) {
        String string = parcel.readString();
        int i8 = AbstractC2281am0.zza;
        this.zza = string;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }
}
