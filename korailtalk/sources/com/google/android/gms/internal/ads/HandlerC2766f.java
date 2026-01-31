package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class HandlerC2766f extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2881g f19117a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19118b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC2422c f19119c;

    /* renamed from: d, reason: collision with root package name */
    private IOException f19120d;

    /* renamed from: e, reason: collision with root package name */
    private int f19121e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f19122f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19123g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f19124h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C3338k f19125i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2766f(C3338k c3338k, Looper looper, InterfaceC2881g interfaceC2881g, InterfaceC2422c interfaceC2422c, int i8, long j8) {
        super(looper);
        this.f19125i = c3338k;
        this.f19117a = interfaceC2881g;
        this.f19119c = interfaceC2422c;
        this.f19118b = j8;
    }

    private final void a() {
        this.f19120d = null;
        C3338k c3338k = this.f19125i;
        ExecutorService executorService = c3338k.f20341a;
        HandlerC2766f handlerC2766f = c3338k.f20342b;
        handlerC2766f.getClass();
        executorService.execute(handlerC2766f);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f19124h) {
            return;
        }
        int i8 = message.what;
        if (i8 == 0) {
            a();
            return;
        }
        if (i8 == 3) {
            throw ((Error) message.obj);
        }
        this.f19125i.f20342b = null;
        long j8 = this.f19118b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = jElapsedRealtime - j8;
        InterfaceC2422c interfaceC2422c = this.f19119c;
        interfaceC2422c.getClass();
        if (this.f19123g) {
            interfaceC2422c.zzJ(this.f19117a, jElapsedRealtime, j9, false);
            return;
        }
        int i9 = message.what;
        if (i9 == 1) {
            try {
                interfaceC2422c.zzK(this.f19117a, jElapsedRealtime, j9);
                return;
            } catch (RuntimeException e8) {
                AbstractC2834fc0.zzd("LoadTask", "Unexpected exception handling load completed", e8);
                this.f19125i.f20343c = new C3224j(e8);
                return;
            }
        }
        if (i9 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f19120d = iOException;
        int i10 = this.f19121e + 1;
        this.f19121e = i10;
        C2651e c2651eZzu = interfaceC2422c.zzu(this.f19117a, jElapsedRealtime, j9, iOException, i10);
        if (c2651eZzu.f18714a == 3) {
            this.f19125i.f20343c = this.f19120d;
        } else if (c2651eZzu.f18714a != 2) {
            if (c2651eZzu.f18714a == 1) {
                this.f19121e = 1;
            }
            zzc(c2651eZzu.f18715b != -9223372036854775807L ? c2651eZzu.f18715b : Math.min((this.f19121e - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        try {
            synchronized (this) {
                z8 = this.f19123g;
                this.f19122f = Thread.currentThread();
            }
            if (!z8) {
                Trace.beginSection("load:" + this.f19117a.getClass().getSimpleName());
                try {
                    this.f19117a.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f19122f = null;
                Thread.interrupted();
            }
            if (this.f19124h) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e8) {
            if (this.f19124h) {
                return;
            }
            obtainMessage(2, e8).sendToTarget();
        } catch (Exception e9) {
            if (this.f19124h) {
                return;
            }
            AbstractC2834fc0.zzd("LoadTask", "Unexpected exception loading stream", e9);
            obtainMessage(2, new C3224j(e9)).sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.f19124h) {
                return;
            }
            AbstractC2834fc0.zzd("LoadTask", "OutOfMemory error loading stream", e10);
            obtainMessage(2, new C3224j(e10)).sendToTarget();
        } catch (Error e11) {
            if (!this.f19124h) {
                AbstractC2834fc0.zzd("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(3, e11).sendToTarget();
            }
            throw e11;
        }
    }

    public final void zza(boolean z8) {
        this.f19124h = z8;
        this.f19120d = null;
        if (hasMessages(0)) {
            this.f19123g = true;
            removeMessages(0);
            if (!z8) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f19123g = true;
                    this.f19117a.zzg();
                    Thread thread = this.f19122f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z8) {
            this.f19125i.f20342b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC2422c interfaceC2422c = this.f19119c;
            interfaceC2422c.getClass();
            interfaceC2422c.zzJ(this.f19117a, jElapsedRealtime, jElapsedRealtime - this.f19118b, true);
            this.f19119c = null;
        }
    }

    public final void zzb(int i8) {
        IOException iOException = this.f19120d;
        if (iOException != null && this.f19121e > i8) {
            throw iOException;
        }
    }

    public final void zzc(long j8) {
        F10.zzf(this.f19125i.f20342b == null);
        this.f19125i.f20342b = this;
        if (j8 > 0) {
            sendEmptyMessageDelayed(0, j8);
        } else {
            a();
        }
    }
}
