package t;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class C0 {

    /* renamed from: a, reason: collision with root package name */
    final Executor f36384a;

    /* renamed from: b, reason: collision with root package name */
    final Object f36385b = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Set f36386c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    final Set f36387d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    final Set f36388e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    private final CameraDevice.StateCallback f36389f = new a();

    C0(Executor executor) {
        this.f36384a = executor;
    }

    private void a(d1 d1Var) {
        d1 d1Var2;
        Iterator it = g().iterator();
        while (it.hasNext() && (d1Var2 = (d1) it.next()) != d1Var) {
            d1Var2.finishClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            d1Var.getStateCallback().onClosed(d1Var);
        }
    }

    CameraDevice.StateCallback c() {
        return this.f36389f;
    }

    List d() {
        ArrayList arrayList;
        synchronized (this.f36385b) {
            arrayList = new ArrayList(this.f36386c);
        }
        return arrayList;
    }

    List e() {
        ArrayList arrayList;
        synchronized (this.f36385b) {
            arrayList = new ArrayList(this.f36387d);
        }
        return arrayList;
    }

    List f() {
        ArrayList arrayList;
        synchronized (this.f36385b) {
            arrayList = new ArrayList(this.f36388e);
        }
        return arrayList;
    }

    List g() {
        ArrayList arrayList;
        synchronized (this.f36385b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(f());
        }
        return arrayList;
    }

    void h(d1 d1Var) {
        synchronized (this.f36385b) {
            this.f36386c.remove(d1Var);
            this.f36387d.remove(d1Var);
        }
    }

    void i(d1 d1Var) {
        synchronized (this.f36385b) {
            this.f36387d.add(d1Var);
        }
    }

    void j(d1 d1Var) {
        a(d1Var);
        synchronized (this.f36385b) {
            this.f36388e.remove(d1Var);
        }
    }

    void k(d1 d1Var) {
        synchronized (this.f36385b) {
            this.f36386c.add(d1Var);
            this.f36388e.remove(d1Var);
        }
        a(d1Var);
    }

    void l(d1 d1Var) {
        synchronized (this.f36385b) {
            this.f36388e.add(d1Var);
        }
    }

    class a extends CameraDevice.StateCallback {
        a() {
        }

        private void b() {
            List listG;
            synchronized (C0.this.f36385b) {
                listG = C0.this.g();
                C0.this.f36388e.clear();
                C0.this.f36386c.clear();
                C0.this.f36387d.clear();
            }
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                ((d1) it.next()).finishClose();
            }
        }

        private void c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C0.this.f36385b) {
                linkedHashSet.addAll(C0.this.f36388e);
                linkedHashSet.addAll(C0.this.f36386c);
            }
            C0.this.f36384a.execute(new Runnable() { // from class: t.B0
                @Override // java.lang.Runnable
                public final void run() {
                    C0.b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i8) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }
}
