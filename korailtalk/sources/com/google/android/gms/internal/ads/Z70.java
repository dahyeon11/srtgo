package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class Z70 implements InterfaceC4823x10 {

    /* renamed from: a */
    private final Context f17512a;

    /* renamed from: b */
    private final Executor f17513b;

    /* renamed from: c */
    protected final AbstractC2302ax f17514c;

    /* renamed from: d */
    private final C3926p80 f17515d;

    /* renamed from: e */
    private final InterfaceC3358k90 f17516e;

    /* renamed from: f */
    private final L1.a f17517f;

    /* renamed from: g */
    private final ViewGroup f17518g;

    /* renamed from: h */
    private final RunnableC5002yd0 f17519h;

    /* renamed from: i */
    private final C1743Pa0 f17520i;

    /* renamed from: j */
    private com.google.common.util.concurrent.C f17521j;

    protected Z70(Context context, Executor executor, AbstractC2302ax abstractC2302ax, InterfaceC3358k90 interfaceC3358k90, C3926p80 c3926p80, C1743Pa0 c1743Pa0, L1.a aVar) {
        this.f17512a = context;
        this.f17513b = executor;
        this.f17514c = abstractC2302ax;
        this.f17516e = interfaceC3358k90;
        this.f17515d = c3926p80;
        this.f17520i = c1743Pa0;
        this.f17517f = aVar;
        this.f17518g = new FrameLayout(context);
        this.f17519h = abstractC2302ax.zzz();
    }

    public final synchronized InterfaceC2682eF i(InterfaceC3131i90 interfaceC3131i90) {
        Y70 y70 = (Y70) interfaceC3131i90;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzil)).booleanValue()) {
            JB jb = new JB(this.f17518g);
            C2912gF c2912gF = new C2912gF();
            c2912gF.zze(this.f17512a);
            c2912gF.zzi(y70.zza);
            C3142iF c3142iFZzj = c2912gF.zzj();
            C4514uI c4514uI = new C4514uI();
            c4514uI.zzc(this.f17515d, this.f17513b);
            c4514uI.zzl(this.f17515d, this.f17513b);
            return b(jb, c3142iFZzj, c4514uI.zzn());
        }
        C3926p80 c3926p80Zzi = C3926p80.zzi(this.f17515d);
        C4514uI c4514uI2 = new C4514uI();
        c4514uI2.zzb(c3926p80Zzi, this.f17513b);
        c4514uI2.zzg(c3926p80Zzi, this.f17513b);
        c4514uI2.zzh(c3926p80Zzi, this.f17513b);
        c4514uI2.zzi(c3926p80Zzi, this.f17513b);
        c4514uI2.zzc(c3926p80Zzi, this.f17513b);
        c4514uI2.zzl(c3926p80Zzi, this.f17513b);
        c4514uI2.zzm(c3926p80Zzi);
        JB jb2 = new JB(this.f17518g);
        C2912gF c2912gF2 = new C2912gF();
        c2912gF2.zze(this.f17512a);
        c2912gF2.zzi(y70.zza);
        return b(jb2, c2912gF2.zzj(), c4514uI2.zzn());
    }

    protected abstract InterfaceC2682eF b(JB jb, C3142iF c3142iF, C4742wI c4742wI);

    final /* synthetic */ void h() {
        this.f17515d.zzdB(AbstractC4542ub0.zzd(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823x10
    public final boolean zza() {
        com.google.common.util.concurrent.C c9 = this.f17521j;
        return (c9 == null || c9.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0092  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4823x10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzb(H1.Y1 r8, java.lang.String r9, com.google.android.gms.internal.ads.C4595v10 r10, com.google.android.gms.internal.ads.InterfaceC4709w10 r11) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Z70.zzb(H1.Y1, java.lang.String, com.google.android.gms.internal.ads.v10, com.google.android.gms.internal.ads.w10):boolean");
    }

    public final void zzl(H1.j2 j2Var) {
        this.f17520i.zzu(j2Var);
    }
}
