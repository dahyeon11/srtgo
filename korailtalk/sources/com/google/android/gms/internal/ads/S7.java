package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class S7 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f16204a;

    /* renamed from: b, reason: collision with root package name */
    private final R7 f16205b;

    /* renamed from: c, reason: collision with root package name */
    private final I7 f16206c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f16207d = false;

    /* renamed from: e, reason: collision with root package name */
    private final P7 f16208e;

    public S7(BlockingQueue blockingQueue, R7 r72, I7 i72, P7 p72) {
        this.f16204a = blockingQueue;
        this.f16205b = r72;
        this.f16206c = i72;
        this.f16208e = p72;
    }

    private void a() {
        Z7 z72 = (Z7) this.f16204a.take();
        SystemClock.elapsedRealtime();
        z72.g(3);
        try {
            try {
                z72.zzm("network-queue-take");
                z72.zzw();
                TrafficStats.setThreadStatsTag(z72.zzc());
                V7 v7Zza = this.f16205b.zza(z72);
                z72.zzm("network-http-complete");
                if (v7Zza.zze && z72.zzv()) {
                    z72.d("not-modified");
                    z72.e();
                } else {
                    C2554d8 c2554d8A = z72.a(v7Zza);
                    z72.zzm("network-parse-complete");
                    if (c2554d8A.zzb != null) {
                        this.f16206c.zzd(z72.zzj(), c2554d8A.zzb);
                        z72.zzm("network-cache-written");
                    }
                    z72.zzq();
                    this.f16208e.zzb(z72, c2554d8A, null);
                    z72.f(c2554d8A);
                }
            } catch (C2898g8 e8) {
                SystemClock.elapsedRealtime();
                this.f16208e.zza(z72, e8);
                z72.e();
            } catch (Exception e9) {
                C3241j8.zzc(e9, "Unhandled exception %s", e9.toString());
                C2898g8 c2898g8 = new C2898g8(e9);
                SystemClock.elapsedRealtime();
                this.f16208e.zza(z72, c2898g8);
                z72.e();
            }
            z72.g(4);
        } catch (Throwable th) {
            z72.g(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f16207d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C3241j8.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.f16207d = true;
        interrupt();
    }
}
