package com.google.android.gms.internal.ads;

import K1.AbstractC0633e;
import K1.InterfaceC0671x0;
import android.content.Context;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3701nA implements InterfaceC2069Wz {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21214a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0671x0 f21215b = G1.u.zzo().zzi();

    public C3701nA(Context context) {
        this.f21214a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069Wz
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        InterfaceC0671x0 interfaceC0671x0 = this.f21215b;
        boolean z8 = Boolean.parseBoolean(str);
        interfaceC0671x0.zzI(z8);
        if (z8) {
            AbstractC0633e.zzc(this.f21214a);
        }
    }
}
