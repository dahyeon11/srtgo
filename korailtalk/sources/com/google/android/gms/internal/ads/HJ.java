package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class HJ {

    /* renamed from: a, reason: collision with root package name */
    private final List f13313a;

    /* renamed from: b, reason: collision with root package name */
    private final C3865oe0 f13314b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13315c;

    public HJ(C4654va0 c4654va0, C3865oe0 c3865oe0) {
        this.f13313a = c4654va0.zzq;
        this.f13314b = c3865oe0;
    }

    public final void zza() {
        if (this.f13315c) {
            return;
        }
        this.f13314b.zzd(this.f13313a);
        this.f13315c = true;
    }
}
