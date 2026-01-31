package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import f2.C5392b;
import i2.AbstractC5670c;

/* renamed from: com.google.android.gms.internal.ads.eg0 */
/* loaded from: classes2.dex */
final class C2727eg0 implements AbstractC5670c.a, AbstractC5670c.b {

    /* renamed from: a */
    private final C1305Eg0 f18799a;

    /* renamed from: b */
    private final C5008yg0 f18800b;

    /* renamed from: c */
    private final Object f18801c = new Object();

    /* renamed from: d */
    private boolean f18802d = false;

    /* renamed from: e */
    private boolean f18803e = false;

    C2727eg0(Context context, Looper looper, C5008yg0 c5008yg0) {
        this.f18800b = c5008yg0;
        this.f18799a = new C1305Eg0(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.f18801c) {
            try {
                if (this.f18799a.isConnected() || this.f18799a.isConnecting()) {
                    this.f18799a.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void a() {
        synchronized (this.f18801c) {
            try {
                if (!this.f18802d) {
                    this.f18802d = true;
                    this.f18799a.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f18801c) {
            try {
                if (this.f18803e) {
                    return;
                }
                this.f18803e = true;
                try {
                    this.f18799a.zzp().zzg(new C1223Cg0(this.f18800b.zzaV()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    b();
                    throw th;
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnectionSuspended(int i8) {
    }

    @Override // i2.AbstractC5670c.b
    public final void onConnectionFailed(C5392b c5392b) {
    }
}
