package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.gn0 */
/* loaded from: classes2.dex */
abstract class AbstractC2971gn0 extends AbstractC3655mn0 {

    /* renamed from: o */
    private static final C1933Tn0 f19399o = new C1933Tn0(AbstractC2971gn0.class);

    /* renamed from: l */
    private AbstractC2009Vk0 f19400l;

    /* renamed from: m */
    private final boolean f19401m;

    /* renamed from: n */
    private final boolean f19402n;

    AbstractC2971gn0(AbstractC2009Vk0 abstractC2009Vk0, boolean z8, boolean z9) {
        super(abstractC2009Vk0.size());
        this.f19400l = abstractC2009Vk0;
        this.f19401m = z8;
        this.f19402n = z9;
    }

    private final void G(int i8, Future future) {
        try {
            L(i8, AbstractC1483In0.zzp(future));
        } catch (ExecutionException e8) {
            I(e8.getCause());
        } catch (Throwable th) {
            I(th);
        }
    }

    /* renamed from: H */
    public final void P(AbstractC2009Vk0 abstractC2009Vk0) {
        int iY = y();
        int i8 = 0;
        AbstractC1188Bj0.zzk(iY >= 0, "Less than 0 remaining futures");
        if (iY == 0) {
            if (abstractC2009Vk0 != null) {
                AbstractC3311jm0 it = abstractC2009Vk0.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        G(i8, future);
                    }
                    i8++;
                }
            }
            D();
            M();
            Q(2);
        }
    }

    private final void I(Throwable th) {
        th.getClass();
        if (this.f19401m && !zzd(th) && K(A(), th)) {
            J(th);
        } else if (th instanceof Error) {
            J(th);
        }
    }

    private static void J(Throwable th) {
        f19399o.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean K(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3655mn0
    final void E(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thA = a();
        Objects.requireNonNull(thA);
        K(set, thA);
    }

    abstract void L(int i8, Object obj);

    abstract void M();

    final void N() {
        Objects.requireNonNull(this.f19400l);
        if (this.f19400l.isEmpty()) {
            M();
            return;
        }
        if (!this.f19401m) {
            final AbstractC2009Vk0 abstractC2009Vk0 = this.f19402n ? this.f19400l : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.fn0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.P(abstractC2009Vk0);
                }
            };
            AbstractC3311jm0 it = this.f19400l.iterator();
            while (it.hasNext()) {
                ((com.google.common.util.concurrent.C) it.next()).addListener(runnable, EnumC4794wn0.INSTANCE);
            }
            return;
        }
        AbstractC3311jm0 it2 = this.f19400l.iterator();
        final int i8 = 0;
        while (it2.hasNext()) {
            final com.google.common.util.concurrent.C c9 = (com.google.common.util.concurrent.C) it2.next();
            c9.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.en0
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.O(c9, i8);
                }
            }, EnumC4794wn0.INSTANCE);
            i8++;
        }
    }

    final /* synthetic */ void O(com.google.common.util.concurrent.C c9, int i8) {
        try {
            if (c9.isCancelled()) {
                this.f19400l = null;
                cancel(false);
            } else {
                G(i8, c9);
            }
            P(null);
        } catch (Throwable th) {
            P(null);
            throw th;
        }
    }

    void Q(int i8) {
        this.f19400l = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final void c() {
        AbstractC2009Vk0 abstractC2009Vk0 = this.f19400l;
        Q(1);
        if ((abstractC2009Vk0 != null) && isCancelled()) {
            boolean zR = r();
            AbstractC3311jm0 it = abstractC2009Vk0.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zR);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final String zza() {
        AbstractC2009Vk0 abstractC2009Vk0 = this.f19400l;
        return abstractC2009Vk0 != null ? "futures=".concat(abstractC2009Vk0.toString()) : super.zza();
    }
}
