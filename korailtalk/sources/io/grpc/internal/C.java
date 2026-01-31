package io.grpc.internal;

import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5794n;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.C5804v;
import io.grpc.internal.InterfaceC5764n0;
import io.grpc.internal.InterfaceC5774t;
import io.grpc.internal.InterfaceC5776u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class C implements InterfaceC5764n0 {

    /* renamed from: c, reason: collision with root package name */
    private final Executor f32229c;

    /* renamed from: d, reason: collision with root package name */
    private final io.grpc.N0 f32230d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f32231e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f32232f;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f32233g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC5764n0.a f32234h;

    /* renamed from: j, reason: collision with root package name */
    private io.grpc.J0 f32236j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC5714a0.i f32237k;

    /* renamed from: l, reason: collision with root package name */
    private long f32238l;

    /* renamed from: a, reason: collision with root package name */
    private final io.grpc.U f32227a = io.grpc.U.allocate((Class<?>) C.class, (String) null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f32228b = new Object();

    /* renamed from: i, reason: collision with root package name */
    private Collection f32235i = new LinkedHashSet();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5764n0.a f32239a;

        a(InterfaceC5764n0.a aVar) {
            this.f32239a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32239a.transportInUse(true);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5764n0.a f32241a;

        b(InterfaceC5764n0.a aVar) {
            this.f32241a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32241a.transportInUse(false);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5764n0.a f32243a;

        c(InterfaceC5764n0.a aVar) {
            this.f32243a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32243a.transportTerminated();
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.J0 f32245a;

        d(io.grpc.J0 j02) {
            this.f32245a = j02;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f32234h.transportShutdown(this.f32245a);
        }
    }

    private class e extends D {

        /* renamed from: j, reason: collision with root package name */
        private final AbstractC5714a0.f f32247j;

        /* renamed from: k, reason: collision with root package name */
        private final C5804v f32248k;

        /* renamed from: l, reason: collision with root package name */
        private final AbstractC5794n[] f32249l;

        /* synthetic */ e(C c9, AbstractC5714a0.f fVar, AbstractC5794n[] abstractC5794nArr, a aVar) {
            this(fVar, abstractC5794nArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable l(InterfaceC5776u interfaceC5776u) {
            C5804v c5804vAttach = this.f32248k.attach();
            try {
                InterfaceC5772s interfaceC5772sNewStream = interfaceC5776u.newStream(this.f32247j.getMethodDescriptor(), this.f32247j.getHeaders(), this.f32247j.getCallOptions(), this.f32249l);
                this.f32248k.detach(c5804vAttach);
                return h(interfaceC5772sNewStream);
            } catch (Throwable th) {
                this.f32248k.detach(c5804vAttach);
                throw th;
            }
        }

        @Override // io.grpc.internal.D, io.grpc.internal.InterfaceC5772s
        public void appendTimeoutInsight(C5737a0 c5737a0) {
            if (this.f32247j.getCallOptions().isWaitForReady()) {
                c5737a0.append("wait_for_ready");
            }
            super.appendTimeoutInsight(c5737a0);
        }

        @Override // io.grpc.internal.D, io.grpc.internal.InterfaceC5772s
        public void cancel(io.grpc.J0 j02) {
            super.cancel(j02);
            synchronized (C.this.f32228b) {
                try {
                    if (C.this.f32233g != null) {
                        boolean zRemove = C.this.f32235i.remove(this);
                        if (!C.this.hasPendingStreams() && zRemove) {
                            C.this.f32230d.executeLater(C.this.f32232f);
                            if (C.this.f32236j != null) {
                                C.this.f32230d.executeLater(C.this.f32233g);
                                C.this.f32233g = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C.this.f32230d.drain();
        }

        @Override // io.grpc.internal.D
        protected void f(io.grpc.J0 j02) {
            for (AbstractC5794n abstractC5794n : this.f32249l) {
                abstractC5794n.streamClosed(j02);
            }
        }

        private e(AbstractC5714a0.f fVar, AbstractC5794n[] abstractC5794nArr) {
            this.f32248k = C5804v.current();
            this.f32247j = fVar;
            this.f32249l = abstractC5794nArr;
        }
    }

    C(Executor executor, io.grpc.N0 n02) {
        this.f32229c = executor;
        this.f32230d = n02;
    }

    private e i(AbstractC5714a0.f fVar, AbstractC5794n[] abstractC5794nArr) {
        e eVar = new e(this, fVar, abstractC5794nArr, null);
        this.f32235i.add(eVar);
        if (j() == 1) {
            this.f32230d.executeLater(this.f32231e);
        }
        for (AbstractC5794n abstractC5794n : abstractC5794nArr) {
            abstractC5794n.createPendingStream();
        }
        return eVar;
    }

    @Override // io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u, io.grpc.T, io.grpc.Y
    public io.grpc.U getLogId() {
        return this.f32227a;
    }

    @Override // io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u, io.grpc.T
    public com.google.common.util.concurrent.C getStats() {
        com.google.common.util.concurrent.M mCreate = com.google.common.util.concurrent.M.create();
        mCreate.set(null);
        return mCreate;
    }

    public final boolean hasPendingStreams() {
        boolean z8;
        synchronized (this.f32228b) {
            z8 = !this.f32235i.isEmpty();
        }
        return z8;
    }

    final int j() {
        int size;
        synchronized (this.f32228b) {
            size = this.f32235i.size();
        }
        return size;
    }

    final void k(AbstractC5714a0.i iVar) {
        Runnable runnable;
        synchronized (this.f32228b) {
            this.f32237k = iVar;
            this.f32238l++;
            if (iVar != null && hasPendingStreams()) {
                ArrayList arrayList = new ArrayList(this.f32235i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    AbstractC5714a0.e eVarPickSubchannel = iVar.pickSubchannel(eVar.f32247j);
                    C5721e callOptions = eVar.f32247j.getCallOptions();
                    InterfaceC5776u interfaceC5776uC = U.c(eVarPickSubchannel, callOptions.isWaitForReady());
                    if (interfaceC5776uC != null) {
                        Executor executor = this.f32229c;
                        if (callOptions.getExecutor() != null) {
                            executor = callOptions.getExecutor();
                        }
                        Runnable runnableL = eVar.l(interfaceC5776uC);
                        if (runnableL != null) {
                            executor.execute(runnableL);
                        }
                        arrayList2.add(eVar);
                    }
                }
                synchronized (this.f32228b) {
                    try {
                        if (hasPendingStreams()) {
                            this.f32235i.removeAll(arrayList2);
                            if (this.f32235i.isEmpty()) {
                                this.f32235i = new LinkedHashSet();
                            }
                            if (!hasPendingStreams()) {
                                this.f32230d.executeLater(this.f32232f);
                                if (this.f32236j != null && (runnable = this.f32233g) != null) {
                                    this.f32230d.executeLater(runnable);
                                    this.f32233g = null;
                                }
                            }
                            this.f32230d.drain();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u
    public final InterfaceC5772s newStream(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, AbstractC5794n[] abstractC5794nArr) {
        InterfaceC5772s h8;
        try {
            C5781w0 c5781w0 = new C5781w0(c5730i0, c5728h0, c5721e);
            AbstractC5714a0.i iVar = null;
            long j8 = -1;
            while (true) {
                synchronized (this.f32228b) {
                    if (this.f32236j == null) {
                        AbstractC5714a0.i iVar2 = this.f32237k;
                        if (iVar2 != null) {
                            if (iVar != null && j8 == this.f32238l) {
                                h8 = i(c5781w0, abstractC5794nArr);
                                break;
                            }
                            j8 = this.f32238l;
                            InterfaceC5776u interfaceC5776uC = U.c(iVar2.pickSubchannel(c5781w0), c5721e.isWaitForReady());
                            if (interfaceC5776uC != null) {
                                h8 = interfaceC5776uC.newStream(c5781w0.getMethodDescriptor(), c5781w0.getHeaders(), c5781w0.getCallOptions(), abstractC5794nArr);
                                break;
                            }
                            iVar = iVar2;
                        } else {
                            h8 = i(c5781w0, abstractC5794nArr);
                            break;
                        }
                    } else {
                        h8 = new H(this.f32236j, abstractC5794nArr);
                        break;
                    }
                }
            }
            return h8;
        } finally {
            this.f32230d.drain();
        }
    }

    @Override // io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u
    public final void ping(InterfaceC5776u.a aVar, Executor executor) {
        throw new UnsupportedOperationException("This method is not expected to be called");
    }

    @Override // io.grpc.internal.InterfaceC5764n0
    public final void shutdown(io.grpc.J0 j02) {
        Runnable runnable;
        synchronized (this.f32228b) {
            try {
                if (this.f32236j != null) {
                    return;
                }
                this.f32236j = j02;
                this.f32230d.executeLater(new d(j02));
                if (!hasPendingStreams() && (runnable = this.f32233g) != null) {
                    this.f32230d.executeLater(runnable);
                    this.f32233g = null;
                }
                this.f32230d.drain();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC5764n0
    public final void shutdownNow(io.grpc.J0 j02) {
        Collection<e> collection;
        Runnable runnable;
        shutdown(j02);
        synchronized (this.f32228b) {
            try {
                collection = this.f32235i;
                runnable = this.f32233g;
                this.f32233g = null;
                if (!collection.isEmpty()) {
                    this.f32235i = Collections.emptyList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable runnableH = eVar.h(new H(j02, InterfaceC5774t.a.REFUSED, eVar.f32249l));
                if (runnableH != null) {
                    runnableH.run();
                }
            }
            this.f32230d.execute(runnable);
        }
    }

    @Override // io.grpc.internal.InterfaceC5764n0
    public final Runnable start(InterfaceC5764n0.a aVar) {
        this.f32234h = aVar;
        this.f32231e = new a(aVar);
        this.f32232f = new b(aVar);
        this.f32233g = new c(aVar);
        return null;
    }
}
