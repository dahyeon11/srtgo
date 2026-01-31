package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class K80 implements InterfaceC3358k90 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2797fF f13754a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f13755b = AbstractC2285ao0.zzb();

    public final InterfaceC2797fF zza() {
        return this.f13754a;
    }

    public final com.google.common.util.concurrent.C zzb(C3472l90 c3472l90, InterfaceC3244j90 interfaceC3244j90, InterfaceC2797fF interfaceC2797fF) {
        InterfaceC2682eF interfaceC2682eFZza = interfaceC3244j90.zza(c3472l90.zzb);
        interfaceC2682eFZza.zzb(new C3814o90(true));
        InterfaceC2797fF interfaceC2797fF2 = (InterfaceC2797fF) interfaceC2682eFZza.zzh();
        this.f13754a = interfaceC2797fF2;
        final HD hdZzb = interfaceC2797fF2.zzb();
        final C1786Qb0 c1786Qb0 = new C1786Qb0();
        return AbstractC1483In0.zzm(AbstractC1483In0.zzn(AbstractC5136zn0.zzu(hdZzb.zzj()), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.I80
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                C1457Ia0 c1457Ia0 = (C1457Ia0) obj;
                c1786Qb0.zzb = c1457Ia0;
                Iterator it = c1457Ia0.zzb.zza.iterator();
                boolean z8 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((C4654va0) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z8 = true;
                        }
                    } else if (z8) {
                        return hdZzb.zzi(AbstractC1483In0.zzh(c1457Ia0));
                    }
                }
                return AbstractC1483In0.zzh(null);
            }
        }, this.f13755b), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.J80
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                C1786Qb0 c1786Qb02 = c1786Qb0;
                c1786Qb02.zzc = (YC) obj;
                return c1786Qb02;
            }
        }, this.f13755b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358k90
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.C zzc(C3472l90 c3472l90, InterfaceC3244j90 interfaceC3244j90, Object obj) {
        return zzb(c3472l90, interfaceC3244j90, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358k90
    public final /* synthetic */ Object zzd() {
        return this.f13754a;
    }
}
