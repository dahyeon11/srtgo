package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class P4 implements InterfaceC2425c1 {
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.N4
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new P4()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2769f1 f15195a;

    /* renamed from: b, reason: collision with root package name */
    private X4 f15196b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15197c;

    private final boolean a(InterfaceC2540d1 interfaceC2540d1) {
        R4 r42 = new R4();
        if (r42.zzb(interfaceC2540d1, true) && (r42.zza & 2) == 2) {
            int iMin = Math.min(r42.zze, 8);
            C4099qh0 c4099qh0 = new C4099qh0(iMin);
            ((Q0) interfaceC2540d1).zzm(c4099qh0.zzM(), 0, iMin, false);
            c4099qh0.zzK(0);
            if (c4099qh0.zzb() >= 5 && c4099qh0.zzm() == 127 && c4099qh0.zzu() == 1179402563) {
                this.f15196b = new M4();
            } else {
                c4099qh0.zzK(0);
                if (Q1.zzd(1, c4099qh0, true)) {
                    this.f15196b = new Z4();
                } else {
                    c4099qh0.zzK(0);
                    if (T4.zzd(c4099qh0)) {
                        this.f15196b = new T4();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) throws C1901Sv {
        F10.zzb(this.f15195a);
        if (this.f15196b == null) {
            if (!a(interfaceC2540d1)) {
                throw C1901Sv.zza("Failed to determine bitstream type", null);
            }
            interfaceC2540d1.zzj();
        }
        if (!this.f15197c) {
            K1 k1Zzw = this.f15195a.zzw(0, 1);
            this.f15195a.zzD();
            this.f15196b.g(this.f15195a, k1Zzw);
            this.f15197c = true;
        }
        return this.f15196b.d(interfaceC2540d1, c5050z1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f15195a = interfaceC2769f1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        X4 x42 = this.f15196b;
        if (x42 != null) {
            x42.i(j8, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) {
        try {
            return a(interfaceC2540d1);
        } catch (C1901Sv unused) {
            return false;
        }
    }
}
