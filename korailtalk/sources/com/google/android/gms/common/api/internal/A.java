package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import f2.C5392b;
import g2.AbstractC5544f;
import h2.AbstractC5599p;
import i2.AbstractC5683p;

/* loaded from: classes.dex */
final class A implements AbstractC5544f.b, AbstractC5544f.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C f11853a;

    /* synthetic */ A(C c9, AbstractC5599p abstractC5599p) {
        this.f11853a = c9;
    }

    @Override // g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnected(Bundle bundle) {
        ((F2.e) AbstractC5683p.checkNotNull(this.f11853a.f11882k)).zad(new BinderC1127z(this.f11853a));
    }

    @Override // g2.AbstractC5544f.c, h2.InterfaceC5591h
    public final void onConnectionFailed(C5392b c5392b) {
        this.f11853a.f11873b.lock();
        try {
            if (this.f11853a.i(c5392b)) {
                this.f11853a.a();
                this.f11853a.f();
            } else {
                this.f11853a.d(c5392b);
            }
            this.f11853a.f11873b.unlock();
        } catch (Throwable th) {
            this.f11853a.f11873b.unlock();
            throw th;
        }
    }

    @Override // g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnectionSuspended(int i8) {
    }
}
