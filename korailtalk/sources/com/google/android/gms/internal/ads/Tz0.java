package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class Tz0 implements InterfaceC3360kA0 {

    /* renamed from: a */
    private final Pz0 f16562a;

    /* renamed from: b */
    private final BA0 f16563b;

    /* renamed from: c */
    private final boolean f16564c;

    /* renamed from: d */
    private final Jy0 f16565d;

    private Tz0(BA0 ba0, Jy0 jy0, Pz0 pz0) {
        this.f16563b = ba0;
        this.f16564c = jy0.j(pz0);
        this.f16565d = jy0;
        this.f16562a = pz0;
    }

    static Tz0 a(BA0 ba0, Jy0 jy0, Pz0 pz0) {
        return new Tz0(ba0, jy0, pz0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final int zza(Object obj) {
        BA0 ba0 = this.f16563b;
        int iB = ba0.b(ba0.d(obj));
        return this.f16564c ? iB + this.f16565d.b(obj).zzd() : iB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final int zzb(Object obj) {
        int iHashCode = this.f16563b.d(obj).hashCode();
        return this.f16564c ? (iHashCode * 53) + this.f16565d.b(obj).f15178a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final Object zze() {
        Pz0 pz0 = this.f16562a;
        return pz0 instanceof Zy0 ? ((Zy0) pz0).A() : pz0.zzcY().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final void zzf(Object obj) {
        this.f16563b.m(obj);
        this.f16565d.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final void zzg(Object obj, Object obj2) {
        AbstractC3702nA0.q(this.f16563b, obj, obj2);
        if (this.f16564c) {
            AbstractC3702nA0.p(this.f16565d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final void zzh(Object obj, InterfaceC2444cA0 interfaceC2444cA0, Iy0 iy0) {
        boolean zZzQ;
        BA0 ba0 = this.f16563b;
        Object objC = ba0.c(obj);
        Jy0 jy0 = this.f16565d;
        Oy0 oy0C = jy0.c(obj);
        while (interfaceC2444cA0.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = interfaceC2444cA0.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objD = jy0.d(iy0, this.f16562a, iZzd >>> 3);
                        if (objD != null) {
                            jy0.g(interfaceC2444cA0, objD, iy0, oy0C);
                        } else {
                            zZzQ = ba0.r(objC, interfaceC2444cA0);
                        }
                    } else {
                        zZzQ = interfaceC2444cA0.zzQ();
                    }
                    if (!zZzQ) {
                        break;
                    }
                } else {
                    Object objD2 = null;
                    int iZzj = 0;
                    AbstractC3677my0 abstractC3677my0Zzp = null;
                    while (interfaceC2444cA0.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = interfaceC2444cA0.zzd();
                        if (iZzd2 == 16) {
                            iZzj = interfaceC2444cA0.zzj();
                            objD2 = jy0.d(iy0, this.f16562a, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objD2 != null) {
                                jy0.g(interfaceC2444cA0, objD2, iy0, oy0C);
                            } else {
                                abstractC3677my0Zzp = interfaceC2444cA0.zzp();
                            }
                        } else if (!interfaceC2444cA0.zzQ()) {
                            break;
                        }
                    }
                    if (interfaceC2444cA0.zzd() != 12) {
                        throw C4021pz0.b();
                    }
                    if (abstractC3677my0Zzp != null) {
                        if (objD2 != null) {
                            jy0.h(abstractC3677my0Zzp, objD2, iy0, oy0C);
                        } else {
                            ba0.k(objC, iZzj, abstractC3677my0Zzp);
                        }
                    }
                }
            } finally {
                ba0.n(obj, objC);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final void zzi(Object obj, byte[] bArr, int i8, int i9, Vx0 vx0) {
        Zy0 zy0 = (Zy0) obj;
        if (zy0.zzt == CA0.zzc()) {
            zy0.zzt = CA0.c();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final void zzj(Object obj, UA0 ua0) {
        Iterator itZzg = this.f16565d.b(obj).zzg();
        while (itZzg.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzg.next();
            Ny0 ny0 = (Ny0) entry.getKey();
            if (ny0.zze() != TA0.MESSAGE || ny0.zzg() || ny0.zzf()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof AbstractC4362sz0) {
                ny0.zza();
                ((AbstractC4362sz0) entry).a();
                throw null;
            }
            ua0.zzw(ny0.zza(), entry.getValue());
        }
        BA0 ba0 = this.f16563b;
        ba0.p(ba0.d(obj), ua0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final boolean zzk(Object obj, Object obj2) {
        BA0 ba0 = this.f16563b;
        if (!ba0.d(obj).equals(ba0.d(obj2))) {
            return false;
        }
        if (this.f16564c) {
            return this.f16565d.b(obj).equals(this.f16565d.b(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final boolean zzl(Object obj) {
        return this.f16565d.b(obj).zzl();
    }
}
