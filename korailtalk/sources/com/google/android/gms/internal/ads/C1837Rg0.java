package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Rg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1837Rg0 extends AbstractC5814a {
    public static final Parcelable.Creator<C1837Rg0> CREATOR = new C1878Sg0();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    C1837Rg0(int i8, byte[] bArr, int i9) {
        this.zza = i8;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeByteArray(parcel, 2, this.zzb, false);
        AbstractC5816c.writeInt(parcel, 3, this.zzc);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C1837Rg0(byte[] bArr, int i8) {
        this(1, null, 1);
    }
}
