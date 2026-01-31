package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.p6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3921p6 implements InterfaceC4490u6 {

    /* renamed from: w, reason: collision with root package name */
    private static final byte[] f21642w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21643a;

    /* renamed from: b, reason: collision with root package name */
    private final C1755Pg0 f21644b = new C1755Pg0(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    private final C4099qh0 f21645c = new C4099qh0(Arrays.copyOf(f21642w, 10));

    /* renamed from: d, reason: collision with root package name */
    private final String f21646d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21647e;

    /* renamed from: f, reason: collision with root package name */
    private String f21648f;

    /* renamed from: g, reason: collision with root package name */
    private K1 f21649g;

    /* renamed from: h, reason: collision with root package name */
    private K1 f21650h;

    /* renamed from: i, reason: collision with root package name */
    private int f21651i;

    /* renamed from: j, reason: collision with root package name */
    private int f21652j;

    /* renamed from: k, reason: collision with root package name */
    private int f21653k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21654l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21655m;

    /* renamed from: n, reason: collision with root package name */
    private int f21656n;

    /* renamed from: o, reason: collision with root package name */
    private int f21657o;

    /* renamed from: p, reason: collision with root package name */
    private int f21658p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21659q;

    /* renamed from: r, reason: collision with root package name */
    private long f21660r;

    /* renamed from: s, reason: collision with root package name */
    private int f21661s;

    /* renamed from: t, reason: collision with root package name */
    private long f21662t;

    /* renamed from: u, reason: collision with root package name */
    private K1 f21663u;

    /* renamed from: v, reason: collision with root package name */
    private long f21664v;

    public C3921p6(boolean z8, String str, int i8) {
        b();
        this.f21656n = -1;
        this.f21657o = -1;
        this.f21660r = -9223372036854775807L;
        this.f21662t = -9223372036854775807L;
        this.f21643a = z8;
        this.f21646d = str;
        this.f21647e = i8;
    }

    private final void a() {
        this.f21655m = false;
        b();
    }

    private final void b() {
        this.f21651i = 0;
        this.f21652j = 0;
        this.f21653k = 256;
    }

    private final void c() {
        this.f21651i = 3;
        this.f21652j = 0;
    }

    private final void d(K1 k12, long j8, int i8, int i9) {
        this.f21651i = 4;
        this.f21652j = i8;
        this.f21663u = k12;
        this.f21664v = j8;
        this.f21661s = i9;
    }

    private final boolean e(C4099qh0 c4099qh0, byte[] bArr, int i8) {
        int iMin = Math.min(c4099qh0.zzb(), i8 - this.f21652j);
        c4099qh0.zzG(bArr, this.f21652j, iMin);
        int i9 = this.f21652j + iMin;
        this.f21652j = i9;
        return i9 == i8;
    }

    private static final boolean f(byte b9, byte b10) {
        return zzf((b10 & 255) | androidx.core.view.M.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean g(C4099qh0 c4099qh0, byte[] bArr, int i8) {
        if (c4099qh0.zzb() < i8) {
            return false;
        }
        c4099qh0.zzG(bArr, 0, i8);
        return true;
    }

    public static boolean zzf(int i8) {
        return (i8 & 65526) == 65520;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0273, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0275, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0276, code lost:
    
        r20.f21654l = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x027a, code lost:
    
        if (r20.f21655m != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x027c, code lost:
    
        r20.f21651i = 1;
        r20.f21652j = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0282, code lost:
    
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0285, code lost:
    
        r21.zzK(r13);
        r8 = 0;
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0268, code lost:
    
        r20.f21658p = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0271, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0268 A[EDGE_INSN: B:146:0x0268->B:98:0x0268 BREAK  A[LOOP:1: B:50:0x01b2->B:172:0x01b2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021f  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.C4099qh0 r21) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3921p6.zza(com.google.android.gms.internal.ads.qh0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzb(InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        c3011h7.zzc();
        this.f21648f = c3011h7.zzb();
        K1 k1Zzw = interfaceC2769f1.zzw(c3011h7.zza(), 1);
        this.f21649g = k1Zzw;
        this.f21663u = k1Zzw;
        if (!this.f21643a) {
            this.f21650h = new C2311b1();
            return;
        }
        c3011h7.zzc();
        K1 k1Zzw2 = interfaceC2769f1.zzw(c3011h7.zza(), 5);
        this.f21650h = k1Zzw2;
        O4 o42 = new O4();
        o42.zzK(c3011h7.zzb());
        o42.zzX("application/id3");
        k1Zzw2.zzl(o42.zzad());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zzd(long j8, int i8) {
        this.f21662t = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4490u6
    public final void zze() {
        this.f21662t = -9223372036854775807L;
        a();
    }
}
