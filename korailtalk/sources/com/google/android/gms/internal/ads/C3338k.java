package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3338k {
    public static final C2651e zza;
    public static final C2651e zzb;
    public static final C2651e zzc;
    public static final C2651e zzd;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f20341a = AbstractC2281am0.zzE("ExoPlayer:Loader:ProgressiveMediaPeriod");

    /* renamed from: b, reason: collision with root package name */
    private HandlerC2766f f20342b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f20343c;

    static {
        long j8 = -9223372036854775807L;
        AbstractC2537d abstractC2537d = null;
        zza = new C2651e(0, j8, abstractC2537d);
        zzb = new C2651e(1, j8, abstractC2537d);
        zzc = new C2651e(2, j8, abstractC2537d);
        zzd = new C2651e(3, j8, abstractC2537d);
    }

    public C3338k(String str) {
    }

    public static C2651e zzb(boolean z8, long j8) {
        return new C2651e(z8 ? 1 : 0, j8, null);
    }

    public final long zza(InterfaceC2881g interfaceC2881g, InterfaceC2422c interfaceC2422c, int i8) {
        Looper looperMyLooper = Looper.myLooper();
        F10.zzb(looperMyLooper);
        this.f20343c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC2766f(this, looperMyLooper, interfaceC2881g, interfaceC2422c, i8, jElapsedRealtime).zzc(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        HandlerC2766f handlerC2766f = this.f20342b;
        F10.zzb(handlerC2766f);
        handlerC2766f.zza(false);
    }

    public final void zzh() {
        this.f20343c = null;
    }

    public final void zzi(int i8) throws IOException {
        IOException iOException = this.f20343c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC2766f handlerC2766f = this.f20342b;
        if (handlerC2766f != null) {
            handlerC2766f.zzb(i8);
        }
    }

    public final void zzj(InterfaceC2996h interfaceC2996h) {
        HandlerC2766f handlerC2766f = this.f20342b;
        if (handlerC2766f != null) {
            handlerC2766f.zza(true);
        }
        this.f20341a.execute(new RunnableC3111i(interfaceC2996h));
        this.f20341a.shutdown();
    }

    public final boolean zzk() {
        return this.f20343c != null;
    }

    public final boolean zzl() {
        return this.f20342b != null;
    }
}
