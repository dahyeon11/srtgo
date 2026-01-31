package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import f2.C5392b;
import i2.AbstractC5670c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.bg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2384bg0 implements AbstractC5670c.a, AbstractC5670c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C1305Eg0 f18167a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18168b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18169c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC1214Cc f18170d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedBlockingQueue f18171e;

    /* renamed from: f, reason: collision with root package name */
    private final HandlerThread f18172f;

    /* renamed from: g, reason: collision with root package name */
    private final C1876Sf0 f18173g;

    /* renamed from: h, reason: collision with root package name */
    private final long f18174h;

    public C2384bg0(Context context, int i8, EnumC1214Cc enumC1214Cc, String str, String str2, String str3, C1876Sf0 c1876Sf0) {
        this.f18168b = str;
        this.f18170d = enumC1214Cc;
        this.f18169c = str2;
        this.f18173g = c1876Sf0;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f18172f = handlerThread;
        handlerThread.start();
        this.f18174h = System.currentTimeMillis();
        C1305Eg0 c1305Eg0 = new C1305Eg0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f18167a = c1305Eg0;
        this.f18171e = new LinkedBlockingQueue();
        c1305Eg0.checkAvailabilityAndConnect();
    }

    static C1837Rg0 a() {
        return new C1837Rg0(null, 1);
    }

    private final void c(int i8, long j8, Exception exc) {
        this.f18173g.zzc(i8, System.currentTimeMillis() - j8, exc);
    }

    protected final C1510Jg0 b() {
        try {
            return this.f18167a.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnected(Bundle bundle) {
        C1510Jg0 c1510Jg0B = b();
        if (c1510Jg0B != null) {
            try {
                C1837Rg0 c1837Rg0Zzf = c1510Jg0B.zzf(new C1714Og0(1, this.f18170d, this.f18168b, this.f18169c));
                c(5011, this.f18174h, null);
                this.f18171e.put(c1837Rg0Zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // i2.AbstractC5670c.b
    public final void onConnectionFailed(C5392b c5392b) throws InterruptedException {
        try {
            c(4012, this.f18174h, null);
            this.f18171e.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnectionSuspended(int i8) throws InterruptedException {
        try {
            c(4011, this.f18174h, null);
            this.f18171e.put(a());
        } catch (InterruptedException unused) {
        }
    }

    public final C1837Rg0 zzb(int i8) {
        C1837Rg0 c1837Rg0;
        try {
            c1837Rg0 = (C1837Rg0) this.f18171e.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            c(2009, this.f18174h, e8);
            c1837Rg0 = null;
        }
        c(3004, this.f18174h, null);
        if (c1837Rg0 != null) {
            if (c1837Rg0.zzc == 7) {
                C1876Sf0.a(X8.DISABLED);
            } else {
                C1876Sf0.a(X8.ENABLED);
            }
        }
        return c1837Rg0 == null ? a() : c1837Rg0;
    }

    public final void zzc() {
        C1305Eg0 c1305Eg0 = this.f18167a;
        if (c1305Eg0 != null) {
            if (c1305Eg0.isConnected() || this.f18167a.isConnecting()) {
                this.f18167a.disconnect();
            }
        }
    }
}
