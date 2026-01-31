package z;

import androidx.camera.core.InterfaceC0888l;
import com.korail.talk.network.BaseResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import z.InterfaceC6553B;

/* renamed from: z.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6558G {

    /* renamed from: c, reason: collision with root package name */
    private final int f37720c;

    /* renamed from: e, reason: collision with root package name */
    private int f37722e;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f37718a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private final Object f37719b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f37721d = new HashMap();

    /* renamed from: z.G$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC6553B.a f37723a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f37724b;

        /* renamed from: c, reason: collision with root package name */
        private final b f37725c;

        a(InterfaceC6553B.a aVar, Executor executor, b bVar) {
            this.f37723a = aVar;
            this.f37724b = executor;
            this.f37725c = bVar;
        }

        InterfaceC6553B.a a() {
            return this.f37723a;
        }

        void b() {
            try {
                Executor executor = this.f37724b;
                final b bVar = this.f37725c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: z.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.onOpenAvailable();
                    }
                });
            } catch (RejectedExecutionException e8) {
                androidx.camera.core.B0.e("CameraStateRegistry", "Unable to notify camera.", e8);
            }
        }

        InterfaceC6553B.a c(InterfaceC6553B.a aVar) {
            InterfaceC6553B.a aVar2 = this.f37723a;
            this.f37723a = aVar;
            return aVar2;
        }
    }

    /* renamed from: z.G$b */
    public interface b {
        void onOpenAvailable();
    }

    public C6558G(int i8) {
        this.f37720c = i8;
        synchronized ("mLock") {
            this.f37722e = i8;
        }
    }

    private static boolean a(InterfaceC6553B.a aVar) {
        return aVar != null && aVar.a();
    }

    private void b() {
        if (androidx.camera.core.B0.isDebugEnabled("CameraStateRegistry")) {
            this.f37718a.setLength(0);
            this.f37718a.append("Recalculating open cameras:\n");
            this.f37718a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f37718a.append("-------------------------------------------------------------------\n");
        }
        int i8 = 0;
        for (Map.Entry entry : this.f37721d.entrySet()) {
            if (androidx.camera.core.B0.isDebugEnabled("CameraStateRegistry")) {
                this.f37718a.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC0888l) entry.getKey()).toString(), ((a) entry.getValue()).a() != null ? ((a) entry.getValue()).a().toString() : "UNKNOWN"));
            }
            if (a(((a) entry.getValue()).a())) {
                i8++;
            }
        }
        if (androidx.camera.core.B0.isDebugEnabled("CameraStateRegistry")) {
            this.f37718a.append("-------------------------------------------------------------------\n");
            this.f37718a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i8), Integer.valueOf(this.f37720c)));
            androidx.camera.core.B0.d("CameraStateRegistry", this.f37718a.toString());
        }
        this.f37722e = Math.max(this.f37720c - i8, 0);
    }

    private InterfaceC6553B.a c(InterfaceC0888l interfaceC0888l) {
        a aVar = (a) this.f37721d.remove(interfaceC0888l);
        if (aVar == null) {
            return null;
        }
        b();
        return aVar.a();
    }

    private InterfaceC6553B.a d(InterfaceC0888l interfaceC0888l, InterfaceC6553B.a aVar) {
        InterfaceC6553B.a aVarC = ((a) Z.h.checkNotNull((a) this.f37721d.get(interfaceC0888l), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).c(aVar);
        InterfaceC6553B.a aVar2 = InterfaceC6553B.a.OPENING;
        if (aVar == aVar2) {
            Z.h.checkState(a(aVar) || aVarC == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (aVarC != aVar) {
            b();
        }
        return aVarC;
    }

    public boolean isCameraClosing() {
        synchronized (this.f37719b) {
            try {
                Iterator it = this.f37721d.entrySet().iterator();
                while (it.hasNext()) {
                    if (((a) ((Map.Entry) it.next()).getValue()).a() == InterfaceC6553B.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void markCameraState(InterfaceC0888l interfaceC0888l, InterfaceC6553B.a aVar) {
        markCameraState(interfaceC0888l, aVar, true);
    }

    public void registerCamera(InterfaceC0888l interfaceC0888l, Executor executor, b bVar) {
        synchronized (this.f37719b) {
            Z.h.checkState(!this.f37721d.containsKey(interfaceC0888l), "Camera is already registered: " + interfaceC0888l);
            this.f37721d.put(interfaceC0888l, new a(null, executor, bVar));
        }
    }

    public boolean tryOpenCamera(InterfaceC0888l interfaceC0888l) {
        boolean z8;
        synchronized (this.f37719b) {
            try {
                a aVar = (a) Z.h.checkNotNull((a) this.f37721d.get(interfaceC0888l), "Camera must first be registered with registerCamera()");
                z8 = false;
                if (androidx.camera.core.B0.isDebugEnabled("CameraStateRegistry")) {
                    this.f37718a.setLength(0);
                    this.f37718a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC0888l, Integer.valueOf(this.f37722e), Boolean.valueOf(a(aVar.a())), aVar.a()));
                }
                if (this.f37722e > 0 || a(aVar.a())) {
                    aVar.c(InterfaceC6553B.a.OPENING);
                    z8 = true;
                }
                if (androidx.camera.core.B0.isDebugEnabled("CameraStateRegistry")) {
                    this.f37718a.append(String.format(Locale.US, " --> %s", z8 ? "SUCCESS" : BaseResponse.FAIL));
                    androidx.camera.core.B0.d("CameraStateRegistry", this.f37718a.toString());
                }
                if (z8) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    public void markCameraState(InterfaceC0888l interfaceC0888l, InterfaceC6553B.a aVar, boolean z8) {
        HashMap map;
        synchronized (this.f37719b) {
            try {
                int i8 = this.f37722e;
                if ((aVar == InterfaceC6553B.a.RELEASED ? c(interfaceC0888l) : d(interfaceC0888l, aVar)) == aVar) {
                    return;
                }
                if (i8 < 1 && this.f37722e > 0) {
                    map = new HashMap();
                    for (Map.Entry entry : this.f37721d.entrySet()) {
                        if (((a) entry.getValue()).a() == InterfaceC6553B.a.PENDING_OPEN) {
                            map.put((InterfaceC0888l) entry.getKey(), (a) entry.getValue());
                        }
                    }
                } else if (aVar != InterfaceC6553B.a.PENDING_OPEN || this.f37722e <= 0) {
                    map = null;
                } else {
                    map = new HashMap();
                    map.put(interfaceC0888l, (a) this.f37721d.get(interfaceC0888l));
                }
                if (map != null && !z8) {
                    map.remove(interfaceC0888l);
                }
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
