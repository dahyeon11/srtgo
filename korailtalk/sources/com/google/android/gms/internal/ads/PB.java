package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class PB extends MB {

    /* renamed from: j */
    private final Context f15223j;

    /* renamed from: k */
    private final View f15224k;

    /* renamed from: l */
    private final InterfaceC2065Wv f15225l;

    /* renamed from: m */
    private final C4768wa0 f15226m;

    /* renamed from: n */
    private final WC f15227n;

    /* renamed from: o */
    private final C2696eM f15228o;

    /* renamed from: p */
    private final FJ f15229p;

    /* renamed from: q */
    private final AD0 f15230q;

    /* renamed from: r */
    private final Executor f15231r;

    /* renamed from: s */
    private H1.d2 f15232s;

    PB(XC xc, Context context, C4768wa0 c4768wa0, View view, InterfaceC2065Wv interfaceC2065Wv, WC wc, C2696eM c2696eM, FJ fj, AD0 ad0, Executor executor) {
        super(xc);
        this.f15223j = context;
        this.f15224k = view;
        this.f15225l = interfaceC2065Wv;
        this.f15226m = c4768wa0;
        this.f15227n = wc;
        this.f15228o = c2696eM;
        this.f15229p = fj;
        this.f15230q = ad0;
        this.f15231r = executor;
    }

    public static /* synthetic */ void zzi(PB pb) {
        C2696eM c2696eM = pb.f15228o;
        if (c2696eM.zze() == null) {
            return;
        }
        try {
            c2696eM.zze().zze((H1.X) pb.f15230q.zzb(), r2.b.wrap(pb.f15223j));
        } catch (RemoteException e8) {
            L1.n.zzh("RemoteException when notifyAdLoad is called", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final int zza() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhU)).booleanValue() && this.f17345b.zzah) {
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhV)).booleanValue()) {
                return 0;
            }
        }
        return this.f17344a.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final View zzc() {
        return this.f15224k;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final H1.V0 zzd() {
        try {
            return this.f15227n.zza();
        } catch (C2112Ya0 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final C4768wa0 zze() {
        H1.d2 d2Var = this.f15232s;
        if (d2Var != null) {
            return AbstractC2071Xa0.zzb(d2Var);
        }
        C4654va0 c4654va0 = this.f17345b;
        if (c4654va0.zzad) {
            for (String str : c4654va0.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f15224k;
            return new C4768wa0(view.getWidth(), view.getHeight(), false);
        }
        return (C4768wa0) this.f17345b.zzs.get(0);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final C4768wa0 zzf() {
        return this.f15226m;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final void zzg() {
        this.f15229p.zza();
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final void zzh(ViewGroup viewGroup, H1.d2 d2Var) {
        InterfaceC2065Wv interfaceC2065Wv;
        if (viewGroup == null || (interfaceC2065Wv = this.f15225l) == null) {
            return;
        }
        interfaceC2065Wv.zzaj(C1943Tw.zzc(d2Var));
        viewGroup.setMinimumHeight(d2Var.zzc);
        viewGroup.setMinimumWidth(d2Var.zzf);
        this.f15232s = d2Var;
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final void zzj() {
        this.f15231r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.OB
            @Override // java.lang.Runnable
            public final void run() {
                PB.zzi(this.zza);
            }
        });
        super.zzj();
    }
}
