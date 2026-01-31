package androidx.camera.core;

import androidx.camera.core.L;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import z.InterfaceC6581g0;

/* loaded from: classes.dex */
final class V extends T {

    /* renamed from: u, reason: collision with root package name */
    final Executor f7548u;

    /* renamed from: v, reason: collision with root package name */
    private final Object f7549v = new Object();

    /* renamed from: w, reason: collision with root package name */
    InterfaceC0902s0 f7550w;

    /* renamed from: x, reason: collision with root package name */
    private b f7551x;

    class a implements B.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f7552a;

        a(b bVar) {
            this.f7552a = bVar;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            this.f7552a.close();
        }

        @Override // B.c
        public void onSuccess(Void r12) {
        }
    }

    static class b extends L {

        /* renamed from: c, reason: collision with root package name */
        final WeakReference f7554c;

        b(InterfaceC0902s0 interfaceC0902s0, V v8) {
            super(interfaceC0902s0);
            this.f7554c = new WeakReference(v8);
            a(new L.a() { // from class: androidx.camera.core.W
                @Override // androidx.camera.core.L.a
                public final void onImageClose(InterfaceC0902s0 interfaceC0902s02) {
                    this.f7559a.f(interfaceC0902s02);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(InterfaceC0902s0 interfaceC0902s0) {
            final V v8 = (V) this.f7554c.get();
            if (v8 != null) {
                v8.f7548u.execute(new Runnable() { // from class: androidx.camera.core.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        v8.z();
                    }
                });
            }
        }
    }

    V(Executor executor) {
        this.f7548u = executor;
    }

    @Override // androidx.camera.core.T
    InterfaceC0902s0 c(InterfaceC6581g0 interfaceC6581g0) {
        return interfaceC6581g0.acquireLatestImage();
    }

    @Override // androidx.camera.core.T
    void f() {
        synchronized (this.f7549v) {
            try {
                InterfaceC0902s0 interfaceC0902s0 = this.f7550w;
                if (interfaceC0902s0 != null) {
                    interfaceC0902s0.close();
                    this.f7550w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.T
    void o(InterfaceC0902s0 interfaceC0902s0) {
        synchronized (this.f7549v) {
            try {
                if (!this.f7538s) {
                    interfaceC0902s0.close();
                    return;
                }
                if (this.f7551x == null) {
                    b bVar = new b(interfaceC0902s0, this);
                    this.f7551x = bVar;
                    B.f.addCallback(d(bVar), new a(bVar), A.a.directExecutor());
                } else {
                    if (interfaceC0902s0.getImageInfo().getTimestamp() <= this.f7551x.getImageInfo().getTimestamp()) {
                        interfaceC0902s0.close();
                    } else {
                        InterfaceC0902s0 interfaceC0902s02 = this.f7550w;
                        if (interfaceC0902s02 != null) {
                            interfaceC0902s02.close();
                        }
                        this.f7550w = interfaceC0902s0;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        synchronized (this.f7549v) {
            try {
                this.f7551x = null;
                InterfaceC0902s0 interfaceC0902s0 = this.f7550w;
                if (interfaceC0902s0 != null) {
                    this.f7550w = null;
                    o(interfaceC0902s0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
