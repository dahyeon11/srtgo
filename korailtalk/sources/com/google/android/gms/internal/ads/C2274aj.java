package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.aj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2274aj extends AbstractC1583Lc implements InterfaceC2503cj {
    C2274aj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2503cj
    public final double zzb() {
        Parcel parcelB = b(3, a());
        double d9 = parcelB.readDouble();
        parcelB.recycle();
        return d9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2503cj
    public final int zzc() {
        Parcel parcelB = b(5, a());
        int i8 = parcelB.readInt();
        parcelB.recycle();
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2503cj
    public final int zzd() {
        Parcel parcelB = b(4, a());
        int i8 = parcelB.readInt();
        parcelB.recycle();
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2503cj
    public final Uri zze() {
        Parcel parcelB = b(2, a());
        Uri uri = (Uri) AbstractC1664Nc.zza(parcelB, Uri.CREATOR);
        parcelB.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2503cj
    public final InterfaceC6172a zzf() {
        Parcel parcelB = b(1, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }
}
