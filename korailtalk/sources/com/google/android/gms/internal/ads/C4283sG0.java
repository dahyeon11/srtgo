package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.sG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4283sG0 implements XM0, InterfaceC2466cL0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4511uG0 f22614a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4739wG0 f22615b;

    public C4283sG0(C4739wG0 c4739wG0, C4511uG0 c4511uG0) {
        this.f22615b = c4739wG0;
        this.f22614a = c4511uG0;
    }

    private final Pair a(int i8, NM0 nm0) {
        NM0 nm0Zza;
        NM0 nm02 = null;
        if (nm0 != null) {
            C4511uG0 c4511uG0 = this.f22614a;
            int i9 = 0;
            while (true) {
                if (i9 >= c4511uG0.zzc.size()) {
                    nm0Zza = null;
                    break;
                }
                if (((NM0) c4511uG0.zzc.get(i9)).zzd == nm0.zzd) {
                    nm0Zza = nm0.zza(Pair.create(c4511uG0.zzb, nm0.zza));
                    break;
                }
                i9++;
            }
            if (nm0Zza == null) {
                return null;
            }
            nm02 = nm0Zza;
        }
        return Pair.create(Integer.valueOf(this.f22614a.zzd), nm02);
    }

    @Override // com.google.android.gms.internal.ads.XM0
    public final void zzae(int i8, NM0 nm0, final JM0 jm0) {
        final Pair pairA = a(0, nm0);
        if (pairA != null) {
            this.f22615b.f23453i.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.pG0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairA;
                    this.zza.f22615b.f23452h.zzae(((Integer) pair.first).intValue(), (NM0) pair.second, jm0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.XM0
    public final void zzaf(int i8, NM0 nm0, final EM0 em0, final JM0 jm0) {
        final Pair pairA = a(0, nm0);
        if (pairA != null) {
            this.f22615b.f23453i.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.nG0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairA;
                    this.zza.f22615b.f23452h.zzaf(((Integer) pair.first).intValue(), (NM0) pair.second, em0, jm0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.XM0
    public final void zzag(int i8, NM0 nm0, final EM0 em0, final JM0 jm0) {
        final Pair pairA = a(0, nm0);
        if (pairA != null) {
            this.f22615b.f23453i.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.rG0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairA;
                    this.zza.f22615b.f23452h.zzag(((Integer) pair.first).intValue(), (NM0) pair.second, em0, jm0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.XM0
    public final void zzah(int i8, NM0 nm0, final EM0 em0, final JM0 jm0, final IOException iOException, final boolean z8) {
        final Pair pairA = a(0, nm0);
        if (pairA != null) {
            this.f22615b.f23453i.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.mG0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairA;
                    this.zza.f22615b.f23452h.zzah(((Integer) pair.first).intValue(), (NM0) pair.second, em0, jm0, iOException, z8);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.XM0
    public final void zzai(int i8, NM0 nm0, final EM0 em0, final JM0 jm0) {
        final Pair pairA = a(0, nm0);
        if (pairA != null) {
            this.f22615b.f23453i.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.oG0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairA;
                    this.zza.f22615b.f23452h.zzai(((Integer) pair.first).intValue(), (NM0) pair.second, em0, jm0);
                }
            });
        }
    }
}
