package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class D implements InterfaceC4364t0, InterfaceC4477u {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12592a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12593b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f12594c;

    /* renamed from: d, reason: collision with root package name */
    private Q5 f12595d;

    /* renamed from: e, reason: collision with root package name */
    private long f12596e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12597f;

    /* renamed from: g, reason: collision with root package name */
    private long f12598g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12599h;

    /* renamed from: i, reason: collision with root package name */
    private long f12600i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC4136r0 f12601j;

    /* renamed from: k, reason: collision with root package name */
    private Executor f12602k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ F f12603l;

    public D(F f8, Context context) {
        this.f12603l = f8;
        this.f12592a = context;
        this.f12593b = true != AbstractC2281am0.zzL(context) ? 5 : 1;
        this.f12594c = new ArrayList();
        this.f12598g = -9223372036854775807L;
        this.f12601j = InterfaceC4136r0.zzb;
        this.f12602k = F.f12883o;
    }

    private final void a() {
        if (this.f12595d == null) {
            return;
        }
        new ArrayList().addAll(this.f12594c);
        Q5 q52 = this.f12595d;
        q52.getClass();
        F10.zzb(null);
        int i8 = q52.zzt;
        C4148r6 c4148r6 = new C4148r6(F.h(q52.zzz), q52.zzs, i8);
        c4148r6.zza(q52.zzw);
        c4148r6.zzb();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4477u
    public final void zza(F f8) {
        final InterfaceC4136r0 interfaceC4136r0 = this.f12601j;
        this.f12602k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.B
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4136r0.zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4477u
    public final void zzb(F f8) {
        final InterfaceC4136r0 interfaceC4136r0 = this.f12601j;
        this.f12602k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.A
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4136r0.zzb(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4477u
    public final void zzc(F f8, final IQ iq) {
        final InterfaceC4136r0 interfaceC4136r0 = this.f12601j;
        this.f12602k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.z
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4136r0.zzc(this.zza, iq);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4364t0
    public final long zzd(long j8, boolean z8) {
        F10.zzf(false);
        long j9 = this.f12600i;
        if (j9 != -9223372036854775807L) {
            if (!F.g(this.f12603l, j9)) {
                return -9223372036854775807L;
            }
            a();
            this.f12600i = -9223372036854775807L;
        }
        F10.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4364t0
    public final void zze() {
        this.f12599h = false;
        this.f12598g = -9223372036854775807L;
        F.d(this.f12603l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4364t0
    public final void zzf(Q5 q52, InterfaceC3002h20 interfaceC3002h20) throws C4250s0 {
        F.b(this.f12603l, q52, interfaceC3002h20);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4364t0
    public final void zzg(int i8, Q5 q52) {
        F10.zzf(false);
        int i9 = AbstractC2281am0.zza;
        this.f12595d = q52;
        if (this.f12599h) {
            F10.zzf(this.f12598g != -9223372036854775807L);
            this.f12600i = this.f12598g;
        } else {
            a();
            this.f12599h = true;
            this.f12600i = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4364t0
    public final void zzh(long j8, long j9) throws C4250s0 {
        F10.zzf(false);
        try {
            this.f12603l.zzo(j8, j9);
        } catch (WE0 e8) {
            Q5 q5Zzad = this.f12595d;
            if (q5Zzad == null) {
                q5Zzad = new O4().zzad();
            }
            throw new C4250s0(e8, q5Zzad);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4364t0
    public final void zzi(InterfaceC4136r0 interfaceC4136r0, Executor executor) {
        this.f12601j = interfaceC4136r0;
        this.f12602k = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4364t0
    public final void zzj(long j8) {
        this.f12597f = this.f12596e != j8;
        this.f12596e = j8;
    }

    public final void zzk(List list) {
        this.f12594c.clear();
        this.f12594c.addAll(list);
        a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4364t0
    public final boolean zzl() {
        return AbstractC2281am0.zzL(this.f12592a);
    }
}
