package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import e3.AbstractC5358c;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.r4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4144r4 implements InterfaceC2425c1 {

    /* renamed from: H, reason: collision with root package name */
    private static final Q5 f22341H;

    /* renamed from: A, reason: collision with root package name */
    private int f22342A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f22343B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC2769f1 f22344C;

    /* renamed from: D, reason: collision with root package name */
    private K1[] f22345D;

    /* renamed from: E, reason: collision with root package name */
    private K1[] f22346E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f22347F;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3122i5 f22348a;

    /* renamed from: b, reason: collision with root package name */
    private final List f22349b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f22350c;

    /* renamed from: d, reason: collision with root package name */
    private final C4099qh0 f22351d;

    /* renamed from: e, reason: collision with root package name */
    private final C4099qh0 f22352e;

    /* renamed from: f, reason: collision with root package name */
    private final C4099qh0 f22353f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f22354g;

    /* renamed from: h, reason: collision with root package name */
    private final C4099qh0 f22355h;

    /* renamed from: i, reason: collision with root package name */
    private final F2 f22356i;

    /* renamed from: j, reason: collision with root package name */
    private final C4099qh0 f22357j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayDeque f22358k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayDeque f22359l;

    /* renamed from: m, reason: collision with root package name */
    private AbstractC2394bl0 f22360m;

    /* renamed from: n, reason: collision with root package name */
    private int f22361n;

    /* renamed from: o, reason: collision with root package name */
    private int f22362o;

    /* renamed from: p, reason: collision with root package name */
    private long f22363p;

    /* renamed from: q, reason: collision with root package name */
    private int f22364q;

    /* renamed from: r, reason: collision with root package name */
    private C4099qh0 f22365r;

    /* renamed from: s, reason: collision with root package name */
    private long f22366s;

    /* renamed from: t, reason: collision with root package name */
    private int f22367t;

    /* renamed from: u, reason: collision with root package name */
    private long f22368u;

    /* renamed from: v, reason: collision with root package name */
    private long f22369v;

    /* renamed from: w, reason: collision with root package name */
    private long f22370w;

    /* renamed from: x, reason: collision with root package name */
    private C4031q4 f22371x;

    /* renamed from: y, reason: collision with root package name */
    private int f22372y;

    /* renamed from: z, reason: collision with root package name */
    private int f22373z;

    @Deprecated
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.m4
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new C4144r4(InterfaceC3122i5.zza, 32)};
        }
    };

    /* renamed from: G, reason: collision with root package name */
    private static final byte[] f22340G = {-94, 57, 79, 82, 90, -101, 79, AbstractC5358c.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    static {
        O4 o42 = new O4();
        o42.zzX("application/x-emsg");
        f22341H = o42.zzad();
    }

    @Deprecated
    public C4144r4() {
        this(InterfaceC3122i5.zza, 32, null, null, AbstractC2394bl0.zzm(), null);
    }

    private static int a(int i8) throws C1901Sv {
        if (i8 >= 0) {
            return i8;
        }
        throw C1901Sv.zza("Unexpected negative value: " + i8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.C3114i1 b(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4144r4.b(java.util.List):com.google.android.gms.internal.ads.i1");
    }

    private final void c() {
        this.f22361n = 0;
        this.f22364q = 0;
    }

    private static void d(C4099qh0 c4099qh0, int i8, F4 f42) throws C1901Sv {
        c4099qh0.zzK(i8 + 8);
        int iZzg = c4099qh0.zzg();
        if ((iZzg & 1) != 0) {
            throw C1901Sv.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z8 = (iZzg & 2) != 0;
        int iZzp = c4099qh0.zzp();
        if (iZzp == 0) {
            Arrays.fill(f42.zzl, 0, f42.zze, false);
            return;
        }
        int i9 = f42.zze;
        if (iZzp != i9) {
            throw C1901Sv.zza("Senc sample count " + iZzp + " is different from fragment sample count" + i9, null);
        }
        Arrays.fill(f42.zzl, 0, iZzp, z8);
        f42.zza(c4099qh0.zzb());
        C4099qh0 c4099qh02 = f42.zzn;
        c4099qh0.zzG(c4099qh02.zzM(), 0, c4099qh02.zze());
        f42.zzn.zzK(0);
        f42.zzo = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(long r47) throws com.google.android.gms.internal.ads.C1901Sv {
        /*
            Method dump skipped, instructions count: 1818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4144r4.e(long):void");
    }

    private static final C3461l4 f(SparseArray sparseArray, int i8) {
        if (sparseArray.size() == 1) {
            return (C3461l4) sparseArray.valueAt(0);
        }
        C3461l4 c3461l4 = (C3461l4) sparseArray.get(i8);
        c3461l4.getClass();
        return c3461l4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0243, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0245, code lost:
    
        r6.zzs(r7, r22, r26.f22372y, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0258, code lost:
    
        if (r26.f22359l.isEmpty() != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025a, code lost:
    
        r1 = (com.google.android.gms.internal.ads.C3917p4) r26.f22359l.removeFirst();
        r26.f22367t -= r1.zzc;
        r5 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026d, code lost:
    
        if (r1.zzb == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026f, code lost:
    
        r5 = r5 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0270, code lost:
    
        r2 = r26.f22345D;
        r15 = r2.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0274, code lost:
    
        if (r14 >= r15) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0276, code lost:
    
        r2[r14].zzs(r5, 1, r1.zzc, r26.f22367t, null);
        r14 = r14 + 1;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0299, code lost:
    
        if (r4.zzk() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x029b, code lost:
    
        r26.f22371x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x029e, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x029f, code lost:
    
        r26.f22361n = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02a2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r26.f22361n != 3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        r2 = r4.zzb();
        r26.f22372y = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r4.zzf >= r4.zzi) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        ((com.google.android.gms.internal.ads.Q0) r1).zzo(r2, false);
        r1 = r4.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        r2 = r4.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        if (r1 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        r2.zzL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        if (r4.zzb.zzb(r4.zzf) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
    
        r2.zzL(r2.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
    
        if (r4.zzk() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
    
        r26.f22371x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (r4.zzd.zza.zzg != r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        r26.f22372y = r2 - 8;
        ((com.google.android.gms.internal.ads.Q0) r1).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        if ("audio/ac4".equals(r4.zzd.zza.zzf.zzn) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0101, code lost:
    
        r26.f22373z = r4.zzc(r26.f22372y, 7);
        com.google.android.gms.internal.ads.D0.zzb(r26.f22372y, r26.f22355h);
        r4.zza.zzq(r26.f22355h, 7);
        r2 = r26.f22373z + 7;
        r26.f22373z = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011e, code lost:
    
        r2 = r4.zzc(r26.f22372y, 0);
        r26.f22373z = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0126, code lost:
    
        r26.f22372y += r2;
        r26.f22361n = 4;
        r26.f22342A = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0130, code lost:
    
        r2 = r4.zzd.zza;
        r6 = r4.zza;
        r7 = r4.zze();
        r11 = r2.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013c, code lost:
    
        if (r11 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
    
        r2 = r26.f22373z;
        r5 = r26.f22372y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0142, code lost:
    
        if (r2 >= r5) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0144, code lost:
    
        r26.f22373z += r6.zzf(r1, r5 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014f, code lost:
    
        r12 = r26.f22352e.zzM();
        r12[0] = 0;
        r12[r3] = 0;
        r12[2] = 0;
        r14 = r11 + 1;
        r11 = 4 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0165, code lost:
    
        if (r26.f22373z >= r26.f22372y) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0167, code lost:
    
        r13 = r26.f22342A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016b, code lost:
    
        if (r13 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016d, code lost:
    
        ((com.google.android.gms.internal.ads.Q0) r1).zzn(r12, r11, r14, r10);
        r26.f22352e.zzK(r10);
        r13 = r26.f22352e.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017e, code lost:
    
        if (r13 <= 0) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0180, code lost:
    
        r26.f22342A = r13 - 1;
        r26.f22351d.zzK(r10);
        r6.zzq(r26.f22351d, 4);
        r6.zzq(r26.f22352e, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        if (r26.f22346E.length <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019b, code lost:
    
        r13 = r2.zzf.zzn;
        r17 = r12[4];
        r10 = com.google.android.gms.internal.ads.AbstractC5148zt0.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a9, code lost:
    
        if ("video/avc".equals(r13) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ad, code lost:
    
        if ((r17 & 31) == r5) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b6, code lost:
    
        if ("video/hevc".equals(r13) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bd, code lost:
    
        if (((r17 & 126) >> r3) != 39) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c0, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c1, code lost:
    
        r26.f22343B = r10;
        r26.f22373z += 5;
        r26.f22372y += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ce, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d7, code lost:
    
        throw com.google.android.gms.internal.ads.C1901Sv.zza("Invalid NAL length", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01da, code lost:
    
        if (r26.f22343B == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01dc, code lost:
    
        r26.f22353f.zzH(r13);
        ((com.google.android.gms.internal.ads.Q0) r1).zzn(r26.f22353f.zzM(), 0, r26.f22342A, false);
        r6.zzq(r26.f22353f, r26.f22342A);
        r5 = r26.f22342A;
        r9 = r26.f22353f;
        r9 = com.google.android.gms.internal.ads.AbstractC5148zt0.zzb(r9.zzM(), r9.zze());
        r26.f22353f.zzK("video/hevc".equals(r2.zzf.zzn) ? 1 : 0);
        r26.f22353f.zzJ(r9);
        com.google.android.gms.internal.ads.N0.zza(r7, r26.f22353f, r26.f22346E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0221, code lost:
    
        r5 = r6.zzf(r1, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0227, code lost:
    
        r26.f22373z += r5;
        r26.f22342A -= r5;
        r5 = 6;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0234, code lost:
    
        r22 = r4.zza();
        r1 = r4.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023c, code lost:
    
        if (r1 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x023e, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.InterfaceC2540d1 r27, com.google.android.gms.internal.ads.C5050z1 r28) throws com.google.android.gms.internal.ads.C1901Sv, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4144r4.zzb(com.google.android.gms.internal.ads.d1, com.google.android.gms.internal.ads.z1):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return this.f22360m;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f22344C = interfaceC2769f1;
        c();
        K1[] k1Arr = new K1[2];
        this.f22345D = k1Arr;
        int i8 = 0;
        K1[] k1Arr2 = (K1[]) AbstractC2281am0.zzP(k1Arr, 0);
        this.f22345D = k1Arr2;
        for (K1 k12 : k1Arr2) {
            k12.zzl(f22341H);
        }
        this.f22346E = new K1[this.f22349b.size()];
        int i9 = 100;
        while (i8 < this.f22346E.length) {
            int i10 = i9 + 1;
            K1 k1Zzw = this.f22344C.zzw(i9, 3);
            k1Zzw.zzl((Q5) this.f22349b.get(i8));
            this.f22346E[i8] = k1Zzw;
            i8++;
            i9 = i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        int size = this.f22350c.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((C4031q4) this.f22350c.valueAt(i8)).zzi();
        }
        this.f22359l.clear();
        this.f22367t = 0;
        this.f22368u = j9;
        this.f22358k.clear();
        c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) {
        G1 g1Zza = C4.zza(interfaceC2540d1);
        this.f22360m = g1Zza != null ? AbstractC2394bl0.zzn(g1Zza) : AbstractC2394bl0.zzm();
        return g1Zza == null;
    }

    public C4144r4(InterfaceC3122i5 interfaceC3122i5, int i8) {
        this(interfaceC3122i5, 32, null, null, AbstractC2394bl0.zzm(), null);
    }

    public C4144r4(InterfaceC3122i5 interfaceC3122i5, int i8, C2132Yk0 c2132Yk0, D4 d42, List list, K1 k12) {
        this.f22348a = interfaceC3122i5;
        this.f22349b = Collections.unmodifiableList(list);
        this.f22356i = new F2();
        this.f22357j = new C4099qh0(16);
        this.f22351d = new C4099qh0(AbstractC5148zt0.zza);
        this.f22352e = new C4099qh0(5);
        this.f22353f = new C4099qh0();
        byte[] bArr = new byte[16];
        this.f22354g = bArr;
        this.f22355h = new C4099qh0(bArr);
        this.f22358k = new ArrayDeque();
        this.f22359l = new ArrayDeque();
        this.f22350c = new SparseArray();
        this.f22360m = AbstractC2394bl0.zzm();
        this.f22369v = -9223372036854775807L;
        this.f22368u = -9223372036854775807L;
        this.f22370w = -9223372036854775807L;
        this.f22344C = InterfaceC2769f1.zza;
        this.f22345D = new K1[0];
        this.f22346E = new K1[0];
    }
}
