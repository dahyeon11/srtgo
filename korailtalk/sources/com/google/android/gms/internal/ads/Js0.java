package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class Js0 {

    /* renamed from: b */
    private static final Js0 f13701b = (Js0) C5034yt0.zza(new InterfaceC4920xt0() { // from class: com.google.android.gms.internal.ads.Hs0
        @Override // com.google.android.gms.internal.ads.InterfaceC4920xt0
        public final Object zza() {
            Js0 js0 = new Js0();
            js0.zzg(new C3551ls0(C4234rs0.class, C3439kt0.class, new InterfaceC3665ms0() { // from class: com.google.android.gms.internal.ads.Is0
                @Override // com.google.android.gms.internal.ads.InterfaceC3665ms0
                public final InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0) {
                    return ((C4234rs0) c5138zo0).zza(c1976Uo0);
                }
            }));
            return js0;
        }
    });

    /* renamed from: a */
    private final AtomicReference f13702a = new AtomicReference(new C4806wt0(new C4123qt0(), null));

    public static Js0 zzc() {
        return f13701b;
    }

    public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) {
        return ((C4806wt0) this.f13702a.get()).zza(interfaceC4009pt0, c1976Uo0);
    }

    public final AbstractC1730Oo0 zzb(InterfaceC4009pt0 interfaceC4009pt0) {
        return ((C4806wt0) this.f13702a.get()).zzb(interfaceC4009pt0);
    }

    public final InterfaceC4009pt0 zzd(C5138zo0 c5138zo0, Class cls, C1976Uo0 c1976Uo0) {
        return ((C4806wt0) this.f13702a.get()).zzc(c5138zo0, cls, c1976Uo0);
    }

    public final InterfaceC4009pt0 zze(AbstractC1730Oo0 abstractC1730Oo0, Class cls) {
        return ((C4806wt0) this.f13702a.get()).zzd(abstractC1730Oo0, cls);
    }

    public final synchronized void zzf(AbstractC3437ks0 abstractC3437ks0) {
        C4123qt0 c4123qt0 = new C4123qt0((C4806wt0) this.f13702a.get());
        c4123qt0.zza(abstractC3437ks0);
        this.f13702a.set(new C4806wt0(c4123qt0, null));
    }

    public final synchronized void zzg(AbstractC3893os0 abstractC3893os0) {
        C4123qt0 c4123qt0 = new C4123qt0((C4806wt0) this.f13702a.get());
        c4123qt0.zzb(abstractC3893os0);
        this.f13702a.set(new C4806wt0(c4123qt0, null));
    }

    public final synchronized void zzh(Os0 os0) {
        C4123qt0 c4123qt0 = new C4123qt0((C4806wt0) this.f13702a.get());
        c4123qt0.zzc(os0);
        this.f13702a.set(new C4806wt0(c4123qt0, null));
    }

    public final synchronized void zzi(Ss0 ss0) {
        C4123qt0 c4123qt0 = new C4123qt0((C4806wt0) this.f13702a.get());
        c4123qt0.zzd(ss0);
        this.f13702a.set(new C4806wt0(c4123qt0, null));
    }

    public final boolean zzj(InterfaceC4009pt0 interfaceC4009pt0) {
        return ((C4806wt0) this.f13702a.get()).zzi(interfaceC4009pt0);
    }

    public final boolean zzk(InterfaceC4009pt0 interfaceC4009pt0) {
        return ((C4806wt0) this.f13702a.get()).zzj(interfaceC4009pt0);
    }
}
