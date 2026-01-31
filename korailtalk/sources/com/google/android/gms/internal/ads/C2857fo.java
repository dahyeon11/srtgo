package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.fo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2857fo extends AbstractC1583Lc implements InterfaceC3087ho {
    C2857fo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final boolean zzA() {
        Parcel parcelB = b(18, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final boolean zzB() {
        Parcel parcelB = b(17, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final double zze() {
        Parcel parcelB = b(8, a());
        double d9 = parcelB.readDouble();
        parcelB.recycle();
        return d9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final float zzf() {
        Parcel parcelB = b(23, a());
        float f8 = parcelB.readFloat();
        parcelB.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final float zzg() {
        Parcel parcelB = b(25, a());
        float f8 = parcelB.readFloat();
        parcelB.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final float zzh() {
        Parcel parcelB = b(24, a());
        float f8 = parcelB.readFloat();
        parcelB.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final Bundle zzi() {
        Parcel parcelB = b(16, a());
        Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcelB, Bundle.CREATOR);
        parcelB.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final H1.V0 zzj() {
        Parcel parcelB = b(11, a());
        H1.V0 v0Zzb = H1.U0.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return v0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC2004Vi zzk() {
        Parcel parcelB = b(12, a());
        InterfaceC2004Vi interfaceC2004ViZzj = AbstractBinderC1963Ui.zzj(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC2004ViZzj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC2503cj zzl() {
        Parcel parcelB = b(5, a());
        InterfaceC2503cj interfaceC2503cjZzg = AbstractBinderC2389bj.zzg(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC2503cjZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC6172a zzm() {
        Parcel parcelB = b(13, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC6172a zzn() {
        Parcel parcelB = b(14, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC6172a zzo() {
        Parcel parcelB = b(15, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzp() {
        Parcel parcelB = b(7, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzq() {
        Parcel parcelB = b(4, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzr() {
        Parcel parcelB = b(6, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzs() {
        Parcel parcelB = b(2, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzt() {
        Parcel parcelB = b(10, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzu() {
        Parcel parcelB = b(9, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final List zzv() {
        Parcel parcelB = b(3, a());
        ArrayList arrayListZzb = AbstractC1664Nc.zzb(parcelB);
        parcelB.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzw(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(20, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzx() {
        c(19, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzy(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a2);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a3);
        c(21, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzz(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(22, parcelA);
    }
}
