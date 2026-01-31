package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.fA0 */
/* loaded from: classes2.dex */
final class C2788fA0 {

    /* renamed from: a */
    private final ArrayDeque f19132a = new ArrayDeque();

    /* synthetic */ C2788fA0(AbstractC2673eA0 abstractC2673eA0) {
    }

    static /* bridge */ /* synthetic */ AbstractC3677my0 a(C2788fA0 c2788fA0, AbstractC3677my0 abstractC3677my0, AbstractC3677my0 abstractC3677my02) {
        c2788fA0.b(abstractC3677my0);
        c2788fA0.b(abstractC3677my02);
        AbstractC3677my0 c3246jA0 = (AbstractC3677my0) c2788fA0.f19132a.pop();
        while (!c2788fA0.f19132a.isEmpty()) {
            c3246jA0 = new C3246jA0((AbstractC3677my0) c2788fA0.f19132a.pop(), c3246jA0);
        }
        return c3246jA0;
    }

    private final void b(AbstractC3677my0 abstractC3677my0) {
        if (!abstractC3677my0.e()) {
            if (!(abstractC3677my0 instanceof C3246jA0)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC3677my0.getClass())));
            }
            C3246jA0 c3246jA0 = (C3246jA0) abstractC3677my0;
            b(c3246jA0.f20203e);
            b(c3246jA0.f20204f);
            return;
        }
        int iC = c(abstractC3677my0.zzd());
        ArrayDeque arrayDeque = this.f19132a;
        int iP = C3246jA0.p(iC + 1);
        if (arrayDeque.isEmpty() || ((AbstractC3677my0) this.f19132a.peek()).zzd() >= iP) {
            this.f19132a.push(abstractC3677my0);
            return;
        }
        int iP2 = C3246jA0.p(iC);
        AbstractC3677my0 c3246jA02 = (AbstractC3677my0) this.f19132a.pop();
        while (!this.f19132a.isEmpty() && ((AbstractC3677my0) this.f19132a.peek()).zzd() < iP2) {
            c3246jA02 = new C3246jA0((AbstractC3677my0) this.f19132a.pop(), c3246jA02);
        }
        C3246jA0 c3246jA03 = new C3246jA0(c3246jA02, abstractC3677my0);
        while (!this.f19132a.isEmpty()) {
            int iC2 = c(c3246jA03.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.f19132a;
            if (((AbstractC3677my0) arrayDeque2.peek()).zzd() >= C3246jA0.p(iC2)) {
                break;
            } else {
                c3246jA03 = new C3246jA0((AbstractC3677my0) this.f19132a.pop(), c3246jA03);
            }
        }
        this.f19132a.push(c3246jA03);
    }

    private static final int c(int i8) {
        int iBinarySearch = Arrays.binarySearch(C3246jA0.f20201i, i8);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
