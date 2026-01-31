package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private final U f16747a;

    /* renamed from: b, reason: collision with root package name */
    private final C2194a0 f16748b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16749c;

    /* renamed from: f, reason: collision with root package name */
    private long f16752f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16755i;

    /* renamed from: d, reason: collision with root package name */
    private int f16750d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f16751e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f16753g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f16754h = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f16756j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC3002h20 f16757k = InterfaceC3002h20.zza;

    public V(Context context, U u8, long j8) {
        this.f16747a = u8;
        this.f16748b = new C2194a0(context);
    }

    private final void a(int i8) {
        this.f16750d = Math.min(this.f16750d, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r15 > 100000) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r20 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r17.f16749c != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(long r18, long r20, long r22, long r24, boolean r26, com.google.android.gms.internal.ads.T r27) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V.zza(long, long, long, long, boolean, com.google.android.gms.internal.ads.T):int");
    }

    public final void zzb() {
        if (this.f16750d == 0) {
            this.f16750d = 1;
        }
    }

    public final void zzc(boolean z8) {
        this.f16755i = z8;
        this.f16754h = -9223372036854775807L;
    }

    public final void zzd() {
        a(0);
    }

    public final void zze(boolean z8) {
        this.f16750d = z8 ? 1 : 0;
    }

    public final void zzf() {
        a(2);
    }

    public final void zzg() {
        this.f16749c = true;
        this.f16752f = AbstractC2281am0.zzr(SystemClock.elapsedRealtime());
        this.f16748b.zzg();
    }

    public final void zzh() {
        this.f16749c = false;
        this.f16754h = -9223372036854775807L;
        this.f16748b.zzh();
    }

    public final void zzi() {
        this.f16748b.zzf();
        this.f16753g = -9223372036854775807L;
        this.f16751e = -9223372036854775807L;
        a(1);
        this.f16754h = -9223372036854775807L;
    }

    public final void zzj(int i8) {
        this.f16748b.zzj(i8);
    }

    public final void zzk(InterfaceC3002h20 interfaceC3002h20) {
        this.f16757k = interfaceC3002h20;
    }

    public final void zzl(float f8) {
        this.f16748b.zzc(f8);
    }

    public final void zzm(Surface surface) {
        this.f16748b.zzi(surface);
        a(1);
    }

    public final void zzn(float f8) {
        this.f16756j = f8;
        this.f16748b.zze(f8);
    }

    public final boolean zzo(boolean z8) {
        boolean z9 = true;
        if (z8 && this.f16750d == 3) {
            this.f16754h = -9223372036854775807L;
        } else {
            if (this.f16754h == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() >= this.f16754h) {
                z9 = false;
                this.f16754h = -9223372036854775807L;
            }
        }
        return z9;
    }

    public final boolean zzp() {
        int i8 = this.f16750d;
        this.f16750d = 3;
        this.f16752f = AbstractC2281am0.zzr(SystemClock.elapsedRealtime());
        return i8 != 3;
    }
}
