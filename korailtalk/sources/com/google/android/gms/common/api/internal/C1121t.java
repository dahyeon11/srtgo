package com.google.android.gms.common.api.internal;

import android.os.Looper;
import f2.C5392b;
import g2.C5539a;
import i2.AbstractC5670c;
import i2.AbstractC5683p;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* loaded from: classes.dex */
final class C1121t implements AbstractC5670c.InterfaceC0311c {

    /* renamed from: a */
    private final WeakReference f12093a;

    /* renamed from: b */
    private final C5539a f12094b;

    /* renamed from: c */
    private final boolean f12095c;

    public C1121t(C c9, C5539a c5539a, boolean z8) {
        this.f12093a = new WeakReference(c9);
        this.f12094b = c5539a;
        this.f12095c = z8;
    }

    @Override // i2.AbstractC5670c.InterfaceC0311c
    public final void onReportServiceBinding(C5392b c5392b) {
        Lock lock;
        C c9 = (C) this.f12093a.get();
        if (c9 == null) {
            return;
        }
        AbstractC5683p.checkState(Looper.myLooper() == c9.f11872a.f11945n.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        c9.f11873b.lock();
        try {
            if (c9.g(0)) {
                if (!c5392b.isSuccess()) {
                    c9.e(c5392b, this.f12094b, this.f12095c);
                }
                if (c9.h()) {
                    c9.f();
                }
                lock = c9.f11873b;
            } else {
                lock = c9.f11873b;
            }
            lock.unlock();
        } catch (Throwable th) {
            c9.f11873b.unlock();
            throw th;
        }
    }
}
