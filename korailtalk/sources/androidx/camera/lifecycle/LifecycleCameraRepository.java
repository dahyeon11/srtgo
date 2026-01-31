package androidx.camera.lifecycle;

import C.e;
import Z.h;
import androidx.camera.core.t1;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.InterfaceC1024m;
import androidx.lifecycle.InterfaceC1025n;
import androidx.lifecycle.v;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class LifecycleCameraRepository {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7914a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f7915b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f7916c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f7917d = new ArrayDeque();

    private static class LifecycleCameraRepositoryObserver implements InterfaceC1024m {

        /* renamed from: a, reason: collision with root package name */
        private final LifecycleCameraRepository f7918a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1025n f7919b;

        LifecycleCameraRepositoryObserver(InterfaceC1025n interfaceC1025n, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f7919b = interfaceC1025n;
            this.f7918a = lifecycleCameraRepository;
        }

        InterfaceC1025n a() {
            return this.f7919b;
        }

        @v(AbstractC1019h.a.ON_DESTROY)
        public void onDestroy(InterfaceC1025n interfaceC1025n) {
            this.f7918a.n(interfaceC1025n);
        }

        @v(AbstractC1019h.a.ON_START)
        public void onStart(InterfaceC1025n interfaceC1025n) {
            this.f7918a.i(interfaceC1025n);
        }

        @v(AbstractC1019h.a.ON_STOP)
        public void onStop(InterfaceC1025n interfaceC1025n) {
            this.f7918a.j(interfaceC1025n);
        }
    }

    static abstract class a {
        a() {
        }

        static a a(InterfaceC1025n interfaceC1025n, e.b bVar) {
            return new androidx.camera.lifecycle.a(interfaceC1025n, bVar);
        }

        public abstract e.b getCameraId();

        public abstract InterfaceC1025n getLifecycleOwner();
    }

    LifecycleCameraRepository() {
    }

    private LifecycleCameraRepositoryObserver e(InterfaceC1025n interfaceC1025n) {
        synchronized (this.f7914a) {
            try {
                for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f7916c.keySet()) {
                    if (interfaceC1025n.equals(lifecycleCameraRepositoryObserver.a())) {
                        return lifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean g(InterfaceC1025n interfaceC1025n) {
        synchronized (this.f7914a) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverE = e(interfaceC1025n);
                if (lifecycleCameraRepositoryObserverE == null) {
                    return false;
                }
                Iterator it = ((Set) this.f7916c.get(lifecycleCameraRepositoryObserverE)).iterator();
                while (it.hasNext()) {
                    if (!((LifecycleCamera) h.checkNotNull((LifecycleCamera) this.f7915b.get((a) it.next()))).getUseCases().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void h(LifecycleCamera lifecycleCamera) {
        synchronized (this.f7914a) {
            try {
                InterfaceC1025n lifecycleOwner = lifecycleCamera.getLifecycleOwner();
                a aVarA = a.a(lifecycleOwner, lifecycleCamera.getCameraUseCaseAdapter().getCameraId());
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverE = e(lifecycleOwner);
                Set hashSet = lifecycleCameraRepositoryObserverE != null ? (Set) this.f7916c.get(lifecycleCameraRepositoryObserverE) : new HashSet();
                hashSet.add(aVarA);
                this.f7915b.put(aVarA, lifecycleCamera);
                if (lifecycleCameraRepositoryObserverE == null) {
                    LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(lifecycleOwner, this);
                    this.f7916c.put(lifecycleCameraRepositoryObserver, hashSet);
                    lifecycleOwner.getLifecycle().addObserver(lifecycleCameraRepositoryObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k(InterfaceC1025n interfaceC1025n) {
        synchronized (this.f7914a) {
            try {
                Iterator it = ((Set) this.f7916c.get(e(interfaceC1025n))).iterator();
                while (it.hasNext()) {
                    ((LifecycleCamera) h.checkNotNull((LifecycleCamera) this.f7915b.get((a) it.next()))).suspend();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(InterfaceC1025n interfaceC1025n) {
        synchronized (this.f7914a) {
            try {
                Iterator it = ((Set) this.f7916c.get(e(interfaceC1025n))).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f7915b.get((a) it.next());
                    if (!((LifecycleCamera) h.checkNotNull(lifecycleCamera)).getUseCases().isEmpty()) {
                        lifecycleCamera.unsuspend();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a(LifecycleCamera lifecycleCamera, t1 t1Var, Collection collection) {
        synchronized (this.f7914a) {
            h.checkArgument(!collection.isEmpty());
            InterfaceC1025n lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            Iterator it = ((Set) this.f7916c.get(e(lifecycleOwner))).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera2 = (LifecycleCamera) h.checkNotNull((LifecycleCamera) this.f7915b.get((a) it.next()));
                if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.getUseCases().isEmpty()) {
                    throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                }
            }
            try {
                lifecycleCamera.getCameraUseCaseAdapter().setViewPort(t1Var);
                lifecycleCamera.a(collection);
                if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(AbstractC1019h.b.STARTED)) {
                    i(lifecycleOwner);
                }
            } catch (e.a e8) {
                throw new IllegalArgumentException(e8.getMessage());
            }
        }
    }

    void b() {
        synchronized (this.f7914a) {
            try {
                Iterator it = new HashSet(this.f7916c.keySet()).iterator();
                while (it.hasNext()) {
                    n(((LifecycleCameraRepositoryObserver) it.next()).a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    LifecycleCamera c(InterfaceC1025n interfaceC1025n, C.e eVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f7914a) {
            try {
                h.checkArgument(this.f7915b.get(a.a(interfaceC1025n, eVar.getCameraId())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                if (interfaceC1025n.getLifecycle().getCurrentState() == AbstractC1019h.b.DESTROYED) {
                    throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                }
                lifecycleCamera = new LifecycleCamera(interfaceC1025n, eVar);
                if (eVar.getUseCases().isEmpty()) {
                    lifecycleCamera.suspend();
                }
                h(lifecycleCamera);
            } catch (Throwable th) {
                throw th;
            }
        }
        return lifecycleCamera;
    }

    LifecycleCamera d(InterfaceC1025n interfaceC1025n, e.b bVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f7914a) {
            lifecycleCamera = (LifecycleCamera) this.f7915b.get(a.a(interfaceC1025n, bVar));
        }
        return lifecycleCamera;
    }

    Collection f() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.f7914a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f7915b.values());
        }
        return collectionUnmodifiableCollection;
    }

    void i(InterfaceC1025n interfaceC1025n) {
        synchronized (this.f7914a) {
            try {
                if (g(interfaceC1025n)) {
                    if (this.f7917d.isEmpty()) {
                        this.f7917d.push(interfaceC1025n);
                    } else {
                        InterfaceC1025n interfaceC1025n2 = (InterfaceC1025n) this.f7917d.peek();
                        if (!interfaceC1025n.equals(interfaceC1025n2)) {
                            k(interfaceC1025n2);
                            this.f7917d.remove(interfaceC1025n);
                            this.f7917d.push(interfaceC1025n);
                        }
                    }
                    o(interfaceC1025n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void j(InterfaceC1025n interfaceC1025n) {
        synchronized (this.f7914a) {
            try {
                this.f7917d.remove(interfaceC1025n);
                k(interfaceC1025n);
                if (!this.f7917d.isEmpty()) {
                    o((InterfaceC1025n) this.f7917d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void l(Collection collection) {
        synchronized (this.f7914a) {
            try {
                Iterator it = this.f7915b.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f7915b.get((a) it.next());
                    boolean zIsEmpty = lifecycleCamera.getUseCases().isEmpty();
                    lifecycleCamera.b(collection);
                    if (!zIsEmpty && lifecycleCamera.getUseCases().isEmpty()) {
                        j(lifecycleCamera.getLifecycleOwner());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void m() {
        synchronized (this.f7914a) {
            try {
                Iterator it = this.f7915b.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f7915b.get((a) it.next());
                    lifecycleCamera.c();
                    j(lifecycleCamera.getLifecycleOwner());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void n(InterfaceC1025n interfaceC1025n) {
        synchronized (this.f7914a) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverE = e(interfaceC1025n);
                if (lifecycleCameraRepositoryObserverE == null) {
                    return;
                }
                j(interfaceC1025n);
                Iterator it = ((Set) this.f7916c.get(lifecycleCameraRepositoryObserverE)).iterator();
                while (it.hasNext()) {
                    this.f7915b.remove((a) it.next());
                }
                this.f7916c.remove(lifecycleCameraRepositoryObserverE);
                lifecycleCameraRepositoryObserverE.a().getLifecycle().removeObserver(lifecycleCameraRepositoryObserverE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
