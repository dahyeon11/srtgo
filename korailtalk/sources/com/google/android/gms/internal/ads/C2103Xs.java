package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Xs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2103Xs extends AbstractC5814a {
    public static final Parcelable.Creator<C2103Xs> CREATOR = new C2144Ys();
    public final String zza;
    public final String zzb;

    @Deprecated
    public final H1.d2 zzc;
    public final H1.Y1 zzd;

    public C2103Xs(String str, String str2, H1.d2 d2Var, H1.Y1 y12) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = d2Var;
        this.zzd = y12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractC5816c.writeString(parcel, 2, this.zzb, false);
        AbstractC5816c.writeParcelable(parcel, 3, this.zzc, i8, false);
        AbstractC5816c.writeParcelable(parcel, 4, this.zzd, i8, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
