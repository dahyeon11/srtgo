package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.g90 */
/* loaded from: classes2.dex */
final class C2901g90 {

    /* renamed from: a */
    private final InterfaceC1418Hb0 f19306a;

    /* renamed from: b */
    private final InterfaceC2797fF f19307b;

    /* renamed from: c */
    private final Executor f19308c;

    /* renamed from: d */
    private C2786f90 f19309d;

    public C2901g90(InterfaceC1418Hb0 interfaceC1418Hb0, InterfaceC2797fF interfaceC2797fF, Executor executor) {
        this.f19306a = interfaceC1418Hb0;
        this.f19307b = interfaceC2797fF;
        this.f19308c = executor;
    }

    public final InterfaceC1827Rb0 d() {
        C1825Ra0 c1825Ra0Zzg = this.f19307b.zzg();
        return this.f19306a.zzc(c1825Ra0Zzg.zzd, c1825Ra0Zzg.zzf, c1825Ra0Zzg.zzj);
    }

    public final com.google.common.util.concurrent.C zzc() {
        com.google.common.util.concurrent.C cZze;
        C2786f90 c2786f90 = this.f19309d;
        if (c2786f90 != null) {
            return AbstractC1483In0.zzh(c2786f90);
        }
        if (((Boolean) AbstractC4897xi.zza.zze()).booleanValue()) {
            cZze = AbstractC1483In0.zze(AbstractC1483In0.zzm(AbstractC5136zn0.zzu(this.f19307b.zzb().zze(this.f19306a.zza())), new C2557d90(this), this.f19308c), YT.class, new C2442c90(this), this.f19308c);
        } else {
            C2786f90 c2786f902 = new C2786f90(null, d(), null);
            this.f19309d = c2786f902;
            cZze = AbstractC1483In0.zzh(c2786f902);
        }
        return AbstractC1483In0.zzm(cZze, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.b90
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return (C2786f90) obj;
            }
        }, this.f19308c);
    }
}
