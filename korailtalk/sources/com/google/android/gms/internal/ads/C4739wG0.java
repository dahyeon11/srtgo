package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wG0 */
/* loaded from: classes2.dex */
final class C4739wG0 {

    /* renamed from: a */
    private final C2577dJ0 f23445a;

    /* renamed from: e */
    private final InterfaceC4625vG0 f23449e;

    /* renamed from: h */
    private final OG0 f23452h;

    /* renamed from: i */
    private final InterfaceC4721w70 f23453i;

    /* renamed from: j */
    private boolean f23454j;

    /* renamed from: k */
    private InterfaceC4279sE0 f23455k;

    /* renamed from: l */
    private JN0 f23456l = new JN0(0);

    /* renamed from: c */
    private final IdentityHashMap f23447c = new IdentityHashMap();

    /* renamed from: d */
    private final Map f23448d = new HashMap();

    /* renamed from: b */
    private final List f23446b = new ArrayList();

    /* renamed from: f */
    private final HashMap f23450f = new HashMap();

    /* renamed from: g */
    private final Set f23451g = new HashSet();

    public C4739wG0(InterfaceC4625vG0 interfaceC4625vG0, OG0 og0, InterfaceC4721w70 interfaceC4721w70, C2577dJ0 c2577dJ0) {
        this.f23445a = c2577dJ0;
        this.f23449e = interfaceC4625vG0;
        this.f23452h = og0;
        this.f23453i = interfaceC4721w70;
    }

    private final void d(int i8, int i9) {
        while (i8 < this.f23446b.size()) {
            ((C4511uG0) this.f23446b.get(i8)).zzd += i9;
            i8++;
        }
    }

    private final void e(C4511uG0 c4511uG0) {
        C4397tG0 c4397tG0 = (C4397tG0) this.f23450f.get(c4511uG0);
        if (c4397tG0 != null) {
            c4397tG0.zza.zzi(c4397tG0.zzb);
        }
    }

    private final void f() {
        Iterator it = this.f23451g.iterator();
        while (it.hasNext()) {
            C4511uG0 c4511uG0 = (C4511uG0) it.next();
            if (c4511uG0.zzc.isEmpty()) {
                e(c4511uG0);
                it.remove();
            }
        }
    }

    private final void g(C4511uG0 c4511uG0) {
        if (c4511uG0.zze && c4511uG0.zzc.isEmpty()) {
            C4397tG0 c4397tG0 = (C4397tG0) this.f23450f.remove(c4511uG0);
            c4397tG0.getClass();
            c4397tG0.zza.zzp(c4397tG0.zzb);
            c4397tG0.zza.zzs(c4397tG0.zzc);
            c4397tG0.zza.zzr(c4397tG0.zzc);
            this.f23451g.remove(c4511uG0);
        }
    }

    private final void h(C4511uG0 c4511uG0) {
        IM0 im0 = c4511uG0.zza;
        OM0 om0 = new OM0() { // from class: com.google.android.gms.internal.ads.lG0
            @Override // com.google.android.gms.internal.ads.OM0
            public final void zza(PM0 pm0, RG rg) {
                this.zza.c(pm0, rg);
            }
        };
        C4283sG0 c4283sG0 = new C4283sG0(this, c4511uG0);
        this.f23450f.put(c4511uG0, new C4397tG0(im0, om0, c4283sG0));
        im0.zzh(new Handler(AbstractC2281am0.zzy(), null), c4283sG0);
        im0.zzg(new Handler(AbstractC2281am0.zzy(), null), c4283sG0);
        im0.zzm(om0, this.f23455k, this.f23445a);
    }

    private final void i(int i8, int i9) {
        while (true) {
            i9--;
            if (i9 < i8) {
                return;
            }
            C4511uG0 c4511uG0 = (C4511uG0) this.f23446b.remove(i9);
            this.f23448d.remove(c4511uG0.zzb);
            d(i9, -c4511uG0.zza.zzC().zzc());
            c4511uG0.zze = true;
            if (this.f23454j) {
                g(c4511uG0);
            }
        }
    }

    final /* synthetic */ void c(PM0 pm0, RG rg) {
        this.f23449e.zzh();
    }

    public final int zza() {
        return this.f23446b.size();
    }

    public final RG zzb() {
        if (this.f23446b.isEmpty()) {
            return RG.zza;
        }
        int iZzc = 0;
        for (int i8 = 0; i8 < this.f23446b.size(); i8++) {
            C4511uG0 c4511uG0 = (C4511uG0) this.f23446b.get(i8);
            c4511uG0.zzd = iZzc;
            iZzc += c4511uG0.zza.zzC().zzc();
        }
        return new CG0(this.f23446b, this.f23456l);
    }

