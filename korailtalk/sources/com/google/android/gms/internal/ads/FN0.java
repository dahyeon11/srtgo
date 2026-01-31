package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class FN0 implements K1 {

    /* renamed from: B, reason: collision with root package name */
    private boolean f12985B;

    /* renamed from: C, reason: collision with root package name */
    private C3040hL0 f12986C;

    /* renamed from: a, reason: collision with root package name */
    private final C4981yN0 f12987a;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2925gL0 f12990d;

    /* renamed from: e, reason: collision with root package name */
    private final C2352bL0 f12991e;

    /* renamed from: f, reason: collision with root package name */
    private EN0 f12992f;

    /* renamed from: g, reason: collision with root package name */
    private Q5 f12993g;

    /* renamed from: o, reason: collision with root package name */
    private int f13001o;

    /* renamed from: p, reason: collision with root package name */
    private int f13002p;

    /* renamed from: q, reason: collision with root package name */
    private int f13003q;

    /* renamed from: r, reason: collision with root package name */
    private int f13004r;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13008v;

    /* renamed from: y, reason: collision with root package name */
    private Q5 f13011y;

    /* renamed from: z, reason: collision with root package name */
    private Q5 f13012z;

    /* renamed from: b, reason: collision with root package name */
    private final BN0 f12988b = new BN0();

    /* renamed from: h, reason: collision with root package name */
    private int f12994h = 1000;

    /* renamed from: i, reason: collision with root package name */
    private long[] f12995i = new long[1000];

    /* renamed from: j, reason: collision with root package name */
    private long[] f12996j = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private long[] f12999m = new long[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f12998l = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    private int[] f12997k = new int[1000];

    /* renamed from: n, reason: collision with root package name */
    private I1[] f13000n = new I1[1000];

    /* renamed from: c, reason: collision with root package name */
    private final MN0 f12989c = new MN0(new InterfaceC3462l40() { // from class: com.google.android.gms.internal.ads.zN0
        @Override // com.google.android.gms.internal.ads.InterfaceC3462l40
        public final void zza(Object obj) {
            InterfaceC2810fL0 interfaceC2810fL0 = ((DN0) obj).zzb;
        }
    });

    /* renamed from: s, reason: collision with root package name */
    private long f13005s = Long.MIN_VALUE;

    /* renamed from: t, reason: collision with root package name */
    private long f13006t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f13007u = Long.MIN_VALUE;

    /* renamed from: x, reason: collision with root package name */
    private boolean f13010x = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13009w = true;

    /* renamed from: A, reason: collision with root package name */
    private boolean f12984A = true;

    protected FN0(C2703eP0 c2703eP0, InterfaceC2925gL0 interfaceC2925gL0, C2352bL0 c2352bL0) {
        this.f12990d = interfaceC2925gL0;
        this.f12991e = c2352bL0;
        this.f12987a = new C4981yN0(c2703eP0);
    }

    private final int a(int i8, int i9, long j8, boolean z8) {
        int i10 = -1;
        for (int i11 = 0; i11 < i9; i11++) {
            long j9 = this.f12999m[i8];
            if (j9 > j8) {
                break;
            }
            if (!z8 || (this.f12998l[i8] & 1) != 0) {
                i10 = i11;
                if (j9 == j8) {
                    break;
                }
            }
            i8++;
            if (i8 == this.f12994h) {
                i8 = 0;
            }
        }
        return i10;
    }

    private final int b(int i8) {
        int i9 = this.f13003q + i8;
        int i10 = this.f12994h;
        return i9 < i10 ? i9 : i9 - i10;
    }

    private final synchronized int c(ZF0 zf0, BE0 be0, boolean z8, boolean z9, BN0 bn0) {
        try {
            be0.zzd = false;
            if (!k()) {
                if (!z9 && !this.f13008v) {
                    Q5 q52 = this.f13012z;
                    if (q52 == null || (!z8 && q52 == this.f12993g)) {
                        return -3;
                    }
                    h(q52, zf0);
                    return -5;
                }
                be0.zzc(4);
                be0.zze = Long.MIN_VALUE;
                return -4;
            }
            Q5 q53 = ((DN0) this.f12989c.zza(this.f13002p + this.f13004r)).zza;
            if (!z8 && q53 == this.f12993g) {
                int iB = b(this.f13004r);
                if (!l(iB)) {
                    be0.zzd = true;
                    return -3;
                }
                be0.zzc(this.f12998l[iB]);
                if (this.f13004r == this.f13001o - 1 && (z9 || this.f13008v)) {
                    be0.zza(536870912);
                }
                be0.zze = this.f12999m[iB];
                bn0.zza = this.f12997k[iB];
                bn0.zzb = this.f12996j[iB];
                bn0.zzc = this.f13000n[iB];
                return -4;
            }
            h(q53, zf0);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long d(long j8, boolean z8, boolean z9) {
        int i8;
        try {
            int i9 = this.f13001o;
            if (i9 != 0) {
                long[] jArr = this.f12999m;
                int i10 = this.f13003q;
                if (j8 >= jArr[i10]) {
                    if (z9 && (i8 = this.f13004r) != i9) {
                        i9 = i8 + 1;
                    }
                    int iA = a(i10, i9, j8, false);
                    if (iA != -1) {
                        return f(iA);
                    }
                }
            }
            return -1L;
        } finally {
        }
    }

    private final synchronized long e() {
        int i8 = this.f13001o;
        if (i8 == 0) {
            return -1L;
        }
        return f(i8);
    }

    private final long f(int i8) {
        long j8 = this.f13006t;
        long jMax = Long.MIN_VALUE;
        if (i8 != 0) {
            int iB = b(i8 - 1);
            for (int i9 = 0; i9 < i8; i9++) {
                jMax = Math.max(jMax, this.f12999m[iB]);
                if ((this.f12998l[iB] & 1) != 0) {
                    break;
                }
                iB--;
                if (iB == -1) {
                    iB = this.f12994h - 1;
                }
            }
        }
        this.f13006t = Math.max(j8, jMax);
        this.f13001o -= i8;
        int i10 = this.f13002p + i8;
        this.f13002p = i10;
        int i11 = this.f13003q + i8;
        this.f13003q = i11;
        int i12 = this.f12994h;
        if (i11 >= i12) {
            this.f13003q = i11 - i12;
        }
        int i13 = this.f13004r - i8;
        this.f13004r = i13;
        if (i13 < 0) {
            this.f13004r = 0;
        }
        this.f12989c.zze(i10);
        if (this.f13001o != 0) {
            return this.f12996j[this.f13003q];
        }
        int i14 = this.f13003q;
        if (i14 == 0) {
            i14 = this.f12994h;
        }
        return this.f12996j[i14 - 1] + this.f12997k[r12];
    }

    private final synchronized void g(long j8, int i8, long j9, int i9, I1 i12) {
        try {
            int i10 = this.f13001o;
            if (i10 > 0) {
                int iB = b(i10 - 1);
                F10.zzd(this.f12996j[iB] + ((long) this.f12997k[iB]) <= j9);
            }
            this.f13008v = (536870912 & i8) != 0;
            this.f13007u = Math.max(this.f13007u, j8);
            int iB2 = b(this.f13001o);
            this.f12999m[iB2] = j8;
            this.f12996j[iB2] = j9;
            this.f12997k[iB2] = i9;
            this.f12998l[iB2] = i8;
            this.f13000n[iB2] = i12;
            this.f12995i[iB2] = 0;
            if (this.f12989c.zzf() || !((DN0) this.f12989c.zzb()).zza.equals(this.f13012z)) {
                Q5 q52 = this.f13012z;
                CN0 cn0 = null;
                if (q52 == null) {
                    throw null;
                }
                this.f12989c.zzc(this.f13002p + this.f13001o, new DN0(q52, InterfaceC2810fL0.zza, cn0));
            }
            int i11 = this.f13001o + 1;
            this.f13001o = i11;
            int i13 = this.f12994h;
            if (i11 == i13) {
                int i14 = i13 + 1000;
                long[] jArr = new long[i14];
                long[] jArr2 = new long[i14];
                long[] jArr3 = new long[i14];
                int[] iArr = new int[i14];
                int[] iArr2 = new int[i14];
                I1[] i1Arr = new I1[i14];
                int i15 = this.f13003q;
                int i16 = i13 - i15;
                System.arraycopy(this.f12996j, i15, jArr2, 0, i16);
                System.arraycopy(this.f12999m, this.f13003q, jArr3, 0, i16);
                System.arraycopy(this.f12998l, this.f13003q, iArr, 0, i16);
                System.arraycopy(this.f12997k, this.f13003q, iArr2, 0, i16);
                System.arraycopy(this.f13000n, this.f13003q, i1Arr, 0, i16);
                System.arraycopy(this.f12995i, this.f13003q, jArr, 0, i16);
                int i17 = this.f13003q;
                System.arraycopy(this.f12996j, 0, jArr2, i16, i17);
                System.arraycopy(this.f12999m, 0, jArr3, i16, i17);
                System.arraycopy(this.f12998l, 0, iArr, i16, i17);
                System.arraycopy(this.f12997k, 0, iArr2, i16, i17);
                System.arraycopy(this.f13000n, 0, i1Arr, i16, i17);
                System.arraycopy(this.f12995i, 0, jArr, i16, i17);
                this.f12996j = jArr2;
                this.f12999m = jArr3;
                this.f12998l = iArr;
                this.f12997k = iArr2;
                this.f13000n = i1Arr;
                this.f12995i = jArr;
                this.f13003q = 0;
                this.f12994h = i14;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void h(Q5 q52, ZF0 zf0) {
        Q5 q53 = this.f12993g;
        C3114i1 c3114i1 = q53 == null ? null : q53.zzq;
        this.f12993g = q52;
        C3114i1 c3114i12 = q52.zzq;
        zf0.zza = q52.zzc(this.f12990d.zza(q52));
        zf0.zzb = this.f12986C;
        if (q53 == null || !AbstractC2281am0.zzG(c3114i1, c3114i12)) {
            C3040hL0 c3040hL0 = q52.zzq != null ? new C3040hL0(new ZK0(new C3268jL0(1), 6001)) : null;
            this.f12986C = c3040hL0;
            zf0.zzb = c3040hL0;
        }
    }

    private final void i() {
        if (this.f12986C != null) {
            this.f12986C = null;
            this.f12993g = null;
        }
    }

    private final synchronized void j() {
        this.f13004r = 0;
        this.f12987a.zzg();
    }

    private final boolean k() {
        return this.f13004r != this.f13001o;
    }

    private final boolean l(int i8) {
        if (this.f12986C != null) {
            return (this.f12998l[i8] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean m(Q5 q52) {
        try {
            this.f13010x = false;
            if (AbstractC2281am0.zzG(q52, this.f13012z)) {
                return false;
            }
            if (this.f12989c.zzf() || !((DN0) this.f12989c.zzb()).zza.equals(q52)) {
                this.f13012z = q52;
            } else {
                this.f13012z = ((DN0) this.f12989c.zzb()).zza;
            }
            boolean z8 = this.f12984A;
            Q5 q53 = this.f13012z;
            this.f12984A = z8 & AbstractC4239rv.zzf(q53.zzn, q53.zzk);
            this.f12985B = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int zza() {
        return this.f13002p;
    }

    public final int zzb() {
        return this.f13002p + this.f13004r;
    }

    public final synchronized int zzc(long j8, boolean z8) {
        int i8 = this.f13004r;
        int iB = b(i8);
        if (k() && j8 >= this.f12999m[iB]) {
            if (j8 > this.f13007u && z8) {
                return this.f13001o - i8;
            }
            int iA = a(iB, this.f13001o - i8, j8, true);
            if (iA == -1) {
                return 0;
            }
            return iA;
        }
        return 0;
    }

    public final int zzd() {
        return this.f13002p + this.f13001o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r9 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(com.google.android.gms.internal.ads.ZF0 r9, com.google.android.gms.internal.ads.BE0 r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.BN0 r7 = r8.f12988b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.c(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzf()
            if (r9 != 0) goto L2b
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L35
            if (r9 == 0) goto L2d
            com.google.android.gms.internal.ads.yN0 r9 = r8.f12987a
            com.google.android.gms.internal.ads.BN0 r11 = r8.f12988b
            r9.zzd(r10, r11)
        L2b:
            r9 = r12
            goto L3e
        L2d:
            com.google.android.gms.internal.ads.yN0 r9 = r8.f12987a
            com.google.android.gms.internal.ads.BN0 r11 = r8.f12988b
            r9.zze(r10, r11)
            goto L38
        L35:
            if (r9 == 0) goto L38
            goto L2b
        L38:
            int r9 = r8.f13004r
            int r9 = r9 + r1
            r8.f13004r = r9
            return r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.FN0.zze(com.google.android.gms.internal.ads.ZF0, com.google.android.gms.internal.ads.BE0, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final /* synthetic */ int zzf(UL0 ul0, int i8, boolean z8) {
        return H1.zza(this, ul0, i8, z8);
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final int zzg(UL0 ul0, int i8, boolean z8, int i9) {
        return this.f12987a.zza(ul0, i8, z8);
    }

    public final synchronized long zzh() {
        return this.f13007u;
    }

    public final synchronized Q5 zzi() {
        if (this.f13010x) {
            return null;
        }
        return this.f13012z;
    }

    public final void zzj(long j8, boolean z8, boolean z9) {
        this.f12987a.zzc(d(j8, false, z9));
    }

    public final void zzk() {
        this.f12987a.zzc(e());
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final void zzl(Q5 q52) {
        this.f13011y = q52;
        boolean zM = m(q52);
        EN0 en0 = this.f12992f;
        if (en0 == null || !zM) {
            return;
        }
        en0.zzM(q52);
    }

    public final void zzm() {
        C3040hL0 c3040hL0 = this.f12986C;
        if (c3040hL0 != null) {
            throw c3040hL0.zza();
        }
    }

    public final void zzn() {
        zzk();
        i();
    }

    public final void zzo() {
        zzp(true);
        i();
    }

    public final void zzp(boolean z8) {
        this.f12987a.zzf();
        this.f13001o = 0;
        this.f13002p = 0;
        this.f13003q = 0;
        this.f13004r = 0;
        this.f13009w = true;
        this.f13005s = Long.MIN_VALUE;
        this.f13006t = Long.MIN_VALUE;
        this.f13007u = Long.MIN_VALUE;
        this.f13008v = false;
        this.f12989c.zzd();
        if (z8) {
            this.f13011y = null;
            this.f13012z = null;
            this.f13010x = true;
            this.f12984A = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final /* synthetic */ void zzq(C4099qh0 c4099qh0, int i8) {
        H1.zzb(this, c4099qh0, i8);
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final void zzr(C4099qh0 c4099qh0, int i8, int i9) {
        this.f12987a.zzh(c4099qh0, i8);
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final void zzs(long j8, int i8, int i9, int i10, I1 i12) {
        if (this.f13009w) {
            if ((i8 & 1) == 0) {
                return;
            } else {
                this.f13009w = false;
            }
        }
        if (this.f12984A) {
            if (j8 < this.f13005s) {
                return;
            }
            if ((i8 & 1) == 0) {
                if (!this.f12985B) {
                    AbstractC2834fc0.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f13012z)));
                    this.f12985B = true;
                }
                i8 |= 1;
            }
        }
        g(j8, i8, (this.f12987a.zzb() - i9) - i10, i9, i12);
    }

    public final void zzt(long j8) {
        this.f13005s = j8;
    }

    public final void zzu(EN0 en0) {
        this.f12992f = en0;
    }

    public final synchronized void zzv(int i8) {
        boolean z8 = false;
        if (i8 >= 0) {
            try {
                if (this.f13004r + i8 <= this.f13001o) {
                    z8 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        F10.zzd(z8);
        this.f13004r += i8;
    }

    public final synchronized boolean zzw() {
        return this.f13008v;
    }

    public final synchronized boolean zzx(boolean z8) {
        boolean z9 = true;
        if (k()) {
            if (((DN0) this.f12989c.zza(this.f13002p + this.f13004r)).zza != this.f12993g) {
                return true;
            }
            return l(b(this.f13004r));
        }
        if (!z8 && !this.f13008v) {
            Q5 q52 = this.f13012z;
            if (q52 == null) {
                z9 = false;
            } else if (q52 == this.f12993g) {
                return false;
            }
        }
        return z9;
    }

    public final synchronized boolean zzy(int i8) {
        j();
        int i9 = this.f13002p;
        if (i8 >= i9 && i8 <= this.f13001o + i9) {
            this.f13005s = Long.MIN_VALUE;
            this.f13004r = i8 - i9;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzz(long r11, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.j()     // Catch: java.lang.Throwable -> L40
            int r0 = r10.f13004r     // Catch: java.lang.Throwable -> L40
            int r2 = r10.b(r0)     // Catch: java.lang.Throwable -> L40
            boolean r1 = r10.k()     // Catch: java.lang.Throwable -> L40
            r7 = 0
            if (r1 == 0) goto L60
            long[] r1 = r10.f12999m     // Catch: java.lang.Throwable -> L40
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L40
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 < 0) goto L60
            long r3 = r10.f13007u     // Catch: java.lang.Throwable -> L40
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            r8 = 1
            if (r1 <= 0) goto L23
            if (r13 == 0) goto L60
            r13 = r8
        L23:
            boolean r1 = r10.f12984A     // Catch: java.lang.Throwable -> L40
            r9 = -1
            if (r1 == 0) goto L49
            int r1 = r10.f13001o     // Catch: java.lang.Throwable -> L40
            int r1 = r1 - r0
            r0 = r7
        L2c:
            if (r0 >= r1) goto L44
            long[] r3 = r10.f12999m     // Catch: java.lang.Throwable -> L40
            r4 = r3[r2]     // Catch: java.lang.Throwable -> L40
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 >= 0) goto L42
            int r2 = r2 + 1
            int r3 = r10.f12994h     // Catch: java.lang.Throwable -> L40
            if (r2 != r3) goto L3d
            r2 = r7
        L3d:
            int r0 = r0 + 1
            goto L2c
        L40:
            r11 = move-exception
            goto L62
        L42:
            r1 = r0
            goto L54
        L44:
            if (r13 == 0) goto L47
            goto L54
        L47:
            r1 = r9
            goto L54
        L49:
            int r13 = r10.f13001o     // Catch: java.lang.Throwable -> L40
            int r3 = r13 - r0
            r6 = 1
            r1 = r10
            r4 = r11
            int r1 = r1.a(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L40
        L54:
            if (r1 != r9) goto L57
            goto L60
        L57:
            r10.f13005s = r11     // Catch: java.lang.Throwable -> L40
            int r11 = r10.f13004r     // Catch: java.lang.Throwable -> L40
            int r11 = r11 + r1
            r10.f13004r = r11     // Catch: java.lang.Throwable -> L40
            monitor-exit(r10)
            return r8
        L60:
            monitor-exit(r10)
            return r7
        L62:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L40
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.FN0.zzz(long, boolean):boolean");
    }
}
