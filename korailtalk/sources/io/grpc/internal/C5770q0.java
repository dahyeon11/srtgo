package io.grpc.internal;

import io.grpc.AbstractC5719d;
import io.grpc.AbstractC5794n;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.C5804v;

/* renamed from: io.grpc.internal.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5770q0 extends AbstractC5719d.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5776u f33092a;

    /* renamed from: b, reason: collision with root package name */
    private final C5730i0 f33093b;

    /* renamed from: c, reason: collision with root package name */
    private final C5728h0 f33094c;

    /* renamed from: d, reason: collision with root package name */
    private final C5721e f33095d;

    /* renamed from: f, reason: collision with root package name */
    private final a f33097f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC5794n[] f33098g;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC5772s f33100i;

    /* renamed from: j, reason: collision with root package name */
    boolean f33101j;

    /* renamed from: k, reason: collision with root package name */
    D f33102k;

    /* renamed from: h, reason: collision with root package name */
    private final Object f33099h = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final C5804v f33096e = C5804v.current();

    /* renamed from: io.grpc.internal.q0$a */
    public interface a {
        void onComplete();
    }

    C5770q0(InterfaceC5776u interfaceC5776u, C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, a aVar, AbstractC5794n[] abstractC5794nArr) {
        this.f33092a = interfaceC5776u;
        this.f33093b = c5730i0;
        this.f33094c = c5728h0;
        this.f33095d = c5721e;
        this.f33097f = aVar;
        this.f33098g = abstractC5794nArr;
    }

    private void a(InterfaceC5772s interfaceC5772s) {
        boolean z8;
        e3.w.checkState(!this.f33101j, "already finalized");
        this.f33101j = true;
        synchronized (this.f33099h) {
            try {
                if (this.f33100i == null) {
                    this.f33100i = interfaceC5772s;
                    z8 = true;
                } else {
                    z8 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            this.f33097f.onComplete();
            return;
        }
        e3.w.checkState(this.f33102k != null, "delayedStream is null");
        Runnable runnableH = this.f33102k.h(interfaceC5772s);
        if (runnableH != null) {
            runnableH.run();
        }
        this.f33097f.onComplete();
    }

    @Override // io.grpc.AbstractC5719d.a
    public void apply(C5728h0 c5728h0) {
        e3.w.checkState(!this.f33101j, "apply() or fail() already called");
        e3.w.checkNotNull(c5728h0, "headers");
        this.f33094c.merge(c5728h0);
        C5804v c5804vAttach = this.f33096e.attach();
        try {
            InterfaceC5772s interfaceC5772sNewStream = this.f33092a.newStream(this.f33093b, this.f33094c, this.f33095d, this.f33098g);
            this.f33096e.detach(c5804vAttach);
            a(interfaceC5772sNewStream);
        } catch (Throwable th) {
            this.f33096e.detach(c5804vAttach);
            throw th;
        }
    }

    InterfaceC5772s b() {
        synchronized (this.f33099h) {
            try {
                InterfaceC5772s interfaceC5772s = this.f33100i;
                if (interfaceC5772s != null) {
                    return interfaceC5772s;
                }
                D d9 = new D();
                this.f33102k = d9;
                this.f33100i = d9;
                return d9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.AbstractC5719d.a
    public void fail(io.grpc.J0 j02) {
        e3.w.checkArgument(!j02.isOk(), "Cannot fail with OK status");
        e3.w.checkState(!this.f33101j, "apply() or fail() already called");
        a(new H(U.replaceInappropriateControlPlaneStatus(j02), this.f33098g));
    }
}
