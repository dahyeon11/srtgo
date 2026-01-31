package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.gm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2968gm extends AbstractC5814a {
    public static final Parcelable.Creator<C2968gm> CREATOR = new C3083hm();
    public final String zza;
    public final Bundle zzb;

    public C2968gm(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractC5816c.writeBundle(parcel, 2, this.zzb, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
