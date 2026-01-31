package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class UD0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f16618a;

    /* renamed from: b, reason: collision with root package name */
    private final List f16619b;

    /* synthetic */ UD0(int i8, int i9, TD0 td0) {
        this.f16618a = DD0.zzc(i8);
        this.f16619b = DD0.zzc(i9);
    }

    public final UD0 zza(PD0 pd0) {
        this.f16619b.add(pd0);
        return this;
    }

    public final UD0 zzb(PD0 pd0) {
        this.f16618a.add(pd0);
        return this;
    }

    public final VD0 zzc() {
        return new VD0(this.f16618a, this.f16619b, null);
    }
}
