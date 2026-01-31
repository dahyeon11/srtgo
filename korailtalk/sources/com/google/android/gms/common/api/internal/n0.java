package com.google.android.gms.common.api.internal;

import I2.C0609m;
import com.google.android.gms.common.api.internal.C1106d;
import f2.C5394d;

/* loaded from: classes.dex */
public final class n0 extends i0 {
    public final h2.E zab;

    public n0(h2.E e8, C0609m c0609m) {
        super(3, c0609m);
        this.zab = e8;
    }

    @Override // h2.AbstractC5608z
    public final boolean zaa(U u8) {
        return this.zab.zaa.zab();
    }

    @Override // h2.AbstractC5608z
    public final C5394d[] zab(U u8) {
        return this.zab.zaa.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void zac(U u8) {
        this.zab.zaa.a(u8.zaf(), this.f12045a);
        C1106d.a listenerKey = this.zab.zaa.getListenerKey();
        if (listenerKey != null) {
            u8.zah().put(listenerKey, this.zab);
        }
    }

    @Override // com.google.android.gms.common.api.internal.i0, com.google.android.gms.common.api.internal.q0
    public final /* bridge */ /* synthetic */ void zag(C1115m c1115m, boolean z8) {
    }
}
