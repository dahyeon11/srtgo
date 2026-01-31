package com.google.android.gms.common.api.internal;

import g2.AbstractC5544f;
import g2.AbstractC5547i;
import i2.AbstractC5683p;

/* loaded from: classes.dex */
final class g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g2.n f12034a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j0 f12035b;

    g0(j0 j0Var, g2.n nVar) {
        this.f12035b = j0Var;
        this.f12034a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5544f abstractC5544f;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.f11857o;
                threadLocal.set(Boolean.TRUE);
                AbstractC5547i abstractC5547iOnSuccess = ((g2.q) AbstractC5683p.checkNotNull(this.f12035b.f12060a)).onSuccess(this.f12034a);
                j0 j0Var = this.f12035b;
                j0Var.f12067h.sendMessage(j0Var.f12067h.obtainMessage(0, abstractC5547iOnSuccess));
                threadLocal.set(Boolean.FALSE);
                j0 j0Var2 = this.f12035b;
                j0.m(this.f12034a);
                abstractC5544f = (AbstractC5544f) this.f12035b.f12066g.get();
                if (abstractC5544f == null) {
                    return;
                }
            } catch (RuntimeException e8) {
                j0 j0Var3 = this.f12035b;
                j0Var3.f12067h.sendMessage(j0Var3.f12067h.obtainMessage(1, e8));
                BasePendingResult.f11857o.set(Boolean.FALSE);
                j0 j0Var4 = this.f12035b;
                j0.m(this.f12034a);
                abstractC5544f = (AbstractC5544f) this.f12035b.f12066g.get();
                if (abstractC5544f == null) {
                    return;
                }
            }
            abstractC5544f.zap(this.f12035b);
        } catch (Throwable th) {
            BasePendingResult.f11857o.set(Boolean.FALSE);
            j0 j0Var5 = this.f12035b;
            j0.m(this.f12034a);
            AbstractC5544f abstractC5544f2 = (AbstractC5544f) this.f12035b.f12066g.get();
            if (abstractC5544f2 != null) {
                abstractC5544f2.zap(this.f12035b);
            }
            throw th;
        }
    }
}
