package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.eo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2742eo extends AbstractC1583Lc implements IInterface {
    C2742eo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() {
        Parcel parcelB = b(13, a());
        Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcelB, Bundle.CREATOR);
        parcelB.recycle();
        return bundle;
    }

    public final H1.V0 zzf() {
        Parcel parcelB = b(16, a());
        H1.V0 v0Zzb = H1.U0.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return v0Zzb;
    }

    public final InterfaceC2004Vi zzg() {
        Parcel parcelB = b(19, a());
        InterfaceC2004Vi interfaceC2004ViZzj = AbstractBinderC1963Ui.zzj(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC2004ViZzj;
    }

    public final InterfaceC2503cj zzh() {
        Parcel parcelB = b(5, a());
        InterfaceC2503cj interfaceC2503cjZzg = AbstractBinderC2389bj.zzg(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC2503cjZzg;
    }

    public final InterfaceC6172a zzi() {
        Parcel parcelB = b(15, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    public final InterfaceC6172a zzj() {
        Parcel parcelB = b(20, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    public final InterfaceC6172a zzk() {
        Parcel parcelB = b(21, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    public final String zzl() {
        Parcel parcelB = b(7, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    public final String zzm() {
        Parcel parcelB = b(4, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    public final String zzn() {
        Parcel parcelB = b(6, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    public final String zzo() {
        Parcel parcelB = b(2, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    public final List zzp() {
        Parcel parcelB = b(3, a());
        ArrayList arrayListZzb = AbstractC1664Nc.zzb(parcelB);
        parcelB.recycle();
        return arrayListZzb;
    }

    public final void zzq(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(9, parcelA);
    }

    public final void zzr() {
        c(8, a());
    }

    public final void zzs(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(10, parcelA);
    }

    public final void zzt(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a2);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a3);
        c(22, parcelA);
    }

    public final void zzu(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(14, parcelA);
    }

    public final boolean zzv() {
        Parcel parcelB = b(12, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    public final boolean zzw() {
        Parcel parcelB = b(11, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }
}
