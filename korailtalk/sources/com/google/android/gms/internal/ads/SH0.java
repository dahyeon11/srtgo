package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class SH0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3711nF f16232a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC2394bl0 f16233b = AbstractC2394bl0.zzm();

    /* renamed from: c, reason: collision with root package name */
    private AbstractC2737el0 f16234c = AbstractC2737el0.zzd();

    /* renamed from: d, reason: collision with root package name */
    private NM0 f16235d;

    /* renamed from: e, reason: collision with root package name */
    private NM0 f16236e;

    /* renamed from: f, reason: collision with root package name */
    private NM0 f16237f;

    public SH0(C3711nF c3711nF) {
        this.f16232a = c3711nF;
    }

    private static NM0 b(InterfaceC3021hC interfaceC3021hC, AbstractC2394bl0 abstractC2394bl0, NM0 nm0, C3711nF c3711nF) {
        RG rgZzn = interfaceC3021hC.zzn();
        int iZze = interfaceC3021hC.zze();
        Object objZzf = rgZzn.zzo() ? null : rgZzn.zzf(iZze);
        int iZzc = (interfaceC3021hC.zzx() || rgZzn.zzo()) ? -1 : rgZzn.zzd(iZze, c3711nF, false).zzc(AbstractC2281am0.zzr(interfaceC3021hC.zzk()));
        for (int i8 = 0; i8 < abstractC2394bl0.size(); i8++) {
            NM0 nm02 = (NM0) abstractC2394bl0.get(i8);
            if (e(nm02, objZzf, interfaceC3021hC.zzx(), interfaceC3021hC.zzb(), interfaceC3021hC.zzc(), iZzc)) {
                return nm02;
            }
        }
        if (abstractC2394bl0.isEmpty() && nm0 != null) {
            if (e(nm0, objZzf, interfaceC3021hC.zzx(), interfaceC3021hC.zzb(), interfaceC3021hC.zzc(), iZzc)) {
                return nm0;
            }
        }
        return null;
    }

    private final void c(C2623dl0 c2623dl0, NM0 nm0, RG rg) {
        if (nm0 == null) {
            return;
        }
        if (rg.zza(nm0.zza) != -1) {
            c2623dl0.zza(nm0, rg);
            return;
        }
        RG rg2 = (RG) this.f16234c.get(nm0);
        if (rg2 != null) {
            c2623dl0.zza(nm0, rg2);
        }
    }

    private final void d(RG rg) {
        C2623dl0 c2623dl0 = new C2623dl0();
        if (this.f16233b.isEmpty()) {
            c(c2623dl0, this.f16236e, rg);
            if (!AbstractC4672vj0.zza(this.f16237f, this.f16236e)) {
                c(c2623dl0, this.f16237f, rg);
            }
            if (!AbstractC4672vj0.zza(this.f16235d, this.f16236e) && !AbstractC4672vj0.zza(this.f16235d, this.f16237f)) {
                c(c2623dl0, this.f16235d, rg);
            }
        } else {
            for (int i8 = 0; i8 < this.f16233b.size(); i8++) {
                c(c2623dl0, (NM0) this.f16233b.get(i8), rg);
            }
            if (!this.f16233b.contains(this.f16235d)) {
                c(c2623dl0, this.f16235d, rg);
            }
        }
        this.f16234c = c2623dl0.zzc();
    }

    private static boolean e(NM0 nm0, Object obj, boolean z8, int i8, int i9, int i10) {
        if (!nm0.zza.equals(obj)) {
            return false;
        }
        if (z8) {
            if (nm0.zzb != i8 || nm0.zzc != i9) {
                return false;
            }
        } else if (nm0.zzb != -1 || nm0.zze != i10) {
            return false;
        }
        return true;
    }

    public final RG zza(NM0 nm0) {
        return (RG) this.f16234c.get(nm0);
    }

    public final NM0 zzb() {
        return this.f16235d;
    }

    public final NM0 zzc() {
        Object next;
        Object obj;
        if (this.f16233b.isEmpty()) {
            return null;
        }
        AbstractC2394bl0 abstractC2394bl0 = this.f16233b;
        if (abstractC2394bl0 == null) {
            Iterator<E> it = abstractC2394bl0.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (abstractC2394bl0.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = abstractC2394bl0.get(abstractC2394bl0.size() - 1);
        }
        return (NM0) obj;
    }

    public final NM0 zzd() {
        return this.f16236e;
    }

    public final NM0 zze() {
        return this.f16237f;
    }

    public final void zzg(InterfaceC3021hC interfaceC3021hC) {
        this.f16235d = b(interfaceC3021hC, this.f16233b, this.f16236e, this.f16232a);
    }

    public final void zzh(List list, NM0 nm0, InterfaceC3021hC interfaceC3021hC) {
        this.f16233b = AbstractC2394bl0.zzk(list);
        if (!list.isEmpty()) {
            this.f16236e = (NM0) list.get(0);
            nm0.getClass();
            this.f16237f = nm0;
        }
        if (this.f16235d == null) {
            this.f16235d = b(interfaceC3021hC, this.f16233b, this.f16236e, this.f16232a);
        }
        d(interfaceC3021hC.zzn());
    }

    public final void zzi(InterfaceC3021hC interfaceC3021hC) {
        this.f16235d = b(interfaceC3021hC, this.f16233b, this.f16236e, this.f16232a);
        d(interfaceC3021hC.zzn());
    }
}
