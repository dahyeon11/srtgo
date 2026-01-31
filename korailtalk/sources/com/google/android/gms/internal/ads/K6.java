package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class K6 implements U6 {

    /* renamed from: a, reason: collision with root package name */
    private Q5 f13743a;

    /* renamed from: b, reason: collision with root package name */
    private C2132Yk0 f13744b;

    /* renamed from: c, reason: collision with root package name */
    private K1 f13745c;

    public K6(String str) {
        O4 o42 = new O4();
        o42.zzX(str);
        this.f13743a = o42.zzad();
    }

    @Override // com.google.android.gms.internal.ads.U6
    public final void zza(C4099qh0 c4099qh0) {
        F10.zzb(this.f13744b);
        int i8 = AbstractC2281am0.zza;
        long jZze = this.f13744b.zze();
        long jZzf = this.f13744b.zzf();
        if (jZze == -9223372036854775807L || jZzf == -9223372036854775807L) {
            return;
        }
        Q5 q52 = this.f13743a;
        if (jZzf != q52.zzr) {
            O4 o4Zzb = q52.zzb();
            o4Zzb.zzab(jZzf);
            Q5 q5Zzad = o4Zzb.zzad();
            this.f13743a = q5Zzad;
            this.f13745c.zzl(q5Zzad);
        }
        int iZzb = c4099qh0.zzb();
        this.f13745c.zzq(c4099qh0, iZzb);
        this.f13745c.zzs(jZze, 1, iZzb, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.U6
    public final void zzb(C2132Yk0 c2132Yk0, InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        this.f13744b = c2132Yk0;
        c3011h7.zzc();
        K1 k1Zzw = interfaceC2769f1.zzw(c3011h7.zza(), 5);
        this.f13745c = k1Zzw;
        k1Zzw.zzl(this.f13743a);
    }
}
