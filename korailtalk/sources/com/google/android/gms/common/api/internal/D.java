package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import f2.C5392b;
import g2.C5539a;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class D implements h2.r {

    /* renamed from: a */
    private final N f11893a;

    public D(N n8) {
        this.f11893a = n8;
    }

    @Override // h2.r
    public final <A extends C5539a.b, R extends g2.n, T extends AbstractC1103b> T zaa(T t8) {
        this.f11893a.f11945n.f11911h.add(t8);
        return t8;
    }

    @Override // h2.r
    public final <A extends C5539a.b, T extends AbstractC1103b> T zab(T t8) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // h2.r
    public final void zad() {
        Iterator it = this.f11893a.f11937f.values().iterator();
        while (it.hasNext()) {
            ((C5539a.f) it.next()).disconnect();
        }
        this.f11893a.f11945n.f11919p = Collections.emptySet();
    }

    @Override // h2.r
    public final void zae() {
        this.f11893a.d();
    }

    @Override // h2.r
    public final void zag(Bundle bundle) {
    }

    @Override // h2.r
    public final void zai(int i8) {
    }

    @Override // h2.r
    public final boolean zaj() {
        return true;
    }

    @Override // h2.r
    public final void zah(C5392b c5392b, C5539a c5539a, boolean z8) {
    }
}
