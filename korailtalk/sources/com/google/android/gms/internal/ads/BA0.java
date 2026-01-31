package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class BA0 {
    BA0() {
    }

    abstract int a(Object obj);

    abstract int b(Object obj);

    abstract Object c(Object obj);

    abstract Object d(Object obj);

    abstract Object e(Object obj, Object obj2);

    abstract Object f();

    abstract Object g(Object obj);

    abstract void h(Object obj, int i8, int i9);

    abstract void i(Object obj, int i8, long j8);

    abstract void j(Object obj, int i8, Object obj2);

    abstract void k(Object obj, int i8, AbstractC3677my0 abstractC3677my0);

    abstract void l(Object obj, int i8, long j8);

    abstract void m(Object obj);

    abstract void n(Object obj, Object obj2);

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, UA0 ua0);

    abstract void q(Object obj, UA0 ua0);

    final boolean r(Object obj, InterfaceC2444cA0 interfaceC2444cA0) throws C4021pz0 {
        int iZzd = interfaceC2444cA0.zzd();
        int i8 = iZzd >>> 3;
        int i9 = iZzd & 7;
        if (i9 == 0) {
            l(obj, i8, interfaceC2444cA0.zzl());
            return true;
        }
        if (i9 == 1) {
            i(obj, i8, interfaceC2444cA0.zzk());
            return true;
        }
        if (i9 == 2) {
            k(obj, i8, interfaceC2444cA0.zzp());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw C4021pz0.a();
            }
            h(obj, i8, interfaceC2444cA0.zzf());
            return true;
        }
        Object objF = f();
        int i10 = i8 << 3;
        while (interfaceC2444cA0.zzc() != Integer.MAX_VALUE && r(objF, interfaceC2444cA0)) {
        }
        if ((4 | i10) != interfaceC2444cA0.zzd()) {
            throw C4021pz0.b();
        }
        g(objF);
        j(obj, i8, objF);
        return true;
    }

    abstract boolean s(InterfaceC2444cA0 interfaceC2444cA0);
}
