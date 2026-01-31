package com.google.android.gms.internal.ads;

import H1.InterfaceC0533f0;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class E10 implements InterfaceC4823x10 {

    /* renamed from: a, reason: collision with root package name */
    private final C1743Pa0 f12734a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2302ax f12735b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f12736c;

    /* renamed from: d, reason: collision with root package name */
    private final C4481u10 f12737d;

    /* renamed from: e, reason: collision with root package name */
    private final RunnableC5002yd0 f12738e;

    /* renamed from: f, reason: collision with root package name */
    private C3821oD f12739f;

    public E10(AbstractC2302ax abstractC2302ax, Context context, C4481u10 c4481u10, C1743Pa0 c1743Pa0) {
        this.f12735b = abstractC2302ax;
        this.f12736c = context;
        this.f12737d = c4481u10;
        this.f12734a = c1743Pa0;
        this.f12738e = abstractC2302ax.zzz();
        c1743Pa0.zzv(c4481u10.zzd());
    }

    final /* synthetic */ void d() {
        this.f12737d.zza().zzdB(AbstractC4542ub0.zzd(4, null, null));
    }

    final /* synthetic */ void e() {
        this.f12737d.zza().zzdB(AbstractC4542ub0.zzd(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823x10
    public final boolean zza() {
        C3821oD c3821oD = this.f12739f;
        return c3821oD != null && c3821oD.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823x10
    public final boolean zzb(H1.Y1 y12, String str, C4595v10 c4595v10, InterfaceC4709w10 interfaceC4709w10) {
        RunnableC4660vd0 runnableC4660vd0;
        G1.u.zzp();
        if (K1.K0.zzH(this.f12736c) && y12.zzs == null) {
            L1.n.zzg("Failed to load the ad because app ID is missing.");
            this.f12735b.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.z10
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.d();
                }
            });
            return false;
        }
        if (str == null) {
            L1.n.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.f12735b.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.A10
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.e();
                }
            });
            return false;
        }
        AbstractC3973pb0.zza(this.f12736c, y12.zzf);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziU)).booleanValue() && y12.zzf) {
            this.f12735b.zzl().zzo(true);
        }
        int i8 = ((C4937y10) c4595v10).zza;
        Bundle bundleZza = AbstractC4643vQ.zza(new Pair(EnumC4415tQ.PUBLIC_API_CALL.zza(), Long.valueOf(y12.zzz)), new Pair(EnumC4415tQ.DYNAMITE_ENTER.zza(), Long.valueOf(G1.u.zzB().currentTimeMillis())));
        C1743Pa0 c1743Pa0 = this.f12734a;
        c1743Pa0.zzH(y12);
        c1743Pa0.zzA(bundleZza);
        c1743Pa0.zzC(i8);
        Context context = this.f12736c;
        C1825Ra0 c1825Ra0ZzJ = c1743Pa0.zzJ();
        EnumC1217Cd0 enumC1217Cd0Zza = AbstractC4546ud0.zza(c1825Ra0ZzJ);
        EnumC1299Ed0 enumC1299Ed0 = EnumC1299Ed0.FORMAT_NATIVE;
        InterfaceC3407kd0 interfaceC3407kd0Zzb = AbstractC3293jd0.zzb(context, enumC1217Cd0Zza, enumC1299Ed0, y12);
        InterfaceC0533f0 interfaceC0533f0 = c1825Ra0ZzJ.zzn;
        if (interfaceC0533f0 != null) {
            this.f12737d.zzd().zzm(interfaceC0533f0);
        }
        InterfaceC2236aL interfaceC2236aLZzh = this.f12735b.zzh();
        C2912gF c2912gF = new C2912gF();
        c2912gF.zze(this.f12736c);
        c2912gF.zzi(c1825Ra0ZzJ);
        interfaceC2236aLZzh.zzf(c2912gF.zzj());
        C4514uI c4514uI = new C4514uI();
        c4514uI.zzk(this.f12737d.zzd(), this.f12735b.zzB());
        interfaceC2236aLZzh.zze(c4514uI.zzn());
        interfaceC2236aLZzh.zzd(this.f12737d.zzc());
        interfaceC2236aLZzh.zzc(new JB(null));
        AbstractC2351bL abstractC2351bLZzg = interfaceC2236aLZzh.zzg();
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
            RunnableC4660vd0 runnableC4660vd0Zzf = abstractC2351bLZzg.zzf();
            runnableC4660vd0Zzf.zzd(enumC1299Ed0);
            runnableC4660vd0Zzf.zzb(y12.zzp);
            runnableC4660vd0Zzf.zzg(y12.zzm);
            runnableC4660vd0 = runnableC4660vd0Zzf;
        } else {
            runnableC4660vd0 = null;
        }
        this.f12735b.zzy().zzc(1);
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        ScheduledExecutorService scheduledExecutorServiceZzC = this.f12735b.zzC();
        HD hdZza = abstractC2351bLZzg.zza();
        C3821oD c3821oD = new C3821oD(interfaceExecutorServiceC1974Un0, scheduledExecutorServiceZzC, hdZza.zzi(hdZza.zzj()));
        this.f12739f = c3821oD;
        c3821oD.zze(new D10(this, interfaceC4709w10, runnableC4660vd0, interfaceC3407kd0Zzb, abstractC2351bLZzg));
        return true;
    }
}
