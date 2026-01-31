package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class JG0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2798fF0 f13626a;

    @Deprecated
    public JG0(Context context, C1369Fv c1369Fv) {
        this.f13626a = new C2798fF0(context, c1369Fv);
    }

    @Deprecated
    public final JG0 zza(final InterfaceC2227aG0 interfaceC2227aG0) {
        C2798fF0 c2798fF0 = this.f13626a;
        F10.zzf(!c2798fF0.f19159q);
        interfaceC2227aG0.getClass();
        c2798fF0.f19148f = new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.XE0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return interfaceC2227aG0;
            }
        };
        return this;
    }

    @Deprecated
    public final JG0 zzb(final VO0 vo0) {
        C2798fF0 c2798fF0 = this.f13626a;
        F10.zzf(!c2798fF0.f19159q);
        vo0.getClass();
        c2798fF0.f19147e = new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.eF0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return vo0;
            }
        };
        return this;
    }

    @Deprecated
    public final KG0 zzc() {
        C2798fF0 c2798fF0 = this.f13626a;
        F10.zzf(!c2798fF0.f19159q);
        c2798fF0.f19159q = true;
        return new KG0(c2798fF0);
    }
}
