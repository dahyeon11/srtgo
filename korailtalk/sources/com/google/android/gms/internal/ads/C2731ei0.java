package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ei0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2731ei0 extends AbstractC1583Lc implements InterfaceC2961gi0 {
    C2731ei0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2961gi0
    public final void zze(Bundle bundle, InterfaceC3190ii0 interfaceC3190ii0) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, bundle);
        AbstractC1664Nc.zzf(parcelA, interfaceC3190ii0);
        d(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2961gi0
    public final void zzf(String str, Bundle bundle, InterfaceC3190ii0 interfaceC3190ii0) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        AbstractC1664Nc.zzd(parcelA, bundle);
        AbstractC1664Nc.zzf(parcelA, interfaceC3190ii0);
        d(1, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2961gi0
    public final void zzg(Bundle bundle, InterfaceC3190ii0 interfaceC3190ii0) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, bundle);
        AbstractC1664Nc.zzf(parcelA, interfaceC3190ii0);
        d(3, parcelA);
    }
}
