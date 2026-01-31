package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import f2.C5392b;
import h2.InterfaceC5607y;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class A0 implements InterfaceC5607y {

    /* renamed from: a */
    final /* synthetic */ C1112j f11854a;

    /* synthetic */ A0(C1112j c1112j, h2.V v8) {
        this.f11854a = c1112j;
    }

    @Override // h2.InterfaceC5607y
    public final void zaa(C5392b c5392b) {
        this.f11854a.f12058m.lock();
        try {
            this.f11854a.f12055j = c5392b;
            C1112j.o(this.f11854a);
        } finally {
            this.f11854a.f12058m.unlock();
        }
    }

    @Override // h2.InterfaceC5607y
    public final void zab(Bundle bundle) {
        this.f11854a.f12058m.lock();
        try {
            C1112j.n(this.f11854a, bundle);
            this.f11854a.f12055j = C5392b.RESULT_SUCCESS;
            C1112j.o(this.f11854a);
        } finally {
            this.f11854a.f12058m.unlock();
        }
    }

    @Override // h2.InterfaceC5607y
    public final void zac(int i8, boolean z8) {
        Lock lock;
        this.f11854a.f12058m.lock();
        try {
            C1112j c1112j = this.f11854a;
            if (c1112j.f12057l || c1112j.f12056k == null || !c1112j.f12056k.isSuccess()) {
                this.f11854a.f12057l = false;
                C1112j.m(this.f11854a, i8, z8);
                lock = this.f11854a.f12058m;
            } else {
                this.f11854a.f12057l = true;
                this.f11854a.f12050e.onConnectionSuspended(i8);
                lock = this.f11854a.f12058m;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f11854a.f12058m.unlock();
            throw th;
        }
    }
}
