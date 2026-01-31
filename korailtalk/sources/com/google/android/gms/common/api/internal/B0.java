package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import f2.C5392b;
import h2.InterfaceC5607y;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class B0 implements InterfaceC5607y {

    /* renamed from: a */
    final /* synthetic */ C1112j f11856a;

    /* synthetic */ B0(C1112j c1112j, h2.W w8) {
        this.f11856a = c1112j;
    }

    @Override // h2.InterfaceC5607y
    public final void zaa(C5392b c5392b) {
        this.f11856a.f12058m.lock();
        try {
            this.f11856a.f12056k = c5392b;
            C1112j.o(this.f11856a);
        } finally {
            this.f11856a.f12058m.unlock();
        }
    }

    @Override // h2.InterfaceC5607y
    public final void zab(Bundle bundle) {
        this.f11856a.f12058m.lock();
        try {
            this.f11856a.f12056k = C5392b.RESULT_SUCCESS;
            C1112j.o(this.f11856a);
        } finally {
            this.f11856a.f12058m.unlock();
        }
    }

    @Override // h2.InterfaceC5607y
    public final void zac(int i8, boolean z8) {
        Lock lock;
        this.f11856a.f12058m.lock();
        try {
            C1112j c1112j = this.f11856a;
            if (c1112j.f12057l) {
                c1112j.f12057l = false;
                C1112j.m(this.f11856a, i8, z8);
                lock = this.f11856a.f12058m;
            } else {
                c1112j.f12057l = true;
                this.f11856a.f12049d.onConnectionSuspended(i8);
                lock = this.f11856a.f12058m;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f11856a.f12058m.unlock();
            throw th;
        }
    }
}
