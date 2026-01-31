package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import f2.C5392b;
import i2.AbstractC5670c;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class TU implements AbstractC5670c.a, AbstractC5670c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C1203Bt f16480a = new C1203Bt();

    /* renamed from: b, reason: collision with root package name */
    protected boolean f16481b = false;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f16482c = false;

    /* renamed from: d, reason: collision with root package name */
    protected C1200Bq f16483d;

    /* renamed from: e, reason: collision with root package name */
    protected Context f16484e;

    /* renamed from: f, reason: collision with root package name */
    protected Looper f16485f;

    /* renamed from: g, reason: collision with root package name */
    protected ScheduledExecutorService f16486g;

    protected final synchronized void a() {
        try {
            if (this.f16483d == null) {
                this.f16483d = new C1200Bq(this.f16484e, this.f16485f, this, this);
            }
            this.f16483d.checkAvailabilityAndConnect();
        } catch (Throwable th) {
            throw th;
        }
    }

    protected final synchronized void b() {
        try {
            this.f16482c = true;
            C1200Bq c1200Bq = this.f16483d;
            if (c1200Bq == null) {
                return;
            }
            if (c1200Bq.isConnected() || this.f16483d.isConnecting()) {
                this.f16483d.disconnect();
            }
            Binder.flushPendingCommands();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // i2.AbstractC5670c.a
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    @Override // i2.AbstractC5670c.b
    public final void onConnectionFailed(C5392b c5392b) {
        String str = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(c5392b.getErrorCode()));
        L1.n.zze(str);
        this.f16480a.zzd(new YT(1, str));
    }

    @Override // i2.AbstractC5670c.a
    public void onConnectionSuspended(int i8) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i8));
        L1.n.zze(str);
        this.f16480a.zzd(new YT(1, str));
    }
}
