package androidx.camera.lifecycle;

import Z.h;
import android.content.Context;
import androidx.camera.core.B;
import androidx.camera.core.C;
import androidx.camera.core.C0903t;
import androidx.camera.core.InterfaceC0888l;
import androidx.camera.core.InterfaceC0898q;
import androidx.camera.core.h1;
import androidx.camera.core.i1;
import androidx.camera.core.impl.utils.m;
import androidx.camera.core.r;
import androidx.camera.core.t1;
import androidx.concurrent.futures.c;
import androidx.lifecycle.InterfaceC1025n;
import com.google.common.util.concurrent.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p.InterfaceC6046a;
import z.InterfaceC6553B;
import z.InterfaceC6601s;
import z.Y;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: h */
    private static final g f7927h = new g();

    /* renamed from: c */
    private C f7930c;

    /* renamed from: f */
    private B f7933f;

    /* renamed from: g */
    private Context f7934g;

    /* renamed from: a */
    private final Object f7928a = new Object();

    /* renamed from: b */
    private C.b f7929b = null;

    /* renamed from: d */
    private com.google.common.util.concurrent.C f7931d = B.f.immediateFuture(null);

    /* renamed from: e */
    private final LifecycleCameraRepository f7932e = new LifecycleCameraRepository();

    class a implements B.c {

        /* renamed from: a */
        final /* synthetic */ c.a f7935a;

        /* renamed from: b */
        final /* synthetic */ B f7936b;

        a(c.a aVar, B b9) {
            this.f7935a = aVar;
            this.f7936b = b9;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            this.f7935a.setException(th);
        }

        @Override // B.c
        public void onSuccess(Void r22) {
            this.f7935a.set(this.f7936b);
        }
    }

    private g() {
    }

    public static void configureInstance(androidx.camera.core.C c9) {
        f7927h.f(c9);
    }

    private void f(final androidx.camera.core.C c9) {
        synchronized (this.f7928a) {
            h.checkNotNull(c9);
            h.checkState(this.f7929b == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
            this.f7929b = new C.b() { // from class: androidx.camera.lifecycle.c
                @Override // androidx.camera.core.C.b
                public final androidx.camera.core.C getCameraXConfig() {
                    return g.h(c9);
                }
            };
        }
    }

    private com.google.common.util.concurrent.C g(Context context) {
        synchronized (this.f7928a) {
            try {
                com.google.common.util.concurrent.C c9 = this.f7930c;
                if (c9 != null) {
                    return c9;
                }
                final B b9 = new B(context, this.f7929b);
                com.google.common.util.concurrent.C future = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: androidx.camera.lifecycle.e
                    @Override // androidx.concurrent.futures.c.InterfaceC0123c
                    public final Object attachCompleter(c.a aVar) {
                        return this.f7924a.k(b9, aVar);
                    }
                });
                this.f7930c = future;
                return future;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static com.google.common.util.concurrent.C getInstance(final Context context) {
        h.checkNotNull(context);
        return B.f.transform(f7927h.g(context), new InterfaceC6046a() { // from class: androidx.camera.lifecycle.d
            @Override // p.InterfaceC6046a
            public final Object apply(Object obj) {
                return g.i(context, (B) obj);
            }
        }, A.a.directExecutor());
    }

    public static /* synthetic */ androidx.camera.core.C h(androidx.camera.core.C c9) {
        return c9;
    }

    public static /* synthetic */ g i(Context context, B b9) {
        g gVar = f7927h;
        gVar.l(b9);
        gVar.m(androidx.camera.core.impl.utils.e.getApplicationContext(context));
        return gVar;
    }

    public static /* synthetic */ com.google.common.util.concurrent.C j(B b9, Void r12) {
        return b9.getInitializeFuture();
    }

    public /* synthetic */ Object k(final B b9, c.a aVar) {
        synchronized (this.f7928a) {
            B.f.addCallback(B.d.from(this.f7931d).transformAsync(new B.a() { // from class: androidx.camera.lifecycle.f
                @Override // B.a
                public final com.google.common.util.concurrent.C apply(Object obj) {
                    return g.j(b9, (Void) obj);
                }
            }, A.a.directExecutor()), new a(aVar, b9), A.a.directExecutor());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    private void l(B b9) {
        this.f7933f = b9;
    }

    private void m(Context context) {
        this.f7934g = context;
    }

    public InterfaceC0888l bindToLifecycle(InterfaceC1025n interfaceC1025n, C0903t c0903t, h1... h1VarArr) {
        return e(interfaceC1025n, c0903t, null, h1VarArr);
    }

    InterfaceC0888l e(InterfaceC1025n interfaceC1025n, C0903t c0903t, t1 t1Var, h1... h1VarArr) {
        InterfaceC6601s interfaceC6601s;
        InterfaceC6601s config;
        m.checkMainThread();
        C0903t.a aVarFromSelector = C0903t.a.fromSelector(c0903t);
        int length = h1VarArr.length;
        int i8 = 0;
        while (true) {
            interfaceC6601s = null;
            if (i8 >= length) {
                break;
            }
            C0903t cameraSelector = h1VarArr[i8].getCurrentConfig().getCameraSelector(null);
            if (cameraSelector != null) {
                Iterator<InterfaceC0898q> it = cameraSelector.getCameraFilterSet().iterator();
                while (it.hasNext()) {
                    aVarFromSelector.addCameraFilter(it.next());
                }
            }
            i8++;
        }
        LinkedHashSet<InterfaceC6553B> linkedHashSetFilter = aVarFromSelector.build().filter(this.f7933f.getCameraRepository().getCameras());
        if (linkedHashSetFilter.isEmpty()) {
            throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
        }
        LifecycleCamera lifecycleCameraD = this.f7932e.d(interfaceC1025n, C.e.generateCameraId(linkedHashSetFilter));
        Collection<LifecycleCamera> collectionF = this.f7932e.f();
        for (h1 h1Var : h1VarArr) {
            for (LifecycleCamera lifecycleCamera : collectionF) {
                if (lifecycleCamera.isBound(h1Var) && lifecycleCamera != lifecycleCameraD) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", h1Var));
                }
            }
        }
        if (lifecycleCameraD == null) {
            lifecycleCameraD = this.f7932e.c(interfaceC1025n, new C.e(linkedHashSetFilter, this.f7933f.getCameraDeviceSurfaceManager(), this.f7933f.getDefaultConfigFactory()));
        }
        Iterator<InterfaceC0898q> it2 = c0903t.getCameraFilterSet().iterator();
        while (it2.hasNext()) {
            InterfaceC0898q next = it2.next();
            if (next.getIdentifier() != InterfaceC0898q.DEFAULT_ID && (config = Y.getConfigProvider(next.getIdentifier()).getConfig(lifecycleCameraD.getCameraInfo(), this.f7934g)) != null) {
                if (interfaceC6601s != null) {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
                interfaceC6601s = config;
            }
        }
        lifecycleCameraD.setExtendedConfig(interfaceC6601s);
        if (h1VarArr.length == 0) {
            return lifecycleCameraD;
        }
        this.f7932e.a(lifecycleCameraD, t1Var, Arrays.asList(h1VarArr));
        return lifecycleCameraD;
    }

    @Override // androidx.camera.lifecycle.b, androidx.camera.core.InterfaceC0901s
    public List<r> getAvailableCameraInfos() {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC6553B> it = this.f7933f.getCameraRepository().getCameras().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCameraInfo());
        }
        return arrayList;
    }

    @Override // androidx.camera.lifecycle.b, androidx.camera.core.InterfaceC0901s
    public boolean hasCamera(C0903t c0903t) {
        try {
            c0903t.select(this.f7933f.getCameraRepository().getCameras());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.camera.lifecycle.b
    public boolean isBound(h1 h1Var) {
        Iterator it = this.f7932e.f().iterator();
        while (it.hasNext()) {
            if (((LifecycleCamera) it.next()).isBound(h1Var)) {
                return true;
            }
        }
        return false;
    }

    public com.google.common.util.concurrent.C shutdown() {
        this.f7932e.b();
        B b9 = this.f7933f;
        com.google.common.util.concurrent.C cShutdown = b9 != null ? b9.shutdown() : B.f.immediateFuture(null);
        synchronized (this.f7928a) {
            this.f7929b = null;
            this.f7930c = null;
            this.f7931d = cShutdown;
        }
        this.f7933f = null;
        this.f7934g = null;
        return cShutdown;
    }

    @Override // androidx.camera.lifecycle.b
    public void unbind(h1... h1VarArr) {
        m.checkMainThread();
        this.f7932e.l(Arrays.asList(h1VarArr));
    }

    @Override // androidx.camera.lifecycle.b
    public void unbindAll() {
        m.checkMainThread();
        this.f7932e.m();
    }

    public InterfaceC0888l bindToLifecycle(InterfaceC1025n interfaceC1025n, C0903t c0903t, i1 i1Var) {
        return e(interfaceC1025n, c0903t, i1Var.getViewPort(), (h1[]) i1Var.getUseCases().toArray(new h1[0]));
    }
}
