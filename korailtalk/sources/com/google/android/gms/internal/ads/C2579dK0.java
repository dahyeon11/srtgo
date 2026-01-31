package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.dK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2579dK0 {

    /* renamed from: A, reason: collision with root package name */
    private long f18575A;

    /* renamed from: B, reason: collision with root package name */
    private long f18576B;

    /* renamed from: C, reason: collision with root package name */
    private long f18577C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f18578D;

    /* renamed from: E, reason: collision with root package name */
    private long f18579E;

    /* renamed from: F, reason: collision with root package name */
    private long f18580F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f18581G;

    /* renamed from: H, reason: collision with root package name */
    private long f18582H;

    /* renamed from: I, reason: collision with root package name */
    private InterfaceC3002h20 f18583I;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2464cK0 f18584a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f18585b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f18586c;

    /* renamed from: d, reason: collision with root package name */
    private int f18587d;

    /* renamed from: e, reason: collision with root package name */
    private C2350bK0 f18588e;

    /* renamed from: f, reason: collision with root package name */
    private int f18589f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18590g;

    /* renamed from: h, reason: collision with root package name */
    private long f18591h;

    /* renamed from: i, reason: collision with root package name */
    private float f18592i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18593j;

    /* renamed from: k, reason: collision with root package name */
    private long f18594k;

    /* renamed from: l, reason: collision with root package name */
    private long f18595l;

    /* renamed from: m, reason: collision with root package name */
    private Method f18596m;

    /* renamed from: n, reason: collision with root package name */
    private long f18597n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18598o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18599p;

    /* renamed from: q, reason: collision with root package name */
    private long f18600q;

    /* renamed from: r, reason: collision with root package name */
    private long f18601r;

    /* renamed from: s, reason: collision with root package name */
    private long f18602s;

    /* renamed from: t, reason: collision with root package name */
    private long f18603t;

    /* renamed from: u, reason: collision with root package name */
    private long f18604u;

    /* renamed from: v, reason: collision with root package name */
    private int f18605v;

    /* renamed from: w, reason: collision with root package name */
    private int f18606w;

    /* renamed from: x, reason: collision with root package name */
    private long f18607x;

    /* renamed from: y, reason: collision with root package name */
    private long f18608y;

    /* renamed from: z, reason: collision with root package name */
    private long f18609z;

    public C2579dK0(InterfaceC2464cK0 interfaceC2464cK0) {
        this.f18584a = interfaceC2464cK0;
        try {
            this.f18596m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f18585b = new long[10];
        this.f18583I = InterfaceC3002h20.zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long a() {
        /*
            r13 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r13.f18607x
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 2
            if (r2 == 0) goto L3b
            android.media.AudioTrack r2 = r13.f18586c
            r2.getClass()
            int r2 = r2.getPlayState()
            if (r2 != r3) goto L1e
            long r0 = r13.f18609z
            return r0
        L1e:
            long r0 = com.google.android.gms.internal.ads.AbstractC2281am0.zzr(r0)
            long r2 = r13.f18607x
            long r0 = r0 - r2
            float r2 = r13.f18592i
            long r0 = com.google.android.gms.internal.ads.AbstractC2281am0.zzp(r0, r2)
            int r2 = r13.f18589f
            long r0 = com.google.android.gms.internal.ads.AbstractC2281am0.zzo(r0, r2)
            long r2 = r13.f18575A
            long r4 = r13.f18609z
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L3b:
            long r6 = r13.f18601r
            long r6 = r0 - r6
            r8 = 5
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto La4
            android.media.AudioTrack r2 = r13.f18586c
            r2.getClass()
            int r6 = r2.getPlayState()
            r7 = 1
            if (r6 != r7) goto L52
            goto La2
        L52:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            boolean r2 = r13.f18590g
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            r9 = 0
            if (r2 == 0) goto L73
            if (r6 != r3) goto L6e
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L6f
            long r11 = r13.f18602s
            r13.f18604u = r11
            goto L6f
        L6e:
            r3 = r6
        L6f:
            long r11 = r13.f18604u
            long r7 = r7 + r11
            r6 = r3
        L73:
            int r2 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            r3 = 29
            if (r2 > r3) goto L93
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L8f
            long r2 = r13.f18602s
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L90
            r2 = 3
            if (r6 != r2) goto L90
            long r2 = r13.f18608y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto La2
            r13.f18608y = r0
            goto La2
        L8f:
            r9 = r7
        L90:
            r13.f18608y = r4
            r7 = r9
        L93:
            long r2 = r13.f18602s
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto La0
            long r2 = r13.f18603t
            r4 = 1
            long r2 = r2 + r4
            r13.f18603t = r2
        La0:
            r13.f18602s = r7
        La2:
            r13.f18601r = r0
        La4:
            long r0 = r13.f18602s
            long r2 = r13.f18582H
            long r0 = r0 + r2
            long r2 = r13.f18603t
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2579dK0.a():long");
    }

    private final long b() {
        return AbstractC2281am0.zzs(a(), this.f18589f);
    }

    private final void c() {
        this.f18594k = 0L;
        this.f18606w = 0;
        this.f18605v = 0;
        this.f18595l = 0L;
        this.f18577C = 0L;
        this.f18580F = 0L;
        this.f18593j = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zza(boolean r24) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2579dK0.zza(boolean):long");
    }

    public final void zzb(long j8) {
        this.f18609z = a();
        this.f18607x = AbstractC2281am0.zzr(SystemClock.elapsedRealtime());
        this.f18575A = j8;
    }

    public final void zzc() {
        c();
        this.f18586c = null;
        this.f18588e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.f18586c = r3
            r2.f18587d = r7
            com.google.android.gms.internal.ads.bK0 r0 = new com.google.android.gms.internal.ads.bK0
            r0.<init>(r3)
            r2.f18588e = r0
            int r3 = r3.getSampleRate()
            r2.f18589f = r3
            r3 = 0
            if (r4 == 0) goto L23
            int r4 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            r0 = 23
            if (r4 >= r0) goto L23
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L24
            r4 = 6
            if (r5 != r4) goto L23
            r5 = r4
            goto L24
        L23:
            r0 = r3
        L24:
            r2.f18590g = r0
            boolean r4 = com.google.android.gms.internal.ads.AbstractC2281am0.zzK(r5)
            r2.f18599p = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.f18589f
            long r4 = com.google.android.gms.internal.ads.AbstractC2281am0.zzs(r4, r6)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            r2.f18591h = r4
            r4 = 0
            r2.f18602s = r4
            r2.f18603t = r4
            r2.f18581G = r3
            r2.f18582H = r4
            r2.f18604u = r4
            r2.f18598o = r3
            r2.f18607x = r0
            r2.f18608y = r0
            r2.f18600q = r4
            r2.f18597n = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f18592i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2579dK0.zzd(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zze(InterfaceC3002h20 interfaceC3002h20) {
        this.f18583I = interfaceC3002h20;
    }

    public final void zzf() {
        if (this.f18607x != -9223372036854775807L) {
            this.f18607x = AbstractC2281am0.zzr(SystemClock.elapsedRealtime());
        }
        C2350bK0 c2350bK0 = this.f18588e;
        c2350bK0.getClass();
        c2350bK0.zze();
    }

    public final boolean zzg(long j8) {
        if (j8 > AbstractC2281am0.zzo(zza(false), this.f18589f)) {
            return true;
        }
        if (this.f18590g) {
            AudioTrack audioTrack = this.f18586c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && a() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.f18586c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j8) {
        return this.f18608y != -9223372036854775807L && j8 > 0 && SystemClock.elapsedRealtime() - this.f18608y >= 200;
    }

    public final boolean zzj(long j8) {
        AudioTrack audioTrack = this.f18586c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f18590g) {
            if (playState == 2) {
                this.f18598o = false;
                return false;
            }
            if (playState == 1) {
                if (a() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z8 = this.f18598o;
        boolean zZzg = zzg(j8);
        this.f18598o = zZzg;
        if (z8 && !zZzg && playState != 1) {
            InterfaceC2464cK0 interfaceC2464cK0 = this.f18584a;
            int i8 = this.f18587d;
            long jZzu = AbstractC2281am0.zzu(this.f18591h);
            EK0 ek0 = (EK0) interfaceC2464cK0;
            MK0 mk0 = ek0.f12799a;
            if (mk0.f14615n != null) {
                ((SK0) ek0.f12799a.f14615n).f16244a.f16452x0.zzx(i8, jZzu, SystemClock.elapsedRealtime() - mk0.f14593T);
            }
        }
        return true;
    }

    public final boolean zzk() {
        c();
        if (this.f18607x != -9223372036854775807L) {
            this.f18609z = a();
            return false;
        }
        C2350bK0 c2350bK0 = this.f18588e;
        c2350bK0.getClass();
        c2350bK0.zze();
        return true;
    }
}
