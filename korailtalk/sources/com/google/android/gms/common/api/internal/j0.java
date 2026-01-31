package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;
import g2.AbstractC5547i;
import g2.InterfaceC5549k;
import i2.AbstractC5683p;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j0 extends g2.r implements g2.o {

    /* renamed from: g */
    private final WeakReference f12066g;

    /* renamed from: h */
    private final h0 f12067h;

    /* renamed from: a */
    private g2.q f12060a = null;

    /* renamed from: b */
    private j0 f12061b = null;

    /* renamed from: c */
    private volatile g2.p f12062c = null;

    /* renamed from: d */
    private AbstractC5547i f12063d = null;

    /* renamed from: e */
    private final Object f12064e = new Object();

    /* renamed from: f */
    private Status f12065f = null;

    /* renamed from: i */
    private boolean f12068i = false;

    public j0(WeakReference<AbstractC5544f> weakReference) {
        AbstractC5683p.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.f12066g = weakReference;
        AbstractC5544f abstractC5544f = weakReference.get();
        this.f12067h = new h0(this, abstractC5544f != null ? abstractC5544f.getLooper() : Looper.getMainLooper());
    }

    public final void i(Status status) {
        synchronized (this.f12064e) {
            this.f12065f = status;
            k(status);
        }
    }

    private final void j() {
        if (this.f12060a == null && this.f12062c == null) {
            return;
        }
        AbstractC5544f abstractC5544f = (AbstractC5544f) this.f12066g.get();
        if (!this.f12068i && this.f12060a != null && abstractC5544f != null) {
            abstractC5544f.zao(this);
            this.f12068i = true;
        }
        Status status = this.f12065f;
        if (status != null) {
            k(status);
            return;
        }
        AbstractC5547i abstractC5547i = this.f12063d;
        if (abstractC5547i != null) {
            abstractC5547i.setResultCallback(this);
        }
    }

    private final void k(Status status) {
        synchronized (this.f12064e) {
            try {
                g2.q qVar = this.f12060a;
                if (qVar != null) {
                    ((j0) AbstractC5683p.checkNotNull(this.f12061b)).i((Status) AbstractC5683p.checkNotNull(qVar.onFailure(status), "onFailure must not return null"));
                } else if (l()) {
                    ((g2.p) AbstractC5683p.checkNotNull(this.f12062c)).onFailure(status);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean l() {
        return (this.f12062c == null || ((AbstractC5544f) this.f12066g.get()) == null) ? false : true;
    }

    public static final void m(g2.n nVar) {
        if (nVar instanceof InterfaceC5549k) {
            try {
                ((InterfaceC5549k) nVar).release();
            } catch (RuntimeException e8) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(nVar)), e8);
            }
        }
    }

    @Override // g2.r
    public final void andFinally(g2.p pVar) {
        synchronized (this.f12064e) {
            AbstractC5683p.checkState(this.f12062c == null, "Cannot call andFinally() twice.");
            AbstractC5683p.checkState(this.f12060a == null, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f12062c = pVar;
            j();
        }
    }

    final void h() {
        this.f12062c = null;
    }

    @Override // g2.o
    public final void onResult(g2.n nVar) {
        synchronized (this.f12064e) {
            try {
                if (!nVar.getStatus().isSuccess()) {
                    i(nVar.getStatus());
                    m(nVar);
                } else if (this.f12060a != null) {
                    h2.I.zaa().submit(new g0(this, nVar));
                } else if (l()) {
                    ((g2.p) AbstractC5683p.checkNotNull(this.f12062c)).onSuccess(nVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g2.r
    public final <S extends g2.n> g2.r then(g2.q qVar) {
        j0 j0Var;
        synchronized (this.f12064e) {
            AbstractC5683p.checkState(this.f12060a == null, "Cannot call then() twice.");
            AbstractC5683p.checkState(this.f12062c == null, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f12060a = qVar;
            j0Var = new j0(this.f12066g);
            this.f12061b = j0Var;
            j();
        }
        return j0Var;
    }

    public final void zai(AbstractC5547i abstractC5547i) {
        synchronized (this.f12064e) {
            this.f12063d = abstractC5547i;
            j();
        }
    }
}
