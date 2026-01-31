package com.google.android.gms.common.api.internal;

import I2.C0609m;
import com.google.android.gms.common.api.internal.C1106d;
import f2.C5394d;

/* loaded from: classes.dex */
public final class p0 extends i0 {
    public final C1106d.a zab;

    public p0(C1106d.a aVar, C0609m c0609m) {
        super(4, c0609m);
        this.zab = aVar;
    }

    @Override // h2.AbstractC5608z
    public final boolean zaa(U u8) {
        h2.E e8 = u8.zah().get(this.zab);
        return e8 != null && e8.zaa.zab();
    }

    @Override // h2.AbstractC5608z
    public final C5394d[] zab(U u8) {
        h2.E e8 = u8.zah().get(this.zab);
        if (e8 == null) {
            return null;
        }
        return e8.zaa.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void zac(U u8) {
        h2.E eRemove = u8.zah().remove(this.zab);
        if (eRemove == null) {
            this.f12045a.trySetResult(Boolean.FALSE);
        } else {
            eRemove.zab.a(u8.zaf(), this.f12045a);
            eRemove.zaa.clearListener();
        }
    }

    @Override // com.google.android.gms.common.api.internal.i0, com.google.android.gms.common.api.internal.q0
    public final /* bridge */ /* synthetic */ void zag(C1115m c1115m, boolean z8) {
    }
}
