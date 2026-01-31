package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class P80 implements InterfaceC3358k90 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3358k90 f15217a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3358k90 f15218b;

    /* renamed from: c, reason: collision with root package name */
    private final C2605dc0 f15219c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15220d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC2797fF f15221e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f15222f;

    public P80(InterfaceC3358k90 interfaceC3358k90, InterfaceC3358k90 interfaceC3358k902, C2605dc0 c2605dc0, String str, Executor executor) {
        this.f15217a = interfaceC3358k90;
        this.f15218b = interfaceC3358k902;
        this.f15219c = c2605dc0;
        this.f15220d = str;
        this.f15222f = executor;
    }

    private final com.google.common.util.concurrent.C c(C1786Qb0 c1786Qb0, C3472l90 c3472l90) {
        InterfaceC2797fF interfaceC2797fF = c1786Qb0.zza;
        this.f15221e = interfaceC2797fF;
        if (c1786Qb0.zzc != null) {
            if (interfaceC2797fF.zzf() != null) {
                c1786Qb0.zzc.zzo().zzl(c1786Qb0.zza.zzf());
            }
            return AbstractC1483In0.zzh(c1786Qb0.zzc);
        }
        interfaceC2797fF.zzb().zzl(c1786Qb0.zzb);
        return ((C2213a90) this.f15217a).zzb(c3472l90, null, c1786Qb0.zza);
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(C3472l90 c3472l90, O80 o80, InterfaceC3244j90 interfaceC3244j90, InterfaceC2797fF interfaceC2797fF, U80 u80) {
        if (u80 != null) {
            O80 o802 = new O80(o80.zza, o80.zzb, o80.zzc, o80.zzd, o80.zze, o80.zzf, u80.zza);
            if (u80.zzc != null) {
                this.f15221e = null;
                this.f15219c.zze(o802);
                return c(u80.zzc, c3472l90);
            }
            com.google.common.util.concurrent.C cZza = this.f15219c.zza(o802);
            if (cZza != null) {
                this.f15221e = null;
                return AbstractC1483In0.zzn(cZza, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.L80
                    @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                    public final com.google.common.util.concurrent.C zza(Object obj) {
                        return this.zza.b((C2261ac0) obj);
                    }
                }, this.f15222f);
            }
            this.f15219c.zze(o802);
            c3472l90 = new C3472l90(c3472l90.zzb, u80.zzb);
        }
        com.google.common.util.concurrent.C cZzb = ((C2213a90) this.f15217a).zzb(c3472l90, interfaceC3244j90, interfaceC2797fF);
        this.f15221e = interfaceC2797fF;
        return cZzb;
    }

    final /* synthetic */ com.google.common.util.concurrent.C b(C2261ac0 c2261ac0) throws RS {
        InterfaceC2490cc0 interfaceC2490cc0;
        if (c2261ac0 == null || c2261ac0.zza == null || (interfaceC2490cc0 = c2261ac0.zzb) == null) {
            throw new RS(1, "Empty prefetch");
        }
        C1589Lf c1589LfZzd = C1957Uf.zzd();
        C1466If c1466IfZza = C1507Jf.zza();
        c1466IfZza.zzf(EnumC1629Mf.IN_MEMORY);
        c1466IfZza.zzh(C1752Pf.zzi());
        c1589LfZzd.zzd(c1466IfZza);
        c2261ac0.zza.zza.zzb().zzc().zzm((C1957Uf) c1589LfZzd.zzbr());
        return c(c2261ac0.zza, ((O80) interfaceC2490cc0).zzb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358k90
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC2797fF zzd() {
        return this.f15221e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358k90
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.C zzc(C3472l90 c3472l90, InterfaceC3244j90 interfaceC3244j90, Object obj) {
        return zzf(c3472l90, interfaceC3244j90, null);
    }

    public final synchronized com.google.common.util.concurrent.C zzf(final C3472l90 c3472l90, final InterfaceC3244j90 interfaceC3244j90, InterfaceC2797fF interfaceC2797fF) {
        InterfaceC2682eF interfaceC2682eFZza = interfaceC3244j90.zza(c3472l90.zzb);
        interfaceC2682eFZza.zza(new Q80(this.f15220d));
        final InterfaceC2797fF interfaceC2797fF2 = (InterfaceC2797fF) interfaceC2682eFZza.zzh();
        interfaceC2797fF2.zzg();
        interfaceC2797fF2.zzg();
        H1.Y1 y12 = interfaceC2797fF2.zzg().zzd;
        if (y12.zzs == null && y12.zzx == null) {
            C1825Ra0 c1825Ra0Zzg = interfaceC2797fF2.zzg();
            final O80 o80 = new O80(interfaceC3244j90, c3472l90, c1825Ra0Zzg.zzd, c1825Ra0Zzg.zzf, this.f15222f, c1825Ra0Zzg.zzj, null);
            return AbstractC1483In0.zzn(AbstractC5136zn0.zzu(((V80) this.f15218b).zzb(c3472l90, interfaceC3244j90, interfaceC2797fF2)), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.M80
                @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                public final com.google.common.util.concurrent.C zza(Object obj) {
                    return this.zza.a(c3472l90, o80, interfaceC3244j90, interfaceC2797fF2, (U80) obj);
                }
            }, this.f15222f);
        }
        this.f15221e = interfaceC2797fF2;
        return ((C2213a90) this.f15217a).zzb(c3472l90, interfaceC3244j90, interfaceC2797fF2);
    }
}
