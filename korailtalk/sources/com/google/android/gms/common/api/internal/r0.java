package com.google.android.gms.common.api.internal;

import f2.C5392b;
import g2.AbstractC5544f;

/* loaded from: classes.dex */
final class r0 implements AbstractC5544f.c {

    /* renamed from: a */
    final /* synthetic */ s0 f12090a;
    public final int zaa;
    public final AbstractC5544f zab;
    public final AbstractC5544f.c zac;

    public r0(s0 s0Var, int i8, AbstractC5544f abstractC5544f, AbstractC5544f.c cVar) {
        this.f12090a = s0Var;
        this.zaa = i8;
        this.zab = abstractC5544f;
        this.zac = cVar;
    }

    @Override // g2.AbstractC5544f.c, h2.InterfaceC5591h
    public final void onConnectionFailed(C5392b c5392b) {
        "beginFailureResolution for ".concat(String.valueOf(c5392b));
        this.f12090a.zah(c5392b, this.zaa);
    }
}