    public final RG zzc(int i8, int i9, List list) {
        F10.zzd(i8 >= 0 && i8 <= i9 && i9 <= zza());
        F10.zzd(list.size() == i9 - i8);
        for (int i10 = i8; i10 < i9; i10++) {
            ((C4511uG0) this.f23446b.get(i10)).zza.zzt((C3658mp) list.get(i10 - i8));
        }
        return zzb();
    }

    public final void zzg(InterfaceC4279sE0 interfaceC4279sE0) {
        F10.zzf(!this.f23454j);
        this.f23455k = interfaceC4279sE0;
        for (int i8 = 0; i8 < this.f23446b.size(); i8++) {
            C4511uG0 c4511uG0 = (C4511uG0) this.f23446b.get(i8);
            h(c4511uG0);
            this.f23451g.add(c4511uG0);
        }
        this.f23454j = true;
    }

    public final void zzh() {
        for (C4397tG0 c4397tG0 : this.f23450f.values()) {
            try {
                c4397tG0.zza.zzp(c4397tG0.zzb);
            } catch (RuntimeException e8) {
                AbstractC2834fc0.zzd("MediaSourceList", "Failed to release child source.", e8);
            }
            c4397tG0.zza.zzs(c4397tG0.zzc);
            c4397tG0.zza.zzr(c4397tG0.zzc);
        }
        this.f23450f.clear();
        this.f23451g.clear();
        this.f23454j = false;
    }

    public final void zzi(LM0 lm0) {
        C4511uG0 c4511uG0 = (C4511uG0) this.f23447c.remove(lm0);
        c4511uG0.getClass();
        c4511uG0.zza.zzG(lm0);
        c4511uG0.zzc.remove(((FM0) lm0).zza);
        if (!this.f23447c.isEmpty()) {
            f();
        }
        g(c4511uG0);
    }

    public final boolean zzj() {
        return this.f23454j;
    }

    public final RG zzk(int i8, List list, JN0 jn0) {
        if (!list.isEmpty()) {
            this.f23456l = jn0;
            for (int i9 = i8; i9 < list.size() + i8; i9++) {
                C4511uG0 c4511uG0 = (C4511uG0) list.get(i9 - i8);
                if (i9 > 0) {
                    C4511uG0 c4511uG02 = (C4511uG0) this.f23446b.get(i9 - 1);
                    c4511uG0.zzc(c4511uG02.zzd + c4511uG02.zza.zzC().zzc());
                } else {
                    c4511uG0.zzc(0);
                }
                d(i9, c4511uG0.zza.zzC().zzc());
                this.f23446b.add(i9, c4511uG0);
                this.f23448d.put(c4511uG0.zzb, c4511uG0);
                if (this.f23454j) {
                    h(c4511uG0);
                    if (this.f23447c.isEmpty()) {
                        this.f23451g.add(c4511uG0);
                    } else {
                        e(c4511uG0);
                    }
                }
            }
        }
        return zzb();
    }

    public final RG zzl(int i8, int i9, int i10, JN0 jn0) {
        F10.zzd(zza() >= 0);
        this.f23456l = null;
        return zzb();
    }

    public final RG zzm(int i8, int i9, JN0 jn0) {
        boolean z8 = false;
        if (i8 >= 0 && i8 <= i9 && i9 <= zza()) {
            z8 = true;
        }
        F10.zzd(z8);
        this.f23456l = jn0;
        i(i8, i9);
        return zzb();
    }

    public final RG zzn(List list, JN0 jn0) {
        i(0, this.f23446b.size());
        return zzk(this.f23446b.size(), list, jn0);
    }

    public final RG zzo(JN0 jn0) {
        int iZza = zza();
        if (jn0.zzc() != iZza) {
            jn0 = jn0.zzf().zzg(0, iZza);
        }
        this.f23456l = jn0;
        return zzb();
    }

    public final LM0 zzp(NM0 nm0, C2703eP0 c2703eP0, long j8) {
        int i8 = CG0.zzc;
        Object obj = nm0.zza;
        Object obj2 = ((Pair) obj).first;
        NM0 nm0Zza = nm0.zza(((Pair) obj).second);
        C4511uG0 c4511uG0 = (C4511uG0) this.f23448d.get(obj2);
        c4511uG0.getClass();
        this.f23451g.add(c4511uG0);
        C4397tG0 c4397tG0 = (C4397tG0) this.f23450f.get(c4511uG0);
        if (c4397tG0 != null) {
            c4397tG0.zza.zzk(c4397tG0.zzb);
        }
        c4511uG0.zzc.add(nm0Zza);
        FM0 fm0ZzI = c4511uG0.zza.zzI(nm0Zza, c2703eP0, j8);
        this.f23447c.put(fm0ZzI, c4511uG0);
        f();
        return fm0ZzI;
    }

    public final JN0 zzq() {
        return this.f23456l;
    }
}
