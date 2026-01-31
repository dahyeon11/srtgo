package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Qp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1813Qp extends AbstractC1583Lc implements InterfaceC1895Sp {
    C1813Qp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final boolean zzH() {
        Parcel parcelB = b(11, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzh(int i8, int i9, Intent intent) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        parcelA.writeInt(i9);
        AbstractC1664Nc.zzd(parcelA, intent);
        c(12, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzi() {
        c(10, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzk(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(13, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzl(Bundle bundle) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, bundle);
        c(1, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzm() {
        c(8, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzo() {
        c(5, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzp(int i8, String[] strArr, int[] iArr) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        parcelA.writeStringArray(strArr);
        parcelA.writeIntArray(iArr);
        c(15, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzq() {
        c(2, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzr() {
        c(4, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzs(Bundle bundle) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, bundle);
        Parcel parcelB = b(6, parcelA);
        if (parcelB.readInt() != 0) {
            bundle.readFromParcel(parcelB);
        }
        parcelB.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzt() {
        c(3, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzu() {
        c(7, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzv() {
        c(14, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzx() {
        c(9, a());
    }
}
