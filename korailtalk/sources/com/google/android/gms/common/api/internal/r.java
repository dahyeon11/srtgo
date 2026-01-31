package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import f2.C5392b;
import g2.C5539a;
import i2.AbstractC5683p;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class r implements h2.r {

    /* renamed from: a, reason: collision with root package name */
    private final N f12088a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12089b = false;

    public r(N n8) {
        this.f12088a = n8;
    }

    final void b() {
        if (this.f12089b) {
            this.f12089b = false;
            this.f12088a.f11945n.f11927x.zab();
            zaj();
        }
    }

    @Override // h2.r
    public final <A extends C5539a.b, R extends g2.n, T extends AbstractC1103b> T zaa(T t8) {
        zab(t8);
        return t8;
    }

    @Override // h2.r
    public final <A extends C5539a.b, T extends AbstractC1103b> T zab(T t8) {
        try {
            this.f12088a.f11945n.f11927x.a(t8);
            K k8 = this.f12088a.f11945n;
            C5539a.f fVar = (C5539a.f) k8.f11918o.get(t8.getClientKey());
            AbstractC5683p.checkNotNull(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f12088a.f11938g.containsKey(t8.getClientKey())) {
                t8.run(fVar);
            } else {
                t8.setFailedResult(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f12088a.f(new C1118p(this, this));
        }
        return t8;
    }

    @Override // h2.r
    public final void zad() {
    }

    @Override // h2.r
    public final void zae() {
        if (this.f12089b) {
            this.f12089b = false;
            this.f12088a.f(new C1119q(this, this));
        }
    }

    @Override // h2.r
    public final void zag(Bundle bundle) {
    }

    @Override // h2.r
    public final void zai(int i8) {
        this.f12088a.e(null);
        this.f12088a.f11946o.zac(i8, this.f12089b);
    }

    @Override // h2.r
    public final boolean zaj() {
        if (this.f12089b) {
            return false;
        }
        Set set = this.f12088a.f11945n.f11926w;
        if (set == null || set.isEmpty()) {
            this.f12088a.e(null);
            return true;
        }
        this.f12089b = true;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).h();
        }
        return false;
    }

    @Override // h2.r
    public final void zah(C5392b c5392b, C5539a c5539a, boolean z8) {
    }
}
