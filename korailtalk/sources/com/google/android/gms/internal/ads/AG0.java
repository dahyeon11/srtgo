package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class AG0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5081zG0 f12157a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4967yG0 f12158b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3002h20 f12159c;

    /* renamed from: d, reason: collision with root package name */
    private final RG f12160d;

    /* renamed from: e, reason: collision with root package name */
    private int f12161e;

    /* renamed from: f, reason: collision with root package name */
    private Object f12162f;

    /* renamed from: g, reason: collision with root package name */
    private final Looper f12163g;

    /* renamed from: h, reason: collision with root package name */
    private final int f12164h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12165i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12166j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12167k;

    public AG0(InterfaceC4967yG0 interfaceC4967yG0, InterfaceC5081zG0 interfaceC5081zG0, RG rg, int i8, InterfaceC3002h20 interfaceC3002h20, Looper looper) {
        this.f12158b = interfaceC4967yG0;
        this.f12157a = interfaceC5081zG0;
        this.f12160d = rg;
        this.f12163g = looper;
        this.f12159c = interfaceC3002h20;
        this.f12164h = i8;
    }

    public final int zza() {
        return this.f12161e;
    }

    public final Looper zzb() {
        return this.f12163g;
    }

    public final InterfaceC5081zG0 zzc() {
        return this.f12157a;
    }

    public final AG0 zzd() {
        F10.zzf(!this.f12165i);
        this.f12165i = true;
        this.f12158b.zzm(this);
        return this;
    }

    public final AG0 zze(Object obj) {
        F10.zzf(!this.f12165i);
        this.f12162f = obj;
        return this;
    }

    public final AG0 zzf(int i8) {
        F10.zzf(!this.f12165i);
        this.f12161e = i8;
        return this;
    }

    public final Object zzg() {
        return this.f12162f;
    }

    public final synchronized void zzh(boolean z8) {
        this.f12166j = z8 | this.f12166j;
        this.f12167k = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j8) {
        try {
            F10.zzf(this.f12165i);
            F10.zzf(this.f12163g.getThread() != Thread.currentThread());
            long jElapsedRealtime = SystemClock.elapsedRealtime() + j8;
            while (!this.f12167k) {
                if (j8 <= 0) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                wait(j8);
                j8 = jElapsedRealtime - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12166j;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
