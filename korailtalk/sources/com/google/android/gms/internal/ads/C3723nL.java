package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3723nL implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f21237a;

    /* synthetic */ C3723nL(C3837oL c3837oL, AbstractC3609mL abstractC3609mL) {
        this.f21237a = new WeakReference(c3837oL);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        C3837oL c3837oL = (C3837oL) this.f21237a.get();
        if (c3837oL == null) {
            return;
        }
        c3837oL.f21456g.zza();
    }
}
