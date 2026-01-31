package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4368t2 implements InterfaceC2425c1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f22767a = new C4099qh0(4);

    /* renamed from: b, reason: collision with root package name */
    private final E1 f22768b = new E1(-1, -1, "image/heif");

    private final boolean a(InterfaceC2540d1 interfaceC2540d1, int i8) {
        this.f22767a.zzH(4);
        ((Q0) interfaceC2540d1).zzm(this.f22767a.zzM(), 0, 4, false);
        return this.f22767a.zzu() == ((long) i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) {
        return this.f22768b.zzb(interfaceC2540d1, c5050z1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f22768b.zzd(interfaceC2769f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f22768b.zze(j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        ((Q0) interfaceC2540d1).zzl(4, false);
        return a(interfaceC2540d1, 1718909296) && a(interfaceC2540d1, 1751476579);
    }
}
