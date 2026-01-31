package com.google.android.gms.internal.ads;

import f2.C5392b;
import i2.AbstractC5670c;

/* renamed from: com.google.android.gms.internal.ads.ce, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2493ce implements AbstractC5670c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2608de f18337a;

    C2493ce(C2608de c2608de) {
        this.f18337a = c2608de;
    }

    @Override // i2.AbstractC5670c.b
    public final void onConnectionFailed(C5392b c5392b) {
        synchronized (this.f18337a.f18652c) {
            try {
                this.f18337a.f18655f = null;
                C2608de c2608de = this.f18337a;
                if (c2608de.f18653d != null) {
                    c2608de.f18653d = null;
                }
                this.f18337a.f18652c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
