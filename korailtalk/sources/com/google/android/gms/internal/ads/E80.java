package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class E80 implements InterfaceC4823x10 {

    /* renamed from: a */
    private final Context f12773a;

    /* renamed from: b */
    private final Executor f12774b;

    /* renamed from: c */
    private final AbstractC2302ax f12775c;

    /* renamed from: d */
    private final C3000h10 f12776d;

    /* renamed from: e */
    private final C3456l10 f12777e;

    /* renamed from: f */
    private final ViewGroup f12778f;

    /* renamed from: g */
    private InterfaceC1756Ph f12779g;

    /* renamed from: h */
    private final SG f12780h;

    /* renamed from: i */
    private final RunnableC5002yd0 f12781i;

    /* renamed from: j */
    private final C2345bI f12782j;

    /* renamed from: k */
    private final C1743Pa0 f12783k;

    /* renamed from: l */
    private com.google.common.util.concurrent.C f12784l;

    public E80(Context context, Executor executor, H1.d2 d2Var, AbstractC2302ax abstractC2302ax, C3000h10 c3000h10, C3456l10 c3456l10, C1743Pa0 c1743Pa0, C2345bI c2345bI) {
        this.f12773a = context;
        this.f12774b = executor;
        this.f12775c = abstractC2302ax;
        this.f12776d = c3000h10;
        this.f12777e = c3456l10;
        this.f12783k = c1743Pa0;
        this.f12780h = abstractC2302ax.zzf();
        this.f12781i = abstractC2302ax.zzz();
        this.f12778f = new FrameLayout(context);
        this.f12782j = c2345bI;
        c1743Pa0.zzs(d2Var);
    }

    final /* synthetic */ void i() {
        this.f12776d.zzdB(AbstractC4542ub0.zzd(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823x10
    public final boolean zza() {
        com.google.common.util.concurrent.C c9 = this.f12784l;
        return (c9 == null || c9.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823x10
    public final boolean zzb(H1.Y1 y12, String str, C4595v10 c4595v10, InterfaceC4709w10 interfaceC4709w10) {
        AbstractC3819oC abstractC3819oCZzh;
        RunnableC4660vd0 runnableC4660vd0;
        if (str == null) {
            L1.n.zzg("Ad unit ID should not be null for banner ad.");
            this.f12774b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.A80
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.i();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziU)).booleanValue() && y12.zzf) {
                this.f12775c.zzl().zzo(true);
            }
            Bundle bundleZza = AbstractC4643vQ.zza(new Pair(EnumC4415tQ.PUBLIC_API_CALL.zza(), Long.valueOf(y12.zzz)), new Pair(EnumC4415tQ.DYNAMITE_ENTER.zza(), Long.valueOf(G1.u.zzB().currentTimeMillis())));
            C1743Pa0 c1743Pa0 = this.f12783k;
            c1743Pa0.zzt(str);
            c1743Pa0.zzH(y12);
            c1743Pa0.zzA(bundleZza);
            Context context = this.f12773a;
            C1825Ra0 c1825Ra0ZzJ = c1743Pa0.zzJ();
            EnumC1217Cd0 enumC1217Cd0Zza = AbstractC4546ud0.zza(c1825Ra0ZzJ);
            EnumC1299Ed0 enumC1299Ed0 = EnumC1299Ed0.FORMAT_BANNER;
            InterfaceC3407kd0 interfaceC3407kd0Zzb = AbstractC3293jd0.zzb(context, enumC1217Cd0Zza, enumC1299Ed0, y12);
            if (!((Boolean) AbstractC4783wi.zze.zze()).booleanValue() || !this.f12783k.zzh().zzk) {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzik)).booleanValue()) {
                    InterfaceC3705nC interfaceC3705nCZze = this.f12775c.zze();
                    C2912gF c2912gF = new C2912gF();
                    c2912gF.zze(this.f12773a);
                    c2912gF.zzi(c1825Ra0ZzJ);
                    interfaceC3705nCZze.zzi(c2912gF.zzj());
                    C4514uI c4514uI = new C4514uI();
                    c4514uI.zzj(this.f12776d, this.f12774b);
                    c4514uI.zzk(this.f12776d, this.f12774b);
                    interfaceC3705nCZze.zzf(c4514uI.zzn());
                    interfaceC3705nCZze.zze(new C3796o00(this.f12779g));
                    interfaceC3705nCZze.zzd(new VK(C2696eM.zza, null));
                    interfaceC3705nCZze.zzg(new QC(this.f12780h, this.f12782j));
                    interfaceC3705nCZze.zzc(new JB(this.f12778f));
                    abstractC3819oCZzh = interfaceC3705nCZze.zzh();
                } else {
                    InterfaceC3705nC interfaceC3705nCZze2 = this.f12775c.zze();
                    C2912gF c2912gF2 = new C2912gF();
                    c2912gF2.zze(this.f12773a);
                    c2912gF2.zzi(c1825Ra0ZzJ);
                    interfaceC3705nCZze2.zzi(c2912gF2.zzj());
                    C4514uI c4514uI2 = new C4514uI();
                    c4514uI2.zzj(this.f12776d, this.f12774b);
                    c4514uI2.zza(this.f12776d, this.f12774b);
                    c4514uI2.zza(this.f12777e, this.f12774b);
                    c4514uI2.zzl(this.f12776d, this.f12774b);
                    c4514uI2.zzd(this.f12776d, this.f12774b);
                    c4514uI2.zze(this.f12776d, this.f12774b);
                    c4514uI2.zzf(this.f12776d, this.f12774b);
                    c4514uI2.zzb(this.f12776d, this.f12774b);
                    c4514uI2.zzk(this.f12776d, this.f12774b);
                    c4514uI2.zzi(this.f12776d, this.f12774b);
                    interfaceC3705nCZze2.zzf(c4514uI2.zzn());
                    interfaceC3705nCZze2.zze(new C3796o00(this.f12779g));
                    interfaceC3705nCZze2.zzd(new VK(C2696eM.zza, null));
                    interfaceC3705nCZze2.zzg(new QC(this.f12780h, this.f12782j));
                    interfaceC3705nCZze2.zzc(new JB(this.f12778f));
                    abstractC3819oCZzh = interfaceC3705nCZze2.zzh();
                }
                AbstractC3819oC abstractC3819oC = abstractC3819oCZzh;
                if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
                    RunnableC4660vd0 runnableC4660vd0Zzj = abstractC3819oC.zzj();
                    runnableC4660vd0Zzj.zzd(enumC1299Ed0);
                    runnableC4660vd0Zzj.zzb(y12.zzp);
                    runnableC4660vd0Zzj.zzg(y12.zzm);
                    runnableC4660vd0 = runnableC4660vd0Zzj;
                } else {
                    runnableC4660vd0 = null;
                }
                HD hdZzd = abstractC3819oC.zzd();
                com.google.common.util.concurrent.C cZzi = hdZzd.zzi(hdZzd.zzj());
                this.f12784l = cZzi;
                AbstractC1483In0.zzr(cZzi, new D80(this, interfaceC4709w10, runnableC4660vd0, interfaceC3407kd0Zzb, abstractC3819oC), this.f12774b);
                return true;
            }
            C3000h10 c3000h10 = this.f12776d;
            if (c3000h10 != null) {
                c3000h10.zzdB(AbstractC4542ub0.zzd(7, null, null));
            }
        }
        return false;
    }

    public final ViewGroup zzd() {
        return this.f12778f;
    }

    public final C1743Pa0 zzi() {
        return this.f12783k;
    }

    public final void zzn() {
        this.f12780h.zzd(this.f12782j.zzc());
    }

    public final void zzo(H1.G g8) {
        this.f12777e.zza(g8);
    }

    public final void zzp(TG tg) {
        this.f12780h.zzo(tg, this.f12774b);
    }

    public final void zzq(InterfaceC1756Ph interfaceC1756Ph) {
        this.f12779g = interfaceC1756Ph;
    }

    public final boolean zzr() {
        Object parent = this.f12778f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        G1.u.zzp();
        return K1.K0.zzW(view, view.getContext());
    }
}
