package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.w90, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4725w90 implements InterfaceC4823x10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23425a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f23426b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2302ax f23427c;

    /* renamed from: d, reason: collision with root package name */
    private final C3000h10 f23428d;

    /* renamed from: e, reason: collision with root package name */
    private final X90 f23429e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC1756Ph f23430f;

    /* renamed from: g, reason: collision with root package name */
    private final RunnableC5002yd0 f23431g;

    /* renamed from: h, reason: collision with root package name */
    private final C1743Pa0 f23432h;

    /* renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.C f23433i;

    public C4725w90(Context context, Executor executor, AbstractC2302ax abstractC2302ax, C3000h10 c3000h10, X90 x90, C1743Pa0 c1743Pa0) {
        this.f23425a = context;
        this.f23426b = executor;
        this.f23427c = abstractC2302ax;
        this.f23428d = c3000h10;
        this.f23432h = c1743Pa0;
        this.f23429e = x90;
        this.f23431g = abstractC2302ax.zzz();
    }

    final /* synthetic */ void f() {
        this.f23428d.zzdB(AbstractC4542ub0.zzd(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823x10
    public final boolean zza() {
        com.google.common.util.concurrent.C c9 = this.f23433i;
        return (c9 == null || c9.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823x10
    public final boolean zzb(H1.Y1 y12, String str, C4595v10 c4595v10, InterfaceC4709w10 interfaceC4709w10) {
        EK ekZzf;
        RunnableC4660vd0 runnableC4660vd0;
        if (str == null) {
            L1.n.zzg("Ad unit ID should not be null for interstitial ad.");
            this.f23426b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.q90
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziU)).booleanValue() && y12.zzf) {
            this.f23427c.zzl().zzo(true);
        }
        H1.d2 d2Var = ((C3928p90) c4595v10).zza;
        Bundle bundleZza = AbstractC4643vQ.zza(new Pair(EnumC4415tQ.PUBLIC_API_CALL.zza(), Long.valueOf(y12.zzz)), new Pair(EnumC4415tQ.DYNAMITE_ENTER.zza(), Long.valueOf(G1.u.zzB().currentTimeMillis())));
        C1743Pa0 c1743Pa0 = this.f23432h;
        c1743Pa0.zzt(str);
        c1743Pa0.zzs(d2Var);
        c1743Pa0.zzH(y12);
        c1743Pa0.zzA(bundleZza);
        Context context = this.f23425a;
        C1825Ra0 c1825Ra0ZzJ = c1743Pa0.zzJ();
        EnumC1217Cd0 enumC1217Cd0Zza = AbstractC4546ud0.zza(c1825Ra0ZzJ);
        EnumC1299Ed0 enumC1299Ed0 = EnumC1299Ed0.FORMAT_INTERSTITIAL;
        InterfaceC3407kd0 interfaceC3407kd0Zzb = AbstractC3293jd0.zzb(context, enumC1217Cd0Zza, enumC1299Ed0, y12);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzim)).booleanValue()) {
            DK dkZzg = this.f23427c.zzg();
            C2912gF c2912gF = new C2912gF();
            c2912gF.zze(this.f23425a);
            c2912gF.zzi(c1825Ra0ZzJ);
            dkZzg.zze(c2912gF.zzj());
            C4514uI c4514uI = new C4514uI();
            c4514uI.zzj(this.f23428d, this.f23426b);
            c4514uI.zzk(this.f23428d, this.f23426b);
            dkZzg.zzd(c4514uI.zzn());
            dkZzg.zzc(new C3796o00(this.f23430f));
            ekZzf = dkZzg.zzf();
        } else {
            C4514uI c4514uI2 = new C4514uI();
            X90 x90 = this.f23429e;
            if (x90 != null) {
                c4514uI2.zze(x90, this.f23426b);
                c4514uI2.zzf(this.f23429e, this.f23426b);
                c4514uI2.zzb(this.f23429e, this.f23426b);
            }
            DK dkZzg2 = this.f23427c.zzg();
            C2912gF c2912gF2 = new C2912gF();
            c2912gF2.zze(this.f23425a);
            c2912gF2.zzi(c1825Ra0ZzJ);
            dkZzg2.zze(c2912gF2.zzj());
            c4514uI2.zzj(this.f23428d, this.f23426b);
            c4514uI2.zze(this.f23428d, this.f23426b);
            c4514uI2.zzf(this.f23428d, this.f23426b);
            c4514uI2.zzb(this.f23428d, this.f23426b);
            c4514uI2.zza(this.f23428d, this.f23426b);
            c4514uI2.zzl(this.f23428d, this.f23426b);
            c4514uI2.zzk(this.f23428d, this.f23426b);
            c4514uI2.zzi(this.f23428d, this.f23426b);
            c4514uI2.zzc(this.f23428d, this.f23426b);
            dkZzg2.zzd(c4514uI2.zzn());
            dkZzg2.zzc(new C3796o00(this.f23430f));
            ekZzf = dkZzg2.zzf();
        }
        EK ek = ekZzf;
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
            RunnableC4660vd0 runnableC4660vd0Zzf = ek.zzf();
            runnableC4660vd0Zzf.zzd(enumC1299Ed0);
            runnableC4660vd0Zzf.zzb(y12.zzp);
            runnableC4660vd0Zzf.zzg(y12.zzm);
            runnableC4660vd0 = runnableC4660vd0Zzf;
        } else {
            runnableC4660vd0 = null;
        }
        HD hdZza = ek.zza();
        com.google.common.util.concurrent.C cZzi = hdZza.zzi(hdZza.zzj());
        this.f23433i = cZzi;
        AbstractC1483In0.zzr(cZzi, new C4611v90(this, interfaceC4709w10, runnableC4660vd0, interfaceC3407kd0Zzb, ek), this.f23426b);
        return true;
    }

    public final void zzi(InterfaceC1756Ph interfaceC1756Ph) {
        this.f23430f = interfaceC1756Ph;
    }
}
