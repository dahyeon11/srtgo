package z;

import androidx.camera.core.C0907v;
import androidx.concurrent.futures.c;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: z.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6556E {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37708a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f37709b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set f37710c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private com.google.common.util.concurrent.C f37711d;

    /* renamed from: e, reason: collision with root package name */
    private c.a f37712e;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object c(c.a aVar) {
        synchronized (this.f37708a) {
            this.f37712e = aVar;
        }
        return "CameraRepository-deinit";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(InterfaceC6553B interfaceC6553B) {
        synchronized (this.f37708a) {
            try {
                this.f37710c.remove(interfaceC6553B);
                if (this.f37710c.isEmpty()) {
                    Z.h.checkNotNull(this.f37712e);
                    this.f37712e.set(null);
                    this.f37712e = null;
                    this.f37711d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.google.common.util.concurrent.C deinit() {
        synchronized (this.f37708a) {
            try {
                if (this.f37709b.isEmpty()) {
                    com.google.common.util.concurrent.C cImmediateFuture = this.f37711d;
                    if (cImmediateFuture == null) {
                        cImmediateFuture = B.f.immediateFuture(null);
                    }
                    return cImmediateFuture;
                }
                com.google.common.util.concurrent.C future = this.f37711d;
                if (future == null) {
                    future = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: z.C
                        @Override // androidx.concurrent.futures.c.InterfaceC0123c
                        public final Object attachCompleter(c.a aVar) {
                            return this.f37688a.c(aVar);
                        }
                    });
                    this.f37711d = future;
                }
                this.f37710c.addAll(this.f37709b.values());
                for (final InterfaceC6553B interfaceC6553B : this.f37709b.values()) {
                    interfaceC6553B.release().addListener(new Runnable() { // from class: z.D
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37706a.d(interfaceC6553B);
                        }
                    }, A.a.directExecutor());
                }
                this.f37709b.clear();
                return future;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceC6553B getCamera(String str) {
        InterfaceC6553B interfaceC6553B;
        synchronized (this.f37708a) {
            try {
                interfaceC6553B = (InterfaceC6553B) this.f37709b.get(str);
                if (interfaceC6553B == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC6553B;
    }

    public LinkedHashSet<InterfaceC6553B> getCameras() {
        LinkedHashSet<InterfaceC6553B> linkedHashSet;
        synchronized (this.f37708a) {
            linkedHashSet = new LinkedHashSet<>((Collection<? extends InterfaceC6553B>) this.f37709b.values());
        }
        return linkedHashSet;
    }

    public void init(InterfaceC6607y interfaceC6607y) {
        synchronized (this.f37708a) {
            try {
                for (String str : interfaceC6607y.getAvailableCameraIds()) {
                    androidx.camera.core.B0.d("CameraRepository", "Added camera: " + str);
                    this.f37709b.put(str, interfaceC6607y.getCamera(str));
                }
            } catch (C0907v e8) {
                throw new androidx.camera.core.A0(e8);
            }
        }
    }
}
