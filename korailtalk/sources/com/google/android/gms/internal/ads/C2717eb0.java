package com.google.android.gms.internal.ads;

import H1.C0591z;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.eb0 */
/* loaded from: classes2.dex */
public final class C2717eb0 {

    /* renamed from: a */
    private final C4654va0 f18787a;

    /* renamed from: b */
    private final C4996ya0 f18788b;

    /* renamed from: c */
    private final C4535uW f18789c;

    /* renamed from: d */
    private final C3865oe0 f18790d;

    /* renamed from: e */
    private final RunnableC4660vd0 f18791e;

    /* renamed from: f */
    private final IA f18792f;

    public C2717eb0(C4535uW c4535uW, C3865oe0 c3865oe0, C4654va0 c4654va0, C4996ya0 c4996ya0, IA ia, RunnableC4660vd0 runnableC4660vd0) {
        this.f18787a = c4654va0;
        this.f18788b = c4996ya0;
        this.f18789c = c4535uW;
        this.f18790d = c3865oe0;
        this.f18792f = ia;
        this.f18791e = runnableC4660vd0;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i8) {
        if (!this.f18787a.zzaj) {
            this.f18790d.zzc(str, this.f18791e);
        } else {
            this.f18789c.zzd(new C4877xW(G1.u.zzB().currentTimeMillis(), this.f18788b.zzb, str, i8));
        }
    }

    public final void zzc(List list, int i8) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1483In0.zzr((((Boolean) H1.C.zzc().zza(AbstractC4439th.zzka)).booleanValue() && IA.zzj(str)) ? this.f18792f.zzb(str, C0591z.zze()) : AbstractC1483In0.zzh(str), new C2488cb0(this, i8), AbstractC4805wt.zza);
        }
    }
}
