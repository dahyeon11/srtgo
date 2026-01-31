package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes2.dex */
final class O extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private RunnableC4034q50 f14974a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f14975b;

    /* renamed from: c, reason: collision with root package name */
    private Error f14976c;

    /* renamed from: d, reason: collision with root package name */
    private RuntimeException f14977d;

    /* renamed from: e, reason: collision with root package name */
    private Q f14978e;

    public O() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RunnableC4034q50 runnableC4034q50;
        int i8 = message.what;
        try {
            if (i8 == 1) {
                try {
                    int i9 = message.arg1;
                    RunnableC4034q50 runnableC4034q502 = this.f14974a;
                    if (runnableC4034q502 == null) {
                        throw null;
                    }
                    runnableC4034q502.zzb(i9);
                    this.f14978e = new Q(this, this.f14974a.zza(), i9 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (R50 e8) {
                    AbstractC2834fc0.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f14977d = new IllegalStateException(e8);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e9) {
                    AbstractC2834fc0.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f14976c = e9;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    AbstractC2834fc0.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f14977d = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i8 == 2) {
                try {
                    runnableC4034q50 = this.f14974a;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (runnableC4034q50 == null) {
                    throw null;
                }
                runnableC4034q50.zzc();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final Q zza(int i8) {
        boolean z8;
        start();
        this.f14975b = new Handler(getLooper(), this);
        this.f14974a = new RunnableC4034q50(this.f14975b, null);
        synchronized (this) {
            z8 = false;
            this.f14975b.obtainMessage(1, i8, 0).sendToTarget();
            while (this.f14978e == null && this.f14977d == null && this.f14976c == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f14977d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f14976c;
        if (error != null) {
            throw error;
        }
        Q q8 = this.f14978e;
        q8.getClass();
        return q8;
    }

    public final void zzb() {
        Handler handler = this.f14975b;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
