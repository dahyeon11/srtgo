package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class OQ implements InterfaceC2378bd0 {

    /* renamed from: b, reason: collision with root package name */
    private final FQ f15114b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.f f15115c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f15113a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f15116d = new HashMap();

    public OQ(FQ fq, Set set, o2.f fVar) {
        this.f15114b = fq;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            NQ nq = (NQ) it.next();
            this.f15116d.put(nq.f14919c, nq);
        }
        this.f15115c = fVar;
    }

    private final void a(EnumC1952Uc0 enumC1952Uc0, boolean z8) {
        EnumC1952Uc0 enumC1952Uc02 = ((NQ) this.f15116d.get(enumC1952Uc0)).f14918b;
        if (this.f15113a.containsKey(enumC1952Uc02)) {
            String str = true != z8 ? "f." : "s.";
            long jElapsedRealtime = this.f15115c.elapsedRealtime() - ((Long) this.f15113a.get(enumC1952Uc02)).longValue();
            this.f15114b.zzb().put("label.".concat(((NQ) this.f15116d.get(enumC1952Uc0)).f14917a), str.concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzd(EnumC1952Uc0 enumC1952Uc0, String str) {
        if (this.f15113a.containsKey(enumC1952Uc0)) {
            long jElapsedRealtime = this.f15115c.elapsedRealtime() - ((Long) this.f15113a.get(enumC1952Uc0)).longValue();
            FQ fq = this.f15114b;
            String strValueOf = String.valueOf(str);
            fq.zzb().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f15116d.containsKey(enumC1952Uc0)) {
            a(enumC1952Uc0, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdC(EnumC1952Uc0 enumC1952Uc0, String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdD(EnumC1952Uc0 enumC1952Uc0, String str, Throwable th) {
        if (this.f15113a.containsKey(enumC1952Uc0)) {
            long jElapsedRealtime = this.f15115c.elapsedRealtime() - ((Long) this.f15113a.get(enumC1952Uc0)).longValue();
            FQ fq = this.f15114b;
            String strValueOf = String.valueOf(str);
            fq.zzb().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f15116d.containsKey(enumC1952Uc0)) {
            a(enumC1952Uc0, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdE(EnumC1952Uc0 enumC1952Uc0, String str) {
        this.f15113a.put(enumC1952Uc0, Long.valueOf(this.f15115c.elapsedRealtime()));
    }
}
