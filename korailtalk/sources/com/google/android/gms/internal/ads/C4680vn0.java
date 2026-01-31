package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.vn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4680vn0 extends AbstractC2971gn0 {

    /* renamed from: p, reason: collision with root package name */
    private AbstractC4566un0 f23310p;

    C4680vn0(AbstractC2009Vk0 abstractC2009Vk0, boolean z8, Executor executor, Callable callable) {
        super(abstractC2009Vk0, z8, false);
        this.f23310p = new C4452tn0(this, callable, executor);
        N();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2971gn0
    final void L(int i8, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2971gn0
    final void M() {
        AbstractC4566un0 abstractC4566un0 = this.f23310p;
        if (abstractC4566un0 != null) {
            abstractC4566un0.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2971gn0
    final void Q(int i8) {
        super.Q(i8);
        if (i8 == 1) {
            this.f23310p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final void o() {
        AbstractC4566un0 abstractC4566un0 = this.f23310p;
        if (abstractC4566un0 != null) {
            abstractC4566un0.g();
        }
    }
}
