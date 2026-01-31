package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;
import g2.AbstractC5547i;
import g2.InterfaceC5549k;
import g2.n;
import i2.AbstractC5683p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends g2.n> extends AbstractC5547i {

    /* renamed from: o */
    static final ThreadLocal f11857o = new x0();
    public static final /* synthetic */ int zad = 0;

    /* renamed from: a */
    private final Object f11858a;

    /* renamed from: b */
    protected final a f11859b;

    /* renamed from: c */
    protected final WeakReference f11860c;

    /* renamed from: d */
    private final CountDownLatch f11861d;

    /* renamed from: e */
    private final ArrayList f11862e;

    /* renamed from: f */
    private g2.o f11863f;

    /* renamed from: g */
    private final AtomicReference f11864g;

    /* renamed from: h */
    private g2.n f11865h;

    /* renamed from: i */
    private Status f11866i;

    /* renamed from: j */
    private volatile boolean f11867j;

    /* renamed from: k */
    private boolean f11868k;

    /* renamed from: l */
    private boolean f11869l;

    /* renamed from: m */
    private volatile j0 f11870m;

    @KeepName
    private y0 mResultGuardian;

    /* renamed from: n */
    private boolean f11871n;

    protected BasePendingResult(Looper looper) {
        this.f11858a = new Object();
        this.f11861d = new CountDownLatch(1);
        this.f11862e = new ArrayList();
        this.f11864g = new AtomicReference();
        this.f11871n = false;
        this.f11859b = new a(looper);
        this.f11860c = new WeakReference(null);
    }

    private final g2.n a() {
        g2.n nVar;
        synchronized (this.f11858a) {
            AbstractC5683p.checkState(!this.f11867j, "Result has already been consumed.");
            AbstractC5683p.checkState(isReady(), "Result is not ready.");
            nVar = this.f11865h;
            this.f11865h = null;
            this.f11863f = null;
            this.f11867j = true;
        }
        k0 k0Var = (k0) this.f11864g.getAndSet(null);
        if (k0Var != null) {
            k0Var.f12071a.f12074a.remove(this);
        }
        return (g2.n) AbstractC5683p.checkNotNull(nVar);
    }

    private final void b(g2.n nVar) {
        this.f11865h = nVar;
        this.f11866i = nVar.getStatus();
        this.f11861d.countDown();
        h2.S s8 = null;
        if (this.f11868k) {
            this.f11863f = null;
        } else {
            g2.o oVar = this.f11863f;
            if (oVar != null) {
                this.f11859b.removeMessages(2);
                this.f11859b.zaa(oVar, a());
            } else if (this.f11865h instanceof InterfaceC5549k) {
                this.mResultGuardian = new y0(this, s8);
            }
        }
        ArrayList arrayList = this.f11862e;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC5547i.a) arrayList.get(i8)).onComplete(this.f11866i);
        }
        this.f11862e.clear();
    }

    public static void zal(g2.n nVar) {
        if (nVar instanceof InterfaceC5549k) {
            try {
                ((InterfaceC5549k) nVar).release();
            } catch (RuntimeException e8) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(nVar)), e8);
            }
        }
    }

    @Override // g2.AbstractC5547i
    public final void addStatusListener(AbstractC5547i.a aVar) {
        AbstractC5683p.checkArgument(aVar != null, "Callback cannot be null.");
        synchronized (this.f11858a) {
            try {
                if (isReady()) {
                    aVar.onComplete(this.f11866i);
                } else {
                    this.f11862e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g2.AbstractC5547i
    public final R await() throws InterruptedException {
        AbstractC5683p.checkNotMainThread("await must not be called on the UI thread");
        AbstractC5683p.checkState(!this.f11867j, "Result has already been consumed");
        AbstractC5683p.checkState(this.f11870m == null, "Cannot await if then() has been called.");
        try {
            this.f11861d.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        AbstractC5683p.checkState(isReady(), "Result is not ready.");
        return (R) a();
    }

    @Override // g2.AbstractC5547i
    public void cancel() {
        synchronized (this.f11858a) {
            try {
                if (!this.f11868k && !this.f11867j) {
                    zal(this.f11865h);
                    this.f11868k = true;
                    b(createFailedResult(Status.RESULT_CANCELED));
                }
            } finally {
            }
        }
    }

    protected abstract g2.n createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.f11858a) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.f11869l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g2.AbstractC5547i
    public final boolean isCanceled() {
        boolean z8;
        synchronized (this.f11858a) {
            z8 = this.f11868k;
        }
        return z8;
    }

    public final boolean isReady() {
        return this.f11861d.getCount() == 0;
    }

    public final void setResult(R r8) {
        synchronized (this.f11858a) {
            try {
                if (this.f11869l || this.f11868k) {
                    zal(r8);
                    return;
                }
                isReady();
                AbstractC5683p.checkState(!isReady(), "Results have already been set");
                AbstractC5683p.checkState(!this.f11867j, "Result has already been consumed");
                b(r8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g2.AbstractC5547i
    public final void setResultCallback(g2.o oVar) {
        synchronized (this.f11858a) {
            try {
                if (oVar == null) {
                    this.f11863f = null;
                    return;
                }
                boolean z8 = true;
                AbstractC5683p.checkState(!this.f11867j, "Result has already been consumed.");
                if (this.f11870m != null) {
                    z8 = false;
                }
                AbstractC5683p.checkState(z8, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.f11859b.zaa(oVar, a());
                } else {
                    this.f11863f = oVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g2.AbstractC5547i
    public final <S extends g2.n> g2.r then(g2.q qVar) {
        g2.r rVarThen;
        AbstractC5683p.checkState(!this.f11867j, "Result has already been consumed.");
        synchronized (this.f11858a) {
            try {
                AbstractC5683p.checkState(this.f11870m == null, "Cannot call then() twice.");
                AbstractC5683p.checkState(this.f11863f == null, "Cannot call then() if callbacks are set.");
                AbstractC5683p.checkState(!this.f11868k, "Cannot call then() if result was canceled.");
                this.f11871n = true;
                this.f11870m = new j0(this.f11860c);
                rVarThen = this.f11870m.then(qVar);
                if (isReady()) {
                    this.f11859b.zaa(this.f11870m, a());
                } else {
                    this.f11863f = this.f11870m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVarThen;
    }

    public final void zak() {
        boolean z8 = true;
        if (!this.f11871n && !((Boolean) f11857o.get()).booleanValue()) {
            z8 = false;
        }
        this.f11871n = z8;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.f11858a) {
            try {
                if (((AbstractC5544f) this.f11860c.get()) == null || !this.f11871n) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCanceled;
    }

    public final void zan(k0 k0Var) {
        this.f11864g.set(k0Var);
    }

    public static class a extends x2.j {
        public a() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                Pair pair = (Pair) message.obj;
                g2.o oVar = (g2.o) pair.first;
                g2.n nVar = (g2.n) pair.second;
                try {
                    oVar.onResult(nVar);
                    return;
                } catch (RuntimeException e8) {
                    BasePendingResult.zal(nVar);
                    throw e8;
                }
            }
            if (i8 == 2) {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                return;
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i8);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        }

        public final void zaa(g2.o oVar, g2.n nVar) {
            int i8 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((g2.o) AbstractC5683p.checkNotNull(oVar), nVar)));
        }

        public a(Looper looper) {
            super(looper);
        }
    }

    protected BasePendingResult(AbstractC5544f abstractC5544f) {
        this.f11858a = new Object();
        this.f11861d = new CountDownLatch(1);
        this.f11862e = new ArrayList();
        this.f11864g = new AtomicReference();
        this.f11871n = false;
        this.f11859b = new a(abstractC5544f != null ? abstractC5544f.getLooper() : Looper.getMainLooper());
        this.f11860c = new WeakReference(abstractC5544f);
    }

    @Override // g2.AbstractC5547i
    public final R await(long j8, TimeUnit timeUnit) {
        if (j8 > 0) {
            AbstractC5683p.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC5683p.checkState(!this.f11867j, "Result has already been consumed.");
        AbstractC5683p.checkState(this.f11870m == null, "Cannot await if then() has been called.");
        try {
            if (!this.f11861d.await(j8, timeUnit)) {
                forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        AbstractC5683p.checkState(isReady(), "Result is not ready.");
        return (R) a();
    }

    @Override // g2.AbstractC5547i
    public final void setResultCallback(g2.o oVar, long j8, TimeUnit timeUnit) {
        synchronized (this.f11858a) {
            try {
                if (oVar == null) {
                    this.f11863f = null;
                    return;
                }
                boolean z8 = true;
                AbstractC5683p.checkState(!this.f11867j, "Result has already been consumed.");
                if (this.f11870m != null) {
                    z8 = false;
                }
                AbstractC5683p.checkState(z8, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.f11859b.zaa(oVar, a());
                } else {
                    this.f11863f = oVar;
                    a aVar = this.f11859b;
                    aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j8));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
