package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.Map;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.lq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3546lq extends AbstractC5814a {
    public static final Parcelable.Creator<C3546lq> CREATOR = new C3660mq();
    public final View zza;
    public final Map zzb;

    public C3546lq(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) r2.b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder));
        this.zzb = (Map) r2.b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        View view = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeIBinder(parcel, 1, r2.b.wrap(view).asBinder(), false);
        AbstractC5816c.writeIBinder(parcel, 2, r2.b.wrap(this.zzb).asBinder(), false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
