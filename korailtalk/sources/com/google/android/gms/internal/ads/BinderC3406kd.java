package com.google.android.gms.internal.ads;

import H1.AbstractBinderC0530e0;

/* renamed from: com.google.android.gms.internal.ads.kd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3406kd extends AbstractBinderC0530e0 {

    /* renamed from: a, reason: collision with root package name */
    private final z1.e f20441a;

    public BinderC3406kd(z1.e eVar) {
        this.f20441a = eVar;
    }

    public final z1.e zzb() {
        return this.f20441a;
    }

    @Override // H1.AbstractBinderC0530e0, H1.InterfaceC0533f0
    public final void zzc(String str, String str2) {
        this.f20441a.onAppEvent(str, str2);
    }
}
