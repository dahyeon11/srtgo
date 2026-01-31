package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.o7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3809o7 implements InterfaceC3695n7 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2769f1 f21415a;

    /* renamed from: b, reason: collision with root package name */
    private final K1 f21416b;

    /* renamed from: c, reason: collision with root package name */
    private final C4037q7 f21417c;

    /* renamed from: d, reason: collision with root package name */
    private final Q5 f21418d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21419e;

    /* renamed from: f, reason: collision with root package name */
    private long f21420f;

    /* renamed from: g, reason: collision with root package name */
    private int f21421g;

    /* renamed from: h, reason: collision with root package name */
    private long f21422h;

    public C3809o7(InterfaceC2769f1 interfaceC2769f1, K1 k12, C4037q7 c4037q7, String str, int i8) throws C1901Sv {
        this.f21415a = interfaceC2769f1;
        this.f21416b = k12;
        this.f21417c = c4037q7;
        int i9 = c4037q7.zzb * c4037q7.zze;
        int i10 = c4037q7.zzd;
        int i11 = i9 / 8;
        if (i10 != i11) {
            throw C1901Sv.zza("Expected block size: " + i11 + "; got: " + i10, null);
        }
        int i12 = c4037q7.zzc * i11;
        int i13 = i12 * 8;
        int iMax = Math.max(i11, i12 / 10);
        this.f21419e = iMax;
        O4 o42 = new O4();
        o42.zzX(str);
        o42.zzx(i13);
        o42.zzS(i13);
        o42.zzP(iMax);
        o42.zzy(c4037q7.zzb);
        o42.zzY(c4037q7.zzc);
        o42.zzR(i8);
        this.f21418d = o42.zzad();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3695n7
    public final void zza(int i8, long j8) {
        this.f21415a.zzO(new C4492u7(this.f21417c, 1, i8, j8));
        this.f21416b.zzl(this.f21418d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3695n7
    public final void zzb(long j8) {
        this.f21420f = j8;
        this.f21421g = 0;
        this.f21422h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3695n7
    public final boolean zzc(InterfaceC2540d1 interfaceC2540d1, long j8) {
        int i8;
        int i9;
        long j9 = j8;
        while (j9 > 0 && (i8 = this.f21421g) < (i9 = this.f21419e)) {
            int iZza = H1.zza(this.f21416b, interfaceC2540d1, (int) Math.min(i9 - i8, j9), true);
            if (iZza == -1) {
                j9 = 0;
            } else {
                this.f21421g += iZza;
                j9 -= iZza;
            }
        }
        C4037q7 c4037q7 = this.f21417c;
        int i10 = this.f21421g;
        int i11 = c4037q7.zzd;
        int i12 = i10 / i11;
        if (i12 > 0) {
            long jZzt = this.f21420f + AbstractC2281am0.zzt(this.f21422h, 1000000L, c4037q7.zzc, RoundingMode.FLOOR);
            int i13 = i12 * i11;
            int i14 = this.f21421g - i13;
            this.f21416b.zzs(jZzt, 1, i13, i14, null);
            this.f21422h += i12;
            this.f21421g = i14;
        }
        return j9 <= 0;
    }
}
