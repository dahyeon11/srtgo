package com.google.android.gms.internal.ads;

import android.content.Context;
import y1.EnumC6522c;

/* renamed from: com.google.android.gms.internal.ads.pY */
/* loaded from: classes2.dex */
final class C3968pY implements MK {

    /* renamed from: a */
    private final C4654va0 f21773a;

    /* renamed from: b */
    private final InterfaceC1852Ro f21774b;

    /* renamed from: c */
    private final EnumC6522c f21775c;

    /* renamed from: d */
    private TF f21776d = null;

    C3968pY(C4654va0 c4654va0, InterfaceC1852Ro interfaceC1852Ro, EnumC6522c enumC6522c) {
        this.f21773a = c4654va0;
        this.f21774b = interfaceC1852Ro;
        this.f21775c = enumC6522c;
    }

    @Override // com.google.android.gms.internal.ads.MK
    public final void zza(boolean z8, Context context, MF mf) throws LK {
        boolean zZzs;
        try {
            EnumC6522c enumC6522c = EnumC6522c.BANNER;
            int iOrdinal = this.f21775c.ordinal();
            if (iOrdinal == 1) {
                zZzs = this.f21774b.zzs(r2.b.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzs = this.f21774b.zzr(r2.b.wrap(context));
                    }
                    throw new LK("Adapter failed to show.");
                }
                zZzs = this.f21774b.zzt(r2.b.wrap(context));
            }
            if (zZzs) {
                if (this.f21776d == null) {
                    return;
                }
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbx)).booleanValue() || this.f21773a.zzZ != 2) {
                    return;
                }
                this.f21776d.zza();
                return;
            }
            throw new LK("Adapter failed to show.");
        } catch (Throwable th) {
            throw new LK(th);
        }
    }

    public final void zzb(TF tf) {
        this.f21776d = tf;
    }
}
