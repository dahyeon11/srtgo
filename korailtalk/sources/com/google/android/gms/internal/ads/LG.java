package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class LG extends AbstractC4400tI implements VF, BG {

    /* renamed from: b, reason: collision with root package name */
    private final C4654va0 f14268b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f14269c;

    public LG(Set set, C4654va0 c4654va0) {
        super(set);
        this.f14269c = new AtomicBoolean();
        this.f14268b = c4654va0;
    }

    private final void zzb() {
        H1.f2 f2Var;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhT)).booleanValue() && this.f14269c.compareAndSet(false, true) && (f2Var = this.f14268b.zzaf) != null && f2Var.zza == 3) {
            a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.KG
                @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
                public final void zza(Object obj) {
                    this.zza.b((NG) obj);
                }
            });
        }
    }

    final /* synthetic */ void b(NG ng) {
        ng.zzh(this.f14268b.zzaf);
    }

    @Override // com.google.android.gms.internal.ads.BG
    public final void zzg() {
        if (this.f14268b.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void zzr() {
        int i8 = this.f14268b.zzb;
        if (i8 == 2 || i8 == 5 || i8 == 4 || i8 == 6 || i8 == 7) {
            zzb();
        }
    }
}
