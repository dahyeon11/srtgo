package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.uM0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4523uM0 extends AbstractC3726nM0 {

    /* renamed from: h */
    private final HashMap f23037h = new HashMap();

    /* renamed from: i */
    private Handler f23038i;

    /* renamed from: j */
    private InterfaceC4279sE0 f23039j;

    protected AbstractC4523uM0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0
    protected final void f() {
        for (C4409tM0 c4409tM0 : this.f23037h.values()) {
            c4409tM0.zza.zzi(c4409tM0.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0
    protected final void g() {
        for (C4409tM0 c4409tM0 : this.f23037h.values()) {
            c4409tM0.zza.zzk(c4409tM0.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0
    protected void h(InterfaceC4279sE0 interfaceC4279sE0) {
        this.f23039j = interfaceC4279sE0;
        this.f23038i = AbstractC2281am0.zzx(null);
    }

    protected abstract void k(Object obj, PM0 pm0, RG rg);

    protected final void l(final Object obj, PM0 pm0) {
        F10.zzd(!this.f23037h.containsKey(obj));
        OM0 om0 = new OM0() { // from class: com.google.android.gms.internal.ads.rM0
            @Override // com.google.android.gms.internal.ads.OM0
            public final void zza(PM0 pm02, RG rg) {
                this.zza.k(obj, pm02, rg);
            }
        };
        C4295sM0 c4295sM0 = new C4295sM0(this, obj);
        this.f23037h.put(obj, new C4409tM0(pm0, om0, c4295sM0));
        Handler handler = this.f23038i;
        handler.getClass();
        pm0.zzh(handler, c4295sM0);
        Handler handler2 = this.f23038i;
        handler2.getClass();
        pm0.zzg(handler2, c4295sM0);
        pm0.zzm(om0, this.f23039j, a());
        if (j()) {
            return;
        }
        pm0.zzi(om0);
    }

    protected int m(Object obj, int i8) {
        return 0;
    }

    protected long n(Object obj, long j8, NM0 nm0) {
        return j8;
    }

    protected abstract NM0 o(Object obj, NM0 nm0);

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public abstract /* synthetic */ void zzG(LM0 lm0);

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public abstract /* synthetic */ LM0 zzI(NM0 nm0, C2703eP0 c2703eP0, long j8);

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public abstract /* synthetic */ C3658mp zzJ();

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0
    protected void zzq() {
        for (C4409tM0 c4409tM0 : this.f23037h.values()) {
            c4409tM0.zza.zzp(c4409tM0.zzb);
            c4409tM0.zza.zzs(c4409tM0.zzc);
            c4409tM0.zza.zzr(c4409tM0.zzc);
        }
        this.f23037h.clear();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public void zzz() {
        Iterator it = this.f23037h.values().iterator();
        while (it.hasNext()) {
            ((C4409tM0) it.next()).zza.zzz();
        }
    }
}
