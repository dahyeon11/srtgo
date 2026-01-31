package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3799o2 implements InterfaceC2425c1 {
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.n2
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new C3799o2()};
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC2769f1 f21388f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21390h;

    /* renamed from: i, reason: collision with root package name */
    private long f21391i;

    /* renamed from: j, reason: collision with root package name */
    private int f21392j;

    /* renamed from: k, reason: collision with root package name */
    private int f21393k;

    /* renamed from: l, reason: collision with root package name */
    private int f21394l;

    /* renamed from: m, reason: collision with root package name */
    private long f21395m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21396n;

    /* renamed from: o, reason: collision with root package name */
    private C3571m2 f21397o;

    /* renamed from: p, reason: collision with root package name */
    private C4254s2 f21398p;

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f21383a = new C4099qh0(4);

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f21384b = new C4099qh0(9);

    /* renamed from: c, reason: collision with root package name */
    private final C4099qh0 f21385c = new C4099qh0(11);

    /* renamed from: d, reason: collision with root package name */
    private final C4099qh0 f21386d = new C4099qh0();

    /* renamed from: e, reason: collision with root package name */
    private final C3913p2 f21387e = new C3913p2();

    /* renamed from: g, reason: collision with root package name */
    private int f21389g = 1;

    private final C4099qh0 a(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        if (this.f21394l > this.f21386d.zzc()) {
            C4099qh0 c4099qh0 = this.f21386d;
            int iZzc = c4099qh0.zzc();
            c4099qh0.zzI(new byte[Math.max(iZzc + iZzc, this.f21394l)], 0);
        } else {
            this.f21386d.zzK(0);
        }
        this.f21386d.zzJ(this.f21394l);
        ((Q0) interfaceC2540d1).zzn(this.f21386d.zzM(), 0, this.f21394l, false);
        return this.f21386d;
    }

    private final void b() {
        if (this.f21396n) {
            return;
        }
        this.f21388f.zzO(new B1(-9223372036854775807L, 0L));
        this.f21396n = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.InterfaceC2540d1 r17, com.google.android.gms.internal.ads.C5050z1 r18) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3799o2.zzb(com.google.android.gms.internal.ads.d1, com.google.android.gms.internal.ads.z1):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f21388f = interfaceC2769f1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        if (j8 == 0) {
            this.f21389g = 1;
            this.f21390h = false;
        } else {
            this.f21389g = 3;
        }
        this.f21392j = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        Q0 q02 = (Q0) interfaceC2540d1;
        q02.zzm(this.f21383a.zzM(), 0, 3, false);
        this.f21383a.zzK(0);
        if (this.f21383a.zzo() != 4607062) {
            return false;
        }
        q02.zzm(this.f21383a.zzM(), 0, 2, false);
        this.f21383a.zzK(0);
        if ((this.f21383a.zzq() & 250) != 0) {
            return false;
        }
        q02.zzm(this.f21383a.zzM(), 0, 4, false);
        this.f21383a.zzK(0);
        int iZzg = this.f21383a.zzg();
        interfaceC2540d1.zzj();
        Q0 q03 = (Q0) interfaceC2540d1;
        q03.zzl(iZzg, false);
        q03.zzm(this.f21383a.zzM(), 0, 4, false);
        this.f21383a.zzK(0);
        return this.f21383a.zzg() == 0;
    }
}
