package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: com.google.android.gms.internal.ads.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4025q1 implements InterfaceC2540d1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2540d1 f21834a;

    public C4025q1(InterfaceC2540d1 interfaceC2540d1) {
        this.f21834a = interfaceC2540d1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) {
        return this.f21834a.zza(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final int zzb(byte[] bArr, int i8, int i9) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final int zzc(int i8) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public long zzd() {
        return this.f21834a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public long zze() {
        return this.f21834a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public long zzf() {
        return this.f21834a.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final void zzg(int i8) throws EOFException, InterruptedIOException {
        ((Q0) this.f21834a).zzl(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final void zzh(byte[] bArr, int i8, int i9) {
        ((Q0) this.f21834a).zzm(bArr, i8, i9, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final void zzi(byte[] bArr, int i8, int i9) throws EOFException, InterruptedIOException {
        ((Q0) this.f21834a).zzn(bArr, i8, i9, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final void zzj() {
        this.f21834a.zzj();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final void zzk(int i8) throws EOFException, InterruptedIOException {
        ((Q0) this.f21834a).zzo(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final boolean zzm(byte[] bArr, int i8, int i9, boolean z8) {
        return this.f21834a.zzm(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540d1
    public final boolean zzn(byte[] bArr, int i8, int i9, boolean z8) {
        return this.f21834a.zzn(bArr, 0, 8, true);
    }
}
