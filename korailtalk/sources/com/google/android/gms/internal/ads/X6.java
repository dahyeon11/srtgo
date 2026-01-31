package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class X6 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2132Yk0 f17121a;

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f17122b = new C4099qh0();

    /* renamed from: c, reason: collision with root package name */
    private final int f17123c;

    public X6(int i8, C2132Yk0 c2132Yk0, int i9) {
        this.f17123c = i8;
        this.f17121a = c2132Yk0;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 zza(InterfaceC2540d1 interfaceC2540d1, long j8) {
        int iZza;
        int iZza2;
        long jZzf = interfaceC2540d1.zzf();
        int iMin = (int) Math.min(112800L, interfaceC2540d1.zzd() - jZzf);
        this.f17122b.zzH(iMin);
        ((Q0) interfaceC2540d1).zzm(this.f17122b.zzM(), 0, iMin, false);
        C4099qh0 c4099qh0 = this.f17122b;
        int iZze = c4099qh0.zze();
        long j9 = -1;
        long j10 = -9223372036854775807L;
        long j11 = -1;
        while (c4099qh0.zzb() >= 188 && (iZza2 = (iZza = AbstractC3239j7.zza(c4099qh0.zzM(), c4099qh0.zzd(), iZze)) + 188) <= iZze) {
            long jZzb = AbstractC3239j7.zzb(c4099qh0, iZza, this.f17123c);
            if (jZzb != -9223372036854775807L) {
                long jZzb2 = this.f17121a.zzb(jZzb);
                if (jZzb2 <= j8) {
                    j11 = iZza;
                    if (100000 + jZzb2 <= j8) {
                        j10 = jZzb2;
                    }
                } else if (j10 == -9223372036854775807L) {
                    return K0.zzd(jZzb2, jZzf);
                }
                return K0.zze(jZzf + j11);
            }
            c4099qh0.zzK(iZza2);
            j9 = iZza2;
        }
        return j10 != -9223372036854775807L ? K0.zzf(j10, jZzf + j9) : K0.zza;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final void zzb() {
        byte[] bArr = AbstractC2281am0.zzf;
        int length = bArr.length;
        this.f17122b.zzI(bArr, 0);
    }
}
