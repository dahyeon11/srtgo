package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import maum.m2u.map.Map;

/* renamed from: com.google.android.gms.internal.ads.m7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3581m7 implements InterfaceC3695n7 {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f20834m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f20835n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, Map.MapException.StatusCode.MAP_TOTAL_SESSION_COUNT_EXCEEDED_VALUE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2769f1 f20836a;

    /* renamed from: b, reason: collision with root package name */
    private final K1 f20837b;

    /* renamed from: c, reason: collision with root package name */
    private final C4037q7 f20838c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20839d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f20840e;

    /* renamed from: f, reason: collision with root package name */
    private final C4099qh0 f20841f;

    /* renamed from: g, reason: collision with root package name */
    private final int f20842g;

    /* renamed from: h, reason: collision with root package name */
    private final Q5 f20843h;

    /* renamed from: i, reason: collision with root package name */
    private int f20844i;

    /* renamed from: j, reason: collision with root package name */
    private long f20845j;

    /* renamed from: k, reason: collision with root package name */
    private int f20846k;

    /* renamed from: l, reason: collision with root package name */
    private long f20847l;

    public C3581m7(InterfaceC2769f1 interfaceC2769f1, K1 k12, C4037q7 c4037q7) throws C1901Sv {
        this.f20836a = interfaceC2769f1;
        this.f20837b = k12;
        this.f20838c = c4037q7;
        int iMax = Math.max(1, c4037q7.zzc / 10);
        this.f20842g = iMax;
        C4099qh0 c4099qh0 = new C4099qh0(c4037q7.zzf);
        c4099qh0.zzk();
        int iZzk = c4099qh0.zzk();
        this.f20839d = iZzk;
        int i8 = c4037q7.zzb;
        int i9 = c4037q7.zzd;
        int i10 = (((i9 - (i8 * 4)) * 8) / (c4037q7.zze * i8)) + 1;
        if (iZzk != i10) {
            throw C1901Sv.zza("Expected frames per block: " + i10 + "; got: " + iZzk, null);
        }
        int i11 = AbstractC2281am0.zza;
        int i12 = ((iMax + iZzk) - 1) / iZzk;
        this.f20840e = new byte[i9 * i12];
        this.f20841f = new C4099qh0(i12 * (iZzk + iZzk) * i8);
        int i13 = ((c4037q7.zzc * c4037q7.zzd) * 8) / iZzk;
        O4 o42 = new O4();
        o42.zzX("audio/raw");
        o42.zzx(i13);
        o42.zzS(i13);
        o42.zzP((iMax + iMax) * i8);
        o42.zzy(c4037q7.zzb);
        o42.zzY(c4037q7.zzc);
        o42.zzR(2);
        this.f20843h = o42.zzad();
    }

    private final int a(int i8) {
        int i9 = this.f20838c.zzb;
        return i8 / (i9 + i9);
    }

    private final int b(int i8) {
        return (i8 + i8) * this.f20838c.zzb;
    }

    private final void c(int i8) {
        long jZzt = this.f20845j + AbstractC2281am0.zzt(this.f20847l, 1000000L, this.f20838c.zzc, RoundingMode.FLOOR);
        int iB = b(i8);
        this.f20837b.zzs(jZzt, 1, iB, this.f20846k - iB, null);
        this.f20847l += i8;
        this.f20846k -= iB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3695n7
    public final void zza(int i8, long j8) {
        this.f20836a.zzO(new C4492u7(this.f20838c, this.f20839d, i8, j8));
        this.f20837b.zzl(this.f20843h);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3695n7
    public final void zzb(long j8) {
        this.f20844i = 0;
        this.f20845j = j8;
        this.f20846k = 0;
        this.f20847l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.InterfaceC3695n7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.InterfaceC2540d1 r21, long r22) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3581m7.zzc(com.google.android.gms.internal.ads.d1, long):boolean");
    }
}
