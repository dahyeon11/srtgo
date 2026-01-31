package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ts, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4461ts implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22942a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22943b;

    public C4461ts(XD0 xd0, XD0 xd02) {
        this.f22942a = xd0;
        this.f22943b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new SharedPreferencesOnSharedPreferenceChangeListenerC4347ss((Context) this.f22942a.zzb(), (InterfaceC0671x0) this.f22943b.zzb());
    }
}
