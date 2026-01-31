package com.google.common.util.concurrent;

import f3.AbstractC5457d0;
import f3.t1;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5167g extends AbstractC5168h {

    /* renamed from: o, reason: collision with root package name */
    private static final Logger f25563o = Logger.getLogger(AbstractC5167g.class.getName());

    /* renamed from: l, reason: collision with root package name */
    private AbstractC5457d0 f25564l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f25565m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f25566n;

    /* renamed from: com.google.common.util.concurrent.g$a */
    enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    AbstractC5167g(AbstractC5457d0 abstractC5457d0, boolean z8, boolean z9) {
        super(abstractC5457d0.size());
        this.f25564l = (AbstractC5457d0) e3.w.checkNotNull(abstractC5457d0);
        this.f25565m = z8;
        this.f25566n = z9;
    }

    private static boolean L(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private void N(int i8, Future future) {
        try {
            M(i8, v.getDone(future));
        } catch (Error e8) {
            e = e8;
            Q(e);
        } catch (RuntimeException e9) {
            e = e9;
            Q(e);
        } catch (ExecutionException e10) {
            Q(e10.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void T(AbstractC5457d0 abstractC5457d0) {
        int iH = H();
        e3.w.checkState(iH >= 0, "Less than 0 remaining futures");
        if (iH == 0) {
            V(abstractC5457d0);
        }
    }

    private void Q(Throwable th) {
        e3.w.checkNotNull(th);
        if (this.f25565m && !setException(th) && L(I(), th)) {
            U(th);
        } else if (th instanceof Error) {
            U(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(C c9, int i8) {
        try {
            if (c9.isCancelled()) {
                this.f25564l = null;
                cancel(false);
            } else {
                N(i8, c9);
            }
            T(null);
        } catch (Throwable th) {
            T(null);
            throw th;
        }
    }

    private static void U(Throwable th) {
        f25563o.log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    private void V(AbstractC5457d0 abstractC5457d0) {
        if (abstractC5457d0 != null) {
            t1 it = abstractC5457d0.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                Future future = (Future) it.next();
                if (!future.isCancelled()) {
                    N(i8, future);
                }
                i8++;
            }
        }
        G();
        P();
        W(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override // com.google.common.util.concurrent.AbstractC5168h
    final void F(Set set) {
        e3.w.checkNotNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable thA = a();
        Objects.requireNonNull(thA);
        L(set, thA);
    }

    abstract void M(int i8, Object obj);

    abstract void P();

    final void R() {
        Objects.requireNonNull(this.f25564l);
        if (this.f25564l.isEmpty()) {
            P();
            return;
        }
        if (!this.f25565m) {
            final AbstractC5457d0 abstractC5457d0 = this.f25566n ? this.f25564l : null;
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25561a.T(abstractC5457d0);
                }
            };
            t1 it = this.f25564l.iterator();
            while (it.hasNext()) {
                ((C) it.next()).addListener(runnable, H.directExecutor());
            }
            return;
        }
        t1 it2 = this.f25564l.iterator();
        final int i8 = 0;
        while (it2.hasNext()) {
            final C c9 = (C) it2.next();
            c9.addListener(new Runnable() { // from class: com.google.common.util.concurrent.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25558a.S(c9, i8);
                }
            }, H.directExecutor());
            i8++;
        }
    }

    void W(a aVar) {
        e3.w.checkNotNull(aVar);
        this.f25564l = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b
    protected final void m() {
        super.m();
        AbstractC5457d0 abstractC5457d0 = this.f25564l;
        W(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (abstractC5457d0 != null)) {
            boolean zB = B();
            t1 it = abstractC5457d0.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zB);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b
    protected final String y() {
        AbstractC5457d0 abstractC5457d0 = this.f25564l;
        if (abstractC5457d0 == null) {
            return super.y();
        }
        return "futures=" + abstractC5457d0;
    }
}
