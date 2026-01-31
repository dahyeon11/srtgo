package com.google.android.gms.internal.ads;

import H1.C0534f1;
import H1.InterfaceC0517a;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class UA implements InterfaceC5078zF, InterfaceC3941pG, VF, InterfaceC0517a, RF, InterfaceC4402tJ {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16595a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f16596b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f16597c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f16598d;

    /* renamed from: e, reason: collision with root package name */
    private final C1457Ia0 f16599e;

    /* renamed from: f, reason: collision with root package name */
    private final C4654va0 f16600f;

    /* renamed from: g, reason: collision with root package name */
    private final C3409ke0 f16601g;

    /* renamed from: h, reason: collision with root package name */
    private final C2717eb0 f16602h;

    /* renamed from: i, reason: collision with root package name */
    private final C2487cb f16603i;

    /* renamed from: j, reason: collision with root package name */
    private final C2084Xh f16604j;

    /* renamed from: k, reason: collision with root package name */
    private final RunnableC4660vd0 f16605k;

    /* renamed from: l, reason: collision with root package name */
    private final WeakReference f16606l;

    /* renamed from: m, reason: collision with root package name */
    private final WeakReference f16607m;

    /* renamed from: n, reason: collision with root package name */
    private final C2224aF f16608n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16609o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f16610p = new AtomicBoolean();

    /* renamed from: q, reason: collision with root package name */
    private final C2166Zh f16611q;

    UA(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3409ke0 c3409ke0, C2717eb0 c2717eb0, View view, InterfaceC2065Wv interfaceC2065Wv, C2487cb c2487cb, C2084Xh c2084Xh, C2166Zh c2166Zh, RunnableC4660vd0 runnableC4660vd0, C2224aF c2224aF) {
        this.f16595a = context;
        this.f16596b = executor;
        this.f16597c = executor2;
        this.f16598d = scheduledExecutorService;
        this.f16599e = c1457Ia0;
        this.f16600f = c4654va0;
        this.f16601g = c3409ke0;
        this.f16602h = c2717eb0;
        this.f16603i = c2487cb;
        this.f16606l = new WeakReference(view);
        this.f16607m = new WeakReference(interfaceC2065Wv);
        this.f16604j = c2084Xh;
        this.f16611q = c2166Zh;
        this.f16605k = runnableC4660vd0;
        this.f16608n = c2224aF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List j() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzls)).booleanValue()) {
            G1.u.zzp();
            if (K1.K0.zzB(this.f16595a)) {
                G1.u.zzp();
                Integer numZzs = K1.K0.zzs(this.f16595a);
                if (numZzs != null) {
                    int iMin = Math.min(numZzs.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f16600f.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.f16600f.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        String strZzh;
        int i8;
        List list = this.f16600f.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdx)).booleanValue()) {
            strZzh = this.f16603i.zzc().zzh(this.f16595a, (View) this.f16606l.get(), null);
        } else {
            strZzh = null;
        }
        if ((((Boolean) H1.C.zzc().zza(AbstractC4439th.zzao)).booleanValue() && this.f16599e.zzb.zzb.zzg) || !((Boolean) AbstractC3986pi.zzh.zze()).booleanValue()) {
            this.f16602h.zza(this.f16601g.zzd(this.f16599e, this.f16600f, false, strZzh, null, j()));
            return;
        }
        if (((Boolean) AbstractC3986pi.zzg.zze()).booleanValue() && ((i8 = this.f16600f.zzb) == 1 || i8 == 2 || i8 == 5)) {
        }
        AbstractC1483In0.zzr((AbstractC5136zn0) AbstractC1483In0.zzo(AbstractC5136zn0.zzu(AbstractC1483In0.zzh(null)), ((Long) H1.C.zzc().zza(AbstractC4439th.zzaW)).longValue(), TimeUnit.MILLISECONDS, this.f16598d), new TA(this, strZzh), this.f16596b);
    }

    private final void l(final int i8, final int i9) {
        View view;
        if (i8 <= 0 || !((view = (View) this.f16606l.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            k();
        } else {
            this.f16598d.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.RA
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.i(i8, i9);
                }
            }, i9, TimeUnit.MILLISECONDS);
        }
    }

    final /* synthetic */ void g() {
        this.f16596b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.QA
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.k();
            }
        });
    }

    final /* synthetic */ void h(int i8, int i9) {
        l(i8 - 1, i9);
    }

    final /* synthetic */ void i(final int i8, final int i9) {
        this.f16596b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.PA
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.h(i8, i9);
            }
        });
    }

    @Override // H1.InterfaceC0517a
    public final void onAdClicked() {
        if (!(((Boolean) H1.C.zzc().zza(AbstractC4439th.zzao)).booleanValue() && this.f16599e.zzb.zzb.zzg) && ((Boolean) AbstractC3986pi.zzd.zze()).booleanValue()) {
            AbstractC1483In0.zzr(AbstractC1483In0.zze(AbstractC5136zn0.zzu(this.f16604j.zza()), Throwable.class, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.OA
                @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, AbstractC4805wt.zzf), new SA(this), this.f16596b);
            return;
        }
        C2717eb0 c2717eb0 = this.f16602h;
        C3409ke0 c3409ke0 = this.f16601g;
        C1457Ia0 c1457Ia0 = this.f16599e;
        C4654va0 c4654va0 = this.f16600f;
        c2717eb0.zzc(c3409ke0.zzc(c1457Ia0, c4654va0, c4654va0.zzc), true == G1.u.zzo().zzA(this.f16595a) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzds(InterfaceC4118qr interfaceC4118qr, String str, String str2) {
        C3409ke0 c3409ke0 = this.f16601g;
        C4654va0 c4654va0 = this.f16600f;
        this.f16602h.zza(c3409ke0.zze(c4654va0, c4654va0.zzi, interfaceC4118qr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zze() {
        C3409ke0 c3409ke0 = this.f16601g;
        C1457Ia0 c1457Ia0 = this.f16599e;
        C4654va0 c4654va0 = this.f16600f;
        this.f16602h.zza(c3409ke0.zzc(c1457Ia0, c4654va0, c4654va0.zzj));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzf() {
        C3409ke0 c3409ke0 = this.f16601g;
        C1457Ia0 c1457Ia0 = this.f16599e;
        C4654va0 c4654va0 = this.f16600f;
        this.f16602h.zza(c3409ke0.zzc(c1457Ia0, c4654va0, c4654va0.zzh));
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void zzq(C0534f1 c0534f1) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbw)).booleanValue()) {
            this.f16602h.zza(this.f16601g.zzc(this.f16599e, this.f16600f, C3409ke0.zzf(2, c0534f1.zza, this.f16600f.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void zzr() {
        if (this.f16610p.compareAndSet(false, true)) {
            int iIntValue = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzdG)).intValue();
            if (iIntValue > 0) {
                l(iIntValue, ((Integer) H1.C.zzc().zza(AbstractC4439th.zzdH)).intValue());
                return;
            }
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdF)).booleanValue()) {
                this.f16597c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.NA
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.g();
                    }
                });
            } else {
                k();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final synchronized void zzs() {
        C2224aF c2224aF;
        try {
            if (this.f16609o) {
                ArrayList arrayList = new ArrayList(j());
                arrayList.addAll(this.f16600f.zzg);
                this.f16602h.zza(this.f16601g.zzd(this.f16599e, this.f16600f, true, null, null, arrayList));
            } else {
                C2717eb0 c2717eb0 = this.f16602h;
                C3409ke0 c3409ke0 = this.f16601g;
                C1457Ia0 c1457Ia0 = this.f16599e;
                C4654va0 c4654va0 = this.f16600f;
                c2717eb0.zza(c3409ke0.zzc(c1457Ia0, c4654va0, c4654va0.zzn));
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdC)).booleanValue() && (c2224aF = this.f16608n) != null) {
                    List listZzh = C3409ke0.zzh(C3409ke0.zzg(c2224aF.zzb().zzn, c2224aF.zza().zzg()), this.f16608n.zza().zza());
                    C2717eb0 c2717eb02 = this.f16602h;
                    C3409ke0 c3409ke02 = this.f16601g;
                    C2224aF c2224aF2 = this.f16608n;
                    c2717eb02.zza(c3409ke02.zzc(c2224aF2.zzc(), c2224aF2.zzb(), listZzh));
                }
                C2717eb0 c2717eb03 = this.f16602h;
                C3409ke0 c3409ke03 = this.f16601g;
                C1457Ia0 c1457Ia02 = this.f16599e;
                C4654va0 c4654va02 = this.f16600f;
                c2717eb03.zza(c3409ke03.zzc(c1457Ia02, c4654va02, c4654va02.zzg));
            }
            this.f16609o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4402tJ
    public final void zzt() {
        C3409ke0 c3409ke0 = this.f16601g;
        C1457Ia0 c1457Ia0 = this.f16599e;
        C4654va0 c4654va0 = this.f16600f;
        this.f16602h.zza(c3409ke0.zzc(c1457Ia0, c4654va0, c4654va0.zzav));
    }
}
