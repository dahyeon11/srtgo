package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import h2.AbstractC5605w;

/* loaded from: classes.dex */
final class u0 extends AbstractC5605w {

    /* renamed from: a */
    final /* synthetic */ Dialog f12100a;

    /* renamed from: b */
    final /* synthetic */ v0 f12101b;

    u0(v0 v0Var, Dialog dialog) {
        this.f12101b = v0Var;
        this.f12100a = dialog;
    }

    @Override // h2.AbstractC5605w
    public final void zaa() {
        this.f12101b.f12104b.e();
        if (this.f12100a.isShowing()) {
            this.f12100a.dismiss();
        }
    }
}
