package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import i2.AbstractC5670c;

/* renamed from: com.google.android.gms.internal.ads.be, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2379be implements AbstractC5670c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2608de f18165a;

    C2379be(C2608de c2608de) {
        this.f18165a = c2608de;
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnected(Bundle bundle) {
        C2608de c2608de;
        synchronized (this.f18165a.f18652c) {
            try {
                c2608de = this.f18165a;
            } catch (DeadObjectException e8) {
                L1.n.zzh("Unable to obtain a cache service instance.", e8);
                C2608de.f(this.f18165a);
            }
            if (c2608de.f18653d != null) {
                c2608de.f18655f = c2608de.f18653d.zzq();
                this.f18165a.f18652c.notifyAll();
            } else {
                this.f18165a.f18652c.notifyAll();
            }
        }
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnectionSuspended(int i8) {
        synchronized (this.f18165a.f18652c) {
            this.f18165a.f18655f = null;
            this.f18165a.f18652c.notifyAll();
        }
    }
}
