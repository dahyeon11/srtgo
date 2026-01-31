package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class R4 {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f16049a = new C4099qh0(255);

    R4() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(InterfaceC2540d1 interfaceC2540d1, boolean z8) throws C1901Sv {
        zza();
        this.f16049a.zzH(27);
        if (AbstractC2884g1.zzc(interfaceC2540d1, this.f16049a.zzM(), 0, 27, z8) && this.f16049a.zzu() == 1332176723) {
            if (this.f16049a.zzm() != 0) {
                if (z8) {
                    return false;
                }
                throw C1901Sv.zzc("unsupported bit stream revision");
            }
            this.zza = this.f16049a.zzm();
            this.zzb = this.f16049a.zzr();
            this.f16049a.zzs();
            this.f16049a.zzs();
            this.f16049a.zzs();
            int iZzm = this.f16049a.zzm();
            this.zzc = iZzm;
            this.zzd = iZzm + 27;
            this.f16049a.zzH(iZzm);
            if (AbstractC2884g1.zzc(interfaceC2540d1, this.f16049a.zzM(), 0, this.zzc, z8)) {
                for (int i8 = 0; i8 < this.zzc; i8++) {
                    this.zzf[i8] = this.f16049a.zzm();
                    this.zze += this.zzf[i8];
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r10 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r9.zzf() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r9.zzc(1) != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.InterfaceC2540d1 r9, long r10) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r8 = this;
            long r0 = r9.zzf()
            long r2 = r9.zze()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            com.google.android.gms.internal.ads.F10.zzd(r0)
            com.google.android.gms.internal.ads.qh0 r0 = r8.f16049a
            r3 = 4
            r0.zzH(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r4 = r9.zzf()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L2c
            goto L55
        L2c:
            com.google.android.gms.internal.ads.qh0 r4 = r8.f16049a
            byte[] r4 = r4.zzM()
            boolean r4 = com.google.android.gms.internal.ads.AbstractC2884g1.zzc(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L55
            com.google.android.gms.internal.ads.qh0 r0 = r8.f16049a
            r0.zzK(r1)
            com.google.android.gms.internal.ads.qh0 r0 = r8.f16049a
            long r4 = r0.zzu()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L51
            r0 = r9
            com.google.android.gms.internal.ads.Q0 r0 = (com.google.android.gms.internal.ads.Q0) r0
            r0.zzo(r2, r1)
            goto L1a
        L51:
            r9.zzj()
            return r2
        L55:
            if (r0 == 0) goto L5f
            long r3 = r9.zzf()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L66
        L5f:
            int r3 = r9.zzc(r2)
            r4 = -1
            if (r3 != r4) goto L55
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.R4.zzc(com.google.android.gms.internal.ads.d1, long):boolean");
    }
}
