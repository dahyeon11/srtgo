package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class T3 implements InterfaceC2425c1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f16384a;

    /* renamed from: b, reason: collision with root package name */
    private final C4708w1 f16385b;

    /* renamed from: c, reason: collision with root package name */
    private final C4252s1 f16386c;

    /* renamed from: d, reason: collision with root package name */
    private final C4480u1 f16387d;

    /* renamed from: e, reason: collision with root package name */
    private final K1 f16388e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC2769f1 f16389f;

    /* renamed from: g, reason: collision with root package name */
    private K1 f16390g;

    /* renamed from: h, reason: collision with root package name */
    private K1 f16391h;

    /* renamed from: i, reason: collision with root package name */
    private int f16392i;

    /* renamed from: j, reason: collision with root package name */
    private C1735Ot f16393j;

    /* renamed from: k, reason: collision with root package name */
    private long f16394k;

    /* renamed from: l, reason: collision with root package name */
    private long f16395l;

    /* renamed from: m, reason: collision with root package name */
    private long f16396m;

    /* renamed from: n, reason: collision with root package name */
    private int f16397n;

    /* renamed from: o, reason: collision with root package name */
    private V3 f16398o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16399p;
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.R3
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new T3(0)};
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private static final InterfaceC2200a3 f16383q = new InterfaceC2200a3() { // from class: com.google.android.gms.internal.ads.S3
    };

    public T3() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int a(com.google.android.gms.internal.ads.InterfaceC2540d1 r19) throws com.google.android.gms.internal.ads.C1901Sv, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.T3.a(com.google.android.gms.internal.ads.d1):int");
    }

    private final long b(long j8) {
        return this.f16394k + ((j8 * 1000000) / this.f16385b.zzd);
    }

    private final V3 c(InterfaceC2540d1 interfaceC2540d1, long j8, boolean z8) {
        ((Q0) interfaceC2540d1).zzm(this.f16384a.zzM(), 0, 4, false);
        this.f16384a.zzK(0);
        this.f16385b.zza(this.f16384a.zzg());
        if (interfaceC2540d1.zzd() != -1) {
            j8 = interfaceC2540d1.zzd();
        }
        return new P3(j8, interfaceC2540d1.zzf(), this.f16385b, false);
    }

    private static boolean d(int i8, long j8) {
        return ((long) (i8 & (-128000))) == (j8 & (-128000));
    }

    private final boolean e(InterfaceC2540d1 interfaceC2540d1) {
        V3 v32 = this.f16398o;
        if (v32 != null) {
            long jZzd = v32.zzd();
            if (jZzd != -1 && interfaceC2540d1.zze() > jZzd - 4) {
                return true;
            }
        }
        try {
            return !interfaceC2540d1.zzm(this.f16384a.zzM(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean f(InterfaceC2540d1 interfaceC2540d1, boolean z8) throws C1901Sv, EOFException, InterruptedIOException {
        int iZze;
        int i8;
        int iZzb;
        interfaceC2540d1.zzj();
        if (interfaceC2540d1.zzf() == 0) {
            C1735Ot c1735OtZza = this.f16387d.zza(interfaceC2540d1, null);
            this.f16393j = c1735OtZza;
            if (c1735OtZza != null) {
                this.f16386c.zzb(c1735OtZza);
            }
            iZze = (int) interfaceC2540d1.zze();
            if (!z8) {
                ((Q0) interfaceC2540d1).zzo(iZze, false);
            }
            i8 = 0;
        } else {
            iZze = 0;
            i8 = 0;
        }
        int i9 = i8;
        int i10 = i9;
        while (true) {
            if (!e(interfaceC2540d1)) {
                this.f16384a.zzK(0);
                int iZzg = this.f16384a.zzg();
                if ((i8 == 0 || d(iZzg, i8)) && (iZzb = AbstractC4822x1.zzb(iZzg)) != -1) {
                    i9++;
                    if (i9 != 1) {
                        if (i9 == 4) {
                            break;
                        }
                    } else {
                        this.f16385b.zza(iZzg);
                        i8 = iZzg;
                    }
                    ((Q0) interfaceC2540d1).zzl(iZzb - 4, false);
                } else {
                    int i11 = i10 + 1;
                    if (i10 == (true != z8 ? 131072 : 32768)) {
                        if (z8) {
                            return false;
                        }
                        throw C1901Sv.zza("Searched too many bytes.", null);
                    }
                    if (z8) {
                        interfaceC2540d1.zzj();
                        ((Q0) interfaceC2540d1).zzl(iZze + i11, false);
                    } else {
                        ((Q0) interfaceC2540d1).zzo(1, false);
                    }
                    i8 = 0;
                    i10 = i11;
                    i9 = 0;
                }
            } else if (i9 <= 0) {
                throw new EOFException();
            }
        }
        if (z8) {
            ((Q0) interfaceC2540d1).zzo(iZze + i10, false);
        } else {
            interfaceC2540d1.zzj();
        }
        this.f16392i = i8;
        return true;
    }

    public final void zza() {
        this.f16399p = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) {
        F10.zzb(this.f16390g);
        int i8 = AbstractC2281am0.zza;
        return a(interfaceC2540d1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f16389f = interfaceC2769f1;
        K1 k1Zzw = interfaceC2769f1.zzw(0, 1);
        this.f16390g = k1Zzw;
        this.f16391h = k1Zzw;
        this.f16389f.zzD();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f16392i = 0;
        this.f16394k = -9223372036854775807L;
        this.f16395l = 0L;
        this.f16397n = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) {
        return f(interfaceC2540d1, true);
    }

    public T3(int i8) {
        this.f16384a = new C4099qh0(10);
        this.f16385b = new C4708w1();
        this.f16386c = new C4252s1();
        this.f16394k = -9223372036854775807L;
        this.f16387d = new C4480u1();
        C2311b1 c2311b1 = new C2311b1();
        this.f16388e = c2311b1;
        this.f16391h = c2311b1;
    }
}
