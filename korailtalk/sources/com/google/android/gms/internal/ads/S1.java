package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class S1 implements InterfaceC2425c1 {

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f16169o;

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f16170p;

    /* renamed from: q, reason: collision with root package name */
    private static final byte[] f16171q;

    /* renamed from: r, reason: collision with root package name */
    private static final int f16172r;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f16173a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16174b;

    /* renamed from: c, reason: collision with root package name */
    private long f16175c;

    /* renamed from: d, reason: collision with root package name */
    private int f16176d;

    /* renamed from: e, reason: collision with root package name */
    private int f16177e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16178f;

    /* renamed from: g, reason: collision with root package name */
    private int f16179g;

    /* renamed from: h, reason: collision with root package name */
    private int f16180h;

    /* renamed from: i, reason: collision with root package name */
    private long f16181i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC2769f1 f16182j;

    /* renamed from: k, reason: collision with root package name */
    private K1 f16183k;

    /* renamed from: l, reason: collision with root package name */
    private C1 f16184l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16185m;
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.R1
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new S1(0)};
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f16168n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f16169o = iArr;
        int i8 = AbstractC2281am0.zza;
        Charset charset = AbstractC3647mj0.zzc;
        f16170p = "#!AMR\n".getBytes(charset);
        f16171q = "#!AMR-WB\n".getBytes(charset);
        f16172r = iArr[8];
    }

    public S1() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:5:0x0008, B:7:0x001c, B:21:0x003a, B:23:0x0043, B:22:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:5:0x0008, B:7:0x001c, B:21:0x003a, B:23:0x0043, B:22:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int a(com.google.android.gms.internal.ads.InterfaceC2540d1 r12) throws com.google.android.gms.internal.ads.C1901Sv {
        /*
            r11 = this;
            int r0 = r11.f16177e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L8
            goto L55
        L8:
            r12.zzj()     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.f16173a     // Catch: java.io.EOFException -> Lb5
            r4 = r12
            com.google.android.gms.internal.ads.Q0 r4 = (com.google.android.gms.internal.ads.Q0) r4     // Catch: java.io.EOFException -> Lb5
            r4.zzm(r0, r3, r2, r3)     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.f16173a     // Catch: java.io.EOFException -> Lb5
            r0 = r0[r3]     // Catch: java.io.EOFException -> Lb5
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L9f
            int r0 = r0 >> 3
            boolean r4 = r11.f16174b     // Catch: java.io.EOFException -> Lb5
            r0 = r0 & 15
            if (r4 == 0) goto L2d
            r6 = 10
            if (r0 < r6) goto L38
            r6 = 13
            if (r0 <= r6) goto L2d
            goto L38
        L2d:
            if (r4 != 0) goto L7a
            r6 = 12
            if (r0 < r6) goto L38
            r6 = 14
            if (r0 > r6) goto L38
            goto L7a
        L38:
            if (r4 == 0) goto L3f
            int[] r4 = com.google.android.gms.internal.ads.S1.f16169o     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
            goto L43
        L3f:
            int[] r4 = com.google.android.gms.internal.ads.S1.f16168n     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
        L43:
            r11.f16176d = r0     // Catch: java.io.EOFException -> Lb5
            r11.f16177e = r0
            int r4 = r11.f16179g
            if (r4 != r1) goto L4e
            r11.f16179g = r0
            r4 = r0
        L4e:
            if (r4 != r0) goto L55
            int r4 = r11.f16180h
            int r4 = r4 + r2
            r11.f16180h = r4
        L55:
            com.google.android.gms.internal.ads.K1 r4 = r11.f16183k
            int r12 = com.google.android.gms.internal.ads.H1.zza(r4, r12, r0, r2)
            if (r12 != r1) goto L5e
            return r1
        L5e:
            int r0 = r11.f16177e
            int r0 = r0 - r12
            r11.f16177e = r0
            if (r0 <= 0) goto L66
            return r3
        L66:
            com.google.android.gms.internal.ads.K1 r4 = r11.f16183k
            long r5 = r11.f16175c
            int r8 = r11.f16176d
            r9 = 0
            r10 = 0
            r7 = 1
            r4.zzs(r5, r7, r8, r9, r10)
            long r0 = r11.f16175c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f16175c = r0
            return r3
        L7a:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L81
            r12 = r3
        L81:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r2.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch: java.io.EOFException -> Lb5
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            r2.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.Sv r12 = com.google.android.gms.internal.ads.C1901Sv.zza(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        L9f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r12.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> Lb5
            r12.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.Sv r12 = com.google.android.gms.internal.ads.C1901Sv.zza(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.S1.a(com.google.android.gms.internal.ads.d1):int");
    }

    private static boolean b(InterfaceC2540d1 interfaceC2540d1, byte[] bArr) {
        interfaceC2540d1.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((Q0) interfaceC2540d1).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean c(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        byte[] bArr = f16170p;
        if (b(interfaceC2540d1, bArr)) {
            this.f16174b = false;
            ((Q0) interfaceC2540d1).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = f16171q;
        if (!b(interfaceC2540d1, bArr2)) {
            return false;
        }
        this.f16174b = true;
        ((Q0) interfaceC2540d1).zzo(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) throws C1901Sv {
        F10.zzb(this.f16183k);
        int i8 = AbstractC2281am0.zza;
        if (interfaceC2540d1.zzf() == 0 && !c(interfaceC2540d1)) {
            throw C1901Sv.zza("Could not find AMR header.", null);
        }
        if (!this.f16185m) {
            this.f16185m = true;
            boolean z8 = this.f16174b;
            String str = true != z8 ? "audio/3gpp" : "audio/amr-wb";
            int i9 = true != z8 ? 8000 : 16000;
            K1 k12 = this.f16183k;
            O4 o42 = new O4();
            o42.zzX(str);
            o42.zzP(f16172r);
            o42.zzy(1);
            o42.zzY(i9);
            k12.zzl(o42.zzad());
        }
        int iA = a(interfaceC2540d1);
        if (this.f16178f) {
            return iA;
        }
        B1 b12 = new B1(-9223372036854775807L, 0L);
        this.f16184l = b12;
        this.f16182j.zzO(b12);
        this.f16178f = true;
        return iA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f16182j = interfaceC2769f1;
        this.f16183k = interfaceC2769f1.zzw(0, 1);
        interfaceC2769f1.zzD();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f16175c = 0L;
        this.f16176d = 0;
        this.f16177e = 0;
        this.f16181i = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) {
        return c(interfaceC2540d1);
    }

    public S1(int i8) {
        this.f16173a = new byte[1];
        this.f16179g = -1;
    }
}
