package com.google.android.gms.internal.ads;

import H1.C0534f1;
import K1.InterfaceC0671x0;

/* loaded from: classes2.dex */
public final class NV implements InterfaceC3941pG, CF {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f14922c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int f14923d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0671x0 f14924a;

    /* renamed from: b, reason: collision with root package name */
    private final YV f14925b;

    public NV(YV yv, InterfaceC0671x0 interfaceC0671x0) {
        this.f14925b = yv;
        this.f14924a = interfaceC0671x0;
    }

    private final void a(boolean z8) {
        int i8;
        int iIntValue;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgs)).booleanValue() && !this.f14924a.zzS()) {
            Object obj = f14922c;
            synchronized (obj) {
                i8 = f14923d;
                iIntValue = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgt)).intValue();
            }
            if (i8 < iIntValue) {
                this.f14925b.zzd(z8);
                synchronized (obj) {
                    f14923d++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.CF
    public final void zzdB(C0534f1 c0534f1) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final void zzs() {
        a(true);
    }
}
