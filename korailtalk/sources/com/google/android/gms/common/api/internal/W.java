package com.google.android.gms.common.api.internal;

import android.util.Log;
import f2.C5392b;

/* loaded from: classes.dex */
final class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5392b f11968a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ X f11969b;

    W(X x8, C5392b c5392b) {
        this.f11969b = x8;
        this.f11968a = c5392b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X x8 = this.f11969b;
        U u8 = (U) x8.f11975f.f12007l.get(x8.f11971b);
        if (u8 == null) {
            return;
        }
        if (!this.f11968a.isSuccess()) {
            u8.zar(this.f11968a, null);
            return;
        }
        this.f11969b.f11974e = true;
        if (this.f11969b.f11970a.requiresSignIn()) {
            this.f11969b.e();
            return;
        }
        try {
            X x9 = this.f11969b;
            x9.f11970a.getRemoteService(null, x9.f11970a.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e8) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
            this.f11969b.f11970a.disconnect("Failed to get service from broker.");
            u8.zar(new C5392b(10), null);
        }
    }
}
