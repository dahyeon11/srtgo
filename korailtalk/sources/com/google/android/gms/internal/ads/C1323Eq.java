package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Eq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1323Eq extends AbstractC5814a {
    public static final Parcelable.Creator<C1323Eq> CREATOR = new C1364Fq();
    public final boolean zza;
    public final List zzb;

    public C1323Eq() {
        this(false, Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z8 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBoolean(parcel, 2, z8);
        AbstractC5816c.writeStringList(parcel, 3, this.zzb, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C1323Eq(boolean z8, List list) {
        this.zza = z8;
        this.zzb = list;
    }
}
