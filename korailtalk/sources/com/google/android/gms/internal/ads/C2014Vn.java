package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Vn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2014Vn extends AbstractC1583Lc implements InterfaceC2096Xn {
    C2014Vn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zze() {
        c(1, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzf() {
        c(2, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzg(int i8) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        c(3, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzh(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(23, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzi(int i8, String str) {
        Parcel parcelA = a();
        parcelA.writeInt(i8);
        parcelA.writeString(str);
        c(22, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzj(int i8) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzk(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(24, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzl(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(21, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzm() {
        c(8, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzn() {
        c(4, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzo() {
        c(6, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzp() {
        c(5, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzq(String str, String str2) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        c(9, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzr(InterfaceC4899xj interfaceC4899xj, String str) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC4899xj);
        parcelA.writeString(str);
        c(10, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzs(C1242Cr c1242Cr) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzt(InterfaceC1406Gr interfaceC1406Gr) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC1406Gr);
        c(16, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzu() {
        c(18, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzv() {
        c(11, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzw() {
        c(15, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzx() {
        c(20, a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzy() {
        c(13, a());
    }
}
