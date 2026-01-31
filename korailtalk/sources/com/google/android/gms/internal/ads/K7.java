package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class K7 extends Thread {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f13746g = C3241j8.zzb;

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f13747a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f13748b;

    /* renamed from: c, reason: collision with root package name */
    private final I7 f13749c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f13750d = false;

    /* renamed from: e, reason: collision with root package name */
    private final C3355k8 f13751e;

    /* renamed from: f, reason: collision with root package name */
    private final P7 f13752f;

    public K7(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, I7 i72, P7 p72) {
        this.f13747a = blockingQueue;
        this.f13748b = blockingQueue2;
        this.f13749c = i72;
        this.f13752f = p72;
        this.f13751e = new C3355k8(this, blockingQueue2, p72);
    }

    private void b() {
        Z7 z72 = (Z7) this.f13747a.take();
        z72.zzm("cache-queue-take");
        z72.g(1);
        try {
            z72.zzw();
            H7 h7Zza = this.f13749c.zza(z72.zzj());
            if (h7Zza == null) {
                z72.zzm("cache-miss");
                if (!this.f13751e.a(z72)) {
                    this.f13748b.put(z72);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (h7Zza.a(jCurrentTimeMillis)) {
                    z72.zzm("cache-hit-expired");
                    z72.zze(h7Zza);
                    if (!this.f13751e.a(z72)) {
                        this.f13748b.put(z72);
                    }
                } else {
                    z72.zzm("cache-hit");
                    C2554d8 c2554d8A = z72.a(new V7(h7Zza.zza, h7Zza.zzg));
                    z72.zzm("cache-hit-parsed");
                    if (!c2554d8A.zzc()) {
                        z72.zzm("cache-parsing-failed");
                        this.f13749c.zzc(z72.zzj(), true);
                        z72.zze(null);
                        if (!this.f13751e.a(z72)) {
                            this.f13748b.put(z72);
                        }
                    } else if (h7Zza.zzf < jCurrentTimeMillis) {
                        z72.zzm("cache-hit-refresh-needed");
                        z72.zze(h7Zza);
                        c2554d8A.zzd = true;
                        if (this.f13751e.a(z72)) {
                            this.f13752f.zzb(z72, c2554d8A, null);
                        } else {
                            this.f13752f.zzb(z72, c2554d8A, new J7(this, z72));
                        }
                    } else {
                        this.f13752f.zzb(z72, c2554d8A, null);
                    }
                }
            }
            z72.g(2);
        } catch (Throwable th) {
            z72.g(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f13746g) {
            C3241j8.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f13749c.zzb();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f13750d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C3241j8.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.f13750d = true;
        interrupt();
    }
}
