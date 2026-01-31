package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import z.InterfaceC6553B;
import z.S;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    private final Size f7611a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7612b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6553B f7613c;

    /* renamed from: d, reason: collision with root package name */
    final com.google.common.util.concurrent.C f7614d;

    /* renamed from: e, reason: collision with root package name */
    private final c.a f7615e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.common.util.concurrent.C f7616f;

    /* renamed from: g, reason: collision with root package name */
    private final c.a f7617g;

    /* renamed from: h, reason: collision with root package name */
    private final z.S f7618h;

    /* renamed from: i, reason: collision with root package name */
    private g f7619i;

    /* renamed from: j, reason: collision with root package name */
    private h f7620j;

    /* renamed from: k, reason: collision with root package name */
    private Executor f7621k;

    class a implements B.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f7622a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.C f7623b;

        a(c.a aVar, com.google.common.util.concurrent.C c9) {
            this.f7622a = aVar;
            this.f7623b = c9;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            if (th instanceof e) {
                Z.h.checkState(this.f7623b.cancel(false));
            } else {
                Z.h.checkState(this.f7622a.set(null));
            }
        }

        @Override // B.c
        public void onSuccess(Void r22) {
            Z.h.checkState(this.f7622a.set(null));
        }
    }

    class b extends z.S {
        b(Size size, int i8) {
            super(size, i8);
        }

        @Override // z.S
        protected com.google.common.util.concurrent.C provideSurface() {
            return g1.this.f7614d;
        }
    }

    class c implements B.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.C f7626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f7627b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7628c;

        c(com.google.common.util.concurrent.C c9, c.a aVar, String str) {
            this.f7626a = c9;
            this.f7627b = aVar;
            this.f7628c = str;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            if (!(th instanceof CancellationException)) {
                this.f7627b.set(null);
                return;
            }
            Z.h.checkState(this.f7627b.setException(new e(this.f7628c + " cancelled.", th)));
        }

        @Override // B.c
        public void onSuccess(Surface surface) {
            B.f.propagate(this.f7626a, this.f7627b);
        }
    }

    class d implements B.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z.a f7630a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Surface f7631b;

        d(Z.a aVar, Surface surface) {
            this.f7630a = aVar;
            this.f7631b = surface;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            Z.h.checkState(th instanceof e, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f7630a.accept(f.a(1, this.f7631b));
        }

        @Override // B.c
        public void onSuccess(Void r32) {
            this.f7630a.accept(f.a(0, this.f7631b));
        }
    }

    private static final class e extends RuntimeException {
        e(String str, Throwable th) {
            super(str, th);
        }
    }

    public static abstract class f {
        public static final int RESULT_INVALID_SURFACE = 2;
        public static final int RESULT_REQUEST_CANCELLED = 1;
        public static final int RESULT_SURFACE_ALREADY_PROVIDED = 3;
        public static final int RESULT_SURFACE_USED_SUCCESSFULLY = 0;
        public static final int RESULT_WILL_NOT_PROVIDE_SURFACE = 4;

        f() {
        }

        static f a(int i8, Surface surface) {
            return new C0884j(i8, surface);
        }

        public abstract int getResultCode();

        public abstract Surface getSurface();
    }

    public static abstract class g {
        g() {
        }

        public static g of(Rect rect, int i8, int i9) {
            return new C0886k(rect, i8, i9);
        }

        public abstract Rect getCropRect();

        public abstract int getRotationDegrees();

        public abstract int getTargetRotation();
    }

    public interface h {
        void onTransformationInfoUpdate(g gVar);
    }

    public g1(Size size, InterfaceC6553B interfaceC6553B, boolean z8) {
        this.f7611a = size;
        this.f7613c = interfaceC6553B;
        this.f7612b = z8;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        com.google.common.util.concurrent.C future = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.core.a1
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return g1.i(atomicReference, str, aVar);
            }
        });
        c.a aVar = (c.a) Z.h.checkNotNull((c.a) atomicReference.get());
        this.f7617g = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        com.google.common.util.concurrent.C future2 = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.core.b1
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar2) {
                return g1.j(atomicReference2, str, aVar2);
            }
        });
        this.f7616f = future2;
        B.f.addCallback(future2, new a(aVar, future), A.a.directExecutor());
        c.a aVar2 = (c.a) Z.h.checkNotNull((c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        com.google.common.util.concurrent.C future3 = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.core.c1
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar3) {
                return g1.k(atomicReference3, str, aVar3);
            }
        });
        this.f7614d = future3;
        this.f7615e = (c.a) Z.h.checkNotNull((c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f7618h = bVar;
        com.google.common.util.concurrent.C terminationFuture = bVar.getTerminationFuture();
        B.f.addCallback(future3, new c(terminationFuture, aVar2, str), A.a.directExecutor());
        terminationFuture.addListener(new Runnable() { // from class: androidx.camera.core.d1
            @Override // java.lang.Runnable
            public final void run() {
                this.f7598a.l();
            }
        }, A.a.directExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object i(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object j(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object k(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f7614d.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Z.a aVar, Surface surface) {
        aVar.accept(f.a(3, surface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Z.a aVar, Surface surface) {
        aVar.accept(f.a(4, surface));
    }

    public void addRequestCancellationListener(Executor executor, Runnable runnable) {
        this.f7617g.addCancellationListener(runnable, executor);
    }

    public void clearTransformationInfoListener() {
        this.f7620j = null;
        this.f7621k = null;
    }

    public InterfaceC6553B getCamera() {
        return this.f7613c;
    }

    public z.S getDeferrableSurface() {
        return this.f7618h;
    }

    public Size getResolution() {
        return this.f7611a;
    }

    public boolean isRGBA8888Required() {
        return this.f7612b;
    }

    public void provideSurface(final Surface surface, Executor executor, final Z.a aVar) throws ExecutionException, InterruptedException {
        if (this.f7615e.set(surface) || this.f7614d.isCancelled()) {
            B.f.addCallback(this.f7616f, new d(aVar, surface), executor);
            return;
        }
        Z.h.checkState(this.f7614d.isDone());
        try {
            this.f7614d.get();
            executor.execute(new Runnable() { // from class: androidx.camera.core.e1
                @Override // java.lang.Runnable
                public final void run() {
                    g1.m(aVar, surface);
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.f1
                @Override // java.lang.Runnable
                public final void run() {
                    g1.n(aVar, surface);
                }
            });
        }
    }

    public void setTransformationInfoListener(Executor executor, final h hVar) {
        this.f7620j = hVar;
        this.f7621k = executor;
        final g gVar = this.f7619i;
        if (gVar != null) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.Z0
                @Override // java.lang.Runnable
                public final void run() {
                    hVar.onTransformationInfoUpdate(gVar);
                }
            });
        }
    }

    public void updateTransformationInfo(final g gVar) {
        this.f7619i = gVar;
        final h hVar = this.f7620j;
        if (hVar != null) {
            this.f7621k.execute(new Runnable() { // from class: androidx.camera.core.Y0
                @Override // java.lang.Runnable
                public final void run() {
                    hVar.onTransformationInfoUpdate(gVar);
                }
            });
        }
    }

    public boolean willNotProvideSurface() {
        return this.f7615e.setException(new S.b("Surface request will not complete."));
    }
}
