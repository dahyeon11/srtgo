package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import K1.InterfaceC0671x0;

/* renamed from: com.google.android.gms.internal.ads.us */
/* loaded from: classes2.dex */
final class C4575us {

    /* renamed from: a */
    private final o2.f f23120a;

    /* renamed from: b */
    private final InterfaceC0671x0 f23121b;

    /* renamed from: c */
    private final C1407Gs f23122c;

    C4575us(o2.f fVar, InterfaceC0671x0 interfaceC0671x0, C1407Gs c1407Gs) {
        this.f23120a = fVar;
        this.f23121b = interfaceC0671x0;
        this.f23122c = c1407Gs;
    }

    public final void zza(int i8, long j8) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaq)).booleanValue()) {
            return;
        }
        if (j8 - this.f23121b.zzf() < 0) {
            AbstractC0667v0.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzar)).booleanValue()) {
            this.f23121b.zzM(i8);
            this.f23121b.zzN(j8);
        } else {
            this.f23121b.zzM(-1);
            this.f23121b.zzN(j8);
        }
    }
}
