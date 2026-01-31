package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.nM0 */
/* loaded from: classes2.dex */
public abstract class AbstractC3726nM0 implements PM0 {

    /* renamed from: a */
    private final ArrayList f21251a = new ArrayList(1);

    /* renamed from: b */
    private final HashSet f21252b = new HashSet(1);

    /* renamed from: c */
    private final WM0 f21253c = new WM0();

    /* renamed from: d */
    private final C2352bL0 f21254d = new C2352bL0();

    /* renamed from: e */
    private Looper f21255e;

    /* renamed from: f */
    private RG f21256f;

    /* renamed from: g */
    private C2577dJ0 f21257g;

    protected final C2577dJ0 a() {
        C2577dJ0 c2577dJ0 = this.f21257g;
        F10.zzb(c2577dJ0);
        return c2577dJ0;
    }

    protected final C2352bL0 b(NM0 nm0) {
        return this.f21254d.zza(0, nm0);
    }

    protected final C2352bL0 c(int i8, NM0 nm0) {
        return this.f21254d.zza(0, nm0);
    }

    protected final WM0 d(NM0 nm0) {
        return this.f21253c.zza(0, nm0);
    }

    protected final WM0 e(int i8, NM0 nm0) {
        return this.f21253c.zza(0, nm0);
    }

    protected void f() {
    }

    protected void g() {
    }

    protected abstract void h(InterfaceC4279sE0 interfaceC4279sE0);

    protected final void i(RG rg) {
        this.f21256f = rg;
        ArrayList arrayList = this.f21251a;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((OM0) arrayList.get(i8)).zza(this, rg);
        }
    }

    protected final boolean j() {
        return !this.f21252b.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.PM0
    public abstract /* synthetic */ void zzG(LM0 lm0);

    @Override // com.google.android.gms.internal.ads.PM0
    public abstract /* synthetic */ LM0 zzI(NM0 nm0, C2703eP0 c2703eP0, long j8);

    @Override // com.google.android.gms.internal.ads.PM0
    public abstract /* synthetic */ C3658mp zzJ();

    @Override // com.google.android.gms.internal.ads.PM0
    public /* synthetic */ RG zzM() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.PM0
    public final void zzg(Handler handler, InterfaceC2466cL0 interfaceC2466cL0) {
        this.f21254d.zzb(handler, interfaceC2466cL0);
    }

    @Override // com.google.android.gms.internal.ads.PM0
    public final void zzh(Handler handler, XM0 xm0) {
        this.f21253c.zzb(handler, xm0);
    }

    @Override // com.google.android.gms.internal.ads.PM0
    public final void zzi(OM0 om0) {
        boolean zIsEmpty = this.f21252b.isEmpty();
        this.f21252b.remove(om0);
        if (zIsEmpty || !this.f21252b.isEmpty()) {
            return;
        }
        f();
    }

    @Override // com.google.android.gms.internal.ads.PM0
    public final void zzk(OM0 om0) {
        this.f21255e.getClass();
        HashSet hashSet = this.f21252b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(om0);
        if (zIsEmpty) {
            g();
        }
    }

    @Override // com.google.android.gms.internal.ads.PM0
    public final void zzm(OM0 om0, InterfaceC4279sE0 interfaceC4279sE0, C2577dJ0 c2577dJ0) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f21255e;
        boolean z8 = true;
        if (looper != null && looper != looperMyLooper) {
            z8 = false;
        }
        F10.zzd(z8);
        this.f21257g = c2577dJ0;
        RG rg = this.f21256f;
        this.f21251a.add(om0);
        if (this.f21255e == null) {
            this.f21255e = looperMyLooper;
            this.f21252b.add(om0);
            h(interfaceC4279sE0);
        } else if (rg != null) {
            zzk(om0);
            om0.zza(this, rg);
        }
    }

    @Override // com.google.android.gms.internal.ads.PM0
    public final void zzp(OM0 om0) {
        this.f21251a.remove(om0);
        if (!this.f21251a.isEmpty()) {
            zzi(om0);
            return;
        }
        this.f21255e = null;
        this.f21256f = null;
        this.f21257g = null;
        this.f21252b.clear();
        zzq();
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.PM0
    public final void zzr(InterfaceC2466cL0 interfaceC2466cL0) {
        this.f21254d.zzc(interfaceC2466cL0);
    }

    @Override // com.google.android.gms.internal.ads.PM0
    public final void zzs(XM0 xm0) {
        this.f21253c.zzh(xm0);
    }

    @Override // com.google.android.gms.internal.ads.PM0
    public /* synthetic */ void zzt(C3658mp c3658mp) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.PM0
    public /* synthetic */ boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.PM0
    public abstract /* synthetic */ void zzz();
}
