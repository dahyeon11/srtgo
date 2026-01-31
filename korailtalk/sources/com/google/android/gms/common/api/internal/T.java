package com.google.android.gms.common.api.internal;

import i2.AbstractC5670c;

/* loaded from: classes.dex */
final class T implements AbstractC5670c.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ U f11952a;

    T(U u8) {
        this.f11952a = u8;
    }

    @Override // i2.AbstractC5670c.e
    public final void onSignOutComplete() {
        this.f11952a.f11965m.f12011p.post(new S(this));
    }
}
