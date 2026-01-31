package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.v7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4606v7 implements InterfaceC2425c1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f23172a = new C4099qh0(4);

    /* renamed from: b, reason: collision with root package name */
    private final E1 f23173b = new E1(-1, -1, "image/webp");

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) {
        return this.f23173b.zzb(interfaceC2540d1, c5050z1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f23173b.zzd(interfaceC2769f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f23173b.zze(j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        this.f23172a.zzH(4);
        Q0 q02 = (Q0) interfaceC2540d1;
        q02.zzm(this.f23172a.zzM(), 0, 4, false);
        if (this.f23172a.zzu() == 1380533830) {
            q02.zzl(4, false);
            this.f23172a.zzH(4);
            q02.zzm(this.f23172a.zzM(), 0, 4, false);
            if (this.f23172a.zzu() == 1464156752) {
                return true;
            }
        }
        return false;
    }
}
