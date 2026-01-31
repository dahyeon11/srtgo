package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Cg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1223Cg0 extends AbstractC5814a {
    public static final Parcelable.Creator<C1223Cg0> CREATOR = new C1264Dg0();
    public final int zza;
    public final byte[] zzb;

    C1223Cg0(int i8, byte[] bArr) {
        this.zza = i8;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeByteArray(parcel, 2, this.zzb, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C1223Cg0(byte[] bArr) {
        this(1, bArr);
    }
}
